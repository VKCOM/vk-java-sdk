package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum FriendsGetRequestsSort implements EnumParam {

    BY_MUTUAL_FRIENDS("1"),
    BY_DATE("0");

    private final String value;

    FriendsGetRequestsSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
