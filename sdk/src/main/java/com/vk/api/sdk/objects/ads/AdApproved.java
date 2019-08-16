package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Review status */
public enum AdApproved implements EnumParam {
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

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
