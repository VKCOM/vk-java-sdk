package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Statistic state */
public enum StoryStatsState implements EnumParam {
    @SerializedName("on")
    ON("on"),

    @SerializedName("off")
    OFF("off"),

    @SerializedName("hidden")
    HIDDEN("hidden");

    private final String value;

    StoryStatsState(String value) {
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
