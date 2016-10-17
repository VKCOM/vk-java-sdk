package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.notifications.NotificationsGetQuery;
import com.vk.api.sdk.queries.notifications.NotificationsMarkAsViewedQuery;

/**
 * List of Notifications methods
 */
public class Notifications extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Notifications(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of notifications about other users' feedback to the current user's wall posts.
     */
    public NotificationsGetQuery get(UserActor actor) {
        return new NotificationsGetQuery(getClient(), actor);
    }

    /**
     * Resets the counter of new notifications about other users' feedback to the current user's wall posts.
     */
    public NotificationsMarkAsViewedQuery markAsViewed(UserActor actor) {
        return new NotificationsMarkAsViewedQuery(getClient(), actor);
    }
}
