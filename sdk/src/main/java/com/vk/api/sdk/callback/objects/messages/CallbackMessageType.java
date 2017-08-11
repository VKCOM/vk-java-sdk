package com.vk.api.sdk.callback.objects.messages;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Anton Tsivarev on 09.09.16.
 */
public enum CallbackMessageType {

    @SerializedName("confirmation")
    CONFIRMATION("confirmation"),

    @SerializedName("message_new")
    MESSAGE_NEW("message_new"),

    @SerializedName("wall_reply_new")
    WALL_REPLY_NEW("wall_reply_new"),

    @SerializedName("wall_reply_edit")
    WALL_REPLY_EDIT("wall_reply_edit"),

    @SerializedName("wall_post_new")
    WALL_POST_NEW("wall_post_new"),

    @SerializedName("audio_new")
    AUIDO_NEW("audio_new"),

    @SerializedName("photo_new")
    PHOTO_NEW("photo_new"),

    @SerializedName("photo_comment_new")
    PHOTO_COMMENT_NEW("photo_comment_new"),

    @SerializedName("video_new")
    VIDEO_NEW("video_new"),

    @SerializedName("video_comment_new")
    VIDEO_COMMENT_NEW("video_comment_new"),

    @SerializedName("group_leave")
    GROUP_LEAVE("group_leave"),

    @SerializedName("group_join")
    GROUP_JOIN("group_join"),

    @SerializedName("board_post_new")
    BOARD_POST_NEW("board_post_new"),

    @SerializedName("board_post_edit")
    BOARD_POST_EDIT("board_post_edit"),

    @SerializedName("board_post_restore")
    BOARD_POST_RESTORE("board_post_restore"),

    @SerializedName("board_post_delete")
    BOARD_POST_DELETE("board_post_delete"),

    @SerializedName("market_comment_new")
    MARKET_COMMENT_NEW("market_comment_new");

    private final String value;

    CallbackMessageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
