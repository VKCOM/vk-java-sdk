package com.vk.api.sdk.streaming.queries;

import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;
import com.vk.api.sdk.streaming.clients.actors.StreamingActor;
import com.vk.api.sdk.streaming.exceptions.StreamingClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Abstract GET query for Streaming API
 */
public abstract class StreamingAbstractGetQuery extends StreamingAbstractQuery {

    private static final Logger LOG = LoggerFactory.getLogger(StreamingAbstractGetQuery.class);
    private static final String CONTENT_TYPE = "application/json";

    public StreamingAbstractGetQuery(VkStreamingApiClient client, StreamingActor actor, String path, Type responseClass) {
        super(client, actor, path, responseClass);
    }

    public String executeAsString() throws StreamingClientException {
        try {
            return getHttpClient().get(getUrl(), CONTENT_TYPE).getContent();
        } catch (IOException e) {
            LOG.error("Problems with request: " + getUrl(), e);
            throw new StreamingClientException("I/O exception");
        }
    }
}
