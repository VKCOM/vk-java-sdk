package com.vk.api.sdk.queries.orders;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.orders.Amount;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Orders.getAmount method
 */
public class OrdersGetAmountQuery extends AbstractQueryBuilder<OrdersGetAmountQuery, Amount> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     * @param votes  value of "votes" parameter.
     */
    public OrdersGetAmountQuery(VkApiClient client, UserActor actor, int userId, String... votes) {
        super(client, "orders.getAmount", Amount.class);
        accessToken(actor.getAccessToken());
        userId(userId);
        votes(votes);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     * @param votes  value of "votes" parameter.
     */
    public OrdersGetAmountQuery(VkApiClient client, UserActor actor, int userId, List<String> votes) {
        super(client, "orders.getAmount", Amount.class);
        accessToken(actor.getAccessToken());
        userId(userId);
        votes(votes);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersGetAmountQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set votes
     *
     * @param value value of "votes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersGetAmountQuery votes(String... value) {
        return unsafeParam("votes", value);
    }

    /**
     * Set votes
     *
     * @param value value of "votes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersGetAmountQuery votes(List<String> value) {
        return unsafeParam("votes", value);
    }

    @Override
    protected OrdersGetAmountQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("votes", "user_id", "access_token");
    }
}
