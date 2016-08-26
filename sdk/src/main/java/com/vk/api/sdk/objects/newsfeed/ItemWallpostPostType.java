package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;

/**
 * Post type
 */
public enum ItemWallpostPostType {
    @SerializedName("post")
    POST("post"),

    @SerializedName("copy")
    COPY("copy"),

    @SerializedName("reply")
    REPLY("reply");

    private final String value;

    ItemWallpostPostType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
