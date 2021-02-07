package com.vk.api.sdk.objects.callback;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum MessageType implements EnumParam {
    @SerializedName("audio_new")
    AUDIO_NEW("audio_new"),

    @SerializedName("board_post_new")
    BOARD_POST_NEW("board_post_new"),

    @SerializedName("board_post_edit")
    BOARD_POST_EDIT("board_post_edit"),

    @SerializedName("board_post_restore")
    BOARD_POST_RESTORE("board_post_restore"),

    @SerializedName("board_post_delete")
    BOARD_POST_DELETE("board_post_delete"),

    @SerializedName("confirmation")
    CONFIRMATION("confirmation"),

    @SerializedName("group_leave")
    GROUP_LEAVE("group_leave"),

    @SerializedName("group_join")
    GROUP_JOIN("group_join"),

    @SerializedName("group_change_photo")
    GROUP_CHANGE_PHOTO("group_change_photo"),

    @SerializedName("group_change_settings")
    GROUP_CHANGE_SETTINGS("group_change_settings"),

    @SerializedName("group_officers_edit")
    GROUP_OFFICERS_EDIT("group_officers_edit"),

    @SerializedName("lead_forms_new")
    LEAD_FORMS_NEW("lead_forms_new"),

    @SerializedName("market_comment_new")
    MARKET_COMMENT_NEW("market_comment_new"),

    @SerializedName("market_comment_delete")
    MARKET_COMMENT_DELETE("market_comment_delete"),

    @SerializedName("market_comment_edit")
    MARKET_COMMENT_EDIT("market_comment_edit"),

    @SerializedName("market_comment_restore")
    MARKET_COMMENT_RESTORE("market_comment_restore"),

    @SerializedName("message_allow")
    MESSAGE_ALLOW("message_allow"),

    @SerializedName("message_new")
    MESSAGE_NEW("message_new"),

    @SerializedName("message_deny")
    MESSAGE_DENY("message_deny"),

    @SerializedName("message_read")
    MESSAGE_READ("message_read"),

    @SerializedName("message_reply")
    MESSAGE_REPLY("message_reply"),

    @SerializedName("message_edit")
    MESSAGE_EDIT("message_edit"),

    @SerializedName("message_typing_state")
    MESSAGE_TYPING_STATE("message_typing_state"),

    @SerializedName("messages_edit")
    MESSAGES_EDIT("messages_edit"),

    @SerializedName("photo_new")
    PHOTO_NEW("photo_new"),

    @SerializedName("photo_comment_new")
    PHOTO_COMMENT_NEW("photo_comment_new"),

    @SerializedName("photo_comment_delete")
    PHOTO_COMMENT_DELETE("photo_comment_delete"),

    @SerializedName("photo_comment_edit")
    PHOTO_COMMENT_EDIT("photo_comment_edit"),

    @SerializedName("photo_comment_restore")
    PHOTO_COMMENT_RESTORE("photo_comment_restore"),

    @SerializedName("poll_vote_new")
    POLL_VOTE_NEW("poll_vote_new"),

    @SerializedName("user_block")
    USER_BLOCK("user_block"),

    @SerializedName("user_unblock")
    USER_UNBLOCK("user_unblock"),

    @SerializedName("video_new")
    VIDEO_NEW("video_new"),

    @SerializedName("video_comment_new")
    VIDEO_COMMENT_NEW("video_comment_new"),

    @SerializedName("video_comment_delete")
    VIDEO_COMMENT_DELETE("video_comment_delete"),

    @SerializedName("video_comment_edit")
    VIDEO_COMMENT_EDIT("video_comment_edit"),

    @SerializedName("video_comment_restore")
    VIDEO_COMMENT_RESTORE("video_comment_restore"),

    @SerializedName("wall_post_new")
    WALL_POST_NEW("wall_post_new"),

    @SerializedName("wall_reply_new")
    WALL_REPLY_NEW("wall_reply_new"),

    @SerializedName("wall_reply_edit")
    WALL_REPLY_EDIT("wall_reply_edit"),

    @SerializedName("wall_reply_delete")
    WALL_REPLY_DELETE("wall_reply_delete"),

    @SerializedName("wall_reply_restore")
    WALL_REPLY_RESTORE("wall_reply_restore"),

    @SerializedName("wall_repost")
    WALL_REPOST("wall_repost");

    private final String value;

    MessageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
