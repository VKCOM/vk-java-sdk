package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetCallbackSettingsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.getCallbackSettings method
 */
public class GroupsGetCallbackSettingsQuery extends AbstractQueryBuilder<GroupsGetCallbackSettingsQuery, GetCallbackSettingsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsGetCallbackSettingsQuery(VkApiClient client, UserActor actor, int groupId, int serverId) {
        super(client, "groups.getCallbackSettings", GetCallbackSettingsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        serverId(serverId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetCallbackSettingsQuery(VkApiClient client, GroupActor actor, int serverId) {
        super(client, "groups.getCallbackSettings", GetCallbackSettingsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        serverId(serverId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetCallbackSettingsQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Server ID.
     *
     * @param value value of "server id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetCallbackSettingsQuery serverId(int value) {
        return unsafeParam("server_id", value);
    }

    @Override
    protected GroupsGetCallbackSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "server_id", "access_token");
    }
}
