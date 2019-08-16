package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Settings parameters */
public enum PushParamsMode implements EnumParam {
    @SerializedName("on")
    ON("on"),

    @SerializedName("off")
    OFF("off"),

    @SerializedName("no_sound")
    NO_SOUND("no_sound"),

    @SerializedName("no_text")
    NO_TEXT("no_text");

    private final String value;

    PushParamsMode(String value) {
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
