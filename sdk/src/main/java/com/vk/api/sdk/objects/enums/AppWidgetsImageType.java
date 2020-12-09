package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum AppWidgetsImageType implements EnumParam {
    @SerializedName("160x160")
    _160X160("160x160"),

    @SerializedName("160x240")
    _160X240("160x240"),

    @SerializedName("24x24")
    _24X24("24x24"),

    @SerializedName("50x50")
    _50X50("50x50"),

    @SerializedName("510x128")
    _510X128("510x128");

    private final String value;

    AppWidgetsImageType(String value) {
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
