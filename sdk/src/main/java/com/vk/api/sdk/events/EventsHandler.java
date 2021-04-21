package com.vk.api.sdk.events;

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
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public abstract class EventsHandler {

    private static final String OVERRIDING_ERR = "Method of handling event is not overridden";

    private static final Logger LOG = LoggerFactory.getLogger(EventsHandler.class);

    protected final Gson gson = new Gson();

    private <T> T designateObject(JsonObject object, Events type) {
        return gson.fromJson(object, type.getType());
    }

    protected String confirmation() {
        LOG.error(OVERRIDING_ERR);
        return null;
    }

    protected void messageNew(Integer groupId, Message message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void messageReply(Integer groupId, Message message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void messageEdit(Integer groupId, Message message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void messageAllow(Integer groupId, MessageAllow message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void messageDeny(Integer groupId, MessageDeny message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void photoNew(Integer groupId, Photo message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void photoCommentNew(Integer groupId, PhotoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void photoCommentEdit(Integer groupId, PhotoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void photoCommentRestore(Integer groupId, PhotoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void photoCommentDelete(Integer groupId, PhotoCommentDelete message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void audioNew(Integer groupId, Audio message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void videoNew(Integer groupId, Video message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void videoCommentNew(Integer groupId, VideoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void videoCommentEdit(Integer groupId, VideoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void videoCommentRestore(Integer groupId, VideoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void videoCommentDelete(Integer groupId, VideoCommentDelete message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void wallPostNew(Integer groupId, Wallpost message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void wallRepost(Integer groupId, Wallpost message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void wallReplyNew(Integer groupId, WallComment object) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void wallReplyEdit(Integer groupId, WallComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void wallReplyRestore(Integer groupId, WallComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void wallReplyDelete(Integer groupId, WallCommentDelete message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void boardPostNew(Integer groupId, TopicComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void boardPostEdit(Integer groupId, TopicComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void boardPostRestore(Integer groupId, TopicComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void boardPostDelete(Integer groupId, BoardPostDelete message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void marketCommentNew(Integer groupId, MarketComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void marketCommentEdit(Integer groupId, MarketComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void marketCommentRestore(Integer groupId, MarketComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void marketCommentDelete(Integer groupId, MarketCommentDelete message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void groupLeave(Integer groupId, GroupLeave message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void groupJoin(Integer groupId, GroupJoin message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void groupChangeSettings(Integer groupId, GroupChangeSettings message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void groupChangePhoto(Integer groupId, GroupChangePhoto message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void groupOfficersEdit(Integer groupId, GroupOfficersEdit message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void pollVoteNew(Integer groupId, PollVoteNew message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void userBlock(Integer groupId, UserBlock message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected void userUnblock(Integer groupId, UserUnblock message) {
        LOG.error(OVERRIDING_ERR);
    }

    protected String parse(CallbackMessage message) {
        switch (message.getType()) {
            case CONFIRMATION:
                return confirmation();
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
                LOG.error("Unexpected callback event type received");
                return null;
        }
        return "OK";
    }
}
