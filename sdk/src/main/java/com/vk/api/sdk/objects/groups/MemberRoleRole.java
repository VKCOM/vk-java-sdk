package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

/**
 * User's credentials as community admin
 */
public enum MemberRoleRole {
    @SerializedName("moderator")
    MODERATOR("moderator"),

    @SerializedName("editor")
    EDITOR("editor"),

    @SerializedName("administrator")
    ADMINISTRATOR("administrator"),

    @SerializedName("creator")
    CREATOR("creator");

    private final String value;

    MemberRoleRole(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
