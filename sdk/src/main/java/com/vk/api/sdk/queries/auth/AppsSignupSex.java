package com.vk.api.sdk.queries.auth;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AppsSignupSex implements EnumParam {

    FEMALE("1"),
    MALE("2");

    private final String value;

    AppsSignupSex(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
