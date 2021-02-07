package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum TagsSuggestionItemButtonAction implements EnumParam {
    @SerializedName("confirm")
    CONFIRM("confirm"),

    @SerializedName("decline")
    DECLINE("decline"),

    @SerializedName("show_tags")
    SHOW_TAGS("show_tags");

    private final String value;

    TagsSuggestionItemButtonAction(String value) {
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
