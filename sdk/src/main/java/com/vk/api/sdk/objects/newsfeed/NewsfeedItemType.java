package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Item type
 */
public enum NewsfeedItemType implements EnumParam {
    @SerializedName("post")
    POST("post"),

    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("photo_tag")
    PHOTO_TAG("photo_tag"),

    @SerializedName("wall_photo")
    WALL_PHOTO("wall_photo"),

    @SerializedName("friend")
    FRIEND("friend"),

    @SerializedName("note")
    NOTE("note"),

    @SerializedName("audio")
    AUDIO("audio"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("topic")
    TOPIC("topic"),

    @SerializedName("digest")
    DIGEST("digest"),

    @SerializedName("stories")
    STORIES("stories");

    private final String value;

    NewsfeedItemType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
