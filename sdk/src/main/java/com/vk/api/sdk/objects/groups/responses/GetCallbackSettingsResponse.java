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
     * Whether notifications about reply message enabled
     */
    @SerializedName("message_reply")
    private BoolInt messageReply;

    /**
     * Whether notifications about edit message enabled
     */
    @SerializedName("message_edit")
    private BoolInt messageEdit;

    /**
     * Whether notifications about allowed messages
     */
    @SerializedName("message_allow")
    private BoolInt messageAllow;

    /**
     * Whether notifications about denied messages
     */
    @SerializedName("message_deny")
    private BoolInt messageDeny;

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
     * Whether notifications about new reposts enabled
     */
    @SerializedName("wall_repost")
    private BoolInt wallRepost;

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
     * Whether notifications about new vote in a public poll
     */
    @SerializedName("poll_vote_new")
    private BoolInt pollVoteNew;

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

    /**
     * Whether notifications about changed group settings
     */
    @SerializedName("group_change_settings")
    private BoolInt groupChangeSettings;

    /**
     * Whether notifications about changed group photo
     */
    @SerializedName("group_change_photo")
    private BoolInt groupChangePhoto;

    /**
     * Whether notifications about changed group officers
     */
    @SerializedName("group_officers_edit")
    private BoolInt groupOfficersEdit;

    public boolean isMessageNew() {
        return messageNew == BoolInt.YES;
    }

    public boolean isMessageReply() {
        return messageReply == BoolInt.YES;
    }

    public boolean isMessageEdit() {
        return messageEdit == BoolInt.YES;
    }

    public boolean isMessageAllow() {
        return messageAllow == BoolInt.YES;
    }

    public boolean isMessageDeny() {
        return messageDeny == BoolInt.YES;
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

    public boolean isWallRepost() {
        return wallRepost == BoolInt.YES;
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

    public boolean isGroupLeave() {
        return groupLeave == BoolInt.YES;
    }

    public boolean isGroupJoin() {
        return pollVoteNew == BoolInt.YES;
    }

    public boolean isGroupChangeSettings() {
        return groupChangeSettings == BoolInt.YES;
    }

    public boolean isGroupChangePhoto() {
        return groupChangePhoto == BoolInt.YES;
    }

    public boolean isGroupOfficersEdit() {
        return groupOfficersEdit == BoolInt.YES;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCallbackSettingsResponse that = (GetCallbackSettingsResponse) o;
        return messageNew == that.messageNew &&
                messageReply == that.messageReply &&
                messageEdit == that.messageEdit &&
                messageAllow == that.messageAllow &&
                messageDeny == that.messageDeny &&
                photoNew == that.photoNew &&
                audioNew == that.audioNew &&
                videoNew == that.videoNew &&
                wallRepost == that.wallRepost &&
                wallReplyNew == that.wallReplyNew &&
                wallReplyEdit == that.wallReplyEdit &&
                wallPostNew == that.wallPostNew &&
                boardPostNew == that.boardPostNew &&
                boardPostEdit == that.boardPostEdit &&
                boardPostRestore == that.boardPostRestore &&
                boardPostDelete == that.boardPostDelete &&
                photoCommentNew == that.photoCommentNew &&
                videoCommentNew == that.videoCommentNew &&
                marketCommentNew == that.marketCommentNew &&
                pollVoteNew == that.pollVoteNew &&
                groupJoin == that.groupJoin &&
                groupLeave == that.groupLeave &&
                groupChangeSettings == that.groupChangeSettings &&
                groupChangePhoto == that.groupChangePhoto &&
                groupOfficersEdit == that.groupOfficersEdit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageNew, messageReply, messageEdit, messageAllow, messageDeny, photoNew, audioNew, videoNew, wallRepost, wallReplyNew, wallReplyEdit, wallPostNew, boardPostNew, boardPostEdit, boardPostRestore, boardPostDelete, photoCommentNew, videoCommentNew, marketCommentNew, pollVoteNew, groupJoin, groupLeave, groupChangeSettings, groupChangePhoto, groupOfficersEdit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCallbackSettingsResponse{");
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
        sb.append(", marketCommentNew=").append(marketCommentNew);
        sb.append(", messageAllow=").append(messageAllow);
        sb.append(", messageDeny=").append(messageDeny);
        sb.append(", messageEdit=").append(messageEdit);
        sb.append(", messageNew=").append(messageNew);
        sb.append(", messageReply=").append(messageReply);
        sb.append(", photoCommentNew=").append(photoCommentNew);
        sb.append(", photoNew=").append(photoNew);
        sb.append(", pollVoteNew=").append(pollVoteNew);
        sb.append(", videoCommentNew=").append(videoCommentNew);
        sb.append(", videoNew=").append(videoNew);
        sb.append(", wallPostNew=").append(wallPostNew);
        sb.append(", wallReplyEdit=").append(wallReplyEdit);
        sb.append(", wallReplyNew=").append(wallReplyNew);
        sb.append(", wallRepost=").append(wallRepost);
        sb.append('}');
        return sb.toString();
    }
}
