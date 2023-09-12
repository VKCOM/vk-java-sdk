package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.groups.*;

/**
 * List of Groups methods
 */
public class GroupsLongPoll extends Groups {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public GroupsLongPoll(VkApiClient client) {
        super(client);
    }

    /**
     * Retrieves server info needed to use long polling.
     */
    public GroupsGetLongPollServerQuery getLongPollServer(UserActor actor, Long groupId) {
        return new GroupsGetLongPollServerQuery(getClient(), actor, groupId);
    }

    /**
     * Retrieves server info needed to use long polling.
     */
    public GroupsGetLongPollServerQuery getLongPollServer(GroupActor actor, Long groupId) {
        return new GroupsGetLongPollServerQuery(getClient(), actor, groupId);
    }

    /**
     * Retrieves group longpoll settings
     */
    public GroupsGetLongPollSettingsQuery getLongPollSettings(UserActor actor, Long groupId) {
        return new GroupsGetLongPollSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Retrieves group longpoll settings
     */
    public GroupsGetLongPollSettingsQuery getLongPollSettings(GroupActor actor, Long groupId) {
        return new GroupsGetLongPollSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Sets group longpoll settings
     */
    public GroupsSetLongPollSettingsQuery setLongPollSettings(UserActor actor, Long groupId) {
        return new GroupsSetLongPollSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Sets group longpoll settings
     */
    public GroupsSetLongPollSettingsQuery setLongPollSettings(GroupActor actor) {
        return new GroupsSetLongPollSettingsQuery(getClient(), actor, actor.getGroupId());
    }

}
