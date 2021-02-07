package com.vk.api.sdk.streaming.queries;

import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;
import com.vk.api.sdk.streaming.clients.actors.StreamingActor;
import com.vk.api.sdk.streaming.exceptions.StreamingClientException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Abstract DELETE query for Streaming API
 */
public abstract class StreamingAbstractDeleteQuery extends StreamingAbstractQuery {

    private static final Logger LOG = LoggerFactory.getLogger(StreamingAbstractDeleteQuery.class);
    private static final String CONTENT_TYPE = "application/json";

    private String body;

    public StreamingAbstractDeleteQuery(VkStreamingApiClient client, StreamingActor actor, String path, Type responseClass) {
        super(client, actor, path, responseClass);
    }

    public String executeAsString() throws StreamingClientException {
        try {
            if (StringUtils.isNotEmpty(body)) {
                return getHttpClient().delete(getUrl(), body, CONTENT_TYPE).getContent();
            }

            return getHttpClient().delete(getUrl(), null, CONTENT_TYPE).getContent();
        } catch (IOException e) {
            LOG.error("Problems with request: " + getUrl(), e);
            throw new StreamingClientException("I/O exception");
        }
    }

    protected void setBody(Object object) {
        body = getGson().toJson(object);
    }
}
