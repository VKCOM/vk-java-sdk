package com.vk.api.sdk.queries.orders;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.orders.responses.CancelSubscriptionResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Orders.cancelSubscription method
 */
public class OrdersCancelSubscriptionQuery extends AbstractQueryBuilder<OrdersCancelSubscriptionQuery, CancelSubscriptionResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     * @param subscriptionId value of "subscription id" parameter. Minimum is 0.
     */
    public OrdersCancelSubscriptionQuery(VkApiClient client, ServiceActor actor, int userId,
            int subscriptionId) {
        super(client, "orders.cancelSubscription", CancelSubscriptionResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        userId(userId);
        subscriptionId(subscriptionId);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersCancelSubscriptionQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set subscription id
     *
     * @param value value of "subscription id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersCancelSubscriptionQuery subscriptionId(int value) {
        return unsafeParam("subscription_id", value);
    }

    /**
     * Set pending cancel
     *
     * @param value value of "pending cancel" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public OrdersCancelSubscriptionQuery pendingCancel(Boolean value) {
        return unsafeParam("pending_cancel", value);
    }

    @Override
    protected OrdersCancelSubscriptionQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("subscription_id", "user_id", "access_token");
    }
}
