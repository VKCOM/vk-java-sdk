package com.vk.api.sdk.callback.longpoll.queries;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;

import java.util.Arrays;
import java.util.List;

public class GetLongPollServerQuery extends AbstractQueryBuilder<GetLongPollServerQuery, GetLongPollServerResponse> {

    public GetLongPollServerQuery(VkApiClient client, Actor actor, String groupId) {
        super(client, "groups.getLongPollServer", GetLongPollServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    protected GetLongPollServerQuery groupId(String groupId) {
        return unsafeParam("group_id", groupId);
    }

    @Override
    protected GetLongPollServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}

