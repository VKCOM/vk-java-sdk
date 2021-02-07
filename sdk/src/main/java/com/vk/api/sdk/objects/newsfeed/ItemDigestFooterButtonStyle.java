package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ItemDigestFooterButtonStyle implements EnumParam {
    @SerializedName("primary")
    PRIMARY("primary");

    private final String value;

    ItemDigestFooterButtonStyle(String value) {
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
