package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsCreateType implements EnumParam {

    GROUP("group"),
    EVENT("event"),
    PUBLIC("public");

    private final String value;

    GroupsCreateType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
