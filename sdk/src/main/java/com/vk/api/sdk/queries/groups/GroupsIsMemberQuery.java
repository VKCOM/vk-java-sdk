package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.isMember method
 */
public class GroupsIsMemberQuery extends AbstractQueryBuilder<GroupsIsMemberQuery, BoolInt> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQuery(VkApiClient client, UserActor actor, String groupId) {
        super(client, "groups.isMember", BoolInt.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQuery(VkApiClient client, GroupActor actor, String groupId) {
        super(client, "groups.isMember", BoolInt.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQuery(VkApiClient client, ServiceActor actor, String groupId) {
        super(client, "groups.isMember", BoolInt.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        groupId(groupId);
    }

    /**
     * ID or screen name of the community.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsIsMemberQuery groupId(String value) {
        return unsafeParam("group_id", value);
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsIsMemberQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected GroupsIsMemberQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id");
    }
}
