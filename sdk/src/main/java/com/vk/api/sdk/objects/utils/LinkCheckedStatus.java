package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;

/**
 * Link status
 */
public enum LinkCheckedStatus {
    @SerializedName("not_banned")
    NOT_BANNED("not_banned"),

    @SerializedName("banned")
    BANNED("banned"),

    @SerializedName("processing")
    PROCESSING("processing");

    private final String value;

    LinkCheckedStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
