package com.vk.api.sdk.queries.upload;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.client.ApiRequest;
import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.ClientResponseTypeable;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ApiExtendedException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.UploadException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class UploadQueryBuilder<T, R> extends ApiRequest<R> {

    private static final Logger LOG = LoggerFactory.getLogger(UploadQueryBuilder.class);
    private final List<Header> headers = new ArrayList<>();
    private final Map<String, File> files;

    public UploadQueryBuilder(VkApiClient client, String uploadUrl, Map<String, File> files, Type type) {
        super(uploadUrl, client.getTransportClient(), client.getGson(), 0, type);
        this.files = files;
    }

    protected abstract T getThis();

    @Override
    public R execute() throws ApiException, ClientException {
        return parseClientResponse(executeAsStringWithReturningFullInfo());
    }

    @Override
    public ClientResponseTypeable<R> executeTypeable() throws ApiExtendedException, ClientException {
        ClientResponse response = executeAsStringWithReturningFullInfo();

        return new ClientResponseTypeable<R>(
                response.getStatusCode(),
                parseClientResponse(response),
                response.getHeaders()
        );
    }

    private R parseClientResponse(ClientResponse response) throws ClientException, ApiExtendedException {
        String textResponse = response.getContent();
        JsonReader jsonReader = new JsonReader(new StringReader(textResponse));
        JsonObject json = (JsonObject) JsonParser.parseReader(jsonReader);

        if (json.has("error")) {
            UploadException uploadException = new UploadException(
                    0,
                    response.getStatusCode(),
                    response.getHeaders(),
                    textResponse,
                    ""
            );
            LOG.error("API error", uploadException);
            throw uploadException;
        }

        JsonElement json_response = json.has("response") ? json.get("response") : json;

        try {
            return getGson().fromJson(json_response, getResponseClass());
        } catch (JsonSyntaxException e) {
            LOG.error("Invalid JSON: " + textResponse, e);
            throw new ClientException("Can't parse json response");
        }
    }

    @Override
    public ClientResponse executeAsStringWithReturningFullInfo() throws ClientException {
        ClientResponse response;
        try {
            if (files != null) {
                response = getClient().post(getUrl(), files);
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

        return response;
    }

    @Override
    public String executeAsString() throws ClientException {
        return executeAsStringWithReturningFullInfo().getContent();
    }

    @Override
    protected String getBody() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    protected Header[] getQueryHeaders() {
        List<Header> result = new ArrayList<>(this.headers);
        return result.toArray(new Header[0]);
    }

    /**
     * Add header to request
     *
     * @param header Header to be added to the request
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T withHeader(BasicHeader header) {
        headers.add(header);
        return getThis();
    }

    /**
     * Add multiple headers to request
     *
     * @param list List of headers which need to be added to request
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T withHeaders(List<BasicHeader> list) {
        headers.addAll(list);
        return getThis();
    }
}
