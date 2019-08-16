package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sex */
public enum CriteriaSex implements EnumParam {
    @SerializedName("0")
    ANY(0),

    @SerializedName("1")
    MALE(1),

    @SerializedName("2")
    FEMALE(2);

    private final Integer value;

    CriteriaSex(Integer value) {
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
