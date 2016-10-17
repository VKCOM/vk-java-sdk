package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.approveRequest method
 */
public class GroupsApproveRequestQuery extends AbstractQueryBuilder<GroupsApproveRequestQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param userId  value of "user id" parameter. Minimum is 0.
     */
    public GroupsApproveRequestQuery(VkApiClient client, UserActor actor, int groupId, int userId) {
        super(client, "groups.approveRequest", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        userId(userId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsApproveRequestQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsApproveRequestQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected GroupsApproveRequestQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "user_id", "access_token");
    }
}
