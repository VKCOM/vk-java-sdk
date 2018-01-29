package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.groups.responses.GetLongPollSettingsResponse;

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

    public GroupsSetLongPollSettingsQuery enabled(BoolInt value) {
        return unsafeParam("enabled", value);
    }

    public GroupsSetLongPollSettingsQuery messageNew(BoolInt value) {
        return unsafeParam("message_new", value);
    }

    public GroupsSetLongPollSettingsQuery messageReply(BoolInt value) {
        return unsafeParam("message_reply", value);
    }

    public GroupsSetLongPollSettingsQuery messageAllow(BoolInt value) {
        return unsafeParam("message_allow", value);
    }

    public GroupsSetLongPollSettingsQuery messageDeny(BoolInt value) {
        return unsafeParam("message_deny", value);
    }

    public GroupsSetLongPollSettingsQuery photoNew(BoolInt value) {
        return unsafeParam("photo_new", value);
    }

    public GroupsSetLongPollSettingsQuery audioNew(BoolInt value) {
        return unsafeParam("audio_new", value);
    }

    public GroupsSetLongPollSettingsQuery videoNew(BoolInt value) {
        return unsafeParam("video_new", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyNew(BoolInt value) {
        return unsafeParam("wall_reply_new", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyEdit(BoolInt value) {
        return unsafeParam("wall_reply_edit", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyDelete(BoolInt value) {
        return unsafeParam("wall_reply_delete", value);
    }

    public GroupsSetLongPollSettingsQuery wallReplyRestore(BoolInt value) {
        return unsafeParam("wall_reply_restore", value);
    }

    public GroupsSetLongPollSettingsQuery wallPostNew(BoolInt value) {
        return unsafeParam("wall_post_new", value);
    }

    public GroupsSetLongPollSettingsQuery wallRepost(BoolInt value) {
        return unsafeParam("wall_repost", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostNew(BoolInt value) {
        return unsafeParam("board_post_new", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostEdit(BoolInt value) {
        return unsafeParam("board_post_edit", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostRestore(BoolInt value) {
        return unsafeParam("board_post_restore", value);
    }

    public GroupsSetLongPollSettingsQuery boardPostDelete(BoolInt value) {
        return unsafeParam("board_post_delete", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentNew(BoolInt value) {
        return unsafeParam("photo_comment_new", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentEdit(BoolInt value) {
        return unsafeParam("photo_comment_edit", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentDelete(BoolInt value) {
        return unsafeParam("photo_comment_delete", value);
    }

    public GroupsSetLongPollSettingsQuery photoCommentRestore(BoolInt value) {
        return unsafeParam("photo_comment_restore", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentNew(BoolInt value) {
        return unsafeParam("video_comment_new", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentEdit(BoolInt value) {
        return unsafeParam("video_comment_edit", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentDelete(BoolInt value) {
        return unsafeParam("video_comment_delete", value);
    }

    public GroupsSetLongPollSettingsQuery videoCommentRestore(BoolInt value) {
        return unsafeParam("video_comment_restore", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentNew(BoolInt value) {
        return unsafeParam("market_comment_new", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentEdit(BoolInt value) {
        return unsafeParam("market_comment_edit", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentDelete(BoolInt value) {
        return unsafeParam("market_comment_delete", value);
    }

    public GroupsSetLongPollSettingsQuery marketCommentRestore(BoolInt value) {
        return unsafeParam("market_comment_restore", value);
    }

    public GroupsSetLongPollSettingsQuery pollVoteNew(BoolInt value) {
        return unsafeParam("poll_vote_new", value);
    }

    public GroupsSetLongPollSettingsQuery groupJoin(BoolInt value) {
        return unsafeParam("group_join", value);
    }

    public GroupsSetLongPollSettingsQuery groupLeave(BoolInt value) {
        return unsafeParam("group_leave", value);
    }

    public GroupsSetLongPollSettingsQuery groupChangeSettings(BoolInt value) {
        return unsafeParam("group_change_settings", value);
    }

    public GroupsSetLongPollSettingsQuery groupChangePhoto(BoolInt value) {
        return unsafeParam("group_change_photo", value);
    }

    public GroupsSetLongPollSettingsQuery groupOfficersEdit(BoolInt value) {
        return unsafeParam("group_officers_edit", value);
    }

    public GroupsSetLongPollSettingsQuery userBlock(BoolInt value) {
        return unsafeParam("user_block", value);
    }

    public GroupsSetLongPollSettingsQuery userUnblock(BoolInt value) {
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
