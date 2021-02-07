package com.vk.api.sdk.queries.upload;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.client.ApiRequest;
import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.UploadException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;

public abstract class UploadQueryBuilder<T, R> extends ApiRequest<R> {

    private static final Logger LOG = LoggerFactory.getLogger(UploadQueryBuilder.class);

    private String filename;

    private File file;

    public UploadQueryBuilder(VkApiClient client, String uploadUrl, String filename, Type type) {
        super(uploadUrl, client.getTransportClient(), client.getGson(), 0, type);
        this.filename = filename;
    }

    public T file(File value) {
        file = value;
        return getThis();
    }

    protected abstract T getThis();

    @Override
    public R execute() throws ApiException, ClientException {
        String textResponse = executeAsString();
        JsonReader jsonReader = new JsonReader(new StringReader(textResponse));
        JsonObject json = (JsonObject) new JsonParser().parse(jsonReader);

        if (json.has("error")) {
            UploadException uploadException = new UploadException(0, textResponse, "");
            LOG.error("API error", uploadException);
            throw uploadException;
        }

        if (json.has("response")) {
            json = json.get("response").getAsJsonObject();
        }

        try {
            return getGson().fromJson(json, getResponseClass());
        } catch (JsonSyntaxException e) {
            LOG.error("Invalid JSON: " + textResponse, e);
            throw new ClientException("Can't parse json response");
        }
    }

    @Override
    public String executeAsString() throws ClientException {
        ClientResponse response;
        try {
            if (file != null) {
                response = getClient().post(getUrl(), filename, file);
            } else {
                response = getClient().post(getUrl());
            }
        } catch (IOException e) {
            LOG.error("Problems with request: " + getUrl(), e);
            throw new ClientException("I/O exception");
        }

        if (response.getStatusCode() != 200) {
            LOG.error("Invalid HTTP status " + response.getStatusCode() + " from " + getUrl());
            throw new ClientException("Internal API server error");
        }

        return response.getContent();
    }

    @Override
    protected String getBody() {
        throw new UnsupportedOperationException("not supported");
    }
}
