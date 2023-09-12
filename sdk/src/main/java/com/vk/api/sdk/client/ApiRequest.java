package com.vk.api.sdk.client;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.exceptions.*;
import com.vk.api.sdk.objects.base.Error;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import com.vk.api.sdk.objects.Validable;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by tsivarev on 21.07.16.
 */
public abstract class ApiRequest<T> {

    private static final Logger LOG = LoggerFactory.getLogger(ApiRequest.class);

    private TransportClient client;

    private Gson gson;

    private String url;

    private Type responseClass;

    private int retryAttempts;

    private List<Header> headers = new ArrayList<>();

    private Map<String, String> cookies = new HashMap<>();

    public ApiRequest(String url, TransportClient client, Gson gson, int retryAttempts, Type responseClass) {
        this.client = client;
        this.url = url;
        this.responseClass = responseClass;
        this.gson = gson;
        this.retryAttempts = retryAttempts;
    }

    public ApiRequest<T> setCookie(String name, String value) {
        this.cookies.put(name, value);
        return this;
    }
    public ApiRequest<T> setCookies(Map<String, String> entries) {
        this.cookies.putAll(entries);
        return this;
    }

    public String getCookie(String name) {
        return cookies.get(name);
    }

    private Header getCookies() {
        return new BasicHeader("Cookie",
                this.cookies.entrySet().stream()
                        .map(entry -> String.format("%s=%s", entry.getKey(), entry.getValue()))
                        .reduce("", (result, cookie) -> result + cookie + ";"));
    }

    public ApiRequest<T> setHeaders(Header[] headers) {
        if (headers != null) {
            this.headers = Arrays.asList(headers);
        }

        return this;
    }

    public ApiRequest<T> addHeader(Header header) {
        if (header != null) {
            this.headers.add(header);
        }

        return this;
    }

    public ApiRequest<T> addHeaders(List<Header> headers) {
        if (headers != null && !headers.isEmpty()) {
            this.headers.addAll(headers);
        }

        return this;
    }

    public ApiRequest<T> setHeaders(List<Header> headers) {
        if (headers != null) {
            this.headers = new ArrayList<>(headers);
        }

        return this;
    }

    public Header[] getHeaders() {
        List<Header> result = new ArrayList<>(this.headers);
        result.addAll(Arrays.asList(getQueryHeaders()));
        if(!cookies.isEmpty()) result.add(this.getCookies());
        return result.toArray(new Header[0]);
    }

    public String getUrl() {
        return url;
    }

    protected Gson getGson() {
        return gson;
    }

    protected TransportClient getClient() {
        return client;
    }

    public Type getResponseClass() {
        return responseClass;
    }

    public T execute() throws ApiException, ClientException {
        ApiServerException exception = null;
        for (int i = 0; i < retryAttempts; i++) {
            try {
                return executeWithoutRetry();
            } catch (ApiServerException e) {
                LOG.warn("API Server error", e);
                exception = e;
            }
        }

        throw exception;
    }

    public ClientResponseTypeable<T> executeTypeable() throws ApiExtendedException, ClientException {
        ApiExtendedException exception = null;
        for (int i = 0; i < retryAttempts; i++) {
            try {
                return executeTypeableWithoutRetry();
            } catch (ApiExtendedException e) {
                LOG.warn("API Server error", e);
                exception = e;
            }
        }

        throw exception;
    }

    public T executeWithoutRetry() throws ClientException, ApiException {
        return parseClientResponse(executeAsStringWithReturningFullInfo());
    }

    public ClientResponseTypeable<T> executeTypeableWithoutRetry() throws ClientException, ApiExtendedException {
        ClientResponse response = executeAsStringWithReturningFullInfo();

        return new ClientResponseTypeable<T>(
                response.getStatusCode(),
                parseClientResponse(response),
                response.getHeaders()
        );
    }

    private T parseClientResponse(ClientResponse clientResponse) throws ClientException, ApiExtendedException {
        String textResponse = clientResponse.getContent();
        JsonReader jsonReader = new JsonReader(new StringReader(textResponse));
        JsonObject json = (JsonObject) new JsonParser().parse(jsonReader);

        if (json.has("error")) {
            JsonElement errorElement = json.get("error");
            Error error;
            try {
                error = gson.fromJson(errorElement, Error.class);
            } catch (JsonSyntaxException e) {
                LOG.error("Invalid JSON: " + textResponse, e);
                throw new ClientException("Can't parse json response");
            }

            ApiException apiException = ExceptionMapper.parseException(error);
            ApiExtendedException extendedException = new ApiExtendedException(
                    apiException.getCode(),
                    clientResponse.getStatusCode(),
                    clientResponse.getHeaders(),
                    apiException.getDescription(),
                    apiException.getMessageRaw()
            );

            LOG.error("API error", extendedException);
            throw extendedException;
        }

        JsonElement response = json;
        if (json.has("response")) {
            response = json.get("response");
        }

        try {
            T result = gson.fromJson(response, responseClass);
            if (result instanceof Validable) {
                try {
                    Validable validable = (Validable) result;
                    validable.validateRequired();
                } catch (RequiredFieldException e) {
                    throw new ClientException("JSON validate fail: " + textResponse + "\n" + e.toString());
                } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException e) {
                    throw new ClientException("JSON validate fail:" + textResponse + e.toString());
                }
            }

            return result;
        } catch (JsonSyntaxException e) {
            throw new ClientException("Can't parse json response: " + textResponse + "\n" + e.toString());
        }
    }

    public ClientResponse executeAsStringWithReturningFullInfo() throws ClientException {
        ClientResponse response;
        try {
            response = client.post(url, getBody(), getHeaders());
        } catch (IOException e) {
            LOG.error("Problems with request: " + url, e);
            throw new ClientException("I/O exception");
        }

        if (response.getStatusCode() != 200) {
            throw new ClientException("Internal API server error. Wrong status code: " + response.getStatusCode() + ". Content: " + response.getContent());
        }

        Map<String, String> headers = response.getHeaders();

        if (!headers.containsKey("Content-Type")) {
            throw new ClientException("No content type header");
        }

        String contentType = headers.get("Content-Type");

        if (!contentType.contains("application/json") && !contentType.contains("text/javascript")) {
            throw new ClientException("Invalid content type");
        }

        return response;
    }

    public String executeAsString() throws ClientException {
        return executeAsStringWithReturningFullInfo().getContent();
    }

    public ClientResponse executeAsRaw() throws ClientException {
        try {
            return client.post(url, getBody(), getHeaders());
        } catch (IOException e) {
            LOG.error("Problems with request: " + url, e);
            throw new ClientException("I/O exception");
        }
    }

    protected abstract String getBody();

    protected abstract Header[] getQueryHeaders();
}
