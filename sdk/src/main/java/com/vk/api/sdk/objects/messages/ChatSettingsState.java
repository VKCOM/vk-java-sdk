package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ChatSettingsState implements EnumParam {
    @SerializedName("in")
    IN("in"),

    @SerializedName("kicked")
    KICKED("kicked"),

    @SerializedName("left")
    LEFT("left");

    private final String value;

    ChatSettingsState(String value) {
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
