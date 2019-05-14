package com.vk.api.sdk.objects.leads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Information whether user can start the lead
 */
public enum CheckedResult implements EnumParam {
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

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
