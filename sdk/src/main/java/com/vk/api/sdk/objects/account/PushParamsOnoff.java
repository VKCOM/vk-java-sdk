package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Settings parameters */
public enum PushParamsOnoff implements EnumParam {
    @SerializedName("on")
    ON("on"),

    @SerializedName("off")
    OFF("off");

    private final String value;

    PushParamsOnoff(String value) {
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
