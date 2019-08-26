package com.vk.api.sdk.objects.fave;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum PageType implements EnumParam {
    @SerializedName("user")
    USER("user"),

    @SerializedName("group")
    GROUP("group"),

    @SerializedName("hints")
    HINTS("hints");

    private final String value;

    PageType(String value) {
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
