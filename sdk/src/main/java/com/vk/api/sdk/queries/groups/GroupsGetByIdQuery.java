package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.GroupFull;

import java.util.Collections;
import java.util.List;

/**
 * Query for Groups.getById method
 */
public class GroupsGetByIdQuery extends AbstractQueryBuilder<GroupsGetByIdQuery, List<GroupFull>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetByIdQuery(VkApiClient client, UserActor actor) {
        super(client, "groups.getById", Utils.buildParametrizedType(List.class, GroupFull.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetByIdQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.getById", Utils.buildParametrizedType(List.class, GroupFull.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public GroupsGetByIdQuery(VkApiClient client, ServiceActor actor) {
        super(client, "groups.getById", Utils.buildParametrizedType(List.class, GroupFull.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * IDs or screen names of communities.
     *
     * @param value value of "group ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetByIdQuery groupIds(String... value) {
        return unsafeParam("group_ids", value);
    }

    /**
     * IDs or screen names of communities.
     *
     * @param value value of "group ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetByIdQuery groupIds(List<String> value) {
        return unsafeParam("group_ids", value);
    }

    /**
     * ID or screen name of the community.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetByIdQuery groupId(String value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Group fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetByIdQuery fields(GroupField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Group fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetByIdQuery fields(List<GroupField> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected GroupsGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
