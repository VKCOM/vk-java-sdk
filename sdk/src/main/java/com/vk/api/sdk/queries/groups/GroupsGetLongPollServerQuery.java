package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.getLongPollServer method
 */
public class GroupsGetLongPollServerQuery extends AbstractQueryBuilder<GroupsGetLongPollServerQuery, GetLongPollServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
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
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsGetLongPollServerQuery(VkApiClient client, GroupActor actor, int groupId) {
        super(client, "groups.getLongPollServer", GetLongPollServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
    }

    /**
     * Community ID
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetLongPollServerQuery groupId(int value) {
        return unsafeParam("group_id", value);
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
