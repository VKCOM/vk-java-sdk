package com.vk.api.sdk.objects.articles;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Article state */
public enum ArticleState implements EnumParam {
    @SerializedName("available")
    AVAILABLE("available"),

    @SerializedName("deleted")
    DELETED("deleted"),

    @SerializedName("banned")
    BANNED("banned"),

    @SerializedName("protected")
    PROTECTED("protected");

    private final String value;

    ArticleState(String value) {
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
