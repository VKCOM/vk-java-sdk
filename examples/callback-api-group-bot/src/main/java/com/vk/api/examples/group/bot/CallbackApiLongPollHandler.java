package com.vk.api.examples.group.bot;

import com.vk.api.sdk.callback.longpoll.CallbackApiLongPoll;
import com.vk.api.sdk.callback.objects.board.CallbackBoardPostDelete;
import com.vk.api.sdk.callback.objects.group.CallbackGroupChangePhoto;
import com.vk.api.sdk.callback.objects.group.CallbackGroupChangeSettings;
import com.vk.api.sdk.callback.objects.group.CallbackGroupJoin;
import com.vk.api.sdk.callback.objects.group.CallbackGroupLeave;
import com.vk.api.sdk.callback.objects.group.CallbackGroupOfficersEdit;
import com.vk.api.sdk.callback.objects.market.CallbackMarketComment;
import com.vk.api.sdk.callback.objects.market.CallbackMarketCommentDelete;
import com.vk.api.sdk.callback.objects.messages.CallbackMessageAllow;
import com.vk.api.sdk.callback.objects.messages.CallbackMessageDeny;
import com.vk.api.sdk.callback.objects.photo.CallbackPhotoComment;
import com.vk.api.sdk.callback.objects.photo.CallbackPhotoCommentDelete;
import com.vk.api.sdk.callback.objects.poll.CallbackPollVoteNew;
import com.vk.api.sdk.callback.objects.user.CallbackUserBlock;
import com.vk.api.sdk.callback.objects.user.CallbackUserUnblock;
import com.vk.api.sdk.callback.objects.video.CallbackVideoComment;
import com.vk.api.sdk.callback.objects.video.CallbackVideoCommentDelete;
import com.vk.api.sdk.callback.objects.wall.CallbackWallComment;
import com.vk.api.sdk.callback.objects.wall.CallbackWallCommentDelete;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.board.TopicComment;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallPost;
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
        LOG.info("messageReply: " + message.toString());
    }

    public void messageAllow(Integer groupId, CallbackMessageAllow message) {
        LOG.info("messageAllow: " + message.toString());
    }

    public void messageDeny(Integer groupId, CallbackMessageDeny message) {
        LOG.info("messageDeny: " + message.toString());
    }

    public void photoNew(Integer groupId, Photo message) {
        LOG.info("photoNew: " + message.toString());
    }

    public void photoCommentNew(Integer groupId, CallbackPhotoComment message) {
        LOG.info("photoCommentNew: " + message.toString());
    }

    public void photoCommentEdit(Integer groupId, CallbackPhotoComment message) {
        LOG.info("photoCommentEdit: " + message.toString());
    }

    public void photoCommentRestore(Integer groupId, CallbackPhotoComment message) {
        LOG.info("photoCommentRestore: " + message.toString());
    }

    public void photoCommentDelete(Integer groupId, CallbackPhotoCommentDelete message) {
        LOG.info("photoCommentDelete: " + message.toString());
    }

    public void audioNew(Integer groupId, Audio message) {
        LOG.info("audioNew: " + message.toString());
    }

    public void videoNew(Integer groupId, Video message) {
        LOG.info("videoNew: " + message.toString());
    }

    public void videoCommentNew(Integer groupId, CallbackVideoComment message) {
        LOG.info("videoCommentNew: " + message.toString());
    }

    public void videoCommentEdit(Integer groupId, CallbackVideoComment message) {
        LOG.info("videoCommentEdit: " + message.toString());
    }

    public void videoCommentRestore(Integer groupId, CallbackVideoComment message) {
        LOG.info("videoCommentRestore: " + message.toString());
    }

    public void videoCommentDelete(Integer groupId, CallbackVideoCommentDelete message) {
        LOG.info("videoCommentDelete: " + message.toString());
    }

    public void wallPostNew(Integer groupId, WallPost message) {
        LOG.info("wallPostNew: " + message.toString());
    }

    public void wallRepost(Integer groupId, WallPost message) {
        LOG.info("wallRepost: " + message.toString());
    }

    public void wallReplyNew(Integer groupId, CallbackWallComment message) {
        LOG.info("wallReplyNew: " + message.toString());
    }

    public void wallReplyEdit(Integer groupId, CallbackWallComment message) {
        LOG.info("wallReplyEdit: " + message.toString());
    }

    public void wallReplyRestore(Integer groupId, CallbackWallComment message) {
        LOG.info("wallReplyRestore: " + message.toString());
    }

    public void wallReplyDelete(Integer groupId, CallbackWallCommentDelete message) {
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

    public void boardPostDelete(Integer groupId, CallbackBoardPostDelete message) {
        LOG.info("boardPostDelete: " + message.toString());
    }

    public void marketCommentNew(Integer groupId, CallbackMarketComment message) {
        LOG.info("marketCommentNew: " + message.toString());
    }

    public void marketCommentEdit(Integer groupId, CallbackMarketComment message) {
        LOG.info("marketCommentEdit: " + message.toString());
    }

    public void marketCommentRestore(Integer groupId, CallbackMarketComment message) {
        LOG.info("marketCommentRestore: " + message.toString());
    }

    public void marketCommentDelete(Integer groupId, CallbackMarketCommentDelete message) {
        LOG.info("marketCommentDelete: " + message.toString());
    }

    public void groupLeave(Integer groupId, CallbackGroupLeave message) {
        LOG.info("groupLeave: " + message.toString());
    }

    public void groupJoin(Integer groupId, CallbackGroupJoin message) {
        LOG.info("groupJoin: " + message.toString());
    }

    public void groupChangeSettings(Integer groupId, CallbackGroupChangeSettings message) {
        LOG.info("groupChangeSettings: " + message.toString());
    }

    public void groupChangePhoto(Integer groupId, CallbackGroupChangePhoto message) {
        LOG.info("groupChangePhoto: " + message.toString());
    }

    public void groupOfficersEdit(Integer groupId, CallbackGroupOfficersEdit message) {
        LOG.info("groupOfficersEdit: " + message.toString());
    }

    public void pollVoteNew(Integer groupId, CallbackPollVoteNew message) {
        LOG.info("pollVoteNew: " + message.toString());
    }

    public void userBlock(Integer groupId, CallbackUserBlock message) {
        LOG.info("userBlock: " + message.toString());
    }

    public void userUnblock(Integer groupId, CallbackUserUnblock message) {
        LOG.info("userUnblock: " + message.toString());
    }
}
