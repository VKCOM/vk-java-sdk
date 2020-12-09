package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.GetOrderByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getOrderById method
 */
public class MarketGetOrderByIdQuery extends AbstractQueryBuilder<MarketGetOrderByIdQuery, GetOrderByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param orderId value of "order id" parameter. Minimum is 0.
     */
    public MarketGetOrderByIdQuery(VkApiClient client, UserActor actor, int orderId) {
        super(client, "market.getOrderById", GetOrderByIdResponse.class);
        accessToken(actor.getAccessToken());
        orderId(orderId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param orderId value of "order id" parameter. Minimum is 0.
     */
    public MarketGetOrderByIdQuery(VkApiClient client, GroupActor actor, int orderId) {
        super(client, "market.getOrderById", GetOrderByIdResponse.class);
        accessToken(actor.getAccessToken());
        orderId(orderId);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetOrderByIdQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set order id
     *
     * @param value value of "order id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetOrderByIdQuery orderId(int value) {
        return unsafeParam("order_id", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetOrderByIdQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected MarketGetOrderByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("order_id", "access_token");
    }
}
