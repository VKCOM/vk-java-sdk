package com.vk.api.sdk.streaming.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Streaming event type
 */
public enum StreamingEventType {

    @SerializedName("post")
    POST("post"),

    @SerializedName("comment")
    COMMENT("comment"),

    @SerializedName("share")
    SHARE("share");

    private final String value;

    StreamingEventType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
