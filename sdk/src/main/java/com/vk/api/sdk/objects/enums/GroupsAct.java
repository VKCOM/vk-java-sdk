package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Describe the action
 */
public enum GroupsAct implements EnumParam {
    @SerializedName("bind")
    BIND("bind"),

    @SerializedName("unbind")
    UNBIND("unbind");

    private final String value;

    GroupsAct(String value) {
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
