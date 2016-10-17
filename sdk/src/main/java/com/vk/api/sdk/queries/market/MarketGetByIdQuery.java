package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.GetByIdResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getById method
 */
public class MarketGetByIdQuery extends AbstractQueryBuilder<MarketGetByIdQuery, GetByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param itemIds value of "item ids" parameter.
     */
    public MarketGetByIdQuery(VkApiClient client, UserActor actor, String... itemIds) {
        super(client, "market.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        itemIds(itemIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param itemIds value of "item ids" parameter.
     */
    public MarketGetByIdQuery(VkApiClient client, UserActor actor, List<String> itemIds) {
        super(client, "market.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        itemIds(itemIds);
    }

    /**
     * Items ID
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetByIdQuery itemIds(String... value) {
        return unsafeParam("item_ids", value);
    }

    /**
     * Items ID
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetByIdQuery itemIds(List<String> value) {
        return unsafeParam("item_ids", value);
    }

    @Override
    protected MarketGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_ids", "access_token");
    }
}
