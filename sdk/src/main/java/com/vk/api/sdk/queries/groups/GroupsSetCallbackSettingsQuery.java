package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.setCallbackSettings method
 */
public class GroupsSetCallbackSettingsQuery extends AbstractQueryBuilder<GroupsSetCallbackSettingsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsSetCallbackSettingsQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.setCallbackSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsSetCallbackSettingsQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.setCallbackSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsSetCallbackSettingsQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * New messages notifications.
     *
     * @param value value of "message new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageNew(Boolean value) {
        return unsafeParam("message_new", value);
    }

    /**
     * Allow messages notifications.
     *
     * @param value value of "message new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageAllow(Boolean value) {
        return unsafeParam("message_allow", value);
    }

    /**
     * Deny messages notifications.
     *
     * @param value value of "message new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageDeny(Boolean value) {
        return unsafeParam("message_deny", value);
    }

    /**
     * New photos notifications.
     *
     * @param value value of "photo new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery photoNew(Boolean value) {
        return unsafeParam("photo_new", value);
    }

    /**
     * New audios notifications.
     *
     * @param value value of "audio new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery audioNew(Boolean value) {
        return unsafeParam("audio_new", value);
    }

    /**
     * New videos notifications.
     *
     * @param value value of "video new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery videoNew(Boolean value) {
        return unsafeParam("video_new", value);
    }

    /**
     * New wall replies notifications.
     *
     * @param value value of "wall reply new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallReplyNew(Boolean value) {
        return unsafeParam("wall_reply_new", value);
    }

    /**
     * Wall replies edited notifications.
     *
     * @param value value of "wall reply edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallReplyEdit(Boolean value) {
        return unsafeParam("wall_reply_edit", value);
    }

    /**
     * New wall posts notifications.
     *
     * @param value value of "wall post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallPostNew(Boolean value) {
        return unsafeParam("wall_post_new", value);
    }

    /**
     * Wall repost notifications.
     *
     * @param value value of "wall post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallRepost(Boolean value) {
        return unsafeParam("wall_repost", value);
    }

    /**
     * New board posts notifications.
     *
     * @param value value of "board post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostNew(Boolean value) {
        return unsafeParam("board_post_new", value);
    }

    /**
     * Board posts edited notifications.
     *
     * @param value value of "board post edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostEdit(Boolean value) {
        return unsafeParam("board_post_edit", value);
    }

    /**
     * Board posts restored notifications.
     *
     * @param value value of "board post restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostRestore(Boolean value) {
        return unsafeParam("board_post_restore", value);
    }

    /**
     * Board posts deleted notifications.
     *
     * @param value value of "board post delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostDelete(Boolean value) {
        return unsafeParam("board_post_delete", value);
    }

    /**
     * New comment to photo notifications.
     *
     * @param value value of "photo comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery photoCommentNew(Boolean value) {
        return unsafeParam("photo_comment_new", value);
    }

    /**
     * New comment to video notifications.
     *
     * @param value value of "video comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery videoCommentNew(Boolean value) {
        return unsafeParam("video_comment_new", value);
    }

    /**
     * New comment to market item notifications.
     *
     * @param value value of "market comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery marketCommentNew(Boolean value) {
        return unsafeParam("market_comment_new", value);
    }

    /**
     * Joined community notifications.
     *
     * @param value value of "group join" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery groupJoin(Boolean value) {
        return unsafeParam("group_join", value);
    }

    /**
     * Left community notifications.
     *
     * @param value value of "group leave" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery groupLeave(Boolean value) {
        return unsafeParam("group_leave", value);
    }

    @Override
    protected GroupsSetCallbackSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
