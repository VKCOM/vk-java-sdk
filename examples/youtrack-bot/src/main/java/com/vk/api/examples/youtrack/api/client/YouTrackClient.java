package com.vk.api.examples.youtrack.api.client;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.SSLContexts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tsivarev on 29.04.16.
 */
public class YouTrackClient {

    private static final Logger LOG = LoggerFactory.getLogger(YouTrackClient.class);

    private static final String ENCODING = "UTF-8";
    private static final int MAX_SIMULTANEOUS_CONNECTIONS = 300;
    private static final int FULL_CONNECTION_TIMEOUT_S = 60;
    private static final int CONNECTION_TIMEOUT_MS = 20_000;
    private static final int SOCKET_TIMEOUT_MS = FULL_CONNECTION_TIMEOUT_S * 1000;
    private static final String CONTENT_TYPE = "application/x-www-form-urlencoded";

    private final CloseableHttpClient client;

    private final String host;

    public YouTrackClient(String host) {
        this(host, null, null, null, null, null, null, null);
    }

    public YouTrackClient(String host, String keyStoreType, String keyStorePath, String keyStorePassword, String keyPassword,
                          String trustStoreType, String trustStorePath, String trustStorePassword) {
        this.host = host;

        CookieStore cookieStore = new BasicCookieStore();
        RequestConfig requestConfig = RequestConfig.custom()
                .setSocketTimeout(SOCKET_TIMEOUT_MS)
                .setConnectTimeout(CONNECTION_TIMEOUT_MS)
                .setConnectionRequestTimeout(CONNECTION_TIMEOUT_MS)
                .setCookieSpec(CookieSpecs.STANDARD)
                .build();

        LayeredConnectionSocketFactory sslFactory;

        RegistryBuilder<ConnectionSocketFactory> registryBuilder = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", new PlainConnectionSocketFactory());

        if (host.contains("https://")) {
            try {
                sslFactory = initSslContext(keyStoreType, keyStorePath, keyStorePassword, keyPassword, trustStoreType, trustStorePath, trustStorePassword);
                registryBuilder.register("https", sslFactory);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        Registry<ConnectionSocketFactory> registry = registryBuilder.build();

        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(registry);

        connectionManager.setMaxTotal(MAX_SIMULTANEOUS_CONNECTIONS);
        connectionManager.setDefaultMaxPerRoute(MAX_SIMULTANEOUS_CONNECTIONS);

        client = HttpClients.custom()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(requestConfig)
                .setDefaultCookieStore(cookieStore)
                .build();
    }

    private static Map<String, String> getResponseHeaders(Header[] headers) {
        Map<String, String> result = new HashMap<>();
        for (Header header : headers) {
            result.put(header.getName(), header.getValue());
        }

        return result;
    }

    private static String mapToGetString(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            builder.append("&").append(entry.getKey()).append("=").append(entry.getValue() != null ? escape(entry.getValue()) : "");
        }

        return builder.toString();
    }

    private static String escape(String urlData) {
        try {
            return URLEncoder.encode(urlData, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    private SSLConnectionSocketFactory initSslContext(String keyStoreType, String keyStorePath, String keyStorePassword, String keyPassword,
                                                      String trustStoreType, String trustStorePath, String trustStorePassword)
            throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException, UnrecoverableKeyException, KeyManagementException {

        SSLContextBuilder sslContextBuilder = SSLContexts.custom();

        if (StringUtils.isNoneBlank(keyStorePath)) {
            KeyStore keyStore = SslUtils.getStore(keyStoreType, keyStorePath, keyStorePassword);
            if (keyStore.size() == 0) {
                throw new IllegalStateException("Key store has no keys");
            }

            sslContextBuilder.loadKeyMaterial(keyStore, keyPassword.toCharArray());
        }

        if (StringUtils.isNoneBlank(trustStorePath)) {
            KeyStore trustStore = SslUtils.getStore(trustStoreType, trustStorePath, trustStorePassword);
            if (trustStore.size() == 0) {
                throw new IllegalStateException("Trust store has no keys");
            }

            sslContextBuilder.loadTrustMaterial(trustStore, new TrustSelfSignedStrategy());
        }

        return new SSLConnectionSocketFactory(
                sslContextBuilder.build(),
                SSLConnectionSocketFactory.getDefaultHostnameVerifier());
    }

    public void login(String username, String password) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("login", username);
        params.put("password", password);

        post("/rest/user/login", mapToGetString(params));
    }

    public YouTrackResponse put(String path) throws IOException {
        return put(path, null);
    }

    public YouTrackResponse put(String path, Map<String, String> params) throws IOException {
        String url = host + path;
        if (MapUtils.isNotEmpty(params)) {
            url += "?" + mapToGetString(params);
        }

        HttpPut request = new HttpPut(url);
        request.setHeader("Content-Type", CONTENT_TYPE);
        return call(request);
    }

    public YouTrackResponse get(String path) throws IOException {
        return get(path, null);
    }

    public YouTrackResponse get(String path, Map<String, String> params) throws IOException {
        String url = host + path;
        if (MapUtils.isNotEmpty(params)) {
            url += "?" + mapToGetString(params);
        }

        HttpGet request = new HttpGet(url);
        return call(request);
    }

    public YouTrackResponse post(String path, String body) throws IOException {
        HttpPost request = new HttpPost(host + path);
        request.setHeader("Content-Type", CONTENT_TYPE);
        if (body != null) {
            request.setEntity(new StringEntity(body));
        }

        return call(request);
    }

    private YouTrackResponse call(HttpUriRequest request) throws IOException {
        HttpResponse response = client.execute(request);
        try (InputStream content = response.getEntity().getContent()) {
            String result = IOUtils.toString(content, ENCODING);
            LOG.info(request.getURI().toString() + " " + response.getStatusLine().getStatusCode());
            return new YouTrackResponse(response.getStatusLine().getStatusCode(), result, getResponseHeaders(response.getAllHeaders()));
        }
    }

}
