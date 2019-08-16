package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Information whether the item is available */
public enum MarketItemAvailability implements EnumParam {
    @SerializedName("0")
    AVAILABLE(0),

    @SerializedName("1")
    REMOVED(1),

    @SerializedName("2")
    UNAVAILABLE(2);

    private final Integer value;

    MarketItemAvailability(Integer value) {
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
