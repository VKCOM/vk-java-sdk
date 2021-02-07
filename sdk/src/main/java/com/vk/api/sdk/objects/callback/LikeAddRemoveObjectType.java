package com.vk.api.sdk.objects.callback;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum LikeAddRemoveObjectType implements EnumParam {
    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("post")
    POST("post"),

    @SerializedName("comment")
    COMMENT("comment"),

    @SerializedName("note")
    NOTE("note"),

    @SerializedName("topic_comment")
    TOPIC_COMMENT("topic_comment"),

    @SerializedName("photo_comment")
    PHOTO_COMMENT("photo_comment"),

    @SerializedName("video_comment")
    VIDEO_COMMENT("video_comment"),

    @SerializedName("market")
    MARKET("market"),

    @SerializedName("market_comment")
    MARKET_COMMENT("market_comment");

    private final String value;

    LikeAddRemoveObjectType(String value) {
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
