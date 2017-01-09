package com.vk.api.sdk.httpclient;

import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.TransportClient;
import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
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
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anton Tsivarev on 11.09.15.
 */
public class HttpTransportClient implements TransportClient {

    private static final Logger LOG = LoggerFactory.getLogger(HttpTransportClient.class);

    private static final String ENCODING = "UTF-8";
    private static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String USER_AGENT = "Java VK SDK/0.3.10";

    private static final int MAX_SIMULTANEOUS_CONNECTIONS = 300;
    private static final int FULL_CONNECTION_TIMEOUT_S = 60;
    private static final int CONNECTION_TIMEOUT_MS = 5_000;
    private static final int SOCKET_TIMEOUT_MS = FULL_CONNECTION_TIMEOUT_S * 1000;

    private static final ConnectionsSupervisor SUPERVISOR = new ConnectionsSupervisor();
    private static HttpTransportClient instance;
    private static HttpClient httpClient;

    public HttpTransportClient() {
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

    private ClientResponse call(HttpUriRequest request) throws IOException {
        SocketException exception = null;
        for (int i = 0; i < 3; i++) {
            try {
                SUPERVISOR.addRequest(request);

                long startTime = System.currentTimeMillis();

                HttpResponse response = httpClient.execute(request);

                long endTime = System.currentTimeMillis();

                long resultTime = endTime - startTime;

                LOG.info(String.format("%s\t\t%d", request.getURI().toURL().toString(), resultTime));

                try (InputStream content = response.getEntity().getContent()) {
                    String result = IOUtils.toString(content, ENCODING);
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Response: " + result);
                    }
                    return new ClientResponse(response.getStatusLine().getStatusCode(), result, getHeaders(response.getAllHeaders()));
                } finally {
                    SUPERVISOR.removeRequest(request);
                }
            } catch (SocketException e) {
                LOG.warn("Network troubles", e);
                exception = e;
            }
        }

        throw exception;
    }

    @Override
    public ClientResponse post(String url, String body) throws IOException {
        HttpPost request = new HttpPost(url);
        request.setHeader(CONTENT_TYPE_HEADER, CONTENT_TYPE);
        if (body != null) {
            request.setEntity(new StringEntity(body));
        }

        return call(request);
    }

    @Override
    public ClientResponse post(String url) throws IOException {
        HttpPost request = new HttpPost(url);
        request.setHeader(CONTENT_TYPE_HEADER, CONTENT_TYPE);
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
    public ClientResponse get(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        return call(request);
    }


}
