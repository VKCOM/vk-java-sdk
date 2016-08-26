package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

/**
 * Information whether age limit
 */
public enum GroupFullAgeLimits {
    @SerializedName("1")
    NO(1),

    @SerializedName("2")
    OVER_16(2),

    @SerializedName("3")
    OVER_18(3);

    private final Integer value;

    GroupFullAgeLimits(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
