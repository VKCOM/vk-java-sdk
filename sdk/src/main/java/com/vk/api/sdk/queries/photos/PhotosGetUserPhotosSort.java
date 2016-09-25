package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum PhotosGetUserPhotosSort implements EnumParam {

    /**
     * by date the tag was added in ascending order
     */
    ASC("1"),

    /**
     * by date the tag was added in descending order
     */
    DESC("0");

    private final String value;

    PhotosGetUserPhotosSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
