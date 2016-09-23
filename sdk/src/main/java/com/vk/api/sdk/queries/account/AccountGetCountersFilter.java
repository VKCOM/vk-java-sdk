package com.vk.api.sdk.queries.account;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AccountGetCountersFilter implements EnumParam {

    FRIENDS("friends"),
    MESSAGES("messages"),
    PHOTOS("photos"),
    VIDEOS("videos"),
    NOTES("notes"),
    GIFTS("gifts"),
    EVENTS("events"),
    GROUPS("groups"),
    SDK("sdk"),
    NOTIFICATIONS("notifications");

    private final String value;

    AccountGetCountersFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
