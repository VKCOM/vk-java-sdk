package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Ban reason */
public enum BanInfoReason implements EnumParam {
    @SerializedName("0")
    OTHER(0),

    @SerializedName("1")
    SPAM(1),

    @SerializedName("2")
    VERBAL_ABUSE(2),

    @SerializedName("3")
    STRONG_LANGUAGE(3),

    @SerializedName("4")
    FLOOD(4);

    private final Integer value;

    BanInfoReason(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
