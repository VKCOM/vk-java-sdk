package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.setSettings method
 */
public class GroupsSetSettingsQuery extends AbstractQueryBuilder<GroupsSetSettingsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsSetSettingsQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.setSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsSetSettingsQuery(VkApiClient client, GroupActor actor, int groupId) {
        super(client, "groups.setSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsSetSettingsQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set messages
     *
     * @param value value of "messages" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetSettingsQuery messages(Boolean value) {
        return unsafeParam("messages", value);
    }

    /**
     * Set bots capabilities
     *
     * @param value value of "bots capabilities" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetSettingsQuery botsCapabilities(Boolean value) {
        return unsafeParam("bots_capabilities", value);
    }

    /**
     * Set bots start button
     *
     * @param value value of "bots start button" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetSettingsQuery botsStartButton(Boolean value) {
        return unsafeParam("bots_start_button", value);
    }

    /**
     * Set bots add to chat
     *
     * @param value value of "bots add to chat" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetSettingsQuery botsAddToChat(Boolean value) {
        return unsafeParam("bots_add_to_chat", value);
    }

    @Override
    protected GroupsSetSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
