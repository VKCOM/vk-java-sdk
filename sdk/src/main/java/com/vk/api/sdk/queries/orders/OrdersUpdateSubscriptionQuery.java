package com.vk.api.sdk.queries.orders;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.orders.responses.UpdateSubscriptionResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Orders.updateSubscription method
 */
public class OrdersUpdateSubscriptionQuery extends AbstractQueryBuilder<OrdersUpdateSubscriptionQuery, UpdateSubscriptionResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     * @param subscriptionId value of "subscription id" parameter. Minimum is 0.
     * @param price value of "price" parameter. Minimum is 0.
     */
    public OrdersUpdateSubscriptionQuery(VkApiClient client, ServiceActor actor, int userId,
            int subscriptionId, int price) {
        super(client, "orders.updateSubscription", UpdateSubscriptionResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        userId(userId);
        subscriptionId(subscriptionId);
        price(price);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersUpdateSubscriptionQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set subscription id
     *
     * @param value value of "subscription id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersUpdateSubscriptionQuery subscriptionId(int value) {
        return unsafeParam("subscription_id", value);
    }

    /**
     * Set price
     *
     * @param value value of "price" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersUpdateSubscriptionQuery price(int value) {
        return unsafeParam("price", value);
    }

    @Override
    protected OrdersUpdateSubscriptionQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("subscription_id", "price", "user_id", "access_token");
    }
}
