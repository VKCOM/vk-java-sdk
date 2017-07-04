package com.vk.api.sdk.streaming.actions;

import com.vk.api.sdk.streaming.clients.StreamingEventHandler;
import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;
import com.vk.api.sdk.streaming.clients.actors.StreamingActor;
import com.vk.api.sdk.streaming.queries.stream.StreamingStreamQuery;

import java.util.concurrent.ExecutionException;

/**
 * Streaming stream action
 */
public class StreamingStream extends StreamingAbstractAction {

    public StreamingStream(VkStreamingApiClient streamingClient) {
        super(streamingClient);
    }

    public StreamingStreamQuery get(StreamingActor actor, StreamingEventHandler handler) throws ExecutionException, InterruptedException {
        return new StreamingStreamQuery(getClient(), actor, handler);
    }
}
