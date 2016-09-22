package com.vk.api.sdk.queries.notifications;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum NotificationsGetFilter implements EnumParam {

    WALL("wall"),
    MENTIONS("mentions"),
    COMMENTS("comments"),
    LIKES("likes"),
    REPOSTS("reposts"),
    FOLLOWERS("followers"),
    FRIENDS("friends");

    private final String value;

    NotificationsGetFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
