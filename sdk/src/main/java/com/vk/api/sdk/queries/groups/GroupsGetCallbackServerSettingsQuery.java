package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.groups.responses.GetCallbackServerSettingsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.getCallbackServerSettings method
 */
public class GroupsGetCallbackServerSettingsQuery extends AbstractQueryBuilder<GroupsGetCallbackServerSettingsQuery, GetCallbackServerSettingsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsGetCallbackServerSettingsQuery(VkApiClient client, Actor actor, int groupId) {
        super(client, "groups.getCallbackServerSettings", GetCallbackServerSettingsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetCallbackServerSettingsQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected GroupsGetCallbackServerSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
