package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort order: '1' — return messages in chronological order. '0' — return messages in reverse chronological order.
 */
public enum MessagesRev implements EnumParam {
    @SerializedName("1")
    CHRONOLOGICAL(1),

    @SerializedName("0")
    REVERSE_CHRONOLOGICAL(0);

    private final Integer value;

    MessagesRev(Integer value) {
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
