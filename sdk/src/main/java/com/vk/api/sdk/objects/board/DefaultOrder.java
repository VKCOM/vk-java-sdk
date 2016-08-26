package com.vk.api.sdk.objects.board;

import com.google.gson.annotations.SerializedName;

/**
 * Sort type
 */
public enum DefaultOrder {
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

    public Integer getValue() {
        return value;
    }
}
