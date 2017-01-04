package com.vk.api.sdk.client;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import org.apache.commons.lang3.StringUtils;
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

    private final TransportClient client;

    private final Gson gson;

    private final Type responseClass;

    public ApiRequest(TransportClient client, Gson gson, Type responseClass) {
        this.client = client;
        this.gson = gson;
        this.responseClass = responseClass;
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
        JsonElement response = handleJson(json, gson);

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
            response = sendRequest(client);
        } catch (IOException e) {
            LOG.error("Problems with request", e);
            throw new ClientException("I/O exception", e);
        }

        response = handleResponse(response);
        return response.getContent();
    }

    /**
     * Handles responses
     * @param response
     * @return ClientResponse
     * @throws ClientException
     */
    protected ClientResponse handleResponse(ClientResponse response) throws ClientException {
        if (response.getStatusCode() != 200) {
            throw new ClientException("Internal API server error. Wrong status code: " + response.getStatusCode() + ". Content: " + response.getContent());
        }

        String expectedType = getExpectedContentType();
        if (StringUtils.isEmpty(expectedType)) {
            return response;
        }

        String contentType = response.getHeaders().get("Content-Type");

        if (StringUtils.isEmpty(contentType)) {
            throw new ClientException("No content type header, but expected: " + expectedType);
        }

        if (!contentType.contains(expectedType)) {
            throw new ClientException("Invalid content type: received " + contentType + ", but expected " + expectedType);
        }

        return response;
    }

    /**
     * Sends actual request to server
     * @param client TrasportClient
     * @return ClientResponse
     * @throws IOException
     */
    protected abstract ClientResponse sendRequest(TransportClient client) throws IOException;

    /**
     * MIME Content Type, that this request expects
     * @return content type
     */
    protected abstract String getExpectedContentType();
    /**
     *
     * @param json
     * @param gson
     * @return JsonElement that should be parsed to instance of generic parameter T
     * @throws ApiException
     */
    protected abstract JsonElement handleJson(JsonObject json, Gson gson) throws ApiException ;
}
