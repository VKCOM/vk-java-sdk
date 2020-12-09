package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ItemDigestFullItemStyle implements EnumParam {
    @SerializedName("default")
    DEFAULT("default"),

    @SerializedName("inversed")
    INVERSED("inversed");

    private final String value;

    ItemDigestFullItemStyle(String value) {
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
