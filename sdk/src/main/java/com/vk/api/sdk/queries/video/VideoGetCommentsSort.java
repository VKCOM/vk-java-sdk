package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum VideoGetCommentsSort implements EnumParam {

    ASC("asc"),
    DESC("desc");

    private final String value;

    VideoGetCommentsSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
