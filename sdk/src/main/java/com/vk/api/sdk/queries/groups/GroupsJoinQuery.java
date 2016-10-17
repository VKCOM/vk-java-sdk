package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.join method
 */
public class GroupsJoinQuery extends AbstractQueryBuilder<GroupsJoinQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsJoinQuery(VkApiClient client, UserActor actor) {
        super(client, "groups.join", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID or screen name of the community.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsJoinQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Optional parameter which is taken into account when "group_id" belongs to the event.
     *
     * @param value value of "not sure" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsJoinQuery notSure(Boolean value) {
        return unsafeParam("not_sure", value);
    }

    @Override
    protected GroupsJoinQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
