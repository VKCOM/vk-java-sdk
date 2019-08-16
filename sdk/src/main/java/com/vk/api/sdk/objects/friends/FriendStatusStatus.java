package com.vk.api.sdk.objects.friends;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Friend status with the user */
public enum FriendStatusStatus implements EnumParam {
    @SerializedName("0")
    NOT_A_FRIEND(0),

    @SerializedName("1")
    OUTCOMING_REQUEST(1),

    @SerializedName("2")
    INCOMING_REQUEST(2),

    @SerializedName("3")
    IS_FRIEND(3);

    private final Integer value;

    FriendStatusStatus(Integer value) {
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
