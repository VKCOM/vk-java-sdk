package com.vk.api.sdk.queries.donut;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetMembersFieldsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Donut.getFriends method
 */
public class DonutGetFriendsQueryWithFields extends AbstractQueryBuilder<DonutGetFriendsQueryWithFields, GetMembersFieldsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     */
    public DonutGetFriendsQueryWithFields(VkApiClient client, UserActor actor, int ownerId,
            String... fields) {
        super(client, "donut.getFriends", GetMembersFieldsResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     */
    public DonutGetFriendsQueryWithFields(VkApiClient client, UserActor actor, int ownerId,
            List<String> fields) {
        super(client, "donut.getFriends", GetMembersFieldsResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        fields(fields);
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DonutGetFriendsQueryWithFields ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DonutGetFriendsQueryWithFields offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DonutGetFriendsQueryWithFields count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DonutGetFriendsQueryWithFields fields(String... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DonutGetFriendsQueryWithFields fields(List<String> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected DonutGetFriendsQueryWithFields getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "access_token");
    }
}
