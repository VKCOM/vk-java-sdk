package com.vk.api.sdk.events;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.board.TopicComment;
import com.vk.api.sdk.objects.callback.*;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallComment;
import com.vk.api.sdk.objects.wall.Wallpost;

import java.lang.reflect.Type;

public enum Events {

    @SerializedName("message_new")
    MESSAGE_NEW(Message.class),

    @SerializedName("message_reply")
    MESSAGE_REPLY(Message.class),

    @SerializedName("message_allow")
    MESSAGE_ALLOW(Message.class),

    @SerializedName("message_deny")
    MESSAGE_DENY(MessageAllow.class),

    @SerializedName("message_edit")
    MESSAGE_EDIT(MessageDeny.class),

    @SerializedName("photo_new")
    PHOTO_NEW(Photo.class),

    @SerializedName("photo_comment_new")
    PHOTO_COMMENT_NEW(PhotoComment.class),

    @SerializedName("photo_comment_edit")
    PHOTO_COMMENT_EDIT(PhotoComment.class),

    @SerializedName("photo_comment_restore")
    PHOTO_COMMENT_RESTORE(PhotoComment.class),

    @SerializedName("photo_comment_delete")
    PHOTO_COMMENT_DELETE(PhotoCommentDelete.class),

    @SerializedName("audio_new")
    AUDIO_NEW(Audio.class),

    @SerializedName("video_new")
    VIDEO_NEW(Video.class),

    @SerializedName("video_comment_new")
    VIDEO_COMMENT_NEW(VideoComment.class),

    @SerializedName("video_comment_edit")
    VIDEO_COMMENT_EDIT(VideoComment.class),

    @SerializedName("video_comment_restore")
    VIDEO_COMMENT_RESTORE(VideoComment.class),

    @SerializedName("video_comment_delete")
    VIDEO_COMMENT_DELETE(VideoCommentDelete.class),

    @SerializedName("wall_post_new")
    WALL_POST_NEW(Wallpost.class),

    @SerializedName("wall_repost")
    WALL_REPOST(Wallpost.class),

    @SerializedName("wall_reply_new")
    WALL_REPLY_NEW(WallComment.class),

    @SerializedName("wall_reply_edit")
    WALL_REPLY_EDIT(WallComment.class),

    @SerializedName("wall_reply_restore")
    WALL_REPLY_RESTORE(WallComment.class),

    @SerializedName("wall_reply_delete")
    WALL_REPLY_DELETE(WallCommentDelete.class),

    @SerializedName("board_post_new")
    BOARD_POST_NEW(TopicComment.class),

    @SerializedName("board_post_edit")
    BOARD_POST_EDIT(TopicComment.class),

    @SerializedName("board_post_restore")
    BOARD_POST_RESTORE(TopicComment.class),

    @SerializedName("board_post_delete")
    BOARD_POST_DELETE(BoardPostDelete.class),

    @SerializedName("market_comment_new")
    MARKET_COMMENT_NEW(MarketComment.class),

    @SerializedName("market_comment_edit")
    MARKET_COMMENT_EDIT(MarketComment.class),

    @SerializedName("market_comment_restore")
    MARKET_COMMENT_RESTORE(MarketComment.class),

    @SerializedName("market_comment_delete")
    MARKET_COMMENT_DELETE(MarketCommentDelete.class),

    @SerializedName("group_leave")
    GROUP_LEAVE(GroupLeave.class),

    @SerializedName("group_join")
    GROUP_JOIN(GroupJoin.class),

    @SerializedName("group_change_settings")
    GROUP_CHANGE_SETTINGS(GroupChangeSettings.class),

    @SerializedName("group_change_photo")
    GROUP_CHANGE_PHOTO(GroupChangePhoto.class),

    @SerializedName("group_officers_edit")
    GROUP_OFFICERS_EDIT(GroupOfficersEdit.class),

    @SerializedName("poll_vote_new")
    POLL_VOTE_NEW(PollVoteNew.class),

    @SerializedName("user_block")
    USER_BLOCK(UserBlock.class),

    @SerializedName("user_unblock")
    USER_UNBLOCK(UserUnblock.class),

    @SerializedName("confirmation")
    CONFIRMATION(null);

    private final Type type;

    Events(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }
}
