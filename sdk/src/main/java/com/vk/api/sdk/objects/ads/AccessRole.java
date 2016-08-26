package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

/**
 * Current user's role
 */
public enum AccessRole {
    @SerializedName("admin")
    ADMIN("admin"),

    @SerializedName("manager")
    MANAGER("manager"),

    @SerializedName("reports")
    REPORTS("reports");

    private final String value;

    AccessRole(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
