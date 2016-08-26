package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

/**
 * Account type
 */
public enum AccountAccountType {
    @SerializedName("general")
    GENERAL("general"),

    @SerializedName("agency")
    AGENCY("agency");

    private final String value;

    AccountAccountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
