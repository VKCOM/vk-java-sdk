package com.vk.api.sdk.objects.owner;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum StateState implements EnumParam {
    @SerializedName("1")
    BANNED(1),

    @SerializedName("2")
    ADULT(2),

    @SerializedName("3")
    HIDDEN(3),

    @SerializedName("4")
    DELETED(4);

    private final Integer value;

    StateState(Integer value) {
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
