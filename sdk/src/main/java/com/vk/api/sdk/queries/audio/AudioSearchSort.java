package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AudioSearchSort implements EnumParam {

    BY_DURATION("1"),
    BY_POPULARITY("2"),
    BY_DATE_ADDED("0");

    private final String value;

    AudioSearchSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
