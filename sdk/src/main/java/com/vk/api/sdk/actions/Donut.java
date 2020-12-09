package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.donut.DonutGetFriendsQueryWithFields;
import com.vk.api.sdk.queries.donut.DonutGetSubscriptionQuery;
import com.vk.api.sdk.queries.donut.DonutGetSubscriptionsQuery;
import com.vk.api.sdk.queries.donut.DonutIsDonQuery;

/**
 * List of Donut methods
 */
public class Donut extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Donut(VkApiClient client) {
        super(client);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param fields
     * @return query
     */
    public DonutGetFriendsQueryWithFields getFriendsWithFields(UserActor actor, int ownerId,
            String... fields) {
        return new DonutGetFriendsQueryWithFields(getClient(), actor, ownerId, fields);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @return query
     */
    public DonutGetSubscriptionQuery getSubscription(UserActor actor, int ownerId) {
        return new DonutGetSubscriptionQuery(getClient(), actor, ownerId);
    }

    /**
     * Returns a list of user's VK Donut subscriptions.
     *
     * @param actor vk actor
     * @return query
     */
    public DonutGetSubscriptionsQuery getSubscriptions(UserActor actor) {
        return new DonutGetSubscriptionsQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @return query
     */
    public DonutIsDonQuery isDon(UserActor actor, int ownerId) {
        return new DonutIsDonQuery(getClient(), actor, ownerId);
    }
}
