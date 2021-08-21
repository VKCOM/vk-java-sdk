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
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.DefaultServiceUnavailableRetryStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
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

    protected static final int MAX_SIMULTANEOUS_CONNECTIONS = 300;
    protected static final int DEFAULT_RETRY_ATTEMPTS_NETWORK_ERROR_COUNT = 3;
    protected static final int DEFAULT_RETRY_INVALID_STATUS_COUNT = 3;
    protected static final int DEFAULT_RETRY_INVALID_STATUS_INTERVAL_MS = 500;
    protected static final int FULL_CONNECTION_TIMEOUT_S = 60;
    protected static final int CONNECTION_TIMEOUT_MS = 5_000;
    protected static final int SOCKET_TIMEOUT_MS = FULL_CONNECTION_TIMEOUT_S * 1000;

    protected static final ConnectionsSupervisor SUPERVISOR = new ConnectionsSupervisor();
    protected static HttpTransportClient instance;
    protected static HttpClient httpClient;

    protected int lastRetryAttemptsNetworkErrorCount;
    protected int lastRetryAttemptsInvalidStatusCount;

    public HttpTransportClient() {
        this(DEFAULT_RETRY_ATTEMPTS_NETWORK_ERROR_COUNT, DEFAULT_RETRY_INVALID_STATUS_COUNT, DEFAULT_RETRY_INVALID_STATUS_INTERVAL_MS);
    }

    public HttpTransportClient(int retryAttemptsNetworkErrorCount, int retryAttemptsInvalidStatusCount, int retryIntervalInvalidStatus) {
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
                .setServiceUnavailableRetryStrategy(new DefaultServiceUnavailableRetryStrategy(retryAttemptsInvalidStatusCount, retryIntervalInvalidStatus) {

                    @Override
                    public boolean retryRequest(HttpResponse response, int executionCount, HttpContext context) {
                        lastRetryAttemptsInvalidStatusCount = executionCount;

                        return super.retryRequest(response, executionCount, context);
                    }
                })
                .setRetryHandler(new DefaultHttpRequestRetryHandler(retryAttemptsNetworkErrorCount, true, Collections.singleton(SocketException.class)) {

                    @Override
                    public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
                        lastRetryAttemptsNetworkErrorCount = executionCount;

                        if (exception instanceof SocketException) {
                            LOG.warn("Network troubles", exception);
                        }
                        return super.retryRequest(exception, executionCount, context);
                    }
                })
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

    @Deprecated
    protected ClientResponse callWithStatusCheck(HttpRequestBase request) throws IOException {
        return call(request);
    }

    @Deprecated
    protected boolean isInvalidGatewayStatus(int status) {
        return status == HttpStatus.SC_BAD_GATEWAY || status == HttpStatus.SC_GATEWAY_TIMEOUT;
    }

    protected ClientResponse call(HttpRequestBase request) throws IOException {
        SUPERVISOR.addRequest(request);

        long startTime = System.currentTimeMillis();

        HttpResponse response = httpClient.execute(request);

        long endTime = System.currentTimeMillis();

        long resultTime = endTime - startTime;

        String result = null;
        Map<String, String> responseHeaders = null;
        Map<String, String> requestHeaders = null;

        try (InputStream content = response.getEntity().getContent()) {
            result = IOUtils.toString(content, ENCODING);
            responseHeaders = getHeaders(response.getAllHeaders());
            requestHeaders = getHeaders(request.getAllHeaders());
            return new ClientResponse(response.getStatusLine().getStatusCode(), result, responseHeaders);
        } finally {
            logRequest(request, requestHeaders, response, responseHeaders, result, resultTime, lastRetryAttemptsInvalidStatusCount, lastRetryAttemptsNetworkErrorCount);
            lastRetryAttemptsInvalidStatusCount = 0;
            lastRetryAttemptsNetworkErrorCount = 0;
            SUPERVISOR.removeRequest(request);
        }
    }

    @Deprecated
    protected void logRequest(HttpRequestBase request) throws IOException {
        logRequest(request, null, null, null, null, null, 0, 0);
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

    protected void logRequest(HttpRequestBase request, Map<String, String> requestHeaders, HttpResponse response, Map<String, String> responseHeaders, String body, Long time, int invalidStatusReturned, int networkErrors) throws IOException {
        if (LOG.isDebugEnabled()) {
            String payload = getRequestPayload(request);

            StringBuilder builder = new StringBuilder("\n")
                    .append("Request:\n")
                    .append("\t").append("Headers: ").append(requestHeaders != null ? requestHeaders : "-").append("\n")
                    .append("\t").append("Method: ").append(request.getMethod()).append("\n")
                    .append("\t").append("URI: ").append(request.getURI()).append("\n")
                    .append("\t").append("Payload: ").append(payload).append("\n")
                    .append("\t").append("Time: ").append(time != null ? time : "-").append("\n")
                    .append("\t").append("Invalid Status Returned: ").append(invalidStatusReturned).append("\n")
                    .append("\t").append("Network errors: ").append(networkErrors).append("\n");

            if (response != null) {
                builder.append("Response:\n")
                        .append("\t").append("Status: ").append(response.getStatusLine().toString()).append("\n")
                        .append("\t").append("Headers: ").append(responseHeaders != null ? responseHeaders : "-").append("\n")
                        .append("\t").append("Body: ").append(body != null ? body : "-").append("\n");
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

    @Override
    public ClientResponse get(String url) throws IOException {
        return get(url, FORM_CONTENT_TYPE);
    }

    @Override
    public ClientResponse get(String url, String contentType) throws IOException {
        HttpGet request = new HttpGet(url);
        request.setHeader(CONTENT_TYPE_HEADER, contentType);
        return call(request);
    }

    @Override
    public ClientResponse get(String url, Header[] headers) throws IOException {
        HttpGet request = new HttpGet(url);
        request.setHeader(CONTENT_TYPE_HEADER, FORM_CONTENT_TYPE);
        for (Header header : headers) {
            request.setHeader(header);
        }
        return call(request);
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

        return call(request);
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

        return call(request);
    }

    @Override
    public ClientResponse post(String url, String fileName, File file) throws IOException {
        HttpPost request = new HttpPost(url);
        FileBody fileBody = new FileBody(file);
        HttpEntity entity = MultipartEntityBuilder
                .create()
                .addPart(fileName, fileBody).build();

        request.setEntity(entity);
        return call(request);
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

        return call(request);
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

        return call(request);
    }
}