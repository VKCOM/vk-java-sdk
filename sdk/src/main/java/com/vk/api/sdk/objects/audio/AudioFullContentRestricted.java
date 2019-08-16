package com.vk.api.sdk.objects.audio;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Audio restriction */
public enum AudioFullContentRestricted implements EnumParam {
    @SerializedName("0")
    NO(0),

    @SerializedName("1")
    CLAIM(1),

    @SerializedName("2")
    GEO(2),

    @SerializedName("3")
    SUBSCRIPTION(3),

    @SerializedName("4")
    REPLACEMENT_REQUIRED(4),

    @SerializedName("5")
    FUTURE(5),

    @SerializedName("6")
    OUTSIDE_HOSTING_COUNTRY(6),

    @SerializedName("7")
    SITE_RULES_VIOLATION(7),

    @SerializedName("8")
    SUBSCRIPTION_SUSPEND(8),

    @SerializedName("9")
    APP_UPDATE(9),

    @SerializedName("10")
    WARNER_NON_RETAIL_CLAIMED(10),

    @SerializedName("21")
    STORY_NOT_AVAILABLE(21),

    @SerializedName("22")
    STORY_FREE(22),

    @SerializedName("23")
    STORY_PAID(23);

    private final Integer value;

    AudioFullContentRestricted(Integer value) {
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
