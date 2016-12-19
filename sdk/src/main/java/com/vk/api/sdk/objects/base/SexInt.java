package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum SexInt implements EnumParam {
    @SerializedName("1")
    FEMALE("1"),
    @SerializedName("2")
    MALE("2"),
    @SerializedName("0")
    UNKNOWN("0");

    private final String value;

    SexInt(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
