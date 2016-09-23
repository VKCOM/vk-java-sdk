package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsEditAgeLimit implements EnumParam {

    WITHOUT_LIMITS("1"),
    OVER_16("2"),
    OVER_18("3");

    private final String value;

    GroupsEditAgeLimit(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
