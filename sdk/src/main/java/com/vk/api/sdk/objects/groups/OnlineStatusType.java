package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Type of online status of group */
public enum OnlineStatusType implements EnumParam {
    @SerializedName("none")
    NONE("none"),

    @SerializedName("online")
    ONLINE("online"),

    @SerializedName("answer_mark")
    ANSWER_MARK("answer_mark");

    private final String value;

    OnlineStatusType(String value) {
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
