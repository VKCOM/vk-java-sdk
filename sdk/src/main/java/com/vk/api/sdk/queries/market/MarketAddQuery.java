package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.AddResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.add method
 */
public class MarketAddQuery extends AbstractQueryBuilder<MarketAddQuery, AddResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param name value of "name" parameter.
     * @param description value of "description" parameter.
     * @param categoryId value of "category id" parameter. Minimum is 0.
     * @param mainPhotoId value of "main photo id" parameter. Minimum is 0.
     */
    public MarketAddQuery(VkApiClient client, UserActor actor, int ownerId, String name,
            String description, int categoryId, int mainPhotoId) {
        super(client, "market.add", AddResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        name(name);
        description(description);
        categoryId(categoryId);
        mainPhotoId(mainPhotoId);
    }

    /**
     * ID of an item owner community.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Item name.
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddQuery name(String value) {
        return unsafeParam("name", value);
    }

    /**
     * Item description.
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * Item category ID.
     *
     * @param value value of "category id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddQuery categoryId(int value) {
        return unsafeParam("category_id", value);
    }

    /**
     * Item price.
     *
     * @param value value of "price" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketAddQuery price(Number value) {
        return unsafeParam("price", value);
    }

    /**
     * Set old price
     *
     * @param value value of "old price" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketAddQuery oldPrice(Number value) {
        return unsafeParam("old_price", value);
    }

    /**
     * Item status ('1' — deleted, '0' — not deleted).
     *
     * @param value value of "deleted" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketAddQuery deleted(Boolean value) {
        return unsafeParam("deleted", value);
    }

    /**
     * Cover photo ID.
     *
     * @param value value of "main photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddQuery mainPhotoId(int value) {
        return unsafeParam("main_photo_id", value);
    }

    /**
     * Url for button in market item.
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketAddQuery url(String value) {
        return unsafeParam("url", value);
    }

    /**
     * photo_ids
     * IDs of additional photos.
     *
     * @param value value of "photo ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketAddQuery photoIds(Integer... value) {
        return unsafeParam("photo_ids", value);
    }

    /**
     * IDs of additional photos.
     *
     * @param value value of "photo ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketAddQuery photoIds(List<Integer> value) {
        return unsafeParam("photo_ids", value);
    }

    @Override
    protected MarketAddQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("main_photo_id", "name", "description", "owner_id", "category_id", "access_token");
    }
}
