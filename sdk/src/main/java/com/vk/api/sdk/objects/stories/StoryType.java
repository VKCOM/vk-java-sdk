package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Story type.
 */
public enum StoryType implements EnumParam {
    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("video")
    VIDEO("video");

    private final String value;

    StoryType(String value) {
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
