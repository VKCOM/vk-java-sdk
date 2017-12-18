package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;

import java.util.Arrays;
import java.util.List;

public class GroupsGetLongPollServerQuery extends AbstractQueryBuilder<GroupsGetLongPollServerQuery, GetLongPollServerResponse> {

    public GroupsGetLongPollServerQuery(VkApiClient client, Actor actor, String groupId) {
        super(client, "groups.getLongPollServer", GetLongPollServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    protected GroupsGetLongPollServerQuery groupId(String groupId) {
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
