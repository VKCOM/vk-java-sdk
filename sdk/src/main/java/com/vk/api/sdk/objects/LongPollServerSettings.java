package com.vk.api.sdk.objects;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

public class LongPollServerSettings {

    @SerializedName("message_new")
    private BoolInt messageNew;

    @SerializedName("message_reply")
    private BoolInt messageReply;

    @SerializedName("message_edit")
    private BoolInt messageEdit;

    @SerializedName("message_allow")
    private BoolInt messageAllow;

    @SerializedName("message_deny")
    private BoolInt messageDeny;

    @SerializedName("photo_new")
    private BoolInt photoNew;

    @SerializedName("audio_new")
    private BoolInt audioNew;

    @SerializedName("video_new")
    private BoolInt videoNew;

    @SerializedName("wall_reply_new")
    private BoolInt wallReplyNew;

    @SerializedName("wall_reply_edit")
    private BoolInt wallReplyEdit;

    @SerializedName("wall_reply_delete")
    private BoolInt wallReplyDelete;

    @SerializedName("wall_post_new")
    private BoolInt wallPostNew;

    @SerializedName("wall_repost")
    private BoolInt wallRespost;

    @SerializedName("board_post_new")
    private BoolInt boardPostNew;

    @SerializedName("board_post_edit")
    private BoolInt boardPostEdit;

    @SerializedName("board_post_delete")
    private BoolInt boardPostDelete;

    @SerializedName("board_post_restore")
    private BoolInt boardPostRestore;

    @SerializedName("photo_comment_new")
    private BoolInt photoCommentNew;

    @SerializedName("photo_comment_edit")
    private BoolInt photoCommentEdit;

    @SerializedName("photo_comment_delete")
    private BoolInt photoCommentDelete;

    @SerializedName("photo_comment_restore")
    private BoolInt photoCommentRestore;

    @SerializedName("video_comment_new")
    private BoolInt videoCommentNew;

    @SerializedName("video_comment_edit")
    private BoolInt videoCommentEdit;

    @SerializedName("video_comment_delete")
    private BoolInt videoCommentDelete;

    @SerializedName("video_comment_restore")
    private BoolInt videoCommentRestore;

    @SerializedName("market_comment_new")
    private BoolInt marketCommentNew;

    @SerializedName("market_comment_edit")
    private BoolInt marketCommentEdit;

    @SerializedName("market_comment_delete")
    private BoolInt marketCommentDelete;

    @SerializedName("market_comment_restore")
    private BoolInt marketCommentRestore;

    @SerializedName("poll_vote_new")
    private BoolInt pollVoteNew;

    @SerializedName("group_join")
    private BoolInt groupJoin;

    @SerializedName("group_leave")
    private BoolInt groupLeave;

    @SerializedName("user_block")
    private BoolInt userBlock;

    @SerializedName("user_unblock")
    private BoolInt userUnblock;

    @SerializedName("group_change_settings")
    private BoolInt groupChangeSettings;

    @SerializedName("group_change_photo")
    private BoolInt groupChangePhoto;

    @SerializedName("group_officers_edit")
    private BoolInt groupOfficersEdit;

    public boolean isMessageNewEnabled() {
        return messageNew == BoolInt.YESBOOL;
    }

    public boolean isMessageReplyEnabled() {
        return messageReply == BoolInt.YESBOOL;
    }

    public boolean isMessageEditnabled() {
        return messageEdit == BoolInt.YESBOOL;
    }

    public boolean isMessageAllowEnabled() {
        return messageAllow == BoolInt.YESBOOL;
    }

    public boolean isMessageDenyEnabled() {
        return messageDeny == BoolInt.YESBOOL;
    }

    public boolean isPhotoNewEnabled() {
        return photoNew == BoolInt.YESBOOL;
    }

    public boolean isAudioNewEnabled() {
        return audioNew == BoolInt.YESBOOL;
    }

    public boolean isVideoNewEnabled() {
        return videoNew == BoolInt.YESBOOL;
    }

    public boolean isWallReplyNewEnabled() {
        return wallReplyNew == BoolInt.YESBOOL;
    }

    public boolean isWallReplyEditEnabled() {
        return wallReplyEdit == BoolInt.YESBOOL;
    }

    public boolean isWallReplyDeleteEnabled() {
        return wallReplyDelete == BoolInt.YESBOOL;
    }

    public boolean isWallPostNewEnabled() {
        return wallPostNew == BoolInt.YESBOOL;
    }

    public boolean isWallRespostEnabled() {
        return wallRespost == BoolInt.YESBOOL;
    }

    public boolean isBoardPostNewEnabled() {
        return boardPostNew == BoolInt.YESBOOL;
    }

    public boolean isBoardPostEditEnabled() {
        return boardPostEdit == BoolInt.YESBOOL;
    }

    public boolean isBoardPostDeleteEnabled() {
        return boardPostDelete == BoolInt.YESBOOL;
    }

    public boolean isBoardPostRestoreEnabled() {
        return boardPostRestore == BoolInt.YESBOOL;
    }

    public boolean isPhotoCommentNewEnabled() {
        return photoCommentNew == BoolInt.YESBOOL;
    }

    public boolean isPhotoCommentEditEnabled() {
        return photoCommentEdit == BoolInt.YESBOOL;
    }

    public boolean isPhotoCommentDeleteEnabled() {
        return photoCommentDelete == BoolInt.YESBOOL;
    }

    public boolean isPhotoCommentRestoreEnabled() {
        return photoCommentRestore == BoolInt.YESBOOL;
    }

    public boolean isVideoCommentNewEnabled() {
        return videoCommentNew == BoolInt.YESBOOL;
    }

    public boolean isVideoCommentEditEnabled() {
        return videoCommentEdit == BoolInt.YESBOOL;
    }

    public boolean isVideoCommentDeleteEnabled() {
        return videoCommentDelete == BoolInt.YESBOOL;
    }

    public boolean isVideoCommentRestoreEnabled() {
        return videoCommentRestore == BoolInt.YESBOOL;
    }

    public boolean isMarketCommentNewEnabled() {
        return marketCommentNew == BoolInt.YESBOOL;
    }

    public boolean isMarketCommentEditEnabled() {
        return marketCommentEdit == BoolInt.YESBOOL;
    }

    public boolean isMarketCommentDeleteEnabled() {
        return marketCommentDelete == BoolInt.YESBOOL;
    }

    public boolean isMarketCommentRestoreEnabled() {
        return marketCommentRestore == BoolInt.YESBOOL;
    }

    public boolean isPollVoteNewEnabled() {
        return pollVoteNew == BoolInt.YESBOOL;
    }

    public boolean isGroupJoinEnabled() {
        return groupJoin == BoolInt.YESBOOL;
    }

    public boolean isGroupLeaveEnabled() {
        return groupLeave == BoolInt.YESBOOL;
    }

    public boolean isUserBlockEnabled() {
        return userBlock == BoolInt.YESBOOL;
    }

    public boolean isUserUnblockEnabled() {
        return userUnblock == BoolInt.YESBOOL;
    }

    public boolean isGroupChangeSettingsEnabled() {
        return groupChangeSettings == BoolInt.YESBOOL;
    }

    public boolean isGroupChangePhotoEnabled() {
        return groupChangePhoto == BoolInt.YESBOOL;
    }

    public boolean isGroupOfficersEditEnabled() {
        return groupOfficersEdit == BoolInt.YESBOOL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongPollServerSettings that = (LongPollServerSettings) o;
        return Objects.equals(messageNew, that.messageNew) &&
                Objects.equals(messageEdit, that.messageEdit) &&
                Objects.equals(messageReply, that.messageReply) &&
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
        return Objects.hash(messageNew, messageReply, messageEdit, messageAllow, messageDeny, photoNew, audioNew, videoNew, wallReplyNew, wallReplyEdit, wallReplyDelete, wallPostNew, wallRespost, boardPostNew, boardPostEdit, boardPostDelete, boardPostRestore, photoCommentNew, photoCommentEdit, photoCommentDelete, photoCommentRestore, videoCommentNew, videoCommentEdit, videoCommentDelete, videoCommentRestore, marketCommentNew, marketCommentEdit, marketCommentDelete, marketCommentRestore, pollVoteNew, groupJoin, groupLeave, userBlock, userUnblock, groupChangeSettings, groupChangePhoto, groupOfficersEdit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LongPollServerSettings{");
        sb.append("audioNew=").append(audioNew);
        sb.append(", boardPostDelete=").append(boardPostDelete);
        sb.append(", boardPostEdit=").append(boardPostEdit);
        sb.append(", boardPostNew=").append(boardPostNew);
        sb.append(", boardPostRestore=").append(boardPostRestore);
        sb.append(", groupChangePhoto=").append(groupChangePhoto);
        sb.append(", groupChangeSettings=").append(groupChangeSettings);
        sb.append(", groupJoin=").append(groupJoin);
        sb.append(", groupLeave=").append(groupLeave);
        sb.append(", groupOfficersEdit=").append(groupOfficersEdit);
        sb.append(", marketCommentDelete=").append(marketCommentDelete);
        sb.append(", marketCommentEdit=").append(marketCommentEdit);
        sb.append(", marketCommentNew=").append(marketCommentNew);
        sb.append(", marketCommentRestore=").append(marketCommentRestore);
        sb.append(", messageAllow=").append(messageAllow);
        sb.append(", messageDeny=").append(messageDeny);
        sb.append(", messageEdit=").append(messageEdit);
        sb.append(", messageNew=").append(messageNew);
        sb.append(", messageReply=").append(messageReply);
        sb.append(", photoCommentDelete=").append(photoCommentDelete);
        sb.append(", photoCommentEdit=").append(photoCommentEdit);
        sb.append(", photoCommentNew=").append(photoCommentNew);
        sb.append(", photoCommentRestore=").append(photoCommentRestore);
        sb.append(", photoNew=").append(photoNew);
        sb.append(", pollVoteNew=").append(pollVoteNew);
        sb.append(", userBlock=").append(userBlock);
        sb.append(", userUnblock=").append(userUnblock);
        sb.append(", videoCommentDelete=").append(videoCommentDelete);
        sb.append(", videoCommentEdit=").append(videoCommentEdit);
        sb.append(", videoCommentNew=").append(videoCommentNew);
        sb.append(", videoCommentRestore=").append(videoCommentRestore);
        sb.append(", videoNew=").append(videoNew);
        sb.append(", wallPostNew=").append(wallPostNew);
        sb.append(", wallReplyDelete=").append(wallReplyDelete);
        sb.append(", wallReplyEdit=").append(wallReplyEdit);
        sb.append(", wallReplyNew=").append(wallReplyNew);
        sb.append(", wallRespost=").append(wallRespost);
        sb.append('}');
        return sb.toString();
    }
}
