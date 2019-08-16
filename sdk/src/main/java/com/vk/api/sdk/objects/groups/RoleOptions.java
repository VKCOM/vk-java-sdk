package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * User's credentials as community admin */
public enum RoleOptions implements EnumParam {
    @SerializedName("moderator")
    MODERATOR("moderator"),

    @SerializedName("editor")
    EDITOR("editor"),

    @SerializedName("administrator")
    ADMINISTRATOR("administrator"),

    @SerializedName("creator")
    CREATOR("creator");

    private final String value;

    RoleOptions(String value) {
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
