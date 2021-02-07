package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.addresses.Fields;
import com.vk.api.sdk.objects.groups.responses.GetAddressesResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.getAddresses method
 */
public class GroupsGetAddressesQuery extends AbstractQueryBuilder<GroupsGetAddressesQuery, GetAddressesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsGetAddressesQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.getAddresses", GetAddressesResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsGetAddressesQuery(VkApiClient client, ServiceActor actor, int groupId) {
        super(client, "groups.getAddresses", GetAddressesResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        groupId(groupId);
    }

    /**
     * ID or screen name of the community.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetAddressesQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Latitude of  the user geo position.
     *
     * @param value value of "latitude" parameter. Maximum is 90. Minimum is -90.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetAddressesQuery latitude(Number value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Longitude of the user geo position.
     *
     * @param value value of "longitude" parameter. Maximum is 180. Minimum is -180.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetAddressesQuery longitude(Number value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Offset needed to return a specific subset of community addresses.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetAddressesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of community addresses to return.
     *
     * @param value value of "count" parameter. Minimum is 0. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetAddressesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * address_ids
     * Set address ids
     *
     * @param value value of "address ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetAddressesQuery addressIds(Integer... value) {
        return unsafeParam("address_ids", value);
    }

    /**
     * Set address ids
     *
     * @param value value of "address ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetAddressesQuery addressIds(List<Integer> value) {
        return unsafeParam("address_ids", value);
    }

    /**
     * fields
     * Address fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetAddressesQuery fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Address fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetAddressesQuery fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected GroupsGetAddressesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
