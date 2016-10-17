package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.reorderItems method
 */
public class MarketReorderItemsQuery extends AbstractQueryBuilder<MarketReorderItemsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param itemId  value of "item id" parameter. Minimum is 0.
     */
    public MarketReorderItemsQuery(VkApiClient client, UserActor actor, int ownerId, int itemId) {
        super(client, "market.reorderItems", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemId(itemId);
    }

    /**
     * Identifier of an item owner
     * Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketReorderItemsQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Identifier of a collection to reorder items in. Set 0 to reorder full items list.
     *
     * @param value value of "album id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketReorderItemsQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    /**
     * Item identifier
     *
     * @param value value of "item id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketReorderItemsQuery itemId(int value) {
        return unsafeParam("item_id", value);
    }

    /**
     * Id of an item to place current item before it
     *
     * @param value value of "before" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketReorderItemsQuery before(Integer value) {
        return unsafeParam("before", value);
    }

    /**
     * Id of an item to place current item after it
     *
     * @param value value of "after" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketReorderItemsQuery after(Integer value) {
        return unsafeParam("after", value);
    }

    @Override
    protected MarketReorderItemsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_id", "owner_id", "access_token");
    }
}
