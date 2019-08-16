package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Returns 1 if out request has been canceled */
public enum DeleteResponseOutRequestDeleted implements EnumParam {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    DeleteResponseOutRequestDeleted(Integer value) {
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
