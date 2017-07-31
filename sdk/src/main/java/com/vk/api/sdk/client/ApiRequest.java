package com.vk.api.sdk.client;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ApiServerException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.ExceptionMapper;
import com.vk.api.sdk.objects.base.Error;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;

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

    public ApiRequest(String url, TransportClient client, Gson gson, int retryAttempts, Type responseClass) {
        this.client = client;
        this.url = url;
        this.responseClass = responseClass;
        this.gson = gson;
        this.retryAttempts = retryAttempts;
    }

    protected String getUrl() {
        return url;
    }

    protected Gson getGson() {
        return gson;
    }

    protected TransportClient getClient() {
        return client;
    }

    protected Type getResponseClass() {
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
            Error error;
            try {
                error = gson.fromJson(errorElement, Error.class);
            } catch (JsonSyntaxException e) {
                LOG.error("Invalid JSON: " + textResponse, e);
                throw new ClientException("Can't parse json response");
            }

            ApiException exception = ExceptionMapper.parseException(error);

            LOG.error("API error", exception);
            throw exception;
        }

        JsonElement response = json;
        if (json.has("response")) {
            response = json.get("response");
        }

        try {
            return gson.fromJson(response, responseClass);
        } catch (JsonSyntaxException e) {
            LOG.error("Invalid JSON: " + textResponse, e);
            throw new ClientException("Can't parse json response");
        }
    }

    public String executeAsString() throws ClientException {
        ClientResponse response;
        try {
            response = client.post(url, getBody());
        } catch (IOException e) {
            LOG.error("Problems with request: " + url, e);
            throw new ClientException("I/O exception");
        }

        if (response.getStatusCode() != 200) {
            throw new ClientException("Internal API server error. Wrong status code: " + response.getStatusCode() + ". Content: " + response.getContent());
        }

        if (!response.getHeaders().containsKey("Content-Type")) {
            throw new ClientException("No content type header");
        }

        if (!response.getHeaders().get("Content-Type").contains("application/json")) {
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
