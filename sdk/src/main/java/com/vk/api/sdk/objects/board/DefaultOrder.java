package com.vk.api.sdk.objects.board;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort type */
public enum DefaultOrder implements EnumParam {
    @SerializedName("1")
    DESC_UPDATED(1),

    @SerializedName("2")
    DESC_CREATED(2),

    @SerializedName("-1")
    ASC_UPDATED(-1),

    @SerializedName("-2")
    ASC_CREATED(-2);

    private final Integer value;

    DefaultOrder(Integer value) {
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
