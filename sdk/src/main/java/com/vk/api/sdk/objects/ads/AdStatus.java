package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

/**
 * Ad atatus
 */
public enum AdStatus {
    @SerializedName("0")
    STOPPED(0),

    @SerializedName("1")
    STARTED(1),

    @SerializedName("2")
    DELETED(2);

    private final Integer value;

    AdStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
