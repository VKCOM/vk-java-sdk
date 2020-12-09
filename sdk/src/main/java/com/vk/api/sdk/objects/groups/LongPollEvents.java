package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * LongPollEvents object
 */
public class LongPollEvents implements Validable {
    @SerializedName("audio_new")
    private BoolInt audioNew;

    @SerializedName("board_post_delete")
    private BoolInt boardPostDelete;

    @SerializedName("board_post_edit")
    private BoolInt boardPostEdit;

    @SerializedName("board_post_new")
    private BoolInt boardPostNew;

    @SerializedName("board_post_restore")
    private BoolInt boardPostRestore;

    @SerializedName("group_change_photo")
    private BoolInt groupChangePhoto;

    @SerializedName("group_change_settings")
    private BoolInt groupChangeSettings;

    @SerializedName("group_join")
    private BoolInt groupJoin;

    @SerializedName("group_leave")
    private BoolInt groupLeave;

    @SerializedName("group_officers_edit")
    private BoolInt groupOfficersEdit;

    @SerializedName("lead_forms_new")
    private BoolInt leadFormsNew;

    @SerializedName("market_comment_delete")
    private BoolInt marketCommentDelete;

    @SerializedName("market_comment_edit")
    private BoolInt marketCommentEdit;

    @SerializedName("market_comment_new")
    private BoolInt marketCommentNew;

    @SerializedName("market_comment_restore")
    private BoolInt marketCommentRestore;

    @SerializedName("market_order_new")
    private BoolInt marketOrderNew;

    @SerializedName("market_order_edit")
    private BoolInt marketOrderEdit;

    @SerializedName("message_allow")
    private BoolInt messageAllow;

    @SerializedName("message_deny")
    private BoolInt messageDeny;

    @SerializedName("message_new")
    private BoolInt messageNew;

    @SerializedName("message_read")
    private BoolInt messageRead;

    @SerializedName("message_reply")
    private BoolInt messageReply;

    @SerializedName("message_typing_state")
    private BoolInt messageTypingState;

    @SerializedName("message_edit")
    private BoolInt messageEdit;

    @SerializedName("photo_comment_delete")
    private BoolInt photoCommentDelete;

    @SerializedName("photo_comment_edit")
    private BoolInt photoCommentEdit;

    @SerializedName("photo_comment_new")
    private BoolInt photoCommentNew;

    @SerializedName("photo_comment_restore")
    private BoolInt photoCommentRestore;

    @SerializedName("photo_new")
    private BoolInt photoNew;

    @SerializedName("poll_vote_new")
    private BoolInt pollVoteNew;

    @SerializedName("user_block")
    private BoolInt userBlock;

    @SerializedName("user_unblock")
    private BoolInt userUnblock;

    @SerializedName("video_comment_delete")
    private BoolInt videoCommentDelete;

    @SerializedName("video_comment_edit")
    private BoolInt videoCommentEdit;

    @SerializedName("video_comment_new")
    private BoolInt videoCommentNew;

    @SerializedName("video_comment_restore")
    private BoolInt videoCommentRestore;

    @SerializedName("video_new")
    private BoolInt videoNew;

    @SerializedName("wall_post_new")
    private BoolInt wallPostNew;

    @SerializedName("wall_reply_delete")
    private BoolInt wallReplyDelete;

    @SerializedName("wall_reply_edit")
    private BoolInt wallReplyEdit;

    @SerializedName("wall_reply_new")
    private BoolInt wallReplyNew;

    @SerializedName("wall_reply_restore")
    private BoolInt wallReplyRestore;

    @SerializedName("wall_repost")
    private BoolInt wallRepost;

    @SerializedName("donut_subscription_create")
    private BoolInt donutSubscriptionCreate;

    @SerializedName("donut_subscription_prolonged")
    private BoolInt donutSubscriptionProlonged;

    @SerializedName("donut_subscription_cancelled")
    private BoolInt donutSubscriptionCancelled;

    @SerializedName("donut_subscription_expired")
    private BoolInt donutSubscriptionExpired;

    @SerializedName("donut_subscription_price_changed")
    private BoolInt donutSubscriptionPriceChanged;

    @SerializedName("donut_money_withdraw")
    private BoolInt donutMoneyWithdraw;

    @SerializedName("donut_money_withdraw_error")
    private BoolInt donutMoneyWithdrawError;

    public boolean isAudioNew() {
        return audioNew == BoolInt.YES;
    }

    public BoolInt getAudioNew() {
        return audioNew;
    }

    public boolean isBoardPostDelete() {
        return boardPostDelete == BoolInt.YES;
    }

    public BoolInt getBoardPostDelete() {
        return boardPostDelete;
    }

    public boolean isBoardPostEdit() {
        return boardPostEdit == BoolInt.YES;
    }

    public BoolInt getBoardPostEdit() {
        return boardPostEdit;
    }

    public boolean isBoardPostNew() {
        return boardPostNew == BoolInt.YES;
    }

    public BoolInt getBoardPostNew() {
        return boardPostNew;
    }

    public boolean isBoardPostRestore() {
        return boardPostRestore == BoolInt.YES;
    }

    public BoolInt getBoardPostRestore() {
        return boardPostRestore;
    }

    public boolean isGroupChangePhoto() {
        return groupChangePhoto == BoolInt.YES;
    }

    public BoolInt getGroupChangePhoto() {
        return groupChangePhoto;
    }

    public boolean isGroupChangeSettings() {
        return groupChangeSettings == BoolInt.YES;
    }

    public BoolInt getGroupChangeSettings() {
        return groupChangeSettings;
    }

    public boolean isGroupJoin() {
        return groupJoin == BoolInt.YES;
    }

    public BoolInt getGroupJoin() {
        return groupJoin;
    }

    public boolean isGroupLeave() {
        return groupLeave == BoolInt.YES;
    }

    public BoolInt getGroupLeave() {
        return groupLeave;
    }

    public boolean isGroupOfficersEdit() {
        return groupOfficersEdit == BoolInt.YES;
    }

    public BoolInt getGroupOfficersEdit() {
        return groupOfficersEdit;
    }

    public boolean isLeadFormsNew() {
        return leadFormsNew == BoolInt.YES;
    }

    public BoolInt getLeadFormsNew() {
        return leadFormsNew;
    }

    public boolean isMarketCommentDelete() {
        return marketCommentDelete == BoolInt.YES;
    }

    public BoolInt getMarketCommentDelete() {
        return marketCommentDelete;
    }

    public boolean isMarketCommentEdit() {
        return marketCommentEdit == BoolInt.YES;
    }

    public BoolInt getMarketCommentEdit() {
        return marketCommentEdit;
    }

    public boolean isMarketCommentNew() {
        return marketCommentNew == BoolInt.YES;
    }

    public BoolInt getMarketCommentNew() {
        return marketCommentNew;
    }

    public boolean isMarketCommentRestore() {
        return marketCommentRestore == BoolInt.YES;
    }

    public BoolInt getMarketCommentRestore() {
        return marketCommentRestore;
    }

    public boolean isMarketOrderNew() {
        return marketOrderNew == BoolInt.YES;
    }

    public BoolInt getMarketOrderNew() {
        return marketOrderNew;
    }

    public boolean isMarketOrderEdit() {
        return marketOrderEdit == BoolInt.YES;
    }

    public BoolInt getMarketOrderEdit() {
        return marketOrderEdit;
    }

    public boolean isMessageAllow() {
        return messageAllow == BoolInt.YES;
    }

    public BoolInt getMessageAllow() {
        return messageAllow;
    }

    public boolean isMessageDeny() {
        return messageDeny == BoolInt.YES;
    }

    public BoolInt getMessageDeny() {
        return messageDeny;
    }

    public boolean isMessageNew() {
        return messageNew == BoolInt.YES;
    }

    public BoolInt getMessageNew() {
        return messageNew;
    }

    public boolean isMessageRead() {
        return messageRead == BoolInt.YES;
    }

    public BoolInt getMessageRead() {
        return messageRead;
    }

    public boolean isMessageReply() {
        return messageReply == BoolInt.YES;
    }

    public BoolInt getMessageReply() {
        return messageReply;
    }

    public boolean isMessageTypingState() {
        return messageTypingState == BoolInt.YES;
    }

    public BoolInt getMessageTypingState() {
        return messageTypingState;
    }

    public boolean isMessageEdit() {
        return messageEdit == BoolInt.YES;
    }

    public BoolInt getMessageEdit() {
        return messageEdit;
    }

    public boolean isPhotoCommentDelete() {
        return photoCommentDelete == BoolInt.YES;
    }

    public BoolInt getPhotoCommentDelete() {
        return photoCommentDelete;
    }

    public boolean isPhotoCommentEdit() {
        return photoCommentEdit == BoolInt.YES;
    }

    public BoolInt getPhotoCommentEdit() {
        return photoCommentEdit;
    }

    public boolean isPhotoCommentNew() {
        return photoCommentNew == BoolInt.YES;
    }

    public BoolInt getPhotoCommentNew() {
        return photoCommentNew;
    }

    public boolean isPhotoCommentRestore() {
        return photoCommentRestore == BoolInt.YES;
    }

    public BoolInt getPhotoCommentRestore() {
        return photoCommentRestore;
    }

    public boolean isPhotoNew() {
        return photoNew == BoolInt.YES;
    }

    public BoolInt getPhotoNew() {
        return photoNew;
    }

    public boolean isPollVoteNew() {
        return pollVoteNew == BoolInt.YES;
    }

    public BoolInt getPollVoteNew() {
        return pollVoteNew;
    }

    public boolean isUserBlock() {
        return userBlock == BoolInt.YES;
    }

    public BoolInt getUserBlock() {
        return userBlock;
    }

    public boolean isUserUnblock() {
        return userUnblock == BoolInt.YES;
    }

    public BoolInt getUserUnblock() {
        return userUnblock;
    }

    public boolean isVideoCommentDelete() {
        return videoCommentDelete == BoolInt.YES;
    }

    public BoolInt getVideoCommentDelete() {
        return videoCommentDelete;
    }

    public boolean isVideoCommentEdit() {
        return videoCommentEdit == BoolInt.YES;
    }

    public BoolInt getVideoCommentEdit() {
        return videoCommentEdit;
    }

    public boolean isVideoCommentNew() {
        return videoCommentNew == BoolInt.YES;
    }

    public BoolInt getVideoCommentNew() {
        return videoCommentNew;
    }

    public boolean isVideoCommentRestore() {
        return videoCommentRestore == BoolInt.YES;
    }

    public BoolInt getVideoCommentRestore() {
        return videoCommentRestore;
    }

    public boolean isVideoNew() {
        return videoNew == BoolInt.YES;
    }

    public BoolInt getVideoNew() {
        return videoNew;
    }

    public boolean isWallPostNew() {
        return wallPostNew == BoolInt.YES;
    }

    public BoolInt getWallPostNew() {
        return wallPostNew;
    }

    public boolean isWallReplyDelete() {
        return wallReplyDelete == BoolInt.YES;
    }

    public BoolInt getWallReplyDelete() {
        return wallReplyDelete;
    }

    public boolean isWallReplyEdit() {
        return wallReplyEdit == BoolInt.YES;
    }

    public BoolInt getWallReplyEdit() {
        return wallReplyEdit;
    }

    public boolean isWallReplyNew() {
        return wallReplyNew == BoolInt.YES;
    }

    public BoolInt getWallReplyNew() {
        return wallReplyNew;
    }

    public boolean isWallReplyRestore() {
        return wallReplyRestore == BoolInt.YES;
    }

    public BoolInt getWallReplyRestore() {
        return wallReplyRestore;
    }

    public boolean isWallRepost() {
        return wallRepost == BoolInt.YES;
    }

    public BoolInt getWallRepost() {
        return wallRepost;
    }

    public boolean isDonutSubscriptionCreate() {
        return donutSubscriptionCreate == BoolInt.YES;
    }

    public BoolInt getDonutSubscriptionCreate() {
        return donutSubscriptionCreate;
    }

    public boolean isDonutSubscriptionProlonged() {
        return donutSubscriptionProlonged == BoolInt.YES;
    }

    public BoolInt getDonutSubscriptionProlonged() {
        return donutSubscriptionProlonged;
    }

    public boolean isDonutSubscriptionCancelled() {
        return donutSubscriptionCancelled == BoolInt.YES;
    }

    public BoolInt getDonutSubscriptionCancelled() {
        return donutSubscriptionCancelled;
    }

    public boolean isDonutSubscriptionExpired() {
        return donutSubscriptionExpired == BoolInt.YES;
    }

    public BoolInt getDonutSubscriptionExpired() {
        return donutSubscriptionExpired;
    }

    public boolean isDonutSubscriptionPriceChanged() {
        return donutSubscriptionPriceChanged == BoolInt.YES;
    }

    public BoolInt getDonutSubscriptionPriceChanged() {
        return donutSubscriptionPriceChanged;
    }

    public boolean isDonutMoneyWithdraw() {
        return donutMoneyWithdraw == BoolInt.YES;
    }

    public BoolInt getDonutMoneyWithdraw() {
        return donutMoneyWithdraw;
    }

    public boolean isDonutMoneyWithdrawError() {
        return donutMoneyWithdrawError == BoolInt.YES;
    }

    public BoolInt getDonutMoneyWithdrawError() {
        return donutMoneyWithdrawError;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pollVoteNew, wallReplyDelete, videoNew, donutMoneyWithdraw, photoNew, donutMoneyWithdrawError, donutSubscriptionPriceChanged, groupOfficersEdit, wallReplyNew, photoCommentRestore, messageNew, donutSubscriptionCancelled, userBlock, donutSubscriptionProlonged, groupLeave, wallReplyEdit, messageAllow, leadFormsNew, marketOrderEdit, messageReply, photoCommentEdit, audioNew, messageTypingState, messageRead, groupChangeSettings, boardPostNew, userUnblock, wallPostNew, wallReplyRestore, videoCommentEdit, boardPostDelete, marketCommentEdit, photoCommentDelete, marketCommentRestore, videoCommentDelete, marketCommentDelete, messageDeny, groupJoin, messageEdit, videoCommentRestore, wallRepost, marketOrderNew, donutSubscriptionCreate, photoCommentNew, boardPostEdit, videoCommentNew, boardPostRestore, marketCommentNew, groupChangePhoto, donutSubscriptionExpired);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongPollEvents longPollEvents = (LongPollEvents) o;
        return Objects.equals(marketOrderNew, longPollEvents.marketOrderNew) &&
                Objects.equals(wallReplyNew, longPollEvents.wallReplyNew) &&
                Objects.equals(photoCommentRestore, longPollEvents.photoCommentRestore) &&
                Objects.equals(videoCommentNew, longPollEvents.videoCommentNew) &&
                Objects.equals(groupJoin, longPollEvents.groupJoin) &&
                Objects.equals(donutSubscriptionCancelled, longPollEvents.donutSubscriptionCancelled) &&
                Objects.equals(audioNew, longPollEvents.audioNew) &&
                Objects.equals(videoCommentEdit, longPollEvents.videoCommentEdit) &&
                Objects.equals(donutSubscriptionProlonged, longPollEvents.donutSubscriptionProlonged) &&
                Objects.equals(messageAllow, longPollEvents.messageAllow) &&
                Objects.equals(marketCommentEdit, longPollEvents.marketCommentEdit) &&
                Objects.equals(wallReplyEdit, longPollEvents.wallReplyEdit) &&
                Objects.equals(messageNew, longPollEvents.messageNew) &&
                Objects.equals(messageEdit, longPollEvents.messageEdit) &&
                Objects.equals(messageDeny, longPollEvents.messageDeny) &&
                Objects.equals(videoCommentRestore, longPollEvents.videoCommentRestore) &&
                Objects.equals(messageRead, longPollEvents.messageRead) &&
                Objects.equals(boardPostDelete, longPollEvents.boardPostDelete) &&
                Objects.equals(marketOrderEdit, longPollEvents.marketOrderEdit) &&
                Objects.equals(videoNew, longPollEvents.videoNew) &&
                Objects.equals(marketCommentRestore, longPollEvents.marketCommentRestore) &&
                Objects.equals(donutMoneyWithdraw, longPollEvents.donutMoneyWithdraw) &&
                Objects.equals(boardPostNew, longPollEvents.boardPostNew) &&
                Objects.equals(donutSubscriptionPriceChanged, longPollEvents.donutSubscriptionPriceChanged) &&
                Objects.equals(boardPostRestore, longPollEvents.boardPostRestore) &&
                Objects.equals(videoCommentDelete, longPollEvents.videoCommentDelete) &&
                Objects.equals(groupLeave, longPollEvents.groupLeave) &&
                Objects.equals(messageReply, longPollEvents.messageReply) &&
                Objects.equals(donutSubscriptionExpired, longPollEvents.donutSubscriptionExpired) &&
                Objects.equals(groupOfficersEdit, longPollEvents.groupOfficersEdit) &&
                Objects.equals(marketCommentDelete, longPollEvents.marketCommentDelete) &&
                Objects.equals(userBlock, longPollEvents.userBlock) &&
                Objects.equals(pollVoteNew, longPollEvents.pollVoteNew) &&
                Objects.equals(userUnblock, longPollEvents.userUnblock) &&
                Objects.equals(wallRepost, longPollEvents.wallRepost) &&
                Objects.equals(groupChangePhoto, longPollEvents.groupChangePhoto) &&
                Objects.equals(wallReplyDelete, longPollEvents.wallReplyDelete) &&
                Objects.equals(wallReplyRestore, longPollEvents.wallReplyRestore) &&
                Objects.equals(photoNew, longPollEvents.photoNew) &&
                Objects.equals(marketCommentNew, longPollEvents.marketCommentNew) &&
                Objects.equals(photoCommentNew, longPollEvents.photoCommentNew) &&
                Objects.equals(boardPostEdit, longPollEvents.boardPostEdit) &&
                Objects.equals(donutMoneyWithdrawError, longPollEvents.donutMoneyWithdrawError) &&
                Objects.equals(wallPostNew, longPollEvents.wallPostNew) &&
                Objects.equals(donutSubscriptionCreate, longPollEvents.donutSubscriptionCreate) &&
                Objects.equals(messageTypingState, longPollEvents.messageTypingState) &&
                Objects.equals(photoCommentEdit, longPollEvents.photoCommentEdit) &&
                Objects.equals(leadFormsNew, longPollEvents.leadFormsNew) &&
                Objects.equals(photoCommentDelete, longPollEvents.photoCommentDelete) &&
                Objects.equals(groupChangeSettings, longPollEvents.groupChangeSettings);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LongPollEvents{");
        sb.append("marketOrderNew=").append(marketOrderNew);
        sb.append(", wallReplyNew=").append(wallReplyNew);
        sb.append(", photoCommentRestore=").append(photoCommentRestore);
        sb.append(", videoCommentNew=").append(videoCommentNew);
        sb.append(", groupJoin=").append(groupJoin);
        sb.append(", donutSubscriptionCancelled=").append(donutSubscriptionCancelled);
        sb.append(", audioNew=").append(audioNew);
        sb.append(", videoCommentEdit=").append(videoCommentEdit);
        sb.append(", donutSubscriptionProlonged=").append(donutSubscriptionProlonged);
        sb.append(", messageAllow=").append(messageAllow);
        sb.append(", marketCommentEdit=").append(marketCommentEdit);
        sb.append(", wallReplyEdit=").append(wallReplyEdit);
        sb.append(", messageNew=").append(messageNew);
        sb.append(", messageEdit=").append(messageEdit);
        sb.append(", messageDeny=").append(messageDeny);
        sb.append(", videoCommentRestore=").append(videoCommentRestore);
        sb.append(", messageRead=").append(messageRead);
        sb.append(", boardPostDelete=").append(boardPostDelete);
        sb.append(", marketOrderEdit=").append(marketOrderEdit);
        sb.append(", videoNew=").append(videoNew);
        sb.append(", marketCommentRestore=").append(marketCommentRestore);
        sb.append(", donutMoneyWithdraw=").append(donutMoneyWithdraw);
        sb.append(", boardPostNew=").append(boardPostNew);
        sb.append(", donutSubscriptionPriceChanged=").append(donutSubscriptionPriceChanged);
        sb.append(", boardPostRestore=").append(boardPostRestore);
        sb.append(", videoCommentDelete=").append(videoCommentDelete);
        sb.append(", groupLeave=").append(groupLeave);
        sb.append(", messageReply=").append(messageReply);
        sb.append(", donutSubscriptionExpired=").append(donutSubscriptionExpired);
        sb.append(", groupOfficersEdit=").append(groupOfficersEdit);
        sb.append(", marketCommentDelete=").append(marketCommentDelete);
        sb.append(", userBlock=").append(userBlock);
        sb.append(", pollVoteNew=").append(pollVoteNew);
        sb.append(", userUnblock=").append(userUnblock);
        sb.append(", wallRepost=").append(wallRepost);
        sb.append(", groupChangePhoto=").append(groupChangePhoto);
        sb.append(", wallReplyDelete=").append(wallReplyDelete);
        sb.append(", wallReplyRestore=").append(wallReplyRestore);
        sb.append(", photoNew=").append(photoNew);
        sb.append(", marketCommentNew=").append(marketCommentNew);
        sb.append(", photoCommentNew=").append(photoCommentNew);
        sb.append(", boardPostEdit=").append(boardPostEdit);
        sb.append(", donutMoneyWithdrawError=").append(donutMoneyWithdrawError);
        sb.append(", wallPostNew=").append(wallPostNew);
        sb.append(", donutSubscriptionCreate=").append(donutSubscriptionCreate);
        sb.append(", messageTypingState=").append(messageTypingState);
        sb.append(", photoCommentEdit=").append(photoCommentEdit);
        sb.append(", leadFormsNew=").append(leadFormsNew);
        sb.append(", photoCommentDelete=").append(photoCommentDelete);
        sb.append(", groupChangeSettings=").append(groupChangeSettings);
        sb.append('}');
        return sb.toString();
    }
}
