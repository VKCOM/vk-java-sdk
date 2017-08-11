package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for groups.editCallbackServer method
 */
public class GroupsEditCallbackServerQuery extends AbstractQueryBuilder<GroupsEditCallbackServerQuery, OkResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param groupId  value of "group id" parameter. Minimum is 0.
     * @param serverId value of "server id" parameter. Minimum is 0.
     */
    public GroupsEditCallbackServerQuery(VkApiClient client, UserActor actor, int groupId, int serverId, String url, String title) {
        super(client, "groups.editCallbackServer", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        serverId(serverId);
        url(url);
        title(title);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param serverId value of "server id" parameter. Minimum is 0.
     */
    public GroupsEditCallbackServerQuery(VkApiClient client, GroupActor actor, int serverId, String url, String title) {
        super(client, "groups.editCallbackServer", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        serverId(serverId);
        url(url);
        title(title);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditCallbackServerQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Server ID.
     *
     * @param value value of "server id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditCallbackServerQuery serverId(int value) {
        return unsafeParam("server_id", value);
    }

    /**
     * URL.
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditCallbackServerQuery url(String value) {
        return unsafeParam("url", value);
    }

    /**
     * Title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditCallbackServerQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Secret key.
     *
     * @param value value of "secret key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditCallbackServerQuery secretKey(String value) {
        return unsafeParam("secret_key", value);
    }

    @Override
    protected GroupsEditCallbackServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "server_id", "url", "title", "access_token");
    }
}
