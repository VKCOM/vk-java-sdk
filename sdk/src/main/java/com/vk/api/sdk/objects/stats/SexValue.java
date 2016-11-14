package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

/**
 * Sex value
 */
public enum SexValue {

    @SerializedName("f")
    FEMALE("f"),

    @SerializedName("m")
    MALE("m");

    private final String value;

    SexValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
