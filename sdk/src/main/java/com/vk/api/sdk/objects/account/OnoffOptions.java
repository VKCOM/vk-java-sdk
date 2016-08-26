package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;

/**
 * Settings parameters
 */
public enum OnoffOptions {
    @SerializedName("on")
    ON("on"),

    @SerializedName("off")
    OFF("off");

    private final String value;

    OnoffOptions(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
