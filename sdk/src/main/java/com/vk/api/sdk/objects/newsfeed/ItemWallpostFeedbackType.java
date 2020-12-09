package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ItemWallpostFeedbackType implements EnumParam {
    @SerializedName("buttons")
    BUTTONS("buttons"),

    @SerializedName("stars")
    STARS("stars");

    private final String value;

    ItemWallpostFeedbackType(String value) {
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
