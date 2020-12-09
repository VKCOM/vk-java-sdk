package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.MarketRev;
import com.vk.api.sdk.objects.enums.MarketSort;
import com.vk.api.sdk.objects.enums.MarketStatus;
import com.vk.api.sdk.objects.market.responses.SearchResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.search method
 */
public class MarketSearchQuery extends AbstractQueryBuilder<MarketSearchQuery, SearchResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     */
    public MarketSearchQuery(VkApiClient client, UserActor actor, int ownerId) {
        super(client, "market.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
    }

    /**
     * ID of an items owner community.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketSearchQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set album id
     *
     * @param value value of "album id" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    /**
     * Search query, for example "pink slippers".
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Minimum item price value.
     *
     * @param value value of "price from" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQuery priceFrom(Integer value) {
        return unsafeParam("price_from", value);
    }

    /**
     * Maximum item price value.
     *
     * @param value value of "price to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQuery priceTo(Integer value) {
        return unsafeParam("price_to", value);
    }

    /**
     * Set sort
     *
     * @param value value of "sort" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQuery sort(MarketSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * '0' — do not use reverse order, '1' — use reverse order
     *
     * @param value value of "rev" parameter. Minimum is 0. By default 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQuery rev(MarketRev value) {
        return unsafeParam("rev", value);
    }

    /**
     * Offset needed to return a specific subset of results.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of items to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * '1' – to return additional fields: 'likes, can_comment, car_repost, photos'. By default: '0'.
     *
     * @param value value of "extended" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Set status
     *
     * @param value value of "status" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQuery status(MarketStatus value) {
        return unsafeParam("status", value);
    }

    @Override
    protected MarketSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "access_token");
    }
}
