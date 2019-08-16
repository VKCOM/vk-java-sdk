package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Link status */
public enum LinkCheckedStatus implements EnumParam {
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

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
