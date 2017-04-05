package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetMembersResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Groups.getMembers method
 */
public class GroupsGetMembersQuery extends AbstractQueryBuilder<GroupsGetMembersQuery, GetMembersResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetMembersQuery(VkApiClient client, UserActor actor) {
        super(client, "groups.getMembers", GetMembersResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetMembersQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.getMembers", GetMembersResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public GroupsGetMembersQuery(VkApiClient client, ServiceActor actor) {
        super(client, "groups.getMembers", GetMembersResponse.class);
    }

    /**
     * ID or screen name of the community.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQuery groupId(String value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Sort order
     *
     * @param value value of "sort" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQuery sort(GroupsGetMembersSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Offset needed to return a specific subset of community members.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of community members to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 1000.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQuery count(Integer value) {
        return unsafeParam("count", value);
    }


    @Override
    protected GroupsGetMembersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
