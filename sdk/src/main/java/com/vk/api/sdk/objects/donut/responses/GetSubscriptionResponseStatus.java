package com.vk.api.sdk.objects.donut.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GetSubscriptionResponseStatus implements EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("expiring")
    EXPIRING("expiring");

    private final String value;

    GetSubscriptionResponseStatus(String value) {
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
