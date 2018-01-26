package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class LongPollServerSettings {

    @SerializedName("message_new")
    private Integer messageNew;

    @SerializedName("message_allow")
    private Integer messageAllow;

    @SerializedName("message_deny")
    private Integer messageDeny;

    @SerializedName("photo_new")
    private Integer photoNew;

    @SerializedName("audio_new")
    private Integer audioNew;

    @SerializedName("video_new")
    private Integer videoNew;

    @SerializedName("wall_reply_new")
    private Integer wallReplyNew;

    @SerializedName("wall_reply_edit")
    private Integer wallReplyEdit;

    @SerializedName("wall_reply_delete")
    private Integer wallReplyDelete;

    @SerializedName("wall_post_new")
    private Integer wallPostNew;

    @SerializedName("wall_repost")
    private Integer wallRespost;

    @SerializedName("board_post_new")
    private Integer boardPostNew;

    @SerializedName("board_post_edit")
    private Integer boardPostEdit;

    @SerializedName("board_post_delete")
    private Integer boardPostDelete;

    @SerializedName("board_post_restore")
    private Integer boardPostRestore;

    @SerializedName("photo_comment_new")
    private Integer photoCommentNew;

    @SerializedName("photo_comment_edit")
    private Integer photoCommentEdit;

    @SerializedName("photo_comment_delete")
    private Integer photoCommentDelete;

    @SerializedName("photo_comment_restore")
    private Integer photoCommentRestore;

    @SerializedName("video_comment_new")
    private Integer videoCommentNew;

    @SerializedName("video_comment_edit")
    private Integer videoCommentEdit;

    @SerializedName("video_comment_delete")
    private Integer videoCommentDelete;

    @SerializedName("video_comment_restore")
    private Integer videoCommentRestore;

    @SerializedName("market_comment_new")
    private Integer marketCommentNew;

    @SerializedName("market_comment_edit")
    private Integer marketCommentEdit;

    @SerializedName("market_comment_delete")
    private Integer marketCommentDelete;

    @SerializedName("market_comment_restore")
    private Integer marketCommentRestore;

    @SerializedName("poll_vote_new")
    private Integer pollVoteNew;

    @SerializedName("group_join")
    private Integer groupJoin;

    @SerializedName("group_leave")
    private Integer groupLeave;

    @SerializedName("user_block")
    private Integer userBlock;

    @SerializedName("user_unblock")
    private Integer userUnblock;

    @SerializedName("group_change_settings")
    private Integer groupChangeSettings;

    @SerializedName("group_change_photo")
    private Integer groupChangePhoto;

    @SerializedName("group_officers_edit")
    private Integer groupOfficersEdit;

    public Integer getMessageNew() {
        return messageNew;
    }

    public Integer getMessageAllow() {
        return messageAllow;
    }

    public Integer getMessageDeny() {
        return messageDeny;
    }

    public Integer getPhotoNew() {
        return photoNew;
    }

    public Integer getAudioNew() {
        return audioNew;
    }

    public Integer getVideoNew() {
        return videoNew;
    }

    public Integer getWallReplyNew() {
        return wallReplyNew;
    }

    public Integer getWallReplyEdit() {
        return wallReplyEdit;
    }

    public Integer getWallReplyDelete() {
        return wallReplyDelete;
    }

    public Integer getWallPostNew() {
        return wallPostNew;
    }

    public Integer getWallRespost() {
        return wallRespost;
    }

    public Integer getBoardPostNew() {
        return boardPostNew;
    }

    public Integer getBoardPostEdit() {
        return boardPostEdit;
    }

    public Integer getBoardPostDelete() {
        return boardPostDelete;
    }

    public Integer getBoardPostRestore() {
        return boardPostRestore;
    }

    public Integer getPhotoCommentNew() {
        return photoCommentNew;
    }

    public Integer getPhotoCommentEdit() {
        return photoCommentEdit;
    }

    public Integer getPhotoCommentDelete() {
        return photoCommentDelete;
    }

    public Integer getPhotoCommentRestore() {
        return photoCommentRestore;
    }

    public Integer getVideoCommentNew() {
        return videoCommentNew;
    }

    public Integer getVideoCommentEdit() {
        return videoCommentEdit;
    }

    public Integer getVideoCommentDelete() {
        return videoCommentDelete;
    }

    public Integer getVideoCommentRestore() {
        return videoCommentRestore;
    }

    public Integer getMarketCommentNew() {
        return marketCommentNew;
    }

    public Integer getMarketCommentEdit() {
        return marketCommentEdit;
    }

    public Integer getMarketCommentDelete() {
        return marketCommentDelete;
    }

    public Integer getMarketCommentRestore() {
        return marketCommentRestore;
    }

    public Integer getPollVoteNew() {
        return pollVoteNew;
    }

    public Integer getGroupJoin() {
        return groupJoin;
    }

    public Integer getGroupLeave() {
        return groupLeave;
    }

    public Integer getUserBlock() {
        return userBlock;
    }

    public Integer getUserUnblock() {
        return userUnblock;
    }

    public Integer getGroupChangeSettings() {
        return groupChangeSettings;
    }

    public Integer getGroupChangePhoto() {
        return groupChangePhoto;
    }

    public Integer getGroupOfficersEdit() {
        return groupOfficersEdit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongPollServerSettings that = (LongPollServerSettings) o;
        return Objects.equals(messageNew, that.messageNew) &&
                Objects.equals(messageAllow, that.messageAllow) &&
                Objects.equals(messageDeny, that.messageDeny) &&
                Objects.equals(photoNew, that.photoNew) &&
                Objects.equals(audioNew, that.audioNew) &&
                Objects.equals(videoNew, that.videoNew) &&
                Objects.equals(wallReplyNew, that.wallReplyNew) &&
                Objects.equals(wallReplyEdit, that.wallReplyEdit) &&
                Objects.equals(wallReplyDelete, that.wallReplyDelete) &&
                Objects.equals(wallPostNew, that.wallPostNew) &&
                Objects.equals(wallRespost, that.wallRespost) &&
                Objects.equals(boardPostNew, that.boardPostNew) &&
                Objects.equals(boardPostEdit, that.boardPostEdit) &&
                Objects.equals(boardPostDelete, that.boardPostDelete) &&
                Objects.equals(boardPostRestore, that.boardPostRestore) &&
                Objects.equals(photoCommentNew, that.photoCommentNew) &&
                Objects.equals(photoCommentEdit, that.photoCommentEdit) &&
                Objects.equals(photoCommentDelete, that.photoCommentDelete) &&
                Objects.equals(photoCommentRestore, that.photoCommentRestore) &&
                Objects.equals(videoCommentNew, that.videoCommentNew) &&
                Objects.equals(videoCommentEdit, that.videoCommentEdit) &&
                Objects.equals(videoCommentDelete, that.videoCommentDelete) &&
                Objects.equals(videoCommentRestore, that.videoCommentRestore) &&
                Objects.equals(marketCommentNew, that.marketCommentNew) &&
                Objects.equals(marketCommentEdit, that.marketCommentEdit) &&
                Objects.equals(marketCommentDelete, that.marketCommentDelete) &&
                Objects.equals(marketCommentRestore, that.marketCommentRestore) &&
                Objects.equals(pollVoteNew, that.pollVoteNew) &&
                Objects.equals(groupJoin, that.groupJoin) &&
                Objects.equals(groupLeave, that.groupLeave) &&
                Objects.equals(userBlock, that.userBlock) &&
                Objects.equals(userUnblock, that.userUnblock) &&
                Objects.equals(groupChangeSettings, that.groupChangeSettings) &&
                Objects.equals(groupChangePhoto, that.groupChangePhoto) &&
                Objects.equals(groupOfficersEdit, that.groupOfficersEdit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageNew, messageAllow, messageDeny, photoNew, audioNew, videoNew, wallReplyNew, wallReplyEdit, wallReplyDelete, wallPostNew, wallRespost, boardPostNew, boardPostEdit, boardPostDelete, boardPostRestore, photoCommentNew, photoCommentEdit, photoCommentDelete, photoCommentRestore, videoCommentNew, videoCommentEdit, videoCommentDelete, videoCommentRestore, marketCommentNew, marketCommentEdit, marketCommentDelete, marketCommentRestore, pollVoteNew, groupJoin, groupLeave, userBlock, userUnblock, groupChangeSettings, groupChangePhoto, groupOfficersEdit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LongPollServerSettings{");
        sb.append("messageNew=").append(messageNew);
        sb.append(", messageAllow=").append(messageAllow);
        sb.append(", messageDeny=").append(messageDeny);
        sb.append(", photoNew=").append(photoNew);
        sb.append(", audioNew=").append(audioNew);
        sb.append(", videoNew=").append(videoNew);
        sb.append(", wallReplyNew=").append(wallReplyNew);
        sb.append(", wallReplyEdit=").append(wallReplyEdit);
        sb.append(", wallReplyDelete=").append(wallReplyDelete);
        sb.append(", wallPostNew=").append(wallPostNew);
        sb.append(", wallRespost=").append(wallRespost);
        sb.append(", boardPostNew=").append(boardPostNew);
        sb.append(", boardPostEdit=").append(boardPostEdit);
        sb.append(", boardPostDelete=").append(boardPostDelete);
        sb.append(", boardPostRestore=").append(boardPostRestore);
        sb.append(", photoCommentNew=").append(photoCommentNew);
        sb.append(", photoCommentEdit=").append(photoCommentEdit);
        sb.append(", photoCommentDelete=").append(photoCommentDelete);
        sb.append(", photoCommentRestore=").append(photoCommentRestore);
        sb.append(", videoCommentNew=").append(videoCommentNew);
        sb.append(", videoCommentEdit=").append(videoCommentEdit);
        sb.append(", videoCommentDelete=").append(videoCommentDelete);
        sb.append(", videoCommentRestore=").append(videoCommentRestore);
        sb.append(", marketCommentNew=").append(marketCommentNew);
        sb.append(", marketCommentEdit=").append(marketCommentEdit);
        sb.append(", marketCommentDelete=").append(marketCommentDelete);
        sb.append(", marketCommentRestore=").append(marketCommentRestore);
        sb.append(", pollVoteNew=").append(pollVoteNew);
        sb.append(", groupJoin=").append(groupJoin);
        sb.append(", groupLeave=").append(groupLeave);
        sb.append(", userBlock=").append(userBlock);
        sb.append(", userUnblock=").append(userUnblock);
        sb.append(", groupChangeSettings=").append(groupChangeSettings);
        sb.append(", groupChangePhoto=").append(groupChangePhoto);
        sb.append(", groupOfficersEdit=").append(groupOfficersEdit);
        sb.append('}');
        return sb.toString();
    }
}
