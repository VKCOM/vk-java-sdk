package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GroupsState implements EnumParam {
    @SerializedName("advanced")
    ADVANCED("advanced"),

    @SerializedName("basic")
    BASIC("basic"),

    @SerializedName("none")
    NONE("none");

    private final String value;

    GroupsState(String value) {
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
