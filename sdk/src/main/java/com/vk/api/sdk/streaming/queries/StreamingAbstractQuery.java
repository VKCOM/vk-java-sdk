package com.vk.api.sdk.streaming.queries;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.vk.api.sdk.events.longpoll.LongPollQueryBuilder;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;
import com.vk.api.sdk.streaming.clients.actors.StreamingActor;
import com.vk.api.sdk.streaming.exceptions.StreamingApiException;
import com.vk.api.sdk.streaming.exceptions.StreamingClientException;
import com.vk.api.sdk.streaming.objects.responses.StreamingResponse;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.lang.reflect.Type;

/**
 * Abstract query for Streaming API
 */
public abstract class StreamingAbstractQuery {

    private static final Logger LOG = LoggerFactory.getLogger(LongPollQueryBuilder.class);

    private TransportClient httpClient;
    private Gson gson;
    private Type responseClass;
    private String url;

    public StreamingAbstractQuery(VkStreamingApiClient client, StreamingActor actor, String path, Type responseClass) {
        this.responseClass = responseClass;
        this.gson = client.getGson();
        this.httpClient = client.getTransportClient();
        this.url = buildUrl(actor, path);
    }

    TransportClient getHttpClient() {
        return httpClient;
    }

    Gson getGson() {
        return gson;
    }

    String getUrl() {
        return url;
    }

    private String buildUrl(StreamingActor actor, String path) {
        return "https://" + actor.getEndpoint() + "/" + path + "?key=" + actor.getKey();
    }

    abstract public String executeAsString() throws StreamingClientException;

    public <T extends StreamingResponse> T execute() throws StreamingClientException, StreamingApiException {
        String json = executeAsString();

        T response;
        try {
            response = gson.fromJson(json, responseClass);
        } catch (JsonSyntaxException e) {
            LOG.error("Invalid JSON: " + json, e);
            throw new StreamingClientException("Can't parse json response");
        }

        if (response.getError() != null) {
            throw new StreamingApiException(response.getError());
        }

        return response;
    }
}
