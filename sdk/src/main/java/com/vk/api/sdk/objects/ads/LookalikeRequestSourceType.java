package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Lookalike request source type
 */
public enum LookalikeRequestSourceType implements EnumParam {
    @SerializedName("retargeting_group")
    RETARGETING_GROUP("retargeting_group");

    private final String value;

    LookalikeRequestSourceType(String value) {
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
