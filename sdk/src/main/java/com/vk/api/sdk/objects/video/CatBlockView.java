package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;

/**
 * Type of view
 */
public enum CatBlockView {
    @SerializedName("horizontal")
    HORIZONTAL("horizontal"),

    @SerializedName("horizontal_compact")
    HORIZONTAL_COMPACT("horizontal_compact"),

    @SerializedName("vertical")
    VERTICAL("vertical"),

    @SerializedName("vertical_compact")
    VERTICAL_COMPACT("vertical_compact");

    private final String value;

    CatBlockView(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
