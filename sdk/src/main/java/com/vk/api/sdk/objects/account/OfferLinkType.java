package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Link type
 */
public enum OfferLinkType implements EnumParam {
    @SerializedName("profile")
    PROFILE("profile"),

    @SerializedName("group")
    GROUP("group"),

    @SerializedName("app")
    APP("app");

    private final String value;

    OfferLinkType(String value) {
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
