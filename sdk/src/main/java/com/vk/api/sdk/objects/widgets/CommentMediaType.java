package com.vk.api.sdk.objects.widgets;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Media type */
public enum CommentMediaType implements EnumParam {
    @SerializedName("audio")
    AUDIO("audio"),

    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("video")
    VIDEO("video");

    private final String value;

    CommentMediaType(String value) {
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
