package com.vk.api.sdk.objects.leads;

import com.google.gson.annotations.SerializedName;

/**
 * Information whether user can start the lead
 */
public enum CheckedResult {
    @SerializedName("true")
    TRUE("true"),

    @SerializedName("false")
    FALSE("false");

    private final String value;

    CheckedResult(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
