package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Status representation
 */
public enum LinkProductStatus implements EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("blocked")
    BLOCKED("blocked"),

    @SerializedName("sold")
    SOLD("sold"),

    @SerializedName("deleted")
    DELETED("deleted"),

    @SerializedName("archived")
    ARCHIVED("archived");

    private final String value;

    LinkProductStatus(String value) {
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
