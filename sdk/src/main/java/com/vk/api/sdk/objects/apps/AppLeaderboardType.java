package com.vk.api.sdk.objects.apps;

import com.google.gson.annotations.SerializedName;

/**
 * Leaderboard type
 */
public enum AppLeaderboardType {
    @SerializedName("0")
    NOT_SUPPORTED(0),

    @SerializedName("1")
    LEVELS(1),

    @SerializedName("2")
    POINTS(2);

    private final Integer value;

    AppLeaderboardType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
