package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum VideoSearchSort implements EnumParam {

    BY_DURATION("1"),
    BY_RELEVANCE("2"),
    BY_ADDED_DATE("0");

    private final String value;

    VideoSearchSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
