package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetLongPollSettingsResponse;

import java.util.Arrays;
import java.util.List;

public class GroupsGetLongPollSettingsQuery extends AbstractQueryBuilder<GroupsGetLongPollSettingsQuery, GetLongPollSettingsResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param groupId group id
     */
    public GroupsGetLongPollSettingsQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.getLongPollSettings", GetLongPollSettingsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  group actor with access token
     */
    public GroupsGetLongPollSettingsQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.getLongPollSettings", GetLongPollSettingsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    public GroupsGetLongPollSettingsQuery groupId(Integer groupId) {
        return unsafeParam("group_id", groupId);
    }

    @Override
    protected GroupsGetLongPollSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "group_id");
    }
}
