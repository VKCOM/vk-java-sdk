package com.vk.api.sdk.objects.apps;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Scope name
 */
public enum ScopeName implements EnumParam {
    @SerializedName("friends")
    FRIENDS("friends"),

    @SerializedName("photos")
    PHOTOS("photos"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("pages")
    PAGES("pages"),

    @SerializedName("status")
    STATUS("status"),

    @SerializedName("notes")
    NOTES("notes"),

    @SerializedName("wall")
    WALL("wall"),

    @SerializedName("docs")
    DOCS("docs"),

    @SerializedName("groups")
    GROUPS("groups"),

    @SerializedName("stats")
    STATS("stats"),

    @SerializedName("market")
    MARKET("market");

    private final String value;

    ScopeName(String value) {
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
