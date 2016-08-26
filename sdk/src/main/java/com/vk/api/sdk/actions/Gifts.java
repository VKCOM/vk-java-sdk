package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.gifts.GiftsGetQuery;

/**
 * List of Gifts methods
 */
public class Gifts extends AbstractAction {
    public Gifts(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of user gifts.
     */
    public GiftsGetQuery get(Actor actor) {
        return new GiftsGetQuery(getClient(), actor);
    }
}
