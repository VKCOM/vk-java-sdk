package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.GetOrdersResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getOrders method
 */
public class MarketGetOrdersQuery extends AbstractQueryBuilder<MarketGetOrdersQuery, GetOrdersResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketGetOrdersQuery(VkApiClient client, UserActor actor) {
        super(client, "market.getOrders", GetOrdersResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetOrdersQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 10. Minimum is 0. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetOrdersQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetOrdersQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected MarketGetOrdersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
