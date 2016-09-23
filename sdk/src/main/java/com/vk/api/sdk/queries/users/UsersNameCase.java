package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum UsersNameCase implements EnumParam {

    NOMINATIVE("nom"),
    GENITIVE("gen"),
    DATIVE("dat"),
    ACCUSATIVE("acc"),
    INSTRUMENTAL("ins"),
    PREPOSITIONAL("abl");

    private final String value;

    UsersNameCase(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
