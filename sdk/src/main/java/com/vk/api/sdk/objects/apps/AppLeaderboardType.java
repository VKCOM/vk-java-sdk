package com.vk.api.sdk.objects.apps;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Leaderboard type */
public enum AppLeaderboardType implements EnumParam {
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

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
