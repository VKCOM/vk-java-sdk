package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Type of object from which to unsubscribe: 'note' — note, 'photo' — photo, 'post' — post on user wall or community wall, 'topic' — topic, 'video' — video */
public enum NewsfeedType implements EnumParam {
    @SerializedName("note")
    NOTE("note"),

    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("post")
    POST("post"),

    @SerializedName("topic")
    TOPIC("topic"),

    @SerializedName("video")
    VIDEO("video");

    private final String value;

    NewsfeedType(String value) {
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
