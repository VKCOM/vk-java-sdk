package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * type of digest
 */
public enum ItemDigestType implements EnumParam {
    @SerializedName("digest")
    DIGEST("digest");

    private final String value;

    ItemDigestType(String value) {
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
