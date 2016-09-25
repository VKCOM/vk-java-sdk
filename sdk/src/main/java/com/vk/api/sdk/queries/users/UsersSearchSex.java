package com.vk.api.sdk.queries.users;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum UsersSearchSex implements EnumParam {

    FEMALE("1"),
    MALE("2"),
    ANY("0");

    private final String value;

    UsersSearchSex(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
