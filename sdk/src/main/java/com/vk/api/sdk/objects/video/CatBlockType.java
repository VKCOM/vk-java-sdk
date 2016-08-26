package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;

/**
 * Block type
 */
public enum CatBlockType {
    @SerializedName("channel")
    CHANNEL("channel"),

    @SerializedName("category")
    CATEGORY("category");

    private final String value;

    CatBlockType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
