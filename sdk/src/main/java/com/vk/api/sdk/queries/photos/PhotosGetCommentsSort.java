package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum PhotosGetCommentsSort implements EnumParam {

    /**
     * by creation date in chronological order
     */
    ASC("asc"),

    /**
     * by creation date in reverse chronological order
     */
    DESC("desc");

    private final String value;

    PhotosGetCommentsSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
