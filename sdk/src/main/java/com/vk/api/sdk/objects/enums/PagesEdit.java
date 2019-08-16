package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Who can edit the wiki page: '1' — only community members, '2' — all users can edit the page, '0' — only community managers */
public enum PagesEdit implements EnumParam {
    @SerializedName("0")
    MANAGERS(0),

    @SerializedName("1")
    MEMBERS(1),

    @SerializedName("2")
    ALL(2);

    private final Integer value;

    PagesEdit(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
