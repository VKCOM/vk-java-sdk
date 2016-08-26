package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.setCallbackServerSettings method
 */
public class GroupsSetCallbackServerSettingsQuery extends AbstractQueryBuilder<GroupsSetCallbackServerSettingsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsSetCallbackServerSettingsQuery(VkApiClient client, Actor actor, int groupId) {
        super(client, "groups.setCallbackServerSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsSetCallbackServerSettingsQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Callback API secret key.
     *
     * @param value value of "secret key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackServerSettingsQuery secretKey(String value) {
        return unsafeParam("secret_key", value);
    }

    @Override
    protected GroupsSetCallbackServerSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
