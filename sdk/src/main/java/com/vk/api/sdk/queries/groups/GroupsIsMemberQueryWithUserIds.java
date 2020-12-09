package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.IsMemberUserIdsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.isMember method
 */
public class GroupsIsMemberQueryWithUserIds extends AbstractQueryBuilder<GroupsIsMemberQueryWithUserIds, List<IsMemberUserIdsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQueryWithUserIds(VkApiClient client, UserActor actor, String groupId,
            Integer... userIds) {
        super(client, "groups.isMember", Utils.buildParametrizedType(List.class, IsMemberUserIdsResponse.class));
        accessToken(actor.getAccessToken());
        groupId(groupId);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQueryWithUserIds(VkApiClient client, UserActor actor, String groupId,
            List<Integer> userIds) {
        super(client, "groups.isMember", Utils.buildParametrizedType(List.class, IsMemberUserIdsResponse.class));
        accessToken(actor.getAccessToken());
        groupId(groupId);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQueryWithUserIds(VkApiClient client, GroupActor actor, String groupId,
            Integer... userIds) {
        super(client, "groups.isMember", Utils.buildParametrizedType(List.class, IsMemberUserIdsResponse.class));
        accessToken(actor.getAccessToken());
        groupId(groupId);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQueryWithUserIds(VkApiClient client, GroupActor actor, String groupId,
            List<Integer> userIds) {
        super(client, "groups.isMember", Utils.buildParametrizedType(List.class, IsMemberUserIdsResponse.class));
        accessToken(actor.getAccessToken());
        groupId(groupId);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQueryWithUserIds(VkApiClient client, ServiceActor actor, String groupId,
            Integer... userIds) {
        super(client, "groups.isMember", Utils.buildParametrizedType(List.class, IsMemberUserIdsResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        groupId(groupId);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GroupsIsMemberQueryWithUserIds(VkApiClient client, ServiceActor actor, String groupId,
            List<Integer> userIds) {
        super(client, "groups.isMember", Utils.buildParametrizedType(List.class, IsMemberUserIdsResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
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
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsIsMemberQueryWithUserIds userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * '1' — to return an extended response with additional fields. By default: '0'.
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsIsMemberQueryWithUserIds extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * user_ids
     * User IDs.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsIsMemberQueryWithUserIds userIds(Integer... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * User IDs.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsIsMemberQueryWithUserIds userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    @Override
    protected GroupsIsMemberQueryWithUserIds getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
