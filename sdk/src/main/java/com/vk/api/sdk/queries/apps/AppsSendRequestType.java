package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AppsSendRequestType implements EnumParam {

    /**
     * if the request is sent to a user who does not have the app installed;
     */
    INVITE("invite"),

    /**
     * if a user has already installed the app
     */
    REQUEST("request");

    private final String value;

    AppsSendRequestType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
