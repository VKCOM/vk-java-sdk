package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * GetCallbackSettingsResponse object
 */
public class GetCallbackSettingsResponse {
    /**
     * Whether notifications about new message enabled
     */
    @SerializedName("message_new")
    private BoolInt messageNew;

    /**
     * Whether notifications about new photos enabled
     */
    @SerializedName("photo_new")
    private BoolInt photoNew;

    /**
     * Whether notifications about new audios enabled
     */
    @SerializedName("audio_new")
    private BoolInt audioNew;

    /**
     * Whether notifications about new videos enabled
     */
    @SerializedName("video_new")
    private BoolInt videoNew;

    /**
     * Whether notifications about new wall replies enabled
     */
    @SerializedName("wall_reply_new")
    private BoolInt wallReplyNew;

    /**
     * Whether notifications about wall replies edits enabled
     */
    @SerializedName("wall_reply_edit")
    private BoolInt wallReplyEdit;

    /**
     * Whether notifications about new wall posts enabled
     */
    @SerializedName("wall_post_new")
    private BoolInt wallPostNew;

    /**
     * Whether notifications about new board posts enabled
     */
    @SerializedName("board_post_new")
    private BoolInt boardPostNew;

    /**
     * Whether notifications about board posts edits enabled
     */
    @SerializedName("board_post_edit")
    private BoolInt boardPostEdit;

    /**
     * Whether notifications about board posts restores enabled
     */
    @SerializedName("board_post_restore")
    private BoolInt boardPostRestore;

    /**
     * Whether notifications about board posts deleted enabled
     */
    @SerializedName("board_post_delete")
    private BoolInt boardPostDelete;

    /**
     * Whether notifications about new photo comments enabled
     */
    @SerializedName("photo_comment_new")
    private BoolInt photoCommentNew;

    /**
     * Whether notifications about new video comments enabled
     */
    @SerializedName("video_comment_new")
    private BoolInt videoCommentNew;

    /**
     * Whether notifications about new market comments enabled
     */
    @SerializedName("market_comment_new")
    private BoolInt marketCommentNew;

    /**
     * Whether notifications about anyone joined the community enabled
     */
    @SerializedName("group_join")
    private BoolInt groupJoin;

    /**
     * Whether notifications about anyone left the community enabled
     */
    @SerializedName("group_leave")
    private BoolInt groupLeave;

    public boolean isMessageNew() {
        return messageNew == BoolInt.YES;
    }

    public boolean isPhotoNew() {
        return photoNew == BoolInt.YES;
    }

    public boolean isAudioNew() {
        return audioNew == BoolInt.YES;
    }

    public boolean isVideoNew() {
        return videoNew == BoolInt.YES;
    }

    public boolean isWallReplyNew() {
        return wallReplyNew == BoolInt.YES;
    }

    public boolean isWallReplyEdit() {
        return wallReplyEdit == BoolInt.YES;
    }

    public boolean isWallPostNew() {
        return wallPostNew == BoolInt.YES;
    }

    public boolean isBoardPostNew() {
        return boardPostNew == BoolInt.YES;
    }

    public boolean isBoardPostEdit() {
        return boardPostEdit == BoolInt.YES;
    }

    public boolean isBoardPostRestore() {
        return boardPostRestore == BoolInt.YES;
    }

    public boolean isBoardPostDelete() {
        return boardPostDelete == BoolInt.YES;
    }

    public boolean isPhotoCommentNew() {
        return photoCommentNew == BoolInt.YES;
    }

    public boolean isVideoCommentNew() {
        return videoCommentNew == BoolInt.YES;
    }

    public boolean isMarketCommentNew() {
        return marketCommentNew == BoolInt.YES;
    }

    public boolean isGroupJoin() {
        return groupJoin == BoolInt.YES;
    }

    public boolean isGroupLeave() {
        return groupLeave == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageNew, audioNew, photoNew, videoNew, groupLeave, boardPostEdit, photoCommentNew, wallReplyEdit, boardPostNew, videoCommentNew, wallPostNew, boardPostRestore, wallReplyNew, boardPostDelete, marketCommentNew, groupJoin);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCallbackSettingsResponse getCallbackSettingsResponse = (GetCallbackSettingsResponse) o;
        return Objects.equals(messageNew, getCallbackSettingsResponse.messageNew) &&
                Objects.equals(photoNew, getCallbackSettingsResponse.photoNew) &&
                Objects.equals(audioNew, getCallbackSettingsResponse.audioNew) &&
                Objects.equals(videoNew, getCallbackSettingsResponse.videoNew) &&
                Objects.equals(wallReplyNew, getCallbackSettingsResponse.wallReplyNew) &&
                Objects.equals(wallReplyEdit, getCallbackSettingsResponse.wallReplyEdit) &&
                Objects.equals(wallPostNew, getCallbackSettingsResponse.wallPostNew) &&
                Objects.equals(boardPostNew, getCallbackSettingsResponse.boardPostNew) &&
                Objects.equals(boardPostEdit, getCallbackSettingsResponse.boardPostEdit) &&
                Objects.equals(boardPostRestore, getCallbackSettingsResponse.boardPostRestore) &&
                Objects.equals(boardPostDelete, getCallbackSettingsResponse.boardPostDelete) &&
                Objects.equals(photoCommentNew, getCallbackSettingsResponse.photoCommentNew) &&
                Objects.equals(videoCommentNew, getCallbackSettingsResponse.videoCommentNew) &&
                Objects.equals(marketCommentNew, getCallbackSettingsResponse.marketCommentNew) &&
                Objects.equals(groupJoin, getCallbackSettingsResponse.groupJoin) &&
                Objects.equals(groupLeave, getCallbackSettingsResponse.groupLeave);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCallbackSettingsResponse{");
        sb.append("messageNew=").append(messageNew);
        sb.append(", photoNew=").append(photoNew);
        sb.append(", audioNew=").append(audioNew);
        sb.append(", videoNew=").append(videoNew);
        sb.append(", wallReplyNew=").append(wallReplyNew);
        sb.append(", wallReplyEdit=").append(wallReplyEdit);
        sb.append(", wallPostNew=").append(wallPostNew);
        sb.append(", boardPostNew=").append(boardPostNew);
        sb.append(", boardPostEdit=").append(boardPostEdit);
        sb.append(", boardPostRestore=").append(boardPostRestore);
        sb.append(", boardPostDelete=").append(boardPostDelete);
        sb.append(", photoCommentNew=").append(photoCommentNew);
        sb.append(", videoCommentNew=").append(videoCommentNew);
        sb.append(", marketCommentNew=").append(marketCommentNew);
        sb.append(", groupJoin=").append(groupJoin);
        sb.append(", groupLeave=").append(groupLeave);
        sb.append('}');
        return sb.toString();
    }
}
