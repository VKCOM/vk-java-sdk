package com.vk.api.sdk.queries.leads;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum LeadsGetUsersStatus implements EnumParam {

    FINISH("1"),
    BLOCKING_USERS("2"),
    TEST_START("3"),
    TEST_FINISH("4"),
    START("0");

    private final String value;

    LeadsGetUsersStatus(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
