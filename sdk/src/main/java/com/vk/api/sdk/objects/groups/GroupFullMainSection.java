package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Main section of community
 */
public enum GroupFullMainSection implements EnumParam {
    @SerializedName("0")
    ABSENT(0),

    @SerializedName("1")
    PHOTOS(1),

    @SerializedName("2")
    TOPICS(2),

    @SerializedName("3")
    AUDIO(3),

    @SerializedName("4")
    VIDEO(4),

    @SerializedName("5")
    MARKET(5);

    private final Integer value;

    GroupFullMainSection(Integer value) {
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
