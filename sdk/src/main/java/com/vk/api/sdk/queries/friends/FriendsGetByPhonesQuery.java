package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.friends.UserXtrPhone;
import com.vk.api.sdk.queries.users.UserField;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getByPhones method
 */
public class FriendsGetByPhonesQuery extends AbstractQueryBuilder<FriendsGetByPhonesQuery, List<UserXtrPhone>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetByPhonesQuery(VkApiClient client, UserActor actor) {
        super(client, "friends.getByPhones", Utils.buildParametrizedType(List.class, UserXtrPhone.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * List of phone numbers in MSISDN format (maximum 1000).
     * Example:
     * +79219876543,+79111234567
     *
     * @param value value of "phones" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetByPhonesQuery phones(String... value) {
        return unsafeParam("phones", value);
    }

    /**
     * List of phone numbers in MSISDN format (maximum 1000).
     * Example:
     * +79219876543,+79111234567
     *
     * @param value value of "phones" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetByPhonesQuery phones(List<String> value) {
        return unsafeParam("phones", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetByPhonesQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetByPhonesQuery fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected FriendsGetByPhonesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
