package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Button type
 */
public enum TemplateType implements EnumParam {
    @SerializedName("carousel")
    CAROUSEL("carousel");

    private final String value;

    TemplateType(String value) {
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
