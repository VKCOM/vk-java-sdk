package com.vk.api.sdk.objects.auth.responses;

import com.google.gson.annotations.SerializedName;

/**
 * 1 if success
 */
public enum ConfirmResponseSuccess {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    ConfirmResponseSuccess(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
