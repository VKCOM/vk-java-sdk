package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.queries.streaming.StreamingGetServerUrl;

/**
 * List of Streaming methods
 */
public class Streaming extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Streaming(VkApiClient client) {
        super(client);
    }

    /**
     * Get endpoint for streaming
     */
    public StreamingGetServerUrl getServerUrl(ServiceActor actor) {
        return new StreamingGetServerUrl(getClient(), actor);
    }
}
