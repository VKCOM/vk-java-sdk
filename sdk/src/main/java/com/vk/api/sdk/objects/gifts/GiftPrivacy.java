package com.vk.api.sdk.objects.gifts;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Gift privacy */
public enum GiftPrivacy implements EnumParam {
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

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
