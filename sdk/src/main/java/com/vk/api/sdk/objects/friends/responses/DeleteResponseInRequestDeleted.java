package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;

/**
 * Returns 1 if incoming request has been declined
 */
public enum DeleteResponseInRequestDeleted {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    DeleteResponseInRequestDeleted(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
