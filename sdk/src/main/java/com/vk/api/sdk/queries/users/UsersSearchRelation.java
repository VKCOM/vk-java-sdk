package com.vk.api.sdk.queries.users;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum UsersSearchRelation implements EnumParam {

    SINGLE("1"),
    IN_RELATIONSHIP("2"),
    ENGAGED("3"),
    MARRIED("4"),
    IT_IS_COMPLICATED("5"),
    ACTIVELY_SEARCHING("6"),
    IN_LOVE("7");

    private final String value;

    UsersSearchRelation(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
