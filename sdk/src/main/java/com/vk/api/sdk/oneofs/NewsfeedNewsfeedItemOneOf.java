package com.vk.api.sdk.oneofs;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vk.api.sdk.objects.newsfeed.ItemAudio;
import com.vk.api.sdk.objects.newsfeed.ItemDigest;
import com.vk.api.sdk.objects.newsfeed.ItemFriend;
import com.vk.api.sdk.objects.newsfeed.ItemNote;
import com.vk.api.sdk.objects.newsfeed.ItemPhoto;
import com.vk.api.sdk.objects.newsfeed.ItemPhotoTag;
import com.vk.api.sdk.objects.newsfeed.ItemPromoButton;
import com.vk.api.sdk.objects.newsfeed.ItemStoriesBlock;
import com.vk.api.sdk.objects.newsfeed.ItemTopic;
import com.vk.api.sdk.objects.newsfeed.ItemVideo;
import com.vk.api.sdk.objects.newsfeed.ItemWallpost;

public class NewsfeedNewsfeedItemOneOf {
    private JsonObject data;

    private Gson gson;

    public NewsfeedNewsfeedItemOneOf(JsonObject data) {
        this.data = data;
        gson = new Gson();
    }

    public JsonObject getRaw() {
        return data;
    }

    public ItemWallpost getOneOf0() {
        return gson.fromJson(data.toString(), ItemWallpost.class);
    }

    public ItemPhoto getOneOf1() {
        return gson.fromJson(data.toString(), ItemPhoto.class);
    }

    public ItemPhotoTag getOneOf2() {
        return gson.fromJson(data.toString(), ItemPhotoTag.class);
    }

    public ItemFriend getOneOf3() {
        return gson.fromJson(data.toString(), ItemFriend.class);
    }

    public ItemNote getOneOf4() {
        return gson.fromJson(data.toString(), ItemNote.class);
    }

    public ItemAudio getOneOf5() {
        return gson.fromJson(data.toString(), ItemAudio.class);
    }

    public ItemVideo getOneOf6() {
        return gson.fromJson(data.toString(), ItemVideo.class);
    }

    public ItemTopic getOneOf7() {
        return gson.fromJson(data.toString(), ItemTopic.class);
    }

    public ItemDigest getOneOf8() {
        return gson.fromJson(data.toString(), ItemDigest.class);
    }

    public ItemPromoButton getOneOf9() {
        return gson.fromJson(data.toString(), ItemPromoButton.class);
    }

    public ItemStoriesBlock getOneOf10() {
        return gson.fromJson(data.toString(), ItemStoriesBlock.class);
    }
}
