package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

public class GroupsSetLongPollSettingsQuery extends AbstractQueryBuilder<GroupsSetLongPollSettingsQuery, OkResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param groupId group id
     */
    public GroupsSetLongPollSettingsQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.setLongPollSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  group actor with access token
     */
    public GroupsSetLongPollSettingsQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.setLongPollSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    public GroupsSetLongPollSettingsQuery groupId(int groupId) {
        return unsafeParam("group_id", groupId);
    }

    public GroupsSetLongPollSettingsQuery enabled(Boolean value) {
        return unsafeParam("enabled", value);
    }

    public GroupsSetLongPollSettingsQuery messageNew(Boolean value) {
        return unsafeParam("message_new", value);
    }

    public GroupsSetLongPollSettingsQuery messageReply(Boolean value) {
        return unsafeParam("message_reply", value);
    }

    public GroupsSetLongPollSettingsQuery messageEdit(Boolean value) {
        return unsafeParam("message_edit", value);
    }

    public GroupsSetLongPollSettingsQuery messageAllow(Boolean value) {
        return unsafeParam("message_allow", value);
    }

    public GroupsSetLongPollSettingsQuery messageDeny(Boolean value) {
        return unsafeParam("message_deny", value);
    }

    public GroupsSetLongPollSettingsQuery photoNew(Boolean value) {
        return unsafeParam("photo_new", value);
    }

    public GroupsSetLongPollSettingsQuery audioNew(Boolean value) {
        return unsafeParam("audio_new", value);
    }

    public GroupsSetLongPollSettingsQuery videoNew(Boolean value) {
        return unsafeParam("video_new", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyNew(Boolean value) {
        return unsafeParam("wall_reply_new", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyEdit(Boolean value) {
        return unsafeParam("wall_reply_edit", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyDelete(Boolean value) {
        return unsafeParam("wall_reply_delete", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyRestore(Boolean value) {
        return unsafeParam("wall_reply_restore", value);
    }

    public GroupsSetLongPollSettingsQuery wallPostNew(Boolean value) {
        return unsafeParam("wall_post_new", value);
    }

    public GroupsSetLongPollSettingsQuery wallRepost(Boolean value) {
        return unsafeParam("wall_repost", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostNew(Boolean value) {
        return unsafeParam("board_post_new", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostEdit(Boolean value) {
        return unsafeParam("board_post_edit", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostRestore(Boolean value) {
        return unsafeParam("board_post_restore", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostDelete(Boolean value) {
        return unsafeParam("board_post_delete", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentNew(Boolean value) {
        return unsafeParam("photo_comment_new", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentEdit(Boolean value) {
        return unsafeParam("photo_comment_edit", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentDelete(Boolean value) {
        return unsafeParam("photo_comment_delete", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentRestore(Boolean value) {
        return unsafeParam("photo_comment_restore", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentNew(Boolean value) {
        return unsafeParam("video_comment_new", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentEdit(Boolean value) {
        return unsafeParam("video_comment_edit", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentDelete(Boolean value) {
        return unsafeParam("video_comment_delete", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentRestore(Boolean value) {
        return unsafeParam("video_comment_restore", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentNew(Boolean value) {
        return unsafeParam("market_comment_new", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentEdit(Boolean value) {
        return unsafeParam("market_comment_edit", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentDelete(Boolean value) {
        return unsafeParam("market_comment_delete", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentRestore(Boolean value) {
        return unsafeParam("market_comment_restore", value);
    }

    public GroupsSetLongPollSettingsQuery pollVoteNew(Boolean value) {
        return unsafeParam("poll_vote_new", value);
    }

    public GroupsSetLongPollSettingsQuery groupJoin(Boolean value) {
        return unsafeParam("group_join", value);
    }

    public GroupsSetLongPollSettingsQuery groupLeave(Boolean value) {
        return unsafeParam("group_leave", value);
    }

    public GroupsSetLongPollSettingsQuery groupChangeSettings(Boolean value) {
        return unsafeParam("group_change_settings", value);
    }

    public GroupsSetLongPollSettingsQuery groupChangePhoto(Boolean value) {
        return unsafeParam("group_change_photo", value);
    }

    public GroupsSetLongPollSettingsQuery groupOfficersEdit(Boolean value) {
        return unsafeParam("group_officers_edit", value);
    }

    public GroupsSetLongPollSettingsQuery userBlock(Boolean value) {
        return unsafeParam("user_block", value);
    }

    public GroupsSetLongPollSettingsQuery userUnblock(Boolean value) {
        return unsafeParam("user_unblock", value);
    }

    @Override
    protected GroupsSetLongPollSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "group_id");
    }
}
