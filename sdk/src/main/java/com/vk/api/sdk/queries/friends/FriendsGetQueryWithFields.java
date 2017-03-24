package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.friends.responses.GetFieldsResponse;
import com.vk.api.sdk.queries.users.UserField;
import com.vk.api.sdk.queries.users.UsersNameCase;

import java.util.Collections;
import java.util.List;

/**
 * Query for Friends.get method
 */
public class FriendsGetQueryWithFields extends AbstractQueryBuilder<FriendsGetQueryWithFields, GetFieldsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param fields user fields
     */
    public FriendsGetQueryWithFields(VkApiClient client, UserActor actor, UserField... fields) {
        super(client, "friends.get", GetFieldsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param fields user fields
     */
    public FriendsGetQueryWithFields(VkApiClient client, UserActor actor, List<UserField> fields) {
        super(client, "friends.get", GetFieldsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param fields user fields
     */
    public FriendsGetQueryWithFields(VkApiClient client, ServiceActor actor, UserField... fields) {
        super(client, "friends.get", GetFieldsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param fields user fields
     */
    public FriendsGetQueryWithFields(VkApiClient client, ServiceActor actor, List<UserField> fields) {
        super(client, "friends.get", GetFieldsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        fields(fields);
    }

    /**
     * User ID. By default, the current user ID.
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields userId(Integer value) {
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
    public FriendsGetQueryWithFields order(FriendsGetOrder value) {
        return unsafeParam("order", value);
    }

    /**
     * ID of the friend list returned by the desktop applications.
     *
     * @param value value of "list id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields listId(Integer value) {
        return unsafeParam("list_id", value);
    }

    /**
     * Number of friends to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of friends.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsGetQueryWithFields fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsGetQueryWithFields fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname.
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected FriendsGetQueryWithFields getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
