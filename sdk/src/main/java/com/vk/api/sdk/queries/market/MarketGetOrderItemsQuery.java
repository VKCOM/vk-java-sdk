package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.GetOrderItemsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getOrderItems method
 */
public class MarketGetOrderItemsQuery extends AbstractQueryBuilder<MarketGetOrderItemsQuery, GetOrderItemsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param orderId value of "order id" parameter. Minimum is 0.
     */
    public MarketGetOrderItemsQuery(VkApiClient client, UserActor actor, int orderId) {
        super(client, "market.getOrderItems", GetOrderItemsResponse.class);
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
    public MarketGetOrderItemsQuery(VkApiClient client, GroupActor actor, int orderId) {
        super(client, "market.getOrderItems", GetOrderItemsResponse.class);
        accessToken(actor.getAccessToken());
        orderId(orderId);
    }

    /**
     * Set order id
     *
     * @param value value of "order id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetOrderItemsQuery orderId(int value) {
        return unsafeParam("order_id", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetOrderItemsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Minimum is 0. By default 50.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetOrderItemsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected MarketGetOrderItemsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("order_id", "access_token");
    }
}
