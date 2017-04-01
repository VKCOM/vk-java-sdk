package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.friends.responses.GetResponse;
import com.vk.api.sdk.queries.users.UsersNameCase;

import java.util.Collections;
import java.util.List;

/**
 * Query for Friends.get method
 */
public class FriendsGetQuery extends AbstractQueryBuilder<FriendsGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetQuery(VkApiClient client, UserActor actor) {
        super(client, "friends.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetQuery(VkApiClient client, ServiceActor actor) {
        super(client, "friends.get", GetResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public FriendsGetQuery(VkApiClient client) {
        super(client, "friends.get", GetResponse.class);
    }

    /**
     * User ID. By default, the current user ID.
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Sort order
     * <p>
     * This parameter is available only for desktop applications.
     *
     * @param value value of "order" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQuery order(FriendsGetOrder value) {
        return unsafeParam("order", value);
    }

    /**
     * ID of the friend list returned by the desktop applications.
     *
     * @param value value of "list id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQuery listId(Integer value) {
        return unsafeParam("list_id", value);
    }

    /**
     * Number of friends to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of friends.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Case for declension of user name and surname.
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQuery nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected FriendsGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
