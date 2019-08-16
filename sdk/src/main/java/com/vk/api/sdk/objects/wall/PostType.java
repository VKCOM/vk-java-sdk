package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Post type */
public enum PostType implements EnumParam {
    @SerializedName("post")
    POST("post"),

    @SerializedName("copy")
    COPY("copy"),

    @SerializedName("reply")
    REPLY("reply"),

    @SerializedName("postpone")
    POSTPONE("postpone"),

    @SerializedName("suggest")
    SUGGEST("suggest");

    private final String value;

    PostType(String value) {
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
