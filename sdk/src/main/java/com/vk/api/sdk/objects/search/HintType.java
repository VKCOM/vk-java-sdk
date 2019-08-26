package com.vk.api.sdk.objects.search;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Object type
 */
public enum HintType implements EnumParam {
    @SerializedName("group")
    GROUP("group"),

    @SerializedName("profile")
    PROFILE("profile"),

    @SerializedName("vk_app")
    VK_APP("vk_app");

    private final String value;

    HintType(String value) {
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
