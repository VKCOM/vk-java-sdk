package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Object type
 */
public enum DomainResolvedType implements EnumParam {
    @SerializedName("user")
    USER("user"),

    @SerializedName("group")
    GROUP("group"),

    @SerializedName("application")
    APPLICATION("application"),

    @SerializedName("page")
    PAGE("page"),

    @SerializedName("vk_app")
    VK_APP("vk_app"),

    @SerializedName("community_application")
    COMMUNITY_APPLICATION("community_application");

    private final String value;

    DomainResolvedType(String value) {
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
