package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

/**
 * Owner type
 */
public enum OwnerXtrBanInfoType {
    @SerializedName("group")
    GROUP("group"),

    @SerializedName("profile")
    PROFILE("profile");

    private final String value;

    OwnerXtrBanInfoType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
