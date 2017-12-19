package com.vk.api.sdk.callback.longpoll.queries;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;

import java.util.Arrays;
import java.util.List;

public class GetLongPollServerQuery extends AbstractQueryBuilder<GetLongPollServerQuery, GetLongPollServerResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param groupId value of "group id" parameter.
     */
    public GetLongPollServerQuery(VkApiClient client, UserActor actor, Integer groupId) {
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
    public GetLongPollServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.getLongPollServer", GetLongPollServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    protected GetLongPollServerQuery groupId(Integer groupId) {
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

