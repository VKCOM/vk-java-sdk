package com.vk.api.sdk.objects.notifications;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Error code */
public enum SendMessageErrorCode implements EnumParam {
    @SerializedName("1")
    NOTIFICATIONS_DISABLED(1),

    @SerializedName("2")
    FLOOD_CONTROL_PER_HOUR(2),

    @SerializedName("3")
    FLOOD_CONTROL_PER_DAY(3),

    @SerializedName("4")
    APP_IS_NOT_INSTALLED(4);

    private final Integer value;

    SendMessageErrorCode(Integer value) {
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
