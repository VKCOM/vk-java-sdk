package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Settings parameters */
public enum PushParamsSettings implements EnumParam {
    @SerializedName("on")
    ON("on"),

    @SerializedName("off")
    OFF("off"),

    @SerializedName("fr_of_fr")
    FR_OF_FR("fr_of_fr");

    private final String value;

    PushParamsSettings(String value) {
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
