package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Returns 1 if incoming request has been declined */
public enum DeleteResponseInRequestDeleted implements EnumParam {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    DeleteResponseInRequestDeleted(Integer value) {
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
