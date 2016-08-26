package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;

/**
 * Element type
 */
public enum CatElementType {
    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("album")
    ALBUM("album");

    private final String value;

    CatElementType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
