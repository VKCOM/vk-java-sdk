package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.groups.MemberStatus;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.isMember method
 */
public class GroupsIsMemberQueryWithUserIds extends AbstractQueryBuilder<GroupsIsMemberQueryWithUserIds, List<MemberStatus>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQueryWithUserIds(VkApiClient client, Actor actor, String groupId, Integer[] userIds) {
        super(client, "groups.isMember", Utils.buildParametrizedType(List.class, MemberStatus.class));
        accessToken(actor.getAccessToken());
        groupId(groupId);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQueryWithUserIds(VkApiClient client, String groupId, Integer[] userIds) {
        super(client, "groups.isMember", Utils.buildParametrizedType(List.class, MemberStatus.class));
        groupId(groupId);
        userIds(userIds);
    }

    /**
     * ID or screen name of the community.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsIsMemberQueryWithUserIds groupId(String value) {
        return unsafeParam("group_id", value);
    }

    /**
     * User IDs.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsIsMemberQueryWithUserIds userIds(Integer... value) {
        return unsafeParam("user_ids", value);
    }

    @Override
    protected GroupsIsMemberQueryWithUserIds getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id");
    }
}
