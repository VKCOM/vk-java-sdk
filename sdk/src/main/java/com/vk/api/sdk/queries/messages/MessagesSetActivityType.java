package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum MessagesSetActivityType implements EnumParam {

    TYPING("typing");

    private final String value;

    MessagesSetActivityType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
