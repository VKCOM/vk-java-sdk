package com.vk.api.sdk.client;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
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
     * Sends actual request to server
     * @param client TrasportClient
     * @return ClientResponse
     * @throws IOException
     */
    protected abstract ClientResponse sendRequest(TransportClient client) throws IOException;

    /**
     * Handles responses
     * @param response
     * @return ClientResponse
     * @throws ClientException
     */
    protected abstract ClientResponse handleResponse(ClientResponse response) throws ClientException;

    /**
     *
     * @param json
     * @param gson
     * @return JsonElement that should be parsed to instance of generic parameter T
     * @throws ApiException
     */
    protected abstract JsonElement handleJson(JsonObject json, Gson gson) throws ApiException ;
}
