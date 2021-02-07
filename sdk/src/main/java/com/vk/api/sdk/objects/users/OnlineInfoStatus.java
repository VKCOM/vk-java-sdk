package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * In case user online is not visible, it indicates approximate timeframe of user online
 */
public enum OnlineInfoStatus implements EnumParam {
    @SerializedName("recently")
    RECENTLY("recently"),

    @SerializedName("last_week")
    LAST_WEEK("last_week"),

    @SerializedName("last_month")
    LAST_MONTH("last_month"),

    @SerializedName("long_ago")
    LONG_AGO("long_ago"),

    @SerializedName("not_show")
    NOT_SHOW("not_show");

    private final String value;

    OnlineInfoStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
