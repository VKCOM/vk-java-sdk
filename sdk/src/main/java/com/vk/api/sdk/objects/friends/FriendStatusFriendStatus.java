package com.vk.api.sdk.objects.friends;

import com.google.gson.annotations.SerializedName;

/**
 * Friend status with the user
 */
public enum FriendStatusFriendStatus {
    @SerializedName("0")
    NOT_A_FRIEND(0),

    @SerializedName("1")
    OUTCOMING_REQUEST(1),

    @SerializedName("2")
    INCOMING_REQUEST(2),

    @SerializedName("3")
    IS_FRIEND(3);

    private final Integer value;

    FriendStatusFriendStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
