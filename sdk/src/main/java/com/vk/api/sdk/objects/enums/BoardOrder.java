package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort order: '1' — by date updated in reverse chronological order. '2' — by date created in reverse chronological order. '-1' — by date updated in chronological order. '-2' — by date created in chronological order. If no sort order is specified, topics are returned in the order specified by the group administrator. Pinned topics are returned first, regardless of the sorting. */
public enum BoardOrder implements EnumParam {
    @SerializedName("1")
    UPDATED_DESC(1),

    @SerializedName("2")
    CREATED_DESC(2),

    @SerializedName("-1")
    UPDATED_ASC(-1),

    @SerializedName("-2")
    CREATED_ASC(-2),

    @SerializedName("0")
    AS_BY_ADMINISTRATOR(0);

    private final Integer value;

    BoardOrder(Integer value) {
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
