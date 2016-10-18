package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.SearchExtendedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.search method
 */
public class MarketSearchQueryWithExtended extends AbstractQueryBuilder<MarketSearchQueryWithExtended, SearchExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     */
    public MarketSearchQueryWithExtended(VkApiClient client, UserActor actor, int ownerId) {
        super(client, "market.search", SearchExtendedResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        extended(true);
    }

    /**
     * Identifier of an items owner community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketSearchQueryWithExtended ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Identifier of an album
     *
     * @param value value of "count" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQueryWithExtended albumId(Integer value) {
        return unsafeParam("album_id", value);
    }


    /**
     * Search query, for example "pink slippers"
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQueryWithExtended q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Minimum item price value. For example "100"
     *
     * @param value value of "price from" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQueryWithExtended priceFrom(Integer value) {
        return unsafeParam("price_from", value);
    }

    /**
     * Maximum item price value. For example "14100"
     *
     * @param value value of "price to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQueryWithExtended priceTo(Integer value) {
        return unsafeParam("price_to", value);
    }

    /**
     * Comma-separated tag ids list
     *
     * @param value value of "tags" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQueryWithExtended tags(Integer... value) {
        return unsafeParam("tags", value);
    }

    /**
     * Comma-separated tag ids list
     *
     * @param value value of "tags" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQueryWithExtended tags(List<Integer> value) {
        return unsafeParam("tags", value);
    }

    /**
     * Items sort
     *
     * @param value value of "price to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQueryWithExtended sort(MarketSearchSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Use reverse order
     *
     * @param value value of "rev" parameter. Minimum is 0. By default 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQueryWithExtended rev(Boolean value) {
        return unsafeParam("rev", value);
    }

    /**
     * Offset based on a first matching item to get a certain items subset
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of items to return
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketSearchQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * "true" - method will return additional fields:
     * likes, can_comment, car_repost, photos.
     * These parameters are not returned by default
     *
     * @param value value of "extended" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketSearchQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected MarketSearchQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "access_token");
    }
}
