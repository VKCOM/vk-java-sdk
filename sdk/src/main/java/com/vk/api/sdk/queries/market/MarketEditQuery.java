package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.edit method
 */
public class MarketEditQuery extends AbstractQueryBuilder<MarketEditQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client      VK API client
     * @param actor       actor with access token
     * @param ownerId     value of "owner id" parameter.
     * @param itemId      value of "item id" parameter. Minimum is 0.
     * @param name        value of "name" parameter.
     * @param description value of "description" parameter.
     * @param categoryId  value of "category id" parameter. Minimum is 0.
     * @param price       value of "price" parameter. Minimum is 0.
     * @param mainPhotoId value of "main photo id" parameter. Minimum is 0.
     */
    public MarketEditQuery(VkApiClient client, UserActor actor, int ownerId, int itemId, String name, String description,
                           int categoryId, double price, int mainPhotoId) {
        super(client, "market.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemId(itemId);
        name(name);
        description(description);
        categoryId(categoryId);
        price(price);
        mainPhotoId(mainPhotoId);
    }

    /**
     * Identifier of an item owner community
     * Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Item id
     *
     * @param value value of "item id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditQuery itemId(int value) {
        return unsafeParam("item_id", value);
    }

    /**
     * New item name
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditQuery name(String value) {
        return unsafeParam("name", value);
    }

    /**
     * New description
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * Item category id
     *
     * @param value value of "category id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditQuery categoryId(int value) {
        return unsafeParam("category_id", value);
    }

    /**
     * Item price
     *
     * @param value value of "price" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditQuery price(double value) {
        return unsafeParam("price", value);
    }

    /**
     * Item status
     *
     * @param value value of "deleted" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketEditQuery deleted(Boolean value) {
        return unsafeParam("deleted", value);
    }

    /**
     * Cover photo id
     *
     * @param value value of "main photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditQuery mainPhotoId(int value) {
        return unsafeParam("main_photo_id", value);
    }

    /**
     * Ids of additional photos
     *
     * @param value value of "photo ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketEditQuery photoIds(Integer... value) {
        return unsafeParam("photo_ids", value);
    }

    /**
     * Ids of additional photos
     *
     * @param value value of "photo ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketEditQuery photoIds(List<Integer> value) {
        return unsafeParam("photo_ids", value);
    }

    @Override
    protected MarketEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("price", "main_photo_id", "name", "item_id", "description", "owner_id", "category_id", "access_token");
    }
}
