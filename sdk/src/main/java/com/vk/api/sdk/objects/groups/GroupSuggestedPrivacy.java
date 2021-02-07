package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GroupSuggestedPrivacy implements EnumParam {
    @SerializedName("0")
    NONE(0),

    @SerializedName("1")
    ALL(1),

    @SerializedName("2")
    SUBSCRIBERS(2);

    private final Integer value;

    GroupSuggestedPrivacy(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
