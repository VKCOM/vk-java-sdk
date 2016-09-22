package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum FriendsGetMutualOrder implements EnumParam {

    RANDOM("random");

    private final String value;

    FriendsGetMutualOrder(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
