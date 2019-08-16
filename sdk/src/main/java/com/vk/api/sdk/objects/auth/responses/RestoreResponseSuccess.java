package com.vk.api.sdk.objects.auth.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * 1 if success */
public enum RestoreResponseSuccess implements EnumParam {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    RestoreResponseSuccess(Integer value) {
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
