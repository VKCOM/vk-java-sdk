package com.vk.api.sdk.callback;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.vk.api.sdk.callback.objects.CallbackBoardPostDelete;
import com.vk.api.sdk.callback.objects.CallbackGroupJoin;
import com.vk.api.sdk.callback.objects.CallbackGroupLeave;
import com.vk.api.sdk.callback.objects.CallbackMarketComment;
import com.vk.api.sdk.callback.objects.CallbackMessage;
import com.vk.api.sdk.callback.objects.CallbackPhotoComment;
import com.vk.api.sdk.callback.objects.CallbackVideoComment;
import com.vk.api.sdk.callback.objects.CallbackWallComment;
import com.vk.api.sdk.callback.objects.CallbackWallPost;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.board.TopicComment;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;

import java.lang.reflect.Type;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackApi {

    private final Gson gson;

    public CallbackApi() {
        gson = new Gson();
    }

    public void wallReplyNew(Integer groupId, CallbackWallComment object) {
    }

    public void wallReplyEdit(Integer groupId, CallbackWallComment message) {
    }

    public void wallPostNew(Integer groupId, CallbackWallPost message) {
    }

    public void audioNew(Integer groupId, Audio message) {
    }

    public void photoNew(Integer groupId, Photo message) {
    }

    public void photoCommentNew(Integer groupId, CallbackPhotoComment message) {
    }

    public void videoNew(Integer groupId, Video message) {
    }

    public void videoCommentNew(Integer groupId, CallbackVideoComment message) {
    }

    public void messageNew(Integer groupId, Message message) {
    }

    public void groupJoin(Integer groupId, CallbackGroupJoin message) {
    }

    public void groupLeave(Integer groupId, CallbackGroupLeave message) {
    }

    public void boardPostNew(Integer groupId, TopicComment message) {
    }

    public void boardPostEdit(Integer groupId, TopicComment message) {
    }

    public void boardPostRestore(Integer groupId, TopicComment message) {
    }

    public void boardPostDelete(Integer groupId, CallbackBoardPostDelete message) {
    }

    public void marketCommentNew(Integer groupId, CallbackMarketComment message) {
    }

    public boolean parse(String json) {
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        return parse(jsonObject);
    }

    public boolean parse(JsonObject json) {
        String type = json.get("type").getAsString();

        Type typeOfClass;
        CallbackMessage message;

        switch (type) {
            case "wall_reply_new":
                typeOfClass = new TypeToken<CallbackMessage<CallbackWallComment>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                wallReplyNew(message.getGroupId(), (CallbackWallComment) message.getObject());
                break;

            case "wall_reply_edit":
                typeOfClass = new TypeToken<CallbackMessage<CallbackWallComment>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                wallReplyEdit(message.getGroupId(), (CallbackWallComment) message.getObject());
                break;

            case "wall_post_new":
                typeOfClass = new TypeToken<CallbackMessage<CallbackWallPost>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                wallPostNew(message.getGroupId(), (CallbackWallPost) message.getObject());
                break;

            case "audio_new":
                typeOfClass = new TypeToken<CallbackMessage<Audio>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                audioNew(message.getGroupId(), (Audio) message.getObject());
                break;

            case "photo_new":
                typeOfClass = new TypeToken<CallbackMessage<Photo>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                photoNew(message.getGroupId(), (Photo) message.getObject());
                break;

            case "photo_comment_new":
                typeOfClass = new TypeToken<CallbackMessage<CallbackPhotoComment>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                photoCommentNew(message.getGroupId(), (CallbackPhotoComment) message.getObject());
                break;

            case "video_new":
                typeOfClass = new TypeToken<CallbackMessage<Video>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                videoNew(message.getGroupId(), (Video) message.getObject());
                break;

            case "video_comment_new":
                typeOfClass = new TypeToken<CallbackMessage<CallbackVideoComment>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                videoCommentNew(message.getGroupId(), (CallbackVideoComment) message.getObject());
                break;

            case "message_new":
                typeOfClass = new TypeToken<CallbackMessage<Message>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                messageNew(message.getGroupId(), (Message) message.getObject());
                break;

            case "group_join":
                typeOfClass = new TypeToken<CallbackMessage<CallbackGroupJoin>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                groupJoin(message.getGroupId(), (CallbackGroupJoin) message.getObject());
                break;

            case "group_leave":
                typeOfClass = new TypeToken<CallbackMessage<CallbackGroupLeave>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                groupLeave(message.getGroupId(), (CallbackGroupLeave) message.getObject());
                break;

            case "board_post_new":
                typeOfClass = new TypeToken<CallbackMessage<TopicComment>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                boardPostNew(message.getGroupId(), (TopicComment) message.getObject());
                break;

            case "board_post_edit":
                typeOfClass = new TypeToken<CallbackMessage<TopicComment>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                boardPostEdit(message.getGroupId(), (TopicComment) message.getObject());
                break;

            case "board_post_restore":
                typeOfClass = new TypeToken<CallbackMessage<TopicComment>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                boardPostRestore(message.getGroupId(), (TopicComment) message.getObject());
                break;

            case "board_post_delete":
                typeOfClass = new TypeToken<CallbackMessage<CallbackBoardPostDelete>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                boardPostDelete(message.getGroupId(), (CallbackBoardPostDelete) message.getObject());
                break;

            case "market_comment_new":
                typeOfClass = new TypeToken<CallbackMessage<CallbackMarketComment>>() {
                }.getType();
                message = gson.fromJson(json, typeOfClass);
                marketCommentNew(message.getGroupId(), (CallbackMarketComment) message.getObject());
                break;

            default:
                return false;

        }

        return true;
    }
}
