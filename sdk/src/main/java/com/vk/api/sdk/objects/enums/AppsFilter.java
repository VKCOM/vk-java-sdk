package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * 'installed' — to return list of installed apps (only for mobile platform).
 */
public enum AppsFilter implements EnumParam {
    @SerializedName("favorite")
    FAVORITE("favorite"),

    @SerializedName("featured")
    FEATURED("featured"),

    @SerializedName("installed")
    INSTALLED("installed"),

    @SerializedName("new")
    NEW("new");

    private final String value;

    AppsFilter(String value) {
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
