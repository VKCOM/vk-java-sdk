package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum UsersReportType implements EnumParam {
    /**
     * pornography
     */
    PORNOGRAPHY("porn"),

    /**
     * spamming
     */
    SPAM("spam"),

    /**
     * abusive behavior
     */
    INSULT("insult"),

    /**
     * disruptive advertisements
     */
    ADVERTISEMENT("advertisment");

    private final String value;

    UsersReportType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
