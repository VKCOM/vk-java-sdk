package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Live stream status
 */
public enum VideoLiveStatus implements EnumParam {
    @SerializedName("waiting")
    WAITING("waiting"),

    @SerializedName("started")
    STARTED("started"),

    @SerializedName("finished")
    FINISHED("finished"),

    @SerializedName("failed")
    FAILED("failed"),

    @SerializedName("upcoming")
    UPCOMING("upcoming");

    private final String value;

    VideoLiveStatus(String value) {
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
