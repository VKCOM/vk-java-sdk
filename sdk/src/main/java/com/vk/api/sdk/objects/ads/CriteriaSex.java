package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

/**
 * Sex
 */
public enum CriteriaSex {
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

    public Integer getValue() {
        return value;
    }
}
