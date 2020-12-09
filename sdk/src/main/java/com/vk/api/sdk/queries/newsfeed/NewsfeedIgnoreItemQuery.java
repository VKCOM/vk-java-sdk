package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.newsfeed.IgnoreItemType;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.ignoreItem method
 */
public class NewsfeedIgnoreItemQuery extends AbstractQueryBuilder<NewsfeedIgnoreItemQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param type value of "type" parameter.
     */
    public NewsfeedIgnoreItemQuery(VkApiClient client, UserActor actor, IgnoreItemType type) {
        super(client, "newsfeed.ignoreItem", OkResponse.class);
        accessToken(actor.getAccessToken());
        type(type);
    }

    /**
     * Item type. Possible values: *'wall' – post on the wall,, *'tag' – tag on a photo,, *'profilephoto' – profile photo,, *'video' – video,, *'audio' – audio.
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NewsfeedIgnoreItemQuery type(IgnoreItemType value) {
        return unsafeParam("type", value);
    }

    /**
     * Item owner's identifier (user or community), "Note that community id must be negative. 'owner_id=1' – user , 'owner_id=-1' – community "
     *
     * @param value value of "owner id" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedIgnoreItemQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Item identifier
     *
     * @param value value of "item id" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedIgnoreItemQuery itemId(Integer value) {
        return unsafeParam("item_id", value);
    }

    @Override
    protected NewsfeedIgnoreItemQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("type", "access_token");
    }
}
