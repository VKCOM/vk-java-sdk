package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsEditWall implements EnumParam {

    DISABLED("0"),
    OPEN("1"),
    LIMITED("2");

    private final String value;

    GroupsEditWall(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
