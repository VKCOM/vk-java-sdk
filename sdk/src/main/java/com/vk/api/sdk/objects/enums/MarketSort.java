package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum MarketSort implements EnumParam {
    @SerializedName("0")
    _0(0),

    @SerializedName("1")
    _1(1),

    @SerializedName("2")
    _2(2),

    @SerializedName("3")
    _3(3);

    private final Integer value;

    MarketSort(Integer value) {
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
