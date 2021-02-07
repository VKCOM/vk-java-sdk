package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum UserFullWallDefault implements EnumParam {
    @SerializedName("owner")
    OWNER("owner"),

    @SerializedName("all")
    ALL("all");

    private final String value;

    UserFullWallDefault(String value) {
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
