package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sex */
public enum StatsSexValue implements EnumParam {
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

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
