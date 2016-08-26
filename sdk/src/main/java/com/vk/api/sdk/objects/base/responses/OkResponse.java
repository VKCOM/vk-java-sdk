package com.vk.api.sdk.objects.base.responses;

import com.google.gson.annotations.SerializedName;

/**
 * Returns 1 if request has been processed successfully
 */
public enum OkResponse {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    OkResponse(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
