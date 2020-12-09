package com.vk.api.examples.group.bot;

import com.vk.api.sdk.callback.longpoll.CallbackApiLongPoll;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.board.TopicComment;
import com.vk.api.sdk.objects.callback.*;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallComment;
import com.vk.api.sdk.objects.wall.Wallpost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CallbackApiLongPollHandler extends CallbackApiLongPoll {

    private static final Logger LOG = LoggerFactory.getLogger(CallbackApiLongPollHandler.class);

    public CallbackApiLongPollHandler(VkApiClient client, UserActor actor, Integer groupId) {
        super(client, actor, groupId);
    }

    public CallbackApiLongPollHandler(VkApiClient client, GroupActor actor) {
        super(client, actor);
    }

    public void messageNew(Integer groupId, Message message) {
        LOG.info("messageNew: " + message.toString());
    }

    public void messageReply(Integer groupId, Message message) {
        LOG.info("messageReply: " + message.toString());
    }

    public void messageEdit(Integer groupId, Message message) {
        LOG.info("messageEdit: " + message.toString());
    }

    public void messageAllow(Integer groupId, MessageAllow message) {
        LOG.info("messageAllow: " + message.toString());
    }

    public void messageDeny(Integer groupId, MessageDeny message) {
        LOG.info("messageDeny: " + message.toString());
    }

    public void photoNew(Integer groupId, Photo message) {
        LOG.info("photoNew: " + message.toString());
    }

    public void photoCommentNew(Integer groupId, PhotoComment message) {
        LOG.info("photoCommentNew: " + message.toString());
    }

    public void photoCommentEdit(Integer groupId, PhotoComment message) {
        LOG.info("photoCommentEdit: " + message.toString());
    }

    public void photoCommentRestore(Integer groupId, PhotoComment message) {
        LOG.info("photoCommentRestore: " + message.toString());
    }

    public void photoCommentDelete(Integer groupId, PhotoCommentDelete message) {
        LOG.info("photoCommentDelete: " + message.toString());
    }

    public void audioNew(Integer groupId, Audio message) {
        LOG.info("audioNew: " + message.toString());
    }

    public void videoNew(Integer groupId, Video message) {
        LOG.info("videoNew: " + message.toString());
    }

    public void videoCommentNew(Integer groupId, VideoComment message) {
        LOG.info("videoCommentNew: " + message.toString());
    }

    public void videoCommentEdit(Integer groupId, VideoComment message) {
        LOG.info("videoCommentEdit: " + message.toString());
    }

    public void videoCommentRestore(Integer groupId, VideoComment message) {
        LOG.info("videoCommentRestore: " + message.toString());
    }

    public void videoCommentDelete(Integer groupId, VideoCommentDelete message) {
        LOG.info("videoCommentDelete: " + message.toString());
    }

    public void wallPostNew(Integer groupId, Wallpost message) {
        LOG.info("wallPostNew: " + message.toString());
    }

    public void wallRepost(Integer groupId, Wallpost message) {
        LOG.info("wallRepost: " + message.toString());
    }

    public void wallReplyNew(Integer groupId, WallComment message) {
        LOG.info("wallReplyNew: " + message.toString());
    }

    public void wallReplyEdit(Integer groupId, WallComment message) {
        LOG.info("wallReplyEdit: " + message.toString());
    }

    public void wallReplyRestore(Integer groupId, WallComment message) {
        LOG.info("wallReplyRestore: " + message.toString());
    }

    public void wallReplyDelete(Integer groupId, WallCommentDelete message) {
        LOG.info("wallReplyDelete: " + message.toString());
    }

    public void boardPostNew(Integer groupId, TopicComment message) {
        LOG.info("boardPostNew: " + message.toString());
    }

    public void boardPostEdit(Integer groupId, TopicComment message) {
        LOG.info("boardPostEdit: " + message.toString());
    }

    public void boardPostRestore(Integer groupId, TopicComment message) {
        LOG.info("boardPostRestore: " + message.toString());
    }

    public void boardPostDelete(Integer groupId, BoardPostDelete message) {
        LOG.info("boardPostDelete: " + message.toString());
    }

    public void marketCommentNew(Integer groupId, MarketComment message) {
        LOG.info("marketCommentNew: " + message.toString());
    }

    public void marketCommentEdit(Integer groupId, MarketComment message) {
        LOG.info("marketCommentEdit: " + message.toString());
    }

    public void marketCommentRestore(Integer groupId, MarketComment message) {
        LOG.info("marketCommentRestore: " + message.toString());
    }

    public void marketCommentDelete(Integer groupId, MarketCommentDelete message) {
        LOG.info("marketCommentDelete: " + message.toString());
    }

    public void groupLeave(Integer groupId, GroupLeave message) {
        LOG.info("groupLeave: " + message.toString());
    }

    public void groupJoin(Integer groupId, GroupJoin message) {
        LOG.info("groupJoin: " + message.toString());
    }

    public void groupChangeSettings(Integer groupId, GroupChangeSettings message) {
        LOG.info("groupChangeSettings: " + message.toString());
    }

    public void groupChangePhoto(Integer groupId, GroupChangePhoto message) {
        LOG.info("groupChangePhoto: " + message.toString());
    }

    public void groupOfficersEdit(Integer groupId, GroupOfficersEdit message) {
        LOG.info("groupOfficersEdit: " + message.toString());
    }

    public void pollVoteNew(Integer groupId, PollVoteNew message) {
        LOG.info("pollVoteNew: " + message.toString());
    }

    public void userBlock(Integer groupId, UserBlock message) {
        LOG.info("userBlock: " + message.toString());
    }

    public void userUnblock(Integer groupId, UserUnblock message) {
        LOG.info("userUnblock: " + message.toString());
    }
}
