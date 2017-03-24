package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetMembersFieldsResponse;
import com.vk.api.sdk.queries.users.UserField;

import java.util.Collections;
import java.util.List;

/**
 * Query for Groups.getMembers method
 */
public class GroupsGetMembersQueryWithFields extends AbstractQueryBuilder<GroupsGetMembersQueryWithFields, GetMembersFieldsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetMembersQueryWithFields(VkApiClient client, UserActor actor, UserField... fields) {
        super(client, "groups.getMembers", GetMembersFieldsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetMembersQueryWithFields(VkApiClient client, GroupActor actor, UserField... fields) {
        super(client, "groups.getMembers", GetMembersFieldsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public GroupsGetMembersQueryWithFields(VkApiClient client, ServiceActor actor, UserField... fields) {
        super(client, "groups.getMembers", GetMembersFieldsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetMembersQueryWithFields(VkApiClient client, UserActor actor, List<UserField> fields) {
        super(client, "groups.getMembers", GetMembersFieldsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetMembersQueryWithFields(VkApiClient client, GroupActor actor, List<UserField> fields) {
        super(client, "groups.getMembers", GetMembersFieldsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public GroupsGetMembersQueryWithFields(VkApiClient client, ServiceActor actor, List<UserField> fields) {
        super(client, "groups.getMembers", GetMembersFieldsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        fields(fields);
    }

    /**
     * ID or screen name of the community.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQueryWithFields groupId(String value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Sort order.
     *
     * @param value value of "sort" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQueryWithFields sort(GroupsGetMembersSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Offset needed to return a specific subset of community members.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQueryWithFields offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of community members to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 1000.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQueryWithFields count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * List of additional fields to be returned.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetMembersQueryWithFields fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * List of additional fields to be returned.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetMembersQueryWithFields fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected GroupsGetMembersQueryWithFields getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
