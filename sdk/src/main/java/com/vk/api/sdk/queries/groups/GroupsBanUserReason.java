package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsBanUserReason implements EnumParam {

    SPAM("1"),
    VERBAL_ABUSE("2"),
    STRONG_LANGUAGE("3"),
    IRRELEVANT_MESSAGES("4"),
    OTHER("0");

    private final String value;

    GroupsBanUserReason(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
