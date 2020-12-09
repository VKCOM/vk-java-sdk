package com.vk.api.sdk.objects.base.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum OkResponse implements EnumParam {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    OkResponse(Integer value) {
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
