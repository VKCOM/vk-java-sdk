package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Button type
 */
public enum TemplateElementActionType implements EnumParam {
    @SerializedName("open_link")
    OPEN_LINK("open_link"),

    @SerializedName("open_photo")
    OPEN_PHOTO("open_photo");

    private final String value;

    TemplateElementActionType(String value) {
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
