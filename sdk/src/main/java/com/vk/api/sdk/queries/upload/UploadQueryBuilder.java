package com.vk.api.sdk.queries.upload;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.vk.api.sdk.client.ApiRequest;
import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.UploadException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;

public abstract class UploadQueryBuilder<T, R> extends ApiRequest<R> {

    private static final Logger LOG = LogManager.getLogger(UploadQueryBuilder.class);

    private final String uploadUrl;
    private final String filename;
    private final File file;

    public UploadQueryBuilder(VkApiClient client, String uploadUrl, String filename, File file, Type type) {
        super(client.getTransportClient(), client.getGson(), type);
        this.uploadUrl = uploadUrl;
        this.filename = filename;
        this.file = file;
    }

    protected abstract T getThis();

    @Override
    protected ClientResponse sendRequest(TransportClient client) throws IOException {
        if (file == null) {
            return getClient().post(uploadUrl);
        }

        return getClient().post(uploadUrl, filename, file);
    }

    @Override
    protected ClientResponse handleResponse(ClientResponse response) throws ClientException {
        if (response.getStatusCode() != 200) {
            throw new ClientException("Internal API server error");
        }

        return response;
    }

    @Override
    protected JsonElement handleJson(JsonObject json, Gson gson) throws ApiException {
        if (json.has("error")) {
            JsonElement errorElement = json.get("error");
            UploadException uploadException = new UploadException(0, errorElement.toString(), "");
            LOG.error("API error", uploadException);
            throw uploadException;
        }

        return json;
    }
}
