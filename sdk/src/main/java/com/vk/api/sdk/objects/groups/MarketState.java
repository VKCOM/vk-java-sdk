package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Declares state if market is enabled in group.
 */
public enum MarketState implements EnumParam {
    @SerializedName("none")
    NONE("none"),

    @SerializedName("basic")
    BASIC("basic"),

    @SerializedName("advanced")
    ADVANCED("advanced");

    private final String value;

    MarketState(String value) {
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
