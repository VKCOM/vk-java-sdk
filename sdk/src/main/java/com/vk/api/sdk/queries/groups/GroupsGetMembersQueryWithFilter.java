package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetMembersFilterResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Groups.getMembers method
 */
public class GroupsGetMembersQueryWithFilter extends AbstractQueryBuilder<GroupsGetMembersQueryWithFilter, GetMembersFilterResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetMembersQueryWithFilter(VkApiClient client, UserActor actor, GroupsGetMembersFilter filter) {
        super(client, "groups.getMembers", GetMembersFilterResponse.class);
        accessToken(actor.getAccessToken());
        filter(filter);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetMembersQueryWithFilter(VkApiClient client, GroupActor actor, GroupsGetMembersFilter filter) {
        super(client, "groups.getMembers", GetMembersFilterResponse.class);
        accessToken(actor.getAccessToken());
        filter(filter);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public GroupsGetMembersQueryWithFilter(VkApiClient client, ServiceActor actor, GroupsGetMembersFilter filter) {
        super(client, "groups.getMembers", GetMembersFilterResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        filter(filter);
    }

    /**
     * ID or screen name of the community.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQueryWithFilter groupId(String value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Sort order.
     *
     * @param value value of "sort" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQueryWithFilter sort(GroupsGetMembersSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Offset needed to return a specific subset of community members.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQueryWithFilter offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of community members to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 1000.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQueryWithFilter count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set filter
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetMembersQueryWithFilter filter(GroupsGetMembersFilter value) {
        return unsafeParam("filter", value);
    }

    @Override
    protected GroupsGetMembersQueryWithFilter getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
