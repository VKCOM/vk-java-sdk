package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.SetCallbackServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.setCallbackServer method
 */
public class GroupsSetCallbackServerQuery extends AbstractQueryBuilder<GroupsSetCallbackServerQuery, SetCallbackServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsSetCallbackServerQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.setCallbackServer", SetCallbackServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsSetCallbackServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.setCallbackServer", SetCallbackServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsSetCallbackServerQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Server URL.
     *
     * @param value value of "server url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackServerQuery serverUrl(String value) {
        return unsafeParam("server_url", value);
    }

    @Override
    protected GroupsSetCallbackServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
