package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

/**
 * Sex
 */
public enum StatsSexValue {
    @SerializedName("f")
    FEMALE("f"),

    @SerializedName("m")
    MALE("m");

    private final String value;

    StatsSexValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
