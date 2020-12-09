package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum TagsSuggestionItemButtonStyle implements EnumParam {
    @SerializedName("primary")
    PRIMARY("primary"),

    @SerializedName("secondary")
    SECONDARY("secondary");

    private final String value;

    TagsSuggestionItemButtonStyle(String value) {
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
