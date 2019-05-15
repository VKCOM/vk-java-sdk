package com.vk.api.sdk.objects.callback.longpoll;

import com.vk.api.sdk.queries.EnumParam;

public enum GetLongPollEventsActInfo implements EnumParam {

    CHECK("a_check");

    private final String value;

    GetLongPollEventsActInfo(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
