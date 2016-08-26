package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;

/**
 * Returns 1 if friend has been deleted
 */
public enum DeleteResponseFriendDeleted {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    DeleteResponseFriendDeleted(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
