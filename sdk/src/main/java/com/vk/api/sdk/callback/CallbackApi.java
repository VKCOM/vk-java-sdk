package com.vk.api.sdk.callback;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.vk.api.sdk.callback.objects.board.CallbackBoardPostDelete;
import com.vk.api.sdk.callback.objects.group.CallbackGroupChangePhoto;
import com.vk.api.sdk.callback.objects.group.CallbackGroupChangeSettings;
import com.vk.api.sdk.callback.objects.group.CallbackGroupJoin;
import com.vk.api.sdk.callback.objects.group.CallbackGroupLeave;
import com.vk.api.sdk.callback.objects.group.CallbackGroupOfficersEdit;
import com.vk.api.sdk.callback.objects.market.CallbackMarketComment;
import com.vk.api.sdk.callback.objects.market.CallbackMarketCommentDelete;
import com.vk.api.sdk.callback.objects.messages.CallbackConfirmationMessage;
import com.vk.api.sdk.callback.objects.messages.CallbackMessage;
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
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.board.TopicComment;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackApi {

    private static final Logger LOG = LoggerFactory.getLogger(CallbackApi.class);
    private static final String CALLBACK_EVENT_MESSAGE_NEW = "message_new";
    private static final String CALLBACK_EVENT_MESSAGE_REPLY = "message_reply";
    private static final String CALLBACK_EVENT_MESSAGE_ALLOW = "message_allow";
    private static final String CALLBACK_EVENT_MESSAGE_DENY = "message_deny";
    private static final String CALLBACK_EVENT_PHOTO_NEW = "photo_new";
    private static final String CALLBACK_EVENT_PHOTO_COMMENT_NEW = "photo_comment_new";
    private static final String CALLBACK_EVENT_PHOTO_COMMENT_EDIT = "photo_comment_edit";
    private static final String CALLBACK_EVENT_PHOTO_COMMENT_RESTORE = "photo_comment_restore";
    private static final String CALLBACK_EVENT_PHOTO_COMMENT_DELETE = "photo_comment_delete";
    private static final String CALLBACK_EVENT_AUDIO_NEW = "audio_new";
    private static final String CALLBACK_EVENT_VIDEO_NEW = "video_new";
    private static final String CALLBACK_EVENT_VIDEO_COMMENT_NEW = "video_comment_new";
    private static final String CALLBACK_EVENT_VIDEO_COMMENT_EDIT = "video_comment_edit";
    private static final String CALLBACK_EVENT_VIDEO_COMMENT_RESTORE = "video_comment_restore";
    private static final String CALLBACK_EVENT_VIDEO_COMMENT_DELETE = "video_comment_delete";
    private static final String CALLBACK_EVENT_WALL_POST_NEW = "wall_post_new";
    private static final String CALLBACK_EVENT_WALL_REPOST = "wall_repost";
    private static final String CALLBACK_EVENT_WALL_REPLY_NEW = "wall_reply_new";
    private static final String CALLBACK_EVENT_WALL_REPLY_EDIT = "wall_reply_edit";
    private static final String CALLBACK_EVENT_WALL_REPLY_RESTORE = "wall_reply_restore";
    private static final String CALLBACK_EVENT_WALL_REPLY_DELETE = "wall_reply_delete";
    private static final String CALLBACK_EVENT_BOARD_POST_NEW = "board_post_new";
    private static final String CALLBACK_EVENT_BOARD_POST_EDIT = "board_post_edit";
    private static final String CALLBACK_EVENT_BOARD_POST_RESTORE = "board_post_restore";
    private static final String CALLBACK_EVENT_BOARD_POST_DELETE = "board_post_delete";
    private static final String CALLBACK_EVENT_MARKET_COMMENT_NEW = "market_comment_new";
    private static final String CALLBACK_EVENT_MARKET_COMMENT_EDIT = "market_comment_edit";
    private static final String CALLBACK_EVENT_MARKET_COMMENT_RESTORE = "market_comment_restore";
    private static final String CALLBACK_EVENT_MARKET_COMMENT_DELETE = "market_comment_delete";
    private static final String CALLBACK_EVENT_GROUP_LEAVE = "group_leave";
    private static final String CALLBACK_EVENT_GROUP_JOIN = "group_join";
    private static final String CALLBACK_EVENT_GROUP_CHANGE_SETTINGS = "group_change_settings";
    private static final String CALLBACK_EVENT_GROUP_CHANGE_PHOTO = "group_change_photo";
    private static final String CALLBACK_EVENT_GROUP_OFFICERS_EDIT = "group_officers_edit";
    private static final String CALLBACK_EVENT_POLL_VOTE_NEW = "poll_vote_new";
    private static final String CALLBACK_EVENT_USER_BLOCK = "user_block";
    private static final String CALLBACK_EVENT_USER_UNBLOCK = "user_unblock";
    private static final String CALLBACK_EVENT_CONFIRMATION = "confirmation";
    private final static Map<String, Type> CALLBACK_TYPES;

    static {
        Map<String, Type> types = new HashMap<>();
        types.put(CALLBACK_EVENT_MESSAGE_NEW, new TypeToken<CallbackMessage<Message>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MESSAGE_REPLY, new TypeToken<CallbackMessage<Message>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MESSAGE_ALLOW, new TypeToken<CallbackMessage<CallbackMessageAllow>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MESSAGE_DENY, new TypeToken<CallbackMessage<CallbackMessageDeny>>() {
        }.getType());

        types.put(CALLBACK_EVENT_PHOTO_NEW, new TypeToken<CallbackMessage<Photo>>() {
        }.getType());
        types.put(CALLBACK_EVENT_PHOTO_COMMENT_NEW, new TypeToken<CallbackMessage<CallbackPhotoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_PHOTO_COMMENT_EDIT, new TypeToken<CallbackMessage<CallbackPhotoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_PHOTO_COMMENT_RESTORE, new TypeToken<CallbackMessage<CallbackPhotoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_PHOTO_COMMENT_DELETE, new TypeToken<CallbackMessage<CallbackPhotoCommentDelete>>() {
        }.getType());

        types.put(CALLBACK_EVENT_AUDIO_NEW, new TypeToken<CallbackMessage<Audio>>() {
        }.getType());

        types.put(CALLBACK_EVENT_VIDEO_NEW, new TypeToken<CallbackMessage<Video>>() {
        }.getType());
        types.put(CALLBACK_EVENT_VIDEO_COMMENT_NEW, new TypeToken<CallbackMessage<CallbackVideoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_VIDEO_COMMENT_EDIT, new TypeToken<CallbackMessage<CallbackVideoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_VIDEO_COMMENT_RESTORE, new TypeToken<CallbackMessage<CallbackVideoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_VIDEO_COMMENT_DELETE, new TypeToken<CallbackMessage<CallbackVideoCommentDelete>>() {
        }.getType());

        types.put(CALLBACK_EVENT_WALL_POST_NEW, new TypeToken<CallbackMessage<WallPost>>() {
        }.getType());
        types.put(CALLBACK_EVENT_WALL_REPOST, new TypeToken<CallbackMessage<WallPost>>() {
        }.getType());

        types.put(CALLBACK_EVENT_WALL_REPLY_NEW, new TypeToken<CallbackMessage<CallbackWallComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_WALL_REPLY_EDIT, new TypeToken<CallbackMessage<CallbackWallComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_WALL_REPLY_RESTORE, new TypeToken<CallbackMessage<CallbackWallComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_WALL_REPLY_DELETE, new TypeToken<CallbackMessage<CallbackWallCommentDelete>>() {
        }.getType());

        types.put(CALLBACK_EVENT_BOARD_POST_NEW, new TypeToken<CallbackMessage<TopicComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_BOARD_POST_EDIT, new TypeToken<CallbackMessage<TopicComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_BOARD_POST_RESTORE, new TypeToken<CallbackMessage<TopicComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_BOARD_POST_DELETE, new TypeToken<CallbackMessage<CallbackBoardPostDelete>>() {
        }.getType());

        types.put(CALLBACK_EVENT_MARKET_COMMENT_NEW, new TypeToken<CallbackMessage<CallbackMarketComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MARKET_COMMENT_EDIT, new TypeToken<CallbackMessage<CallbackMarketComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MARKET_COMMENT_RESTORE, new TypeToken<CallbackMessage<CallbackMarketComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MARKET_COMMENT_DELETE, new TypeToken<CallbackMessage<CallbackMarketCommentDelete>>() {
        }.getType());

        types.put(CALLBACK_EVENT_GROUP_LEAVE, new TypeToken<CallbackMessage<CallbackGroupLeave>>() {
        }.getType());
        types.put(CALLBACK_EVENT_GROUP_JOIN, new TypeToken<CallbackMessage<CallbackGroupJoin>>() {
        }.getType());
        types.put(CALLBACK_EVENT_GROUP_CHANGE_SETTINGS, new TypeToken<CallbackMessage<CallbackGroupChangeSettings>>() {
        }.getType());
        types.put(CALLBACK_EVENT_GROUP_CHANGE_PHOTO, new TypeToken<CallbackMessage<CallbackGroupChangePhoto>>() {
        }.getType());
        types.put(CALLBACK_EVENT_GROUP_OFFICERS_EDIT, new TypeToken<CallbackMessage<CallbackGroupOfficersEdit>>() {
        }.getType());
        types.put(CALLBACK_EVENT_USER_BLOCK, new TypeToken<CallbackMessage<CallbackUserBlock>>() {
        }.getType());
        types.put(CALLBACK_EVENT_USER_UNBLOCK, new TypeToken<CallbackMessage<CallbackUserUnblock>>() {
        }.getType());

        types.put(CALLBACK_EVENT_POLL_VOTE_NEW, new TypeToken<CallbackMessage<CallbackPollVoteNew>>() {
        }.getType());

        CALLBACK_TYPES = Collections.unmodifiableMap(types);
    }

    private final Gson gson;

    public CallbackApi() {
        gson = new Gson();
    }

    public void messageNew(Integer groupId, Message message) {
    }

    public void messageNew(Integer groupId, String secret, Message message) {
        messageNew(groupId, message);
    }

    public void messageReply(Integer groupId, Message message) {
    }

    public void messageReply(Integer groupId, String secret, Message message) {
        messageReply(groupId, message);
    }

    public void messageAllow(Integer groupId, CallbackMessageAllow message) {
    }

    public void messageAllow(Integer groupId, String secret, CallbackMessageAllow message) {
        messageAllow(groupId, message);
    }

    public void messageDeny(Integer groupId, CallbackMessageDeny message) {
    }

    public void messageDeny(Integer groupId, String secret, CallbackMessageDeny message) {
        messageDeny(groupId, message);
    }

    public void photoNew(Integer groupId, Photo message) {
    }

    public void photoNew(Integer groupId, String secret, Photo message) {
        photoNew(groupId, message);
    }

    public void photoCommentNew(Integer groupId, CallbackPhotoComment message) {
    }

    public void photoCommentNew(Integer groupId, String secret, CallbackPhotoComment message) {
        photoCommentNew(groupId, message);
    }

    public void photoCommentEdit(Integer groupId, CallbackPhotoComment message) {
    }

    public void photoCommentEdit(Integer groupId, String secret, CallbackPhotoComment message) {
        photoCommentEdit(groupId, message);
    }

    public void photoCommentRestore(Integer groupId, CallbackPhotoComment message) {
    }

    public void photoCommentRestore(Integer groupId, String secret, CallbackPhotoComment message) {
        photoCommentRestore(groupId, message);
    }

    public void photoCommentDelete(Integer groupId, CallbackPhotoCommentDelete message) {
    }

    public void photoCommentDelete(Integer groupId, String secret, CallbackPhotoCommentDelete message) {
        photoCommentDelete(groupId, message);
    }

    public void audioNew(Integer groupId, Audio message) {
    }

    public void audioNew(Integer groupId, String secret, Audio message) {
        audioNew(groupId, message);
    }

    public void videoNew(Integer groupId, Video message) {
    }

    public void videoNew(Integer groupId, String secret, Video message) {
        videoNew(groupId, message);
    }

    public void videoCommentNew(Integer groupId, CallbackVideoComment message) {
    }

    public void videoCommentNew(Integer groupId, String secret, CallbackVideoComment message) {
        videoCommentNew(groupId, message);
    }

    public void videoCommentEdit(Integer groupId, CallbackVideoComment message) {
    }

    public void videoCommentEdit(Integer groupId, String secret, CallbackVideoComment message) {
        videoCommentEdit(groupId, message);
    }

    public void videoCommentRestore(Integer groupId, CallbackVideoComment message) {
    }

    public void videoCommentRestore(Integer groupId, String secret, CallbackVideoComment message) {
        videoCommentRestore(groupId, message);
    }

    public void videoCommentDelete(Integer groupId, CallbackVideoCommentDelete message) {
    }

    public void videoCommentDelete(Integer groupId, String secret, CallbackVideoCommentDelete message) {
        videoCommentDelete(groupId, message);
    }

    public void wallPostNew(Integer groupId, WallPost message) {
    }

    public void wallPostNew(Integer groupId, String secret, WallPost message) {
        wallPostNew(groupId, message);
    }

    public void wallRepost(Integer groupId, WallPost message) {
    }

    public void wallRepost(Integer groupId, String secret, WallPost message) {
        wallRepost(groupId, message);
    }

    public void wallReplyNew(Integer groupId, CallbackWallComment object) {
    }

    public void wallReplyNew(Integer groupId, String secret, CallbackWallComment object) {
        wallReplyNew(groupId, object);
    }

    public void wallReplyEdit(Integer groupId, CallbackWallComment message) {
    }

    public void wallReplyEdit(Integer groupId, String secret, CallbackWallComment message) {
        wallReplyEdit(groupId, message);
    }

    public void wallReplyRestore(Integer groupId, CallbackWallComment message) {
    }

    public void wallReplyRestore(Integer groupId, String secret, CallbackWallComment message) {
        wallReplyRestore(groupId, message);
    }

    public void wallReplyDelete(Integer groupId, CallbackWallCommentDelete message) {
    }

    public void wallReplyDelete(Integer groupId, String secret, CallbackWallCommentDelete message) {
        wallReplyDelete(groupId, message);
    }

    public void boardPostNew(Integer groupId, TopicComment message) {
    }

    public void boardPostNew(Integer groupId, String secret, TopicComment message) {
        boardPostNew(groupId, message);
    }

    public void boardPostEdit(Integer groupId, TopicComment message) {
    }

    public void boardPostEdit(Integer groupId, String secret, TopicComment message) {
        boardPostEdit(groupId, message);
    }

    public void boardPostRestore(Integer groupId, TopicComment message) {
    }

    public void boardPostRestore(Integer groupId, String secret, TopicComment message) {
        boardPostRestore(groupId, message);
    }

    public void boardPostDelete(Integer groupId, CallbackBoardPostDelete message) {
    }

    public void boardPostDelete(Integer groupId, String secret, CallbackBoardPostDelete message) {
        boardPostDelete(groupId, message);
    }

    public void marketCommentNew(Integer groupId, CallbackMarketComment message) {
    }

    public void marketCommentNew(Integer groupId, String secret, CallbackMarketComment message) {
        marketCommentNew(groupId, message);
    }

    public void marketCommentEdit(Integer groupId, CallbackMarketComment message) {
    }

    public void marketCommentEdit(Integer groupId, String secret, CallbackMarketComment message) {
        marketCommentEdit(groupId, message);
    }

    public void marketCommentRestore(Integer groupId, CallbackMarketComment message) {
    }

    public void marketCommentRestore(Integer groupId, String secret, CallbackMarketComment message) {
        marketCommentRestore(groupId, message);
    }

    public void marketCommentDelete(Integer groupId, CallbackMarketCommentDelete message) {
    }

    public void marketCommentDelete(Integer groupId, String secret, CallbackMarketCommentDelete message) {
        marketCommentDelete(groupId, message);
    }

    public void groupLeave(Integer groupId, CallbackGroupLeave message) {
    }

    public void groupLeave(Integer groupId, String secret, CallbackGroupLeave message) {
        groupLeave(groupId, message);
    }

    public void groupJoin(Integer groupId, CallbackGroupJoin message) {
    }

    public void groupJoin(Integer groupId, String secret, CallbackGroupJoin message) {
        groupJoin(groupId, message);
    }

    public void groupChangeSettings(Integer groupId, CallbackGroupChangeSettings message) {
    }

    public void groupChangeSettings(Integer groupId, String secret, CallbackGroupChangeSettings message) {
        groupChangeSettings(groupId, message);
    }

    public void groupChangePhoto(Integer groupId, CallbackGroupChangePhoto message) {
    }

    public void groupChangePhoto(Integer groupId, String secret, CallbackGroupChangePhoto message) {
        groupChangePhoto(groupId, message);
    }

    public void groupOfficersEdit(Integer groupId, CallbackGroupOfficersEdit message) {
    }

    public void groupOfficersEdit(Integer groupId, String secret, CallbackGroupOfficersEdit message) {
        groupOfficersEdit(groupId, message);
    }


    public void pollVoteNew(Integer groupId, CallbackPollVoteNew message) {
    }

    public void pollVoteNew(Integer groupId, String secret, CallbackPollVoteNew message) {
        pollVoteNew(groupId, message);
    }

    public void userBlock(Integer groupId, CallbackUserBlock message) {
    }

    public void userBlock(Integer groupId, String secret, CallbackUserBlock message) {
        userBlock(groupId, message);
    }

    public void userUnblock(Integer groupId, CallbackUserUnblock message) {
    }

    public void userUnblock(Integer groupId, String secret, CallbackUserUnblock message) {
        userUnblock(groupId, message);
    }

    public void confirmation(Integer groupId) {
    }

    public void confirmation(Integer groupId, String secret) {
        confirmation(groupId);
    }

    public boolean parse(String json) {
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        return parse(jsonObject);
    }

    public boolean parse(JsonObject json) {
        String type = json.get("type").getAsString();
        if (type.equalsIgnoreCase(CALLBACK_EVENT_CONFIRMATION)) {
            CallbackConfirmationMessage message = gson.fromJson(json, CallbackConfirmationMessage.class);
            confirmation(message.getGroupId(), message.getSecret());
            return true;
        }

        Type typeOfClass = CALLBACK_TYPES.get(type);
        if (typeOfClass == null) {
            LOG.warn("Unsupported callback event", type);
            return false;
        }

        CallbackMessage message = gson.fromJson(json, typeOfClass);

        switch (type) {
            case CALLBACK_EVENT_MESSAGE_NEW:
                messageNew(message.getGroupId(), message.getSecret(), (Message) message.getObject());
                break;

            case CALLBACK_EVENT_MESSAGE_REPLY:
                messageReply(message.getGroupId(), message.getSecret(), (Message) message.getObject());
                break;

            case CALLBACK_EVENT_MESSAGE_ALLOW:
                messageAllow(message.getGroupId(), message.getSecret(), (CallbackMessageAllow) message.getObject());
                break;

            case CALLBACK_EVENT_MESSAGE_DENY:
                messageDeny(message.getGroupId(), message.getSecret(), (CallbackMessageDeny) message.getObject());
                break;

            case CALLBACK_EVENT_PHOTO_NEW:
                photoNew(message.getGroupId(), message.getSecret(), (Photo) message.getObject());
                break;

            case CALLBACK_EVENT_PHOTO_COMMENT_NEW:
                photoCommentNew(message.getGroupId(), message.getSecret(), (CallbackPhotoComment) message.getObject());
                break;

            case CALLBACK_EVENT_PHOTO_COMMENT_EDIT:
                photoCommentEdit(message.getGroupId(), message.getSecret(), (CallbackPhotoComment) message.getObject());
                break;

            case CALLBACK_EVENT_PHOTO_COMMENT_RESTORE:
                photoCommentRestore(message.getGroupId(), message.getSecret(), (CallbackPhotoComment) message.getObject());
                break;

            case CALLBACK_EVENT_PHOTO_COMMENT_DELETE:
                photoCommentDelete(message.getGroupId(), message.getSecret(), (CallbackPhotoCommentDelete) message.getObject());
                break;

            case CALLBACK_EVENT_AUDIO_NEW:
                audioNew(message.getGroupId(), message.getSecret(), (Audio) message.getObject());
                break;

            case CALLBACK_EVENT_VIDEO_NEW:
                videoNew(message.getGroupId(), message.getSecret(), (Video) message.getObject());
                break;

            case CALLBACK_EVENT_VIDEO_COMMENT_NEW:
                videoCommentNew(message.getGroupId(), message.getSecret(), (CallbackVideoComment) message.getObject());
                break;

            case CALLBACK_EVENT_VIDEO_COMMENT_EDIT:
                videoCommentEdit(message.getGroupId(), message.getSecret(), (CallbackVideoComment) message.getObject());
                break;

            case CALLBACK_EVENT_VIDEO_COMMENT_RESTORE:
                videoCommentRestore(message.getGroupId(), message.getSecret(), (CallbackVideoComment) message.getObject());
                break;

            case CALLBACK_EVENT_VIDEO_COMMENT_DELETE:
                videoCommentDelete(message.getGroupId(), message.getSecret(), (CallbackVideoCommentDelete) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_POST_NEW:
                wallPostNew(message.getGroupId(), message.getSecret(), (WallPost) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_REPOST:
                wallRepost(message.getGroupId(), message.getSecret(), (WallPost) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_REPLY_NEW:
                wallReplyNew(message.getGroupId(), message.getSecret(), (CallbackWallComment) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_REPLY_EDIT:
                wallReplyEdit(message.getGroupId(), message.getSecret(), (CallbackWallComment) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_REPLY_RESTORE:
                wallReplyRestore(message.getGroupId(), message.getSecret(), (CallbackWallComment) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_REPLY_DELETE:
                wallReplyDelete(message.getGroupId(), message.getSecret(), (CallbackWallCommentDelete) message.getObject());
                break;

            case CALLBACK_EVENT_BOARD_POST_NEW:
                boardPostNew(message.getGroupId(), message.getSecret(), (TopicComment) message.getObject());
                break;

            case CALLBACK_EVENT_BOARD_POST_EDIT:
                boardPostEdit(message.getGroupId(), message.getSecret(), (TopicComment) message.getObject());
                break;

            case CALLBACK_EVENT_BOARD_POST_RESTORE:
                boardPostRestore(message.getGroupId(), message.getSecret(), (TopicComment) message.getObject());
                break;

            case CALLBACK_EVENT_BOARD_POST_DELETE:
                boardPostDelete(message.getGroupId(), message.getSecret(), (CallbackBoardPostDelete) message.getObject());
                break;

            case CALLBACK_EVENT_MARKET_COMMENT_NEW:
                marketCommentNew(message.getGroupId(), message.getSecret(), (CallbackMarketComment) message.getObject());
                break;

            case CALLBACK_EVENT_MARKET_COMMENT_EDIT:
                marketCommentEdit(message.getGroupId(), message.getSecret(), (CallbackMarketComment) message.getObject());
                break;

            case CALLBACK_EVENT_MARKET_COMMENT_RESTORE:
                marketCommentRestore(message.getGroupId(), message.getSecret(), (CallbackMarketComment) message.getObject());
                break;

            case CALLBACK_EVENT_MARKET_COMMENT_DELETE:
                marketCommentDelete(message.getGroupId(), message.getSecret(), (CallbackMarketCommentDelete) message.getObject());
                break;

            case CALLBACK_EVENT_GROUP_LEAVE:
                groupLeave(message.getGroupId(), message.getSecret(), (CallbackGroupLeave) message.getObject());
                break;

            case CALLBACK_EVENT_GROUP_JOIN:
                groupJoin(message.getGroupId(), message.getSecret(), (CallbackGroupJoin) message.getObject());
                break;

            case CALLBACK_EVENT_GROUP_CHANGE_SETTINGS:
                groupChangeSettings(message.getGroupId(), message.getSecret(), (CallbackGroupChangeSettings) message.getObject());
                break;

            case CALLBACK_EVENT_GROUP_CHANGE_PHOTO:
                groupChangePhoto(message.getGroupId(), message.getSecret(), (CallbackGroupChangePhoto) message.getObject());
                break;

            case CALLBACK_EVENT_GROUP_OFFICERS_EDIT:
                groupOfficersEdit(message.getGroupId(), message.getSecret(), (CallbackGroupOfficersEdit) message.getObject());
                break;

            case CALLBACK_EVENT_USER_BLOCK:
                userBlock(message.getGroupId(), message.getSecret(), (CallbackUserBlock) message.getObject());
                break;

            case CALLBACK_EVENT_USER_UNBLOCK:
                userUnblock(message.getGroupId(), message.getSecret(), (CallbackUserUnblock) message.getObject());
                break;

            case CALLBACK_EVENT_POLL_VOTE_NEW:
                pollVoteNew(message.getGroupId(), message.getSecret(), (CallbackPollVoteNew) message.getObject());
                break;

            default:
                LOG.warn("Unsupported callback event", type);
                return false;

        }

        return true;
    }
}
