package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Post type */
public enum ItemWallpostType implements EnumParam {
    @SerializedName("post")
    POST("post"),

    @SerializedName("copy")
    COPY("copy"),

    @SerializedName("reply")
    REPLY("reply");

    private final String value;

    ItemWallpostType(String value) {
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
