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
    PROFILE("profile");

    private final String value;

    HintType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
