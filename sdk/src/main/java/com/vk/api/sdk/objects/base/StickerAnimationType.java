package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Type of animation script
 */
public enum StickerAnimationType implements EnumParam {
    @SerializedName("light")
    LIGHT("light"),

    @SerializedName("dark")
    DARK("dark");

    private final String value;

    StickerAnimationType(String value) {
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
