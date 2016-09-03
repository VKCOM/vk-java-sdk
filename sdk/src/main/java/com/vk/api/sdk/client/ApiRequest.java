package com.vk.api.sdk.client;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.ExceptionMapper;
import com.vk.api.sdk.objects.base.Error;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;

/**
 * Created by tsivarev on 21.07.16.
 */
public abstract class ApiRequest<T> {

    private static final Logger LOG = LogManager.getLogger(ApiRequest.class);

    private TransportClient client;

    private Gson gson;

    private String url;

    private Type responseClass;

    public ApiRequest(String url, TransportClient client, Gson gson, Type responseClass) {
        this.client = client;
        this.url = url;
        this.responseClass = responseClass;
        this.gson = gson;
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

        JsonElement response = json.get("response");

        if (!json.has("response")) { // for Client Credentials Flow response
            response = json;
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
            throw new ClientException("Internal API server error");
        }

        if (!response.getHeaders().containsKey("Content-Type")) {
            throw new ClientException("No content type header");
        }

        if (!response.getHeaders().get("Content-Type").contains("application/json")) {
            throw new ClientException("Invalid content type");
        }

        return response.getContent();
    }

    protected abstract String getBody();


}
