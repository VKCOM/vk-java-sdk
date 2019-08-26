package com.vk.api.sdk.objects.fave;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum BookmarkType implements EnumParam {
    @SerializedName("post")
    POST("post"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("product")
    PRODUCT("product"),

    @SerializedName("article")
    ARTICLE("article"),

    @SerializedName("link")
    LINK("link");

    private final String value;

    BookmarkType(String value) {
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
