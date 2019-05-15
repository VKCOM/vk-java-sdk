package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort order: 'asc' — old first, 'desc' — new first
 */
public enum PhotosSort implements EnumParam {
    @SerializedName("asc")
    OLD_FIRST("asc"),

    @SerializedName("desc")
    NEW_FIRST("desc");

    private final String value;

    PhotosSort(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
