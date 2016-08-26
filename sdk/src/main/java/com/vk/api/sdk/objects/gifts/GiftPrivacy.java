package com.vk.api.sdk.objects.gifts;

import com.google.gson.annotations.SerializedName;

/**
 * Gift privacy
 */
public enum GiftPrivacy {
    @SerializedName("0")
    NAME_AND_MESSAGE_FOR_ALL(0),

    @SerializedName("1")
    NAME_FOR_ALL(1),

    @SerializedName("2")
    NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY(2);

    private final Integer value;

    GiftPrivacy(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
