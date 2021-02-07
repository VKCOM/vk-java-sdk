package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum RestrictionButtonAction implements EnumParam {
    @SerializedName("play")
    PLAY("play");

    private final String value;

    RestrictionButtonAction(String value) {
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
