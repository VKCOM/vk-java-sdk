package com.vk.api.sdk.callback;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.board.TopicComment;
import com.vk.api.sdk.objects.callback.*;
import com.vk.api.sdk.objects.callback.messages.CallbackMessage;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallComment;
import com.vk.api.sdk.objects.wall.Wallpost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CallbackApi {

    private final Logger LOG = LogManager.getLogger(CallbackApi.class);

    private final Gson gson = new Gson();

    private final String confirmationCode;

    private String secretKey = null;

    private <T> T designateObject(JsonObject object, CallbackEvent type) {
        return gson.fromJson(object, type.getType());
    }

    public CallbackApi(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    public CallbackApi(String confirmationCode, String secretKey) {
        this.confirmationCode = confirmationCode;
        this.secretKey = secretKey;
    }

    // TODO: methods below should have some implementation contract

    public void messageNew(Integer groupId, Message message) {}

    public void messageReply(Integer groupId, Message message) {}

    public void messageEdit(Integer groupId, Message message) {}

    public void messageAllow(Integer groupId, MessageAllow message) {}

    public void messageDeny(Integer groupId, MessageDeny message) {}

    public void photoNew(Integer groupId, Photo message) {}

    public void photoCommentNew(Integer groupId, PhotoComment message) {}

    public void photoCommentEdit(Integer groupId, PhotoComment message) {}

    public void photoCommentRestore(Integer groupId, PhotoComment message) {}

    public void photoCommentDelete(Integer groupId, PhotoCommentDelete message) {}

    public void audioNew(Integer groupId, Audio message) {}

    public void videoNew(Integer groupId, Video message) {}

    public void videoCommentNew(Integer groupId, VideoComment message) {}

    public void videoCommentEdit(Integer groupId, VideoComment message) {}

    public void videoCommentRestore(Integer groupId, VideoComment message) {}

    public void videoCommentDelete(Integer groupId, VideoCommentDelete message) {}

    public void wallPostNew(Integer groupId, Wallpost message) {}

    public void wallRepost(Integer groupId, Wallpost message) {}

    public void wallReplyNew(Integer groupId, WallComment object) {}

    public void wallReplyEdit(Integer groupId, WallComment message) {}

    public void wallReplyRestore(Integer groupId, WallComment message) {}

    public void wallReplyDelete(Integer groupId, WallCommentDelete message) {}

    public void boardPostNew(Integer groupId, TopicComment message) {}

    public void boardPostEdit(Integer groupId, TopicComment message) {}

    public void boardPostRestore(Integer groupId, TopicComment message) {}

    public void boardPostDelete(Integer groupId, BoardPostDelete message) {}

    public void marketCommentNew(Integer groupId, MarketComment message) {}

    public void marketCommentEdit(Integer groupId, MarketComment message) {}

    public void marketCommentRestore(Integer groupId, MarketComment message) {}

    public void marketCommentDelete(Integer groupId, MarketCommentDelete message) {}

    public void groupLeave(Integer groupId, GroupLeave message) {}

    public void groupJoin(Integer groupId, GroupJoin message) {}

    public void groupChangeSettings(Integer groupId, GroupChangeSettings message) {}

    public void groupChangePhoto(Integer groupId, GroupChangePhoto message) {}

    public void groupOfficersEdit(Integer groupId, GroupOfficersEdit message) {}

    public void pollVoteNew(Integer groupId, PollVoteNew message) {}

    public void userBlock(Integer groupId, UserBlock message) {}

    public void userUnblock(Integer groupId, UserUnblock message) {}

    public String confirmation() {
        return confirmationCode;
    }

    public boolean parse(String json) {
        return parse(gson.fromJson(json, JsonObject.class));
    }

    public boolean parse(JsonObject json) {

        final CallbackMessage message = gson.fromJson(json, CallbackMessage.class);

        // TODO: MOAR checks!
        if (this.secretKey != null && !message.getSecret().isEmpty() && !this.secretKey.equals(message.getSecret())) {
            LOG.error("Secret key is not matched");
            return false;
        }

        switch (message.getType()) {
            case CONFIRMATION:
                confirmation();
                break;
            case MESSAGE_NEW:
                messageNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MESSAGE_REPLY:
                messageReply(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MESSAGE_EDIT:
                messageEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MESSAGE_ALLOW:
                messageAllow(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MESSAGE_DENY:
                messageDeny(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case PHOTO_NEW:
                photoNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case PHOTO_COMMENT_NEW:
                photoCommentNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case PHOTO_COMMENT_EDIT:
                photoCommentEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case PHOTO_COMMENT_RESTORE:
                photoCommentRestore(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case PHOTO_COMMENT_DELETE:
                photoCommentDelete(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case AUDIO_NEW:
                audioNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case VIDEO_NEW:
                videoNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case VIDEO_COMMENT_NEW:
                videoCommentNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case VIDEO_COMMENT_EDIT:
                videoCommentEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case VIDEO_COMMENT_RESTORE:
                videoCommentRestore(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case VIDEO_COMMENT_DELETE:
                videoCommentDelete(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_POST_NEW:
                wallPostNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_REPOST:
                wallRepost(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_REPLY_NEW:
                wallReplyNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_REPLY_EDIT:
                wallReplyEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_REPLY_RESTORE:
                wallReplyRestore(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case WALL_REPLY_DELETE:
                wallReplyDelete(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case BOARD_POST_NEW:
                boardPostNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case BOARD_POST_EDIT:
                boardPostEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case BOARD_POST_RESTORE:
                boardPostRestore(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case BOARD_POST_DELETE:
                boardPostDelete(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MARKET_COMMENT_NEW:
                marketCommentNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MARKET_COMMENT_EDIT:
                marketCommentEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MARKET_COMMENT_RESTORE:
                marketCommentRestore(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case MARKET_COMMENT_DELETE:
                marketCommentDelete(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case GROUP_LEAVE:
                groupLeave(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case GROUP_JOIN:
                groupJoin(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case GROUP_CHANGE_SETTINGS:
                groupChangeSettings(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case GROUP_CHANGE_PHOTO:
                groupChangePhoto(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case GROUP_OFFICERS_EDIT:
                groupOfficersEdit(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case USER_BLOCK:
                userBlock(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case USER_UNBLOCK:
                userUnblock(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            case POLL_VOTE_NEW:
                pollVoteNew(message.getGroupId(), designateObject(message.getObject(), message.getType()));
                break;
            default:
                // TODO: use right log message
                LOG.warn(String.format("Unsupported callback event: %s", message.getType()));
                return false;
        }

        return true;
    }
}