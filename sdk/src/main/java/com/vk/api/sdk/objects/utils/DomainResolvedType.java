package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;

/**
 * Object type
 */
public enum DomainResolvedType {
    @SerializedName("user")
    USER("user"),

    @SerializedName("group")
    GROUP("group"),

    @SerializedName("application")
    APPLICATION("application"),

    @SerializedName("page")
    PAGE("page");

    private final String value;

    DomainResolvedType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
