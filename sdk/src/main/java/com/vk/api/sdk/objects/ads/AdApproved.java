package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

/**
 * Review status
 */
public enum AdApproved {
    @SerializedName("0")
    NOT_MODERATED(0),

    @SerializedName("1")
    PENDING_MODERATION(1),

    @SerializedName("2")
    APPROVED(2),

    @SerializedName("3")
    REJECTED(3);

    private final Integer value;

    AdApproved(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
