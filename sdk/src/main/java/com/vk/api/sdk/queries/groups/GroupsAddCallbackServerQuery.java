package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.AddCallbackServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for groups.addCallbackServer method
 */
public class GroupsAddCallbackServerQuery extends AbstractQueryBuilder<GroupsAddCallbackServerQuery, AddCallbackServerResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsAddCallbackServerQuery(VkApiClient client, UserActor actor, int groupId, String url, String title) {
        super(client, "groups.addCallbackServer", AddCallbackServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        url(url);
        title(title);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsAddCallbackServerQuery(VkApiClient client, GroupActor actor, String url, String title) {
        super(client, "groups.addCallbackServer", AddCallbackServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        url(url);
        title(title);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddCallbackServerQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * URL.
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddCallbackServerQuery url(String value) {
        return unsafeParam("url", value);
    }

    /**
     * Title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddCallbackServerQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Secret key.
     *
     * @param value value of "secret key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsAddCallbackServerQuery secretKey(String value) {
        return unsafeParam("secret_key", value);
    }

    @Override
    protected GroupsAddCallbackServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "url", "title", "access_token");
    }
}
