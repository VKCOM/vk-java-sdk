package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsEditAccess implements EnumParam {

    OPEN("0"),
    CLOSED("1"),
    PRIVATE("2");

    private final String value;

    GroupsEditAccess(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
