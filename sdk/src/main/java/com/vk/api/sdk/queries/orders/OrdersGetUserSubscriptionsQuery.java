package com.vk.api.sdk.queries.orders;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.orders.responses.GetUserSubscriptionsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Orders.getUserSubscriptions method
 */
public class OrdersGetUserSubscriptionsQuery extends AbstractQueryBuilder<OrdersGetUserSubscriptionsQuery, GetUserSubscriptionsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     */
    public OrdersGetUserSubscriptionsQuery(VkApiClient client, ServiceActor actor, int userId) {
        super(client, "orders.getUserSubscriptions", GetUserSubscriptionsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        userId(userId);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersGetUserSubscriptionsQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected OrdersGetUserSubscriptionsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_id", "access_token");
    }
}
