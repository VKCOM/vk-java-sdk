package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort order: 'popular_today' — popular for one day (default), 'visitors' — by visitors number , 'create_date' — by creation date, 'growth_rate' — by growth rate, 'popular_week' — popular for one week */
public enum AppsSort implements EnumParam {
    @SerializedName("popular_today")
    POPULAR_TODAY("popular_today"),

    @SerializedName("visitors")
    VISITORS("visitors"),

    @SerializedName("create_date")
    CREATE_DATE("create_date"),

    @SerializedName("growth_rate")
    GROWTH_RATE("growth_rate"),

    @SerializedName("popular_week")
    POPULAR_WEEK("popular_week");

    private final String value;

    AppsSort(String value) {
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
