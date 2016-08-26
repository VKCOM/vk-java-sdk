package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

/**
 * Community type
 */
public enum GroupXtrInvitedByType {
    @SerializedName("group")
    GROUP("group"),

    @SerializedName("page")
    PAGE("page"),

    @SerializedName("event")
    EVENT("event");

    private final String value;

    GroupXtrInvitedByType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
