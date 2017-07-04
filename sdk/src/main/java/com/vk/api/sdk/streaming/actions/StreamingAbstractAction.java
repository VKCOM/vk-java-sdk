package com.vk.api.sdk.streaming.actions;

import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;

/**
 * Abstract action for Streaming API
 */
public abstract class StreamingAbstractAction {

    private VkStreamingApiClient streamingClient;

    public StreamingAbstractAction(VkStreamingApiClient streamingClient) {
        this.streamingClient = streamingClient;
    }

    protected VkStreamingApiClient getClient() {
        return streamingClient;
    }
}
