package com.vk.api.sdk.objects.polls;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum BackgroundType implements EnumParam {
    @SerializedName("gradient")
    GRADIENT("gradient"),

    @SerializedName("tile")
    TILE("tile");

    private final String value;

    BackgroundType(String value) {
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
