package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum AccountFilter implements EnumParam {
    @SerializedName("friends")
    FRIENDS("friends"),

    @SerializedName("messages")
    MESSAGES("messages"),

    @SerializedName("photos")
    PHOTOS("photos"),

    @SerializedName("videos")
    VIDEOS("videos"),

    @SerializedName("notes")
    NOTES("notes"),

    @SerializedName("gifts")
    GIFTS("gifts"),

    @SerializedName("events")
    EVENTS("events"),

    @SerializedName("groups")
    GROUPS("groups"),

    @SerializedName("sdk")
    SDK("sdk"),

    @SerializedName("friends_suggestions")
    FRIENDS_SUGGESTIONS("friends_suggestions");

    private final String value;

    AccountFilter(String value) {
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
