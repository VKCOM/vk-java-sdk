package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsCreateSubType implements EnumParam {

    PLACE_OR_SMALL_BUSINESS("1"),
    COMPANY_OR_WEBSITE("2"),
    PERSON_OF_GROUP("3"),
    PRODUCT("4");

    private final String value;

    GroupsCreateSubType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
