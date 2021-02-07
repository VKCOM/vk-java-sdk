package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.deleteAddress method
 */
public class GroupsDeleteAddressQuery extends AbstractQueryBuilder<GroupsDeleteAddressQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param addressId value of "address id" parameter. Minimum is 0.
     */
    public GroupsDeleteAddressQuery(VkApiClient client, UserActor actor, int groupId,
            int addressId) {
        super(client, "groups.deleteAddress", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        addressId(addressId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param addressId value of "address id" parameter. Minimum is 0.
     */
    public GroupsDeleteAddressQuery(VkApiClient client, GroupActor actor, int groupId,
            int addressId) {
        super(client, "groups.deleteAddress", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
        addressId(addressId);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsDeleteAddressQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set address id
     *
     * @param value value of "address id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsDeleteAddressQuery addressId(int value) {
        return unsafeParam("address_id", value);
    }

    @Override
    protected GroupsDeleteAddressQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token", "address_id");
    }
}
