package com.vk.api.sdk.streaming.queries;

import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;
import com.vk.api.sdk.streaming.clients.actors.StreamingActor;
import com.vk.api.sdk.streaming.exceptions.StreamingClientException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Abstract POST query for Streaming API
 */
public abstract class StreamingAbstractPostQuery extends StreamingAbstractQuery {

    private static final Logger LOG = LoggerFactory.getLogger(StreamingAbstractPostQuery.class);
    private static final String CONTENT_TYPE = "application/json";

    private String body;

    public StreamingAbstractPostQuery(VkStreamingApiClient client, StreamingActor actor, String path, Type responseClass) {
        super(client, actor, path, responseClass);
    }

    public String executeAsString() throws StreamingClientException {
        try {
            if (StringUtils.isNotEmpty(body)) {
                return getHttpClient().post(getUrl(), body, CONTENT_TYPE).getContent();
            }

            return getHttpClient().post(getUrl(), null, CONTENT_TYPE).getContent();
        } catch (IOException e) {
            LOG.error("Problems with request: " + getUrl(), e);
            throw new StreamingClientException("I/O exception");
        }
    }

    public void setBody(Object object) {
        body = getGson().toJson(object);
    }
}
