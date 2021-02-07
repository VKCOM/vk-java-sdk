package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum MarketStatus implements EnumParam {
    @SerializedName("0")
    ACTIVE(0),

    @SerializedName("2")
    DISABLED(2);

    private final Integer value;

    MarketStatus(Integer value) {
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
