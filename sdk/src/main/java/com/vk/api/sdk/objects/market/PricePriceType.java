// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum PricePriceType implements EnumParam {
    @SerializedName("0")
    EXACT(0),

    @SerializedName("2")
    RANGE(2),

    @SerializedName("3")
    BY_AGREEMENT(3);

    private final Integer value;

    PricePriceType(Integer value) {
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