package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Cost type
 */
public enum AdCostType implements EnumParam {
    @SerializedName("0")
    PER_CLICKS(0),

    @SerializedName("1")
    PER_IMPRESSIONS(1),

    @SerializedName("2")
    PER_ACTIONS(2),

    @SerializedName("3")
    PER_IMPRESSIONS_OPTIMIZED(3);

    private final Integer value;

    AdCostType(Integer value) {
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
