package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
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
    public MarketGetByIdQuery(VkApiClient client, Actor actor, String... itemIds) {
        super(client, "market.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        itemIds(itemIds);
    }

    /**
     * Comma-separated ids list: &lt;code&gt;{user id}_{item id}&lt;/code&gt;.
     * If an item belongs to a community &lt;code&gt;-{community id}&lt;/code&gt; is used.
     * &lt;blockquote&gt; "Videos" value example: &lt;br&gt;''-4363_136089719,13245770_137352259''&lt;/blockquote&gt;
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetByIdQuery itemIds(String... value) {
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
