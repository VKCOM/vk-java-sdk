package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

public enum Sex {

    @SerializedName("1")
    FEMALE(1),

    @SerializedName("2")
    MALE(2),

    @SerializedName("0")
    UNKNOWN(0);

    private final Integer value;

    Sex(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
