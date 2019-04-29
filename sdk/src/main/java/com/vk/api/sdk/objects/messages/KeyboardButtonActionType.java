package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Button type
 */
public enum KeyboardButtonActionType implements EnumParam {
    @SerializedName("text")
    TEXT("text"),

    @SerializedName("start")
    START("start");

    private final String value;

    KeyboardButtonActionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
