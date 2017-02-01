package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

/**
 * LinkButtonAction type
 */
public enum LinkButtonActionType {

    @SerializedName("open_url")
    OPEN_URL("open_url");

    private final String value;

    LinkButtonActionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
