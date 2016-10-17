package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.friends.responses.GetAvailableForCallFieldsResponse;
import com.vk.api.sdk.queries.users.UserField;
import com.vk.api.sdk.queries.users.UsersNameCase;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getAvailableForCall method
 */
public class FriendsGetAvailableForCallQueryWithFields extends AbstractQueryBuilder<FriendsGetAvailableForCallQueryWithFields, GetAvailableForCallFieldsResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param fields user fields
     */
    public FriendsGetAvailableForCallQueryWithFields(VkApiClient client, UserActor actor, UserField... fields) {
        super(client, "friends.getAvailableForCall", GetAvailableForCallFieldsResponse.class);
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
    public FriendsGetAvailableForCallQueryWithFields(VkApiClient client, UserActor actor, List<UserField> fields) {
        super(client, "friends.getAvailableForCall", GetAvailableForCallFieldsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsGetAvailableForCallQueryWithFields fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsGetAvailableForCallQueryWithFields fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname.
     *
     * @param value value of "name case" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetAvailableForCallQueryWithFields nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected FriendsGetAvailableForCallQueryWithFields getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
