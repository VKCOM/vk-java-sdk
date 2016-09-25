package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum UsersSearchSort implements EnumParam {

    BY_REGISTERED_DATE("1"),
    BY_RATING("0");

    private final String value;

    UsersSearchSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
