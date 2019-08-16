package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Action type */
public enum LinkButtonActionType implements EnumParam {
    @SerializedName("open_url")
    OPEN_URL("open_url");

    private final String value;

    LinkButtonActionType(String value) {
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
