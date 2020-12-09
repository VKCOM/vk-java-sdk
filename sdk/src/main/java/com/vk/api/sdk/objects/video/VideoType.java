package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum VideoType implements EnumParam {
    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("music_video")
    MUSIC_VIDEO("music_video"),

    @SerializedName("movie")
    MOVIE("movie");

    private final String value;

    VideoType(String value) {
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
