package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Who can invite users to chat
 */
public enum ChatSettingsPermissionsInvite implements EnumParam {
    @SerializedName("owner")
    OWNER("owner"),

    @SerializedName("owner_and_admins")
    OWNER_AND_ADMINS("owner_and_admins"),

    @SerializedName("all")
    ALL("all");

    private final String value;

    ChatSettingsPermissionsInvite(String value) {
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
