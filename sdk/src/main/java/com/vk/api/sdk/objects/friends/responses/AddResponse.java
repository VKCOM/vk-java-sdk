package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Friend request status */
public enum AddResponse implements EnumParam {
    @SerializedName("1")
    SEND(1),

    @SerializedName("2")
    APPROVED(2),

    @SerializedName("4")
    RESEND(4);

    private final Integer value;

    AddResponse(Integer value) {
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
