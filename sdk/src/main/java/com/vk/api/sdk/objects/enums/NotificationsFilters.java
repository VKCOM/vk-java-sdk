package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum NotificationsFilters implements EnumParam {
    @SerializedName("wall")
    WALL("wall"),

    @SerializedName("mentions")
    MENTIONS("mentions"),

    @SerializedName("comments")
    COMMENTS("comments"),

    @SerializedName("likes")
    LIKES("likes"),

    @SerializedName("reposted")
    REPOSTED("reposted"),

    @SerializedName("followers")
    FOLLOWERS("followers"),

    @SerializedName("friends")
    FRIENDS("friends");

    private final String value;

    NotificationsFilters(String value) {
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
