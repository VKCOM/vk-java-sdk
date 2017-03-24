package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.users.responses.GetFollowersResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Users.getFollowers method
 */
public class UsersGetFollowersQuery extends AbstractQueryBuilder<UsersGetFollowersQuery, GetFollowersResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public UsersGetFollowersQuery(VkApiClient client, UserActor actor) {
        super(client, "users.getFollowers", GetFollowersResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public UsersGetFollowersQuery(VkApiClient client, ServiceActor actor) {
        super(client, "users.getFollowers", GetFollowersResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Offset needed to return a specific subset of followers.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of followers to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetFollowersQuery nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected UsersGetFollowersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
