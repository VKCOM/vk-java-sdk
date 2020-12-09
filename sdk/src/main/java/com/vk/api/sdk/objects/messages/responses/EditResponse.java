package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum EditResponse implements EnumParam {
    @SerializedName("0")
    NO(0),

    @SerializedName("1")
    YES(1);

    private final Integer value;

    EditResponse(Integer value) {
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
