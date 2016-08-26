package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.market.responses.GetByIdExtendedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getById method
 */
public class MarketGetByIdQueryWithExtended extends AbstractQueryBuilder<MarketGetByIdQueryWithExtended, GetByIdExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param itemIds value of "item ids" parameter.
     */
    public MarketGetByIdQueryWithExtended(VkApiClient client, Actor actor, String... itemIds) {
        super(client, "market.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        itemIds(itemIds);
        extended(true);
    }

    /**
     * Comma-separated ids list: &lt;code&gt;{user id}_{item id}&lt;/code&gt;.
     * If an item belongs to a community &lt;code&gt;-{community id}&lt;/code&gt; is used.
     * &lt;blockquote&gt; "Videos" value example: &lt;br&gt;''-4363_136089719,13245770_137352259''&lt;/blockquote&gt;
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetByIdQueryWithExtended itemIds(String... value) {
        return unsafeParam("item_ids", value);
    }

    /**
     * 1 - method will return additional fields: likes, can_comment, car_repost, photos. These parameters are not returned by default
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetByIdQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected MarketGetByIdQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_ids", "access_token");
    }
}
