package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;

import java.util.Arrays;
import java.util.List;

public class GroupsGetLongPollServerQuery extends AbstractQueryBuilder<GroupsGetLongPollServerQuery, GetLongPollServerResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GroupsGetLongPollServerQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.getLongPollServer", GetLongPollServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  group actor with access token
     */
    public GroupsGetLongPollServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.getLongPollServer", GetLongPollServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    protected GroupsGetLongPollServerQuery groupId(int groupId) {
        return unsafeParam("group_id", groupId);
    }

    @Override
    protected GroupsGetLongPollServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}

