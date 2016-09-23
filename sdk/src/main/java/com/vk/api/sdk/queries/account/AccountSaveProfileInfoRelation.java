package com.vk.api.sdk.queries.account;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AccountSaveProfileInfoRelation implements EnumParam {

    SINGLE("1"),
    IN_RELATIONSHIP("2"),
    ENGAGED("3"),
    MARRIED("4"),
    IT_IS_COMPLICATED("5"),
    ACTIVELY_SEARCHING("6"),
    IN_LOVE("7"),
    NOT_SPECIFIED("8");

    private final String value;

    AccountSaveProfileInfoRelation(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
