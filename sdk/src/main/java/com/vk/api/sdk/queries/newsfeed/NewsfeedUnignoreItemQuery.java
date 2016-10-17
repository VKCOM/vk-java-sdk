package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.unignoreItem method
 */
public class NewsfeedUnignoreItemQuery extends AbstractQueryBuilder<NewsfeedUnignoreItemQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param type    value of "type" parameter.
     * @param ownerId value of "owner id" parameter.
     * @param itemId  value of "item id" parameter. Minimum is 0.
     */
    public NewsfeedUnignoreItemQuery(VkApiClient client, UserActor actor, NewsfeedItemType type, int ownerId, int itemId) {
        super(client, "newsfeed.unignoreItem", OkResponse.class);
        accessToken(actor.getAccessToken());
        type(type);
        ownerId(ownerId);
        itemId(itemId);
    }

    /**
     * Item type.
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NewsfeedUnignoreItemQuery type(NewsfeedItemType value) {
        return unsafeParam("type", value);
    }

    /**
     * Item owner's identifier (user or community)
     * Note that community id must be negative.
     * "owner_id=1" - user
     * "owner_id=-1" - community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NewsfeedUnignoreItemQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Item identifier
     *
     * @param value value of "item id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NewsfeedUnignoreItemQuery itemId(int value) {
        return unsafeParam("item_id", value);
    }

    @Override
    protected NewsfeedUnignoreItemQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_id", "type", "owner_id", "access_token");
    }
}
