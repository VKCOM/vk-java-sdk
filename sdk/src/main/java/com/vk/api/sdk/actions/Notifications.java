package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.notifications.NotificationsGetQuery;
import com.vk.api.sdk.queries.notifications.NotificationsMarkAsViewedQuery;

/**
 * List of Notifications methods
 */
public class Notifications extends AbstractAction {
    public Notifications(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of notifications about other users' feedback to the current user's wall posts.
     */
    public NotificationsGetQuery get(Actor actor) {
        return new NotificationsGetQuery(getClient(), actor);
    }

    /**
     * Resets the counter of new notifications about other users' feedback to the current user's wall posts.
     */
    public NotificationsMarkAsViewedQuery markAsViewed(Actor actor) {
        return new NotificationsMarkAsViewedQuery(getClient(), actor);
    }
}
