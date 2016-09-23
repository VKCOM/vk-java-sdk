package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AppsGetFriendsListType implements EnumParam {
    INVITE("invite"),
    REQUEST("request");

    private final String value;

    AppsGetFriendsListType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
