package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Says what user can edit in post about donut properties
 */
public enum WallpostDonutEditMode implements EnumParam {
    @SerializedName("all")
    ALL("all"),

    @SerializedName("duration")
    DURATION("duration");

    private final String value;

    WallpostDonutEditMode(String value) {
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
