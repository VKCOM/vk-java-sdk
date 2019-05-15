package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ItemStoriesBlockBlockType implements EnumParam {
    @SerializedName("local")
    LOCAL("local"),

    @SerializedName("remote")
    REMOTE("remote");

    private final String value;

    ItemStoriesBlockBlockType(String value) {
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
