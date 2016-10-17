package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.apps.responses.GetFriendsListResponse;
import com.vk.api.sdk.queries.EnumParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.getFriendsList method
 */
public class AppsGetFriendsListQuery extends AbstractQueryBuilder<AppsGetFriendsListQuery, GetFriendsListResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AppsGetFriendsListQuery(VkApiClient client, UserActor actor) {
        super(client, "apps.getFriendsList", GetFriendsListResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * List size.
     *
     * @param value value of "count" parameter. Maximum is 5000. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetFriendsListQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * List type.
     *
     * @param value value of "type" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetFriendsListQuery type(AppsGetFriendsListType value) {
        return unsafeParam("type", value);
    }

    /**
     * Additional profile fields, see description.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetFriendsListQuery fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Additional profile fields, see description.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetFriendsListQuery fields(List<EnumParam> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected AppsGetFriendsListQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
