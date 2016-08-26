package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;

/**
 * Information whether the item is available
 */
public enum MarketItemAvailability {
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

    public Integer getValue() {
        return value;
    }
}
