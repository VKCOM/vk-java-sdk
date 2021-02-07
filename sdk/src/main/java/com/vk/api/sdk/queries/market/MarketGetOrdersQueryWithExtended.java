package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.GetOrdersExtendedResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getOrders method
 */
public class MarketGetOrdersQueryWithExtended extends AbstractQueryBuilder<MarketGetOrdersQueryWithExtended, GetOrdersExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketGetOrdersQueryWithExtended(VkApiClient client, UserActor actor) {
        super(client, "market.getOrders", GetOrdersExtendedResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetOrdersQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 10. Minimum is 0. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetOrdersQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetOrdersQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected MarketGetOrdersQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
