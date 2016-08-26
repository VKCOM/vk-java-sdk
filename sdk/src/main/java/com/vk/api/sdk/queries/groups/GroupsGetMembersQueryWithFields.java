package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.groups.responses.GetMembersFieldsResponse;
import com.vk.api.sdk.queries.Field;

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
    public GroupsGetMembersQueryWithFields(VkApiClient client, Actor actor, Field... fields) {
        super(client, "groups.getMembers", GetMembersFieldsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public GroupsGetMembersQueryWithFields(VkApiClient client, Field... fields) {
        super(client, "groups.getMembers", GetMembersFieldsResponse.class);
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
     * Sort order. Available values: ''id_asc'', ''id_desc'', ''time_asc'', ''time_desc''.
     * ''time_asc'' and ''time_desc'' are availavle only if the method is called by the group's "moderator".
     *
     * @param value value of "sort" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetMembersQueryWithFields sort(String value) {
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
     * Available values: "sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, lists, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters".
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetMembersQueryWithFields fields(Field... value) {
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
