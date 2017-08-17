package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

/**
 * Callback server status
 */
public enum CallbackServerStatus {
    @SerializedName("ok")
    OK("ok"),

    @SerializedName("wait")
    WAIT("wait"),

    @SerializedName("unconfigured")
    UNCONFIGURED("unconfigured"),

    @SerializedName("failed")
    FAILED("failed");

    private final String value;

    CallbackServerStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
