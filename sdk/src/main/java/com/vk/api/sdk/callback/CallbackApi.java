package com.vk.api.sdk.callback;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.vk.api.sdk.objects.callback.messages.CallbackMessage;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.board.TopicComment;
import com.vk.api.sdk.objects.callback.*;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallComment;
import com.vk.api.sdk.objects.wall.Wallpost;
import com.vk.api.sdk.queries.oauth.OAuthQueryBuilder;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
@SuppressWarnings("unused")
public class CallbackApi {

    private static final Logger LOG = LoggerFactory.getLogger(OAuthQueryBuilder.class);
    private static final String CALLBACK_EVENT_MESSAGE_NEW = "message_new";
    private static final String CALLBACK_EVENT_MESSAGE_REPLY = "message_reply";
    private static final String CALLBACK_EVENT_MESSAGE_ALLOW = "message_allow";
    private static final String CALLBACK_EVENT_MESSAGE_DENY = "message_deny";
    private static final String CALLBACK_EVENT_MESSAGE_EDIT = "message_edit";
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
        types.put(CALLBACK_EVENT_MESSAGE_EDIT, new TypeToken<CallbackMessage<Message>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MESSAGE_ALLOW, new TypeToken<CallbackMessage<MessageAllow>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MESSAGE_DENY, new TypeToken<CallbackMessage<MessageDeny>>() {
        }.getType());

        types.put(CALLBACK_EVENT_PHOTO_NEW, new TypeToken<CallbackMessage<Photo>>() {
        }.getType());
        types.put(CALLBACK_EVENT_PHOTO_COMMENT_NEW, new TypeToken<CallbackMessage<PhotoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_PHOTO_COMMENT_EDIT, new TypeToken<CallbackMessage<PhotoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_PHOTO_COMMENT_RESTORE, new TypeToken<CallbackMessage<PhotoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_PHOTO_COMMENT_DELETE, new TypeToken<CallbackMessage<PhotoCommentDelete>>() {
        }.getType());

        types.put(CALLBACK_EVENT_AUDIO_NEW, new TypeToken<CallbackMessage<Audio>>() {
        }.getType());

        types.put(CALLBACK_EVENT_VIDEO_NEW, new TypeToken<CallbackMessage<Video>>() {
        }.getType());
        types.put(CALLBACK_EVENT_VIDEO_COMMENT_NEW, new TypeToken<CallbackMessage<VideoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_VIDEO_COMMENT_EDIT, new TypeToken<CallbackMessage<VideoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_VIDEO_COMMENT_RESTORE, new TypeToken<CallbackMessage<VideoComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_VIDEO_COMMENT_DELETE, new TypeToken<CallbackMessage<VideoCommentDelete>>() {
        }.getType());

        types.put(CALLBACK_EVENT_WALL_POST_NEW, new TypeToken<CallbackMessage<Wallpost>>() {
        }.getType());
        types.put(CALLBACK_EVENT_WALL_REPOST, new TypeToken<CallbackMessage<Wallpost>>() {
        }.getType());

        types.put(CALLBACK_EVENT_WALL_REPLY_NEW, new TypeToken<CallbackMessage<WallComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_WALL_REPLY_EDIT, new TypeToken<CallbackMessage<WallComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_WALL_REPLY_RESTORE, new TypeToken<CallbackMessage<WallComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_WALL_REPLY_DELETE, new TypeToken<CallbackMessage<WallCommentDelete>>() {
        }.getType());

        types.put(CALLBACK_EVENT_BOARD_POST_NEW, new TypeToken<CallbackMessage<TopicComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_BOARD_POST_EDIT, new TypeToken<CallbackMessage<TopicComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_BOARD_POST_RESTORE, new TypeToken<CallbackMessage<TopicComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_BOARD_POST_DELETE, new TypeToken<CallbackMessage<BoardPostDelete>>() {
        }.getType());

        types.put(CALLBACK_EVENT_MARKET_COMMENT_NEW, new TypeToken<CallbackMessage<MarketComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MARKET_COMMENT_EDIT, new TypeToken<CallbackMessage<MarketComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MARKET_COMMENT_RESTORE, new TypeToken<CallbackMessage<MarketComment>>() {
        }.getType());
        types.put(CALLBACK_EVENT_MARKET_COMMENT_DELETE, new TypeToken<CallbackMessage<MarketCommentDelete>>() {
        }.getType());

        types.put(CALLBACK_EVENT_GROUP_LEAVE, new TypeToken<CallbackMessage<GroupLeave>>() {
        }.getType());
        types.put(CALLBACK_EVENT_GROUP_JOIN, new TypeToken<CallbackMessage<GroupJoin>>() {
        }.getType());
        types.put(CALLBACK_EVENT_GROUP_CHANGE_SETTINGS, new TypeToken<CallbackMessage<GroupChangeSettings>>() {
        }.getType());
        types.put(CALLBACK_EVENT_GROUP_CHANGE_PHOTO, new TypeToken<CallbackMessage<GroupChangePhoto>>() {
        }.getType());
        types.put(CALLBACK_EVENT_GROUP_OFFICERS_EDIT, new TypeToken<CallbackMessage<GroupOfficersEdit>>() {
        }.getType());
        types.put(CALLBACK_EVENT_USER_BLOCK, new TypeToken<CallbackMessage<UserBlock>>() {
        }.getType());
        types.put(CALLBACK_EVENT_USER_UNBLOCK, new TypeToken<CallbackMessage<UserUnblock>>() {
        }.getType());

        types.put(CALLBACK_EVENT_POLL_VOTE_NEW, new TypeToken<CallbackMessage<PollVoteNew>>() {
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

    public void messageEdit(Integer groupId, Message message) {
    }

    public void messageEdit(Integer groupId, String secret, Message message) {
        messageEdit(groupId, message);
    }

    public void messageAllow(Integer groupId, MessageAllow message) {
    }

    public void messageAllow(Integer groupId, String secret, MessageAllow message) {
        messageAllow(groupId, message);
    }

    public void messageDeny(Integer groupId, MessageDeny message) {
    }

    public void messageDeny(Integer groupId, String secret, MessageDeny message) {
        messageDeny(groupId, message);
    }

    public void photoNew(Integer groupId, Photo message) {
    }

    public void photoNew(Integer groupId, String secret, Photo message) {
        photoNew(groupId, message);
    }

    public void photoCommentNew(Integer groupId, PhotoComment message) {
    }

    public void photoCommentNew(Integer groupId, String secret, PhotoComment message) {
        photoCommentNew(groupId, message);
    }

    public void photoCommentEdit(Integer groupId, PhotoComment message) {
    }

    public void photoCommentEdit(Integer groupId, String secret, PhotoComment message) {
        photoCommentEdit(groupId, message);
    }

    public void photoCommentRestore(Integer groupId, PhotoComment message) {
    }

    public void photoCommentRestore(Integer groupId, String secret, PhotoComment message) {
        photoCommentRestore(groupId, message);
    }

    public void photoCommentDelete(Integer groupId, PhotoCommentDelete message) {
    }

    public void photoCommentDelete(Integer groupId, String secret, PhotoCommentDelete message) {
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

    public void videoCommentNew(Integer groupId, VideoComment message) {
    }

    public void videoCommentNew(Integer groupId, String secret, VideoComment message) {
        videoCommentNew(groupId, message);
    }

    public void videoCommentEdit(Integer groupId, VideoComment message) {
    }

    public void videoCommentEdit(Integer groupId, String secret, VideoComment message) {
        videoCommentEdit(groupId, message);
    }

    public void videoCommentRestore(Integer groupId, VideoComment message) {
    }

    public void videoCommentRestore(Integer groupId, String secret, VideoComment message) {
        videoCommentRestore(groupId, message);
    }

    public void videoCommentDelete(Integer groupId, VideoCommentDelete message) {
    }

    public void videoCommentDelete(Integer groupId, String secret, VideoCommentDelete message) {
        videoCommentDelete(groupId, message);
    }

    public void wallPostNew(Integer groupId, Wallpost message) {
    }

    public void wallPostNew(Integer groupId, String secret, Wallpost message) {
        wallPostNew(groupId, message);
    }

    public void wallRepost(Integer groupId, Wallpost message) {
    }

    public void wallRepost(Integer groupId, String secret, Wallpost message) {
        wallRepost(groupId, message);
    }

    public void wallReplyNew(Integer groupId, WallComment object) {
    }

    public void wallReplyNew(Integer groupId, String secret, WallComment object) {
        wallReplyNew(groupId, object);
    }

    public void wallReplyEdit(Integer groupId, WallComment message) {
    }

    public void wallReplyEdit(Integer groupId, String secret, WallComment message) {
        wallReplyEdit(groupId, message);
    }

    public void wallReplyRestore(Integer groupId, WallComment message) {
    }

    public void wallReplyRestore(Integer groupId, String secret, WallComment message) {
        wallReplyRestore(groupId, message);
    }

    public void wallReplyDelete(Integer groupId, WallCommentDelete message) {
    }

    public void wallReplyDelete(Integer groupId, String secret, WallCommentDelete message) {
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

    public void boardPostDelete(Integer groupId, BoardPostDelete message) {
    }

    public void boardPostDelete(Integer groupId, String secret, BoardPostDelete message) {
        boardPostDelete(groupId, message);
    }

    public void marketCommentNew(Integer groupId, MarketComment message) {
    }

    public void marketCommentNew(Integer groupId, String secret, MarketComment message) {
        marketCommentNew(groupId, message);
    }

    public void marketCommentEdit(Integer groupId, MarketComment message) {
    }

    public void marketCommentEdit(Integer groupId, String secret, MarketComment message) {
        marketCommentEdit(groupId, message);
    }

    public void marketCommentRestore(Integer groupId, MarketComment message) {
    }

    public void marketCommentRestore(Integer groupId, String secret, MarketComment message) {
        marketCommentRestore(groupId, message);
    }

    public void marketCommentDelete(Integer groupId, MarketCommentDelete message) {
    }

    public void marketCommentDelete(Integer groupId, String secret, MarketCommentDelete message) {
        marketCommentDelete(groupId, message);
    }

    public void groupLeave(Integer groupId, GroupLeave message) {
    }

    public void groupLeave(Integer groupId, String secret, GroupLeave message) {
        groupLeave(groupId, message);
    }

    public void groupJoin(Integer groupId, GroupJoin message) {
    }

    public void groupJoin(Integer groupId, String secret, GroupJoin message) {
        groupJoin(groupId, message);
    }

    public void groupChangeSettings(Integer groupId, GroupChangeSettings message) {
    }

    public void groupChangeSettings(Integer groupId, String secret, GroupChangeSettings message) {
        groupChangeSettings(groupId, message);
    }

    public void groupChangePhoto(Integer groupId, GroupChangePhoto message) {
    }

    public void groupChangePhoto(Integer groupId, String secret, GroupChangePhoto message) {
        groupChangePhoto(groupId, message);
    }

    public void groupOfficersEdit(Integer groupId, GroupOfficersEdit message) {
    }

    public void groupOfficersEdit(Integer groupId, String secret, GroupOfficersEdit message) {
        groupOfficersEdit(groupId, message);
    }


    public void pollVoteNew(Integer groupId, PollVoteNew message) {
    }

    public void pollVoteNew(Integer groupId, String secret, PollVoteNew message) {
        pollVoteNew(groupId, message);
    }

    public void userBlock(Integer groupId, UserBlock message) {
    }

    public void userBlock(Integer groupId, String secret, UserBlock message) {
        userBlock(groupId, message);
    }

    public void userUnblock(Integer groupId, UserUnblock message) {
    }

    public void userUnblock(Integer groupId, String secret, UserUnblock message) {
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
            ConfirmationMessage message = gson.fromJson(json, ConfirmationMessage.class);
            confirmation(message.getGroupId(), message.getSecret());
            return true;
        }

        Type typeOfClass = CALLBACK_TYPES.get(type);
        if (typeOfClass == null) {
            LOG.warn("Unsupported callback event: {}", type);
            return false;
        }

        CallbackMessage<?> message = gson.fromJson(json, typeOfClass);

        switch (type) {
            case CALLBACK_EVENT_MESSAGE_NEW:
                messageNew(message.getGroupId(), message.getSecret(), (Message) message.getObject());
                break;

            case CALLBACK_EVENT_MESSAGE_REPLY:
                messageReply(message.getGroupId(), message.getSecret(), (Message) message.getObject());
                break;

            case CALLBACK_EVENT_MESSAGE_EDIT:
                messageEdit(message.getGroupId(), message.getSecret(), (Message) message.getObject());
                break;

            case CALLBACK_EVENT_MESSAGE_ALLOW:
                messageAllow(message.getGroupId(), message.getSecret(), (MessageAllow) message.getObject());
                break;

            case CALLBACK_EVENT_MESSAGE_DENY:
                messageDeny(message.getGroupId(), message.getSecret(), (MessageDeny) message.getObject());
                break;

            case CALLBACK_EVENT_PHOTO_NEW:
                photoNew(message.getGroupId(), message.getSecret(), (Photo) message.getObject());
                break;

            case CALLBACK_EVENT_PHOTO_COMMENT_NEW:
                photoCommentNew(message.getGroupId(), message.getSecret(), (PhotoComment) message.getObject());
                break;

            case CALLBACK_EVENT_PHOTO_COMMENT_EDIT:
                photoCommentEdit(message.getGroupId(), message.getSecret(), (PhotoComment) message.getObject());
                break;

            case CALLBACK_EVENT_PHOTO_COMMENT_RESTORE:
                photoCommentRestore(message.getGroupId(), message.getSecret(), (PhotoComment) message.getObject());
                break;

            case CALLBACK_EVENT_PHOTO_COMMENT_DELETE:
                photoCommentDelete(message.getGroupId(), message.getSecret(), (PhotoCommentDelete) message.getObject());
                break;

            case CALLBACK_EVENT_AUDIO_NEW:
                audioNew(message.getGroupId(), message.getSecret(), (Audio) message.getObject());
                break;

            case CALLBACK_EVENT_VIDEO_NEW:
                videoNew(message.getGroupId(), message.getSecret(), (Video) message.getObject());
                break;

            case CALLBACK_EVENT_VIDEO_COMMENT_NEW:
                videoCommentNew(message.getGroupId(), message.getSecret(), (VideoComment) message.getObject());
                break;

            case CALLBACK_EVENT_VIDEO_COMMENT_EDIT:
                videoCommentEdit(message.getGroupId(), message.getSecret(), (VideoComment) message.getObject());
                break;

            case CALLBACK_EVENT_VIDEO_COMMENT_RESTORE:
                videoCommentRestore(message.getGroupId(), message.getSecret(), (VideoComment) message.getObject());
                break;

            case CALLBACK_EVENT_VIDEO_COMMENT_DELETE:
                videoCommentDelete(message.getGroupId(), message.getSecret(), (VideoCommentDelete) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_POST_NEW:
                wallPostNew(message.getGroupId(), message.getSecret(), (Wallpost) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_REPOST:
                wallRepost(message.getGroupId(), message.getSecret(), (Wallpost) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_REPLY_NEW:
                wallReplyNew(message.getGroupId(), message.getSecret(), (WallComment) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_REPLY_EDIT:
                wallReplyEdit(message.getGroupId(), message.getSecret(), (WallComment) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_REPLY_RESTORE:
                wallReplyRestore(message.getGroupId(), message.getSecret(), (WallComment) message.getObject());
                break;

            case CALLBACK_EVENT_WALL_REPLY_DELETE:
                wallReplyDelete(message.getGroupId(), message.getSecret(), (WallCommentDelete) message.getObject());
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
                boardPostDelete(message.getGroupId(), message.getSecret(), (BoardPostDelete) message.getObject());
                break;

            case CALLBACK_EVENT_MARKET_COMMENT_NEW:
                marketCommentNew(message.getGroupId(), message.getSecret(), (MarketComment) message.getObject());
                break;

            case CALLBACK_EVENT_MARKET_COMMENT_EDIT:
                marketCommentEdit(message.getGroupId(), message.getSecret(), (MarketComment) message.getObject());
                break;

            case CALLBACK_EVENT_MARKET_COMMENT_RESTORE:
                marketCommentRestore(message.getGroupId(), message.getSecret(), (MarketComment) message.getObject());
                break;

            case CALLBACK_EVENT_MARKET_COMMENT_DELETE:
                marketCommentDelete(message.getGroupId(), message.getSecret(), (MarketCommentDelete) message.getObject());
                break;

            case CALLBACK_EVENT_GROUP_LEAVE:
                groupLeave(message.getGroupId(), message.getSecret(), (GroupLeave) message.getObject());
                break;

            case CALLBACK_EVENT_GROUP_JOIN:
                groupJoin(message.getGroupId(), message.getSecret(), (GroupJoin) message.getObject());
                break;

            case CALLBACK_EVENT_GROUP_CHANGE_SETTINGS:
                groupChangeSettings(message.getGroupId(), message.getSecret(), (GroupChangeSettings) message.getObject());
                break;

            case CALLBACK_EVENT_GROUP_CHANGE_PHOTO:
                groupChangePhoto(message.getGroupId(), message.getSecret(), (GroupChangePhoto) message.getObject());
                break;

            case CALLBACK_EVENT_GROUP_OFFICERS_EDIT:
                groupOfficersEdit(message.getGroupId(), message.getSecret(), (GroupOfficersEdit) message.getObject());
                break;

            case CALLBACK_EVENT_USER_BLOCK:
                userBlock(message.getGroupId(), message.getSecret(), (UserBlock) message.getObject());
                break;

            case CALLBACK_EVENT_USER_UNBLOCK:
                userUnblock(message.getGroupId(), message.getSecret(), (UserUnblock) message.getObject());
                break;

            case CALLBACK_EVENT_POLL_VOTE_NEW:
                pollVoteNew(message.getGroupId(), message.getSecret(), (PollVoteNew) message.getObject());
                break;

            default:
                LOG.warn("Unsupported callback event: {}", type);
                return false;

        }

        return true;
    }
}
