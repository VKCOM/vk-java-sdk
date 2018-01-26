package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetLongPollSettingsResponse;

import java.util.Arrays;
import java.util.List;

public class GroupsSetLongPollSettingsQuery extends AbstractQueryBuilder<GroupsSetLongPollSettingsQuery, Integer> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param groupId group id
     */
    public GroupsSetLongPollSettingsQuery(VkApiClient client, UserActor actor, Integer groupId) {
        super(client, "groups.getLongPollSettings", GetLongPollSettingsResponse.class);
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
        super(client, "groups.getLongPollSettings", GetLongPollSettingsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    public GroupsSetLongPollSettingsQuery groupId(Integer groupId) {
        return unsafeParam("group_id", groupId);
    }

    public GroupsSetLongPollSettingsQuery enabled(Integer value) {
        return unsafeParam("enabled", value);
    }

    public GroupsSetLongPollSettingsQuery messageNew(Integer value) {
        return unsafeParam("message_new", value);
    }

    public GroupsSetLongPollSettingsQuery messageReply(Integer value) {
        return unsafeParam("message_reply", value);
    }

    public GroupsSetLongPollSettingsQuery messageAllow(Integer value) {
        return unsafeParam("message_allow", value);
    }

    public GroupsSetLongPollSettingsQuery messageDeny(Integer value) {
        return unsafeParam("message_deny", value);
    }

    public GroupsSetLongPollSettingsQuery photoNew(Integer value) {
        return unsafeParam("photo_new", value);
    }

    public GroupsSetLongPollSettingsQuery audioNew(Integer value) {
        return unsafeParam("audio_new", value);
    }

    public GroupsSetLongPollSettingsQuery videoNew(Integer value) {
        return unsafeParam("video_new", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyNew(Integer value) {
        return unsafeParam("wall_reply_new", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyEdit(Integer value) {
        return unsafeParam("wall_reply_edit", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyDelete(Integer value) {
        return unsafeParam("wall_reply_delete", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyRestore(Integer value) {
        return unsafeParam("wall_reply_restore", value);
    }

    public GroupsSetLongPollSettingsQuery wallPostNew(Integer value) {
        return unsafeParam("wall_post_new", value);
    }

    public GroupsSetLongPollSettingsQuery wallRepost(Integer value) {
        return unsafeParam("wall_repost", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostNew(Integer value) {
        return unsafeParam("board_post_new", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostEdit(Integer value) {
        return unsafeParam("board_post_edit", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostRestore(Integer value) {
        return unsafeParam("board_post_restore", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostDelete(Integer value) {
        return unsafeParam("board_post_delete", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentNew(Integer value) {
        return unsafeParam("photo_comment_new", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentEdit(Integer value) {
        return unsafeParam("photo_comment_edit", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentDelete(Integer value) {
        return unsafeParam("photo_comment_delete", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentRestore(Integer value) {
        return unsafeParam("photo_comment_restore", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentNew(Integer value) {
        return unsafeParam("video_comment_new", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentEdit(Integer value) {
        return unsafeParam("video_comment_edit", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentDelete(Integer value) {
        return unsafeParam("video_comment_delete", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentRestore(Integer value) {
        return unsafeParam("video_comment_restore", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentNew(Integer value) {
        return unsafeParam("market_comment_new", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentEdit(Integer value) {
        return unsafeParam("market_comment_edit", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentDelete(Integer value) {
        return unsafeParam("market_comment_delete", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentRestore(Integer value) {
        return unsafeParam("market_comment_restore", value);
    }

    public GroupsSetLongPollSettingsQuery pollVoteNew(Integer value) {
        return unsafeParam("poll_vote_new", value);
    }

    public GroupsSetLongPollSettingsQuery groupJoin(Integer value) {
        return unsafeParam("group_join", value);
    }

    public GroupsSetLongPollSettingsQuery groupLeave(Integer value) {
        return unsafeParam("group_leave", value);
    }

    public GroupsSetLongPollSettingsQuery groupChangeSettings(Integer value) {
        return unsafeParam("group_change_settings", value);
    }

    public GroupsSetLongPollSettingsQuery groupChangePhoto(Integer value) {
        return unsafeParam("group_change_photo", value);
    }

    public GroupsSetLongPollSettingsQuery groupOfficersEdit(Integer value) {
        return unsafeParam("group_officers_edit", value);
    }

    public GroupsSetLongPollSettingsQuery userBlock(Integer value) {
        return unsafeParam("user_block", value);
    }

    public GroupsSetLongPollSettingsQuery userUnblock(Integer value) {
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
