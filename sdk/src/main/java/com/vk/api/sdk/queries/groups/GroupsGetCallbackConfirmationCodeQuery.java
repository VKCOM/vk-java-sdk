package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetCallbackConfirmationCodeResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.getCallbackConfirmationCode method
 */
public class GroupsGetCallbackConfirmationCodeQuery extends AbstractQueryBuilder<GroupsGetCallbackConfirmationCodeQuery, GetCallbackConfirmationCodeResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsGetCallbackConfirmationCodeQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.getCallbackConfirmationCode", GetCallbackConfirmationCodeResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetCallbackConfirmationCodeQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.getCallbackConfirmationCode", GetCallbackConfirmationCodeResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetCallbackConfirmationCodeQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected GroupsGetCallbackConfirmationCodeQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
