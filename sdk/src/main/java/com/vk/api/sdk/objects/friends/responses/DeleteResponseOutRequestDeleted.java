package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;

/**
 * Returns 1 if out request has been canceled
 */
public enum DeleteResponseOutRequestDeleted {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    DeleteResponseOutRequestDeleted(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
