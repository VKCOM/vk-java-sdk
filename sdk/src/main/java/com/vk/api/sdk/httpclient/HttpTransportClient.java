package com.vk.api.sdk.httpclient;

import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.TransportClient;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
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

    private static final Logger LOG = LoggerFactory.getLogger(HttpTransportClient.class);

    private static final String ENCODING = "UTF-8";
    private static final String FORM_CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String USER_AGENT = "Java VK SDK/0.5.12";

    private static final String EMPTY_PAYLOAD = "-";

    private static final int MAX_SIMULTANEOUS_CONNECTIONS = 300;
    private static final int DEFAULT_RETRY_ATTEMPTS_NETWORK_ERROR_COUNT = 3;
    private static final int DEFAULT_RETRY_INVALID_STATUS_COUNT = 3;
    private static final int FULL_CONNECTION_TIMEOUT_S = 60;
    private static final int CONNECTION_TIMEOUT_MS = 5_000;
    private static final int SOCKET_TIMEOUT_MS = FULL_CONNECTION_TIMEOUT_S * 1000;

    private static final ConnectionsSupervisor SUPERVISOR = new ConnectionsSupervisor();
    private static HttpTransportClient instance;
    private static HttpClient httpClient;

    private int retryAttemptsNetworkErrorCount;
    private int retryAttemptsInvalidStatusCount;

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

    private static Map<String, String> getHeaders(Header[] headers) {
        Map<String, String> result = new HashMap<>();
        for (Header header : headers) {
            result.put(header.getName(), header.getValue());
        }

        return result;
    }

    private ClientResponse callWithStatusCheck(HttpRequestBase request) throws IOException {
        ClientResponse response;
        int attempts = 0;

        do {
            response = call(request);
            attempts++;
        } while (attempts < retryAttemptsInvalidStatusCount && isInvalidGatewayStatus(response.getStatusCode()));

        return response;
    }

    private boolean isInvalidGatewayStatus(int status) {
        return status == HttpStatus.SC_BAD_GATEWAY || status == HttpStatus.SC_GATEWAY_TIMEOUT;
    }

    private ClientResponse call(HttpRequestBase request) throws IOException {
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

    private void logRequest(HttpRequestBase request) throws IOException {
        logRequest(request, null, null, null, null, null);
    }

    private String getRequestPayload(HttpRequestBase request) throws IOException {
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

    private void logRequest(HttpRequestBase request, Map<String, String> requestHeaders, HttpResponse response, Map<String, String> responseHeaders, String body, Long time) throws IOException {
        if (LOG.isDebugEnabled()) {
            String payload = getRequestPayload(request);

            StringBuilder builder = new StringBuilder("\n")
                    .append("Request:\n")
                    .append("\t").append("Headers: ").append(requestHeaders != null ? requestHeaders : "-").append("\n")
                    .append("\t").append("Method: ").append(request.getMethod()).append("\n")
                    .append("\t").append("URI: ").append(request.getURI()).append("\n")
                    .append("\t").append("Payload: ").append(payload).append("\n")
                    .append("\t").append("Time: ").append(time != null ? time : "-").append("\n");

            if (response != null) {
                builder.append("Response:\n")
                        .append("\t").append("Status: ").append(response.getStatusLine().toString()).append("\n")
                        .append("\t").append("Headers: ").append(responseHeaders != null ? responseHeaders : "-").append("\n")
                        .append("\t").append("Body: ").append(body != null ? body : "-").append("\n");
            }

            LOG.debug(builder.toString());
        } else if (LOG.isInfoEnabled()) {
            StringBuilder builder = new StringBuilder().append("Request: ").append(request.getURI().toURL().toString());
            if (time != null) {
                builder.append("\t\t").append(time);
            }

            LOG.info(builder.toString());
        }
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
    public ClientResponse post(String url) throws IOException {
        return post(url, null);
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
    public ClientResponse post(String url, String fileName, File file) throws IOException {
        HttpPost request = new HttpPost(url);
        FileBody fileBody = new FileBody(file);
        HttpEntity entity = MultipartEntityBuilder
                .create()
                .addPart(fileName, fileBody).build();

        request.setEntity(entity);
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
}
