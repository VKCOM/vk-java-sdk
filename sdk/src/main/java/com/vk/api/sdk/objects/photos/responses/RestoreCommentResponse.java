package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum RestoreCommentResponse implements EnumParam {
    @SerializedName("0")
    NO(0),

    @SerializedName("1")
    YES(1);

    private final Integer value;

    RestoreCommentResponse(Integer value) {
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
