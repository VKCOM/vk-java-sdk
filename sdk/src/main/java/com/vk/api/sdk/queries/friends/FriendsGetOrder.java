package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum FriendsGetOrder implements EnumParam {

    /**
     * by name
     */
    NAME("name"),

    /**
     * by rating, similar to how friends are sorted in My friends section
     */
    HINTS("hints");

    private final String value;

    FriendsGetOrder(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
