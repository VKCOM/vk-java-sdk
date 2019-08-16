package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Account type */
public enum AccountType implements EnumParam {
    @SerializedName("general")
    GENERAL("general"),

    @SerializedName("agency")
    AGENCY("agency");

    private final String value;

    AccountType(String value) {
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
