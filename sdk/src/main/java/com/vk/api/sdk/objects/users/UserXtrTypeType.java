package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

/**
 * Object type
 */
public enum UserXtrTypeType {
    @SerializedName("profile")
    PROFILE("profile");

    private final String value;

    UserXtrTypeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
