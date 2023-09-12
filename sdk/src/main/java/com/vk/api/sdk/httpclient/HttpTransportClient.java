package com.vk.api.sdk.httpclient;

import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.TransportClient;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anton Tsivarev on 11.09.15.
 */
public class HttpTransportClient implements TransportClient {

    protected static final Logger LOG = LoggerFactory.getLogger(HttpTransportClient.class);

    protected static final String ENCODING = "UTF-8";
    protected static final String FORM_CONTENT_TYPE = "application/x-www-form-urlencoded";
    protected static final String CONTENT_TYPE_HEADER = "Content-Type";
    protected static final String USER_AGENT = "Java VK SDK/1.0";

    protected static final String EMPTY_PAYLOAD = "-";
    protected static final String EMPTY_BODY = "-";

    protected static final int MAX_SIMULTANEOUS_CONNECTIONS = 300;
    protected static final int DEFAULT_RETRY_ATTEMPTS_NETWORK_ERROR_COUNT = 3;
    protected static final int DEFAULT_RETRY_INVALID_STATUS_COUNT = 3;
    protected static final int FULL_CONNECTION_TIMEOUT_S = 60;
    protected static final int CONNECTION_TIMEOUT_MS = 5_000;
    protected static final int SOCKET_TIMEOUT_MS = FULL_CONNECTION_TIMEOUT_S * 1000;

    protected static final ConnectionsSupervisor SUPERVISOR = new ConnectionsSupervisor();
    protected static HttpTransportClient instance;
    protected static HttpClient httpClient;

    protected int retryAttemptsNetworkErrorCount;
    protected int retryAttemptsInvalidStatusCount;

    public HttpTransportClient() {
        this(DEFAULT_RETRY_ATTEMPTS_NETWORK_ERROR_COUNT, DEFAULT_RETRY_INVALID_STATUS_COUNT);
    }

    public HttpTransportClient(int retryAttemptsNetworkErrorCount, int retryAttemptsInvalidStatusCount) {
        this.retryAttemptsNetworkErrorCount = retryAttemptsNetworkErrorCount;
        this.retryAttemptsInvalidStatusCount = retryAttemptsInvalidStatusCount;

        CookieStore cookieStore = new BasicCookieStore();
        RequestConfig requestConfig = RequestConfig.custom()
                .setSocketTimeout(SOCKET_TIMEOUT_MS)
                .setConnectTimeout(CONNECTION_TIMEOUT_MS)
                .setConnectionRequestTimeout(CONNECTION_TIMEOUT_MS)
                .setCookieSpec(CookieSpecs.STANDARD)
                .build();

        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();

        connectionManager.setMaxTotal(MAX_SIMULTANEOUS_CONNECTIONS);
        connectionManager.setDefaultMaxPerRoute(MAX_SIMULTANEOUS_CONNECTIONS);

        httpClient = HttpClients.custom()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(requestConfig)
                .setDefaultCookieStore(cookieStore)
                .setUserAgent(USER_AGENT)
                .build();
    }

    public static HttpTransportClient getInstance() {
        if (instance == null) {
            instance = new HttpTransportClient();
        }

        return instance;
    }

    protected static Map<String, String> getHeaders(Header[] headers) {
        Map<String, String> result = new HashMap<>();
        for (Header header : headers) {
            result.put(header.getName(), header.getValue());
        }

        return result;
    }

    protected ClientResponse callWithStatusCheck(HttpRequestBase request) throws IOException {
        ClientResponse response;
        int attempts = 0;

        do {
            response = call(request);
            attempts++;
        } while (attempts < retryAttemptsInvalidStatusCount && isInvalidGatewayStatus(response.getStatusCode()));

        return response;
    }

    protected boolean isInvalidGatewayStatus(int status) {
        return status == HttpStatus.SC_BAD_GATEWAY || status == HttpStatus.SC_GATEWAY_TIMEOUT;
    }

    protected ClientResponse call(HttpRequestBase request) throws IOException {
        SocketException exception = null;
        for (int i = 0; i < retryAttemptsNetworkErrorCount; i++) {
            try {
                SUPERVISOR.addRequest(request);

                long startTime = System.currentTimeMillis();

                HttpResponse response = httpClient.execute(request);

                long endTime = System.currentTimeMillis();

                long resultTime = endTime - startTime;

                try (InputStream content = response.getEntity().getContent()) {
                    String result = IOUtils.toString(content, ENCODING);
                    Map<String, String> responseHeaders = getHeaders(response.getAllHeaders());
                    Map<String, String> requestHeaders = getHeaders(request.getAllHeaders());
                    logRequest(request, requestHeaders, response, responseHeaders, result, resultTime);
                    return new ClientResponse(response.getStatusLine().getStatusCode(), result, responseHeaders);
                } finally {
                    SUPERVISOR.removeRequest(request);
                }
            } catch (SocketException e) {
                logRequest(request);
                LOG.warn("Network troubles", e);
                exception = e;
            }
        }

        throw exception;
    }

    protected void logRequest(HttpRequestBase request) throws IOException {
        logRequest(request, null, null, null, null, null);
    }

    protected String getRequestPayload(HttpRequestBase request) throws IOException {
        if (!(request instanceof HttpPost)) {
            return EMPTY_PAYLOAD;
        }

        HttpPost postRequest = (HttpPost) request;
        if (postRequest.getEntity() == null) {
            return EMPTY_PAYLOAD;
        }

        if (StringUtils.isNotEmpty(postRequest.getEntity().getContentType().getValue())) {
            String contentType = postRequest.getEntity().getContentType().getValue();
            if (contentType.contains("multipart/form-data")) {
                return EMPTY_PAYLOAD;
            }
        }

        return IOUtils.toString(postRequest.getEntity().getContent(), StandardCharsets.UTF_8);
    }

    protected String getURI(HttpRequestBase request) {

        return request.getURI().toString();
    }

    protected void logRequest(HttpRequestBase request, Map<String, String> requestHeaders, HttpResponse response, Map<String, String> responseHeaders, String body, Long time) throws IOException {
        if (LOG.isDebugEnabled()) {
            String modifiedPayload = coverSensitiveInfo(getRequestPayload(request));
            String modifiedURI = coverSensitiveInfo(getURI(request));
            String modifiedBody = coverSensitiveInfo(body);

            StringBuilder builder = new StringBuilder("\n")
                    .append("Request:\n")
                    .append("\t").append("Headers: ").append(requestHeaders != null ? requestHeaders : "-").append("\n")
                    .append("\t").append("Method: ").append(request.getMethod()).append("\n")
                    .append("\t").append("URI: ").append(modifiedURI).append("\n")
                    .append("\t").append("Payload: ").append(modifiedPayload).append("\n")
                    .append("\t").append("Time: ").append(time != null ? time : "-").append("\n");

            if (response != null) {
                builder.append("Response:\n")
                        .append("\t").append("Status: ").append(response.getStatusLine().toString()).append("\n")
                        .append("\t").append("Headers: ").append(responseHeaders != null ? responseHeaders : "-").append("\n")
                        .append("\t").append("Body: ").append(modifiedBody != null ? modifiedBody : "-").append("\n");
            }

            LOG.debug(builder.toString());
        } else if (LOG.isTraceEnabled()) {
            StringBuilder builder = new StringBuilder().append("Request: ").append(request.getURI().toURL().toString());
            if (time != null) {
                builder.append("\t\t").append(time);
            }

            LOG.info(builder.toString());
        }
    }

    protected String coverSensitiveInfo(String creds) {
        return creds
                .replaceFirst("access_token(=|:)([0-9a-f]{3})[0-9a-f]+([0-9a-f]{3})", "access_token$1$2...$3")
                .replaceFirst("anonymous_token(=|:)([0-9a-f]{3})[0-9a-f]+([0-9a-f]{3})", "anonymous_token$1$2...$3")
                .replaceFirst("client_secret(=|:)([0-9a-zA-z]{3})[0-9a-zA-Z]+([0-9a-zA-Z]{3})", "client_secret$1$2...$3")
                .replaceFirst("login(=|:)([0-9a-z]{3})([0-9a-z_])+@([0-9a-z]+)(\\.[a-z]{3})", "login$1$2...$5")
                .replaceFirst("password(=|:)([0-9a-zA-z]{3})[0-9a-zA-Z]+([0-9a-zA-Z]{3})", "password$1$2...$3")
                .replaceFirst("hash(=|:)([0-9a-z]{3})[0-9a-z]+([0-9a-z]{3})", "hash$1$2...$3")
                .replaceFirst("rhash(=|:)([0-9a-z]{3})[0-9a-z]+([0-9a-z]{3})", "rhash$1$2...$3");
    }

    @Override
    public ClientResponse get(String url) throws IOException {
        return get(url, FORM_CONTENT_TYPE);
    }

    @Override
    public ClientResponse get(String url, String contentType) throws IOException {
        HttpGet request = new HttpGet(url);
        request.setHeader(CONTENT_TYPE_HEADER, contentType);
        return callWithStatusCheck(request);
    }

    @Override
    public ClientResponse get(String url, Header[] headers) throws IOException {
        HttpGet request = new HttpGet(url);
        request.setHeader(CONTENT_TYPE_HEADER, FORM_CONTENT_TYPE);
        for (Header header : headers) {
            request.setHeader(header);
        }
        return callWithStatusCheck(request);
    }

    @Override
    public ClientResponse post(String url) throws IOException {
        return post(url, null, FORM_CONTENT_TYPE);
    }

    @Override
    public ClientResponse post(String url, String body) throws IOException {
        return post(url, body, FORM_CONTENT_TYPE);
    }

    @Override
    public ClientResponse post(String url, String body, String contentType) throws IOException {
        HttpPost request = new HttpPost(url);
        request.setHeader(CONTENT_TYPE_HEADER, contentType);
        if (body != null) {
            request.setEntity(new StringEntity(body, "UTF-8"));
        }

        return callWithStatusCheck(request);
    }

    @Override
    public ClientResponse post(String url, String body, Header[] headers) throws IOException {
        HttpPost request = new HttpPost(url);
        request.setHeader(CONTENT_TYPE_HEADER, FORM_CONTENT_TYPE);
        for (Header header : headers) {
            request.setHeader(header);
        }
        if (body != null) {
            request.setEntity(new StringEntity(body, "UTF-8"));
        }

        return callWithStatusCheck(request);
    }

    @Override
    public ClientResponse post(String url, Map<String, File> files) throws IOException {
        HttpPost request = new HttpPost(url);
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        files.forEach((key, file) -> builder.addPart(key, new FileBody(file)));
        request.setEntity(builder.build());

        return callWithStatusCheck(request);
    }

    @Override
    public ClientResponse delete(String url) throws IOException {
        return delete(url, null, FORM_CONTENT_TYPE);
    }

    @Override
    public ClientResponse delete(String url, String body) throws IOException {
        return delete(url, body, FORM_CONTENT_TYPE);
    }

    @Override
    public ClientResponse delete(String url, String body, String contentType) throws IOException {
        HttpDeleteWithBody request = new HttpDeleteWithBody(url);
        request.setHeader(CONTENT_TYPE_HEADER, contentType);
        if (body != null) {
            request.setEntity(new StringEntity(body));
        }

        return callWithStatusCheck(request);
    }

    @Override
    public ClientResponse delete(String url, String body, Header[] headers) throws IOException {
        HttpDeleteWithBody request = new HttpDeleteWithBody(url);
        request.setHeader(CONTENT_TYPE_HEADER, FORM_CONTENT_TYPE);
        for (Header header : headers) {
            request.setHeader(header);
        }
        if (body != null) {
            request.setEntity(new StringEntity(body));
        }

        return callWithStatusCheck(request);
    }
}
