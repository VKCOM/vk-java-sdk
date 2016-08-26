package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

public enum PropertyExists {
    @SerializedName("1")
    PROPERTY_EXISTS(1);

    private final Integer value;

    PropertyExists(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
