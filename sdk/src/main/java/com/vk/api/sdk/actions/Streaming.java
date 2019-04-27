package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.streaming.StreamingGetServerUrlQuery;
import com.vk.api.sdk.queries.streaming.StreamingSetSettingsQuery;

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
     * Allows to receive data for the connection to Streaming API.
     *
     * @param actor vk actor
     * @return query
     */
    public StreamingGetServerUrlQuery getServerUrl(UserActor actor) {
        return new StreamingGetServerUrlQuery(getClient(), actor);
    }

    /**
     * Allows to receive data for the connection to Streaming API.
     *
     * @param actor vk actor
     * @return query
     */
    public StreamingGetServerUrlQuery getServerUrl(ServiceActor actor) {
        return new StreamingGetServerUrlQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public StreamingSetSettingsQuery setSettings(UserActor actor) {
        return new StreamingSetSettingsQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public StreamingSetSettingsQuery setSettings(ServiceActor actor) {
        return new StreamingSetSettingsQuery(getClient(), actor);
    }
}
