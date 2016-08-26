package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

/**
 * Main section of community
 */
public enum GroupFullMainSection {
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

    public Integer getValue() {
        return value;
    }
}
