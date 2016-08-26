package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;

/**
 * State code
 */
public enum SetCallbackServerResponseStateCode {
    @SerializedName("1")
    OK(1),

    @SerializedName("2")
    WAIT(2),

    @SerializedName("3")
    INCORRECT(3),

    @SerializedName("4")
    FAILED(4);

    private final Integer value;

    SetCallbackServerResponseStateCode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
