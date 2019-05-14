package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * '1' — female, '2' — male, '0' — any (default)
 */
public enum UsersSex implements EnumParam {
    @SerializedName("0")
    ANY(0),

    @SerializedName("1")
    FEMALE(1),

    @SerializedName("2")
    MALE(2);

    private final Integer value;

    UsersSex(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
