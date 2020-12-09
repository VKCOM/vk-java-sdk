package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ItemDigestHeaderStyle implements EnumParam {
    @SerializedName("singleline")
    SINGLELINE("singleline"),

    @SerializedName("multiline")
    MULTILINE("multiline");

    private final String value;

    ItemDigestHeaderStyle(String value) {
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
