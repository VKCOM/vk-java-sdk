package com.vk.api.sdk.objects.polls.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum SavePhotoResponseType implements EnumParam {
    @SerializedName("gradient")
    GRADIENT("gradient"),

    @SerializedName("tile")
    TILE("tile");

    private final String value;

    SavePhotoResponseType(String value) {
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
