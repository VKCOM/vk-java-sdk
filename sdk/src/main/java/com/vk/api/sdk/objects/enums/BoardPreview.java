package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * '1' — to return the first comment in each topic,, '2' — to return the last comment in each topic,, '0' — to return no comments. By default: '0'. */
public enum BoardPreview implements EnumParam {
    @SerializedName("1")
    FIRST(1),

    @SerializedName("2")
    LAST(2),

    @SerializedName("0")
    NONE(0);

    private final Integer value;

    BoardPreview(Integer value) {
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
