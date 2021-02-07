package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum SettingsTwitterStatus implements EnumParam {
    @SerializedName("loading")
    LOADING("loading"),

    @SerializedName("sync")
    SYNC("sync");

    private final String value;

    SettingsTwitterStatus(String value) {
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
