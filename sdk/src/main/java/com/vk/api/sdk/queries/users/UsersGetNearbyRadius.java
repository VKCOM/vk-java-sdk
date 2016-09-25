package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum UsersGetNearbyRadius implements EnumParam {

    METRES_3000("1"),
    METRES_2400("2"),
    KM_18("3"),
    KM_150("4");

    private final String value;

    UsersGetNearbyRadius(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
