package com.vk.api.sdk.client;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.exceptions.*;
import com.vk.api.sdk.objects.base.Error;
import com.vk.api.sdk.objects.base.ErrorWithCaptcha;
import org.apache.http.Header;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import com.vk.api.sdk.objects.Validable;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Map;

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

    private Header[] headers = new Header[0];

    public ApiRequest(String url, TransportClient client, Gson gson, int retryAttempts, Type responseClass) {
        this.client = client;
        this.url = url;
        this.responseClass = responseClass;
        this.gson = gson;
        this.retryAttempts = retryAttempts;
    }

    public ApiRequest<T> setHeaders(Header[] headers) {
        if (headers != null) {
            this.headers = headers;
        }

        return this;
    }

    protected Header[] getHeaders() {
        return this.headers;
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

    private T executeWithoutRetry() throws ClientException, ApiException {
        String textResponse = executeAsString();
        JsonReader jsonReader = new JsonReader(new StringReader(textResponse));
        JsonObject json = (JsonObject) new JsonParser().parse(jsonReader);

        if (json.has("error")) {
            JsonElement errorElement = json.get("error");
            ErrorWithCaptcha error;
            try {
                error = gson.fromJson(errorElement, ErrorWithCaptcha.class);
            } catch (JsonSyntaxException e) {
                LOG.error("Invalid JSON: " + textResponse, e);
                throw new ClientException("Can't parse json response");
            }

            ApiException exception = ExceptionMapperCustom.parseException(error);

            LOG.error("API error", exception);
            throw exception;
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

    public String executeAsString() throws ClientException {
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

        return response.getContent();
    }

    public ClientResponse executeAsRaw() throws ClientException {
        try {
            return client.post(url, getBody());
        } catch (IOException e) {
            LOG.error("Problems with request: " + url, e);
            throw new ClientException("I/O exception");
        }
    }

    protected abstract String getBody();
}
