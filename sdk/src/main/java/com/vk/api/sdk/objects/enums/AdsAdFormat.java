package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Ad format: *1 — image and text,, *2 — big image,, *3 — exclusive format,, *4 — community, square image,, *7 — special app format.
 */
public enum AdsAdFormat implements EnumParam {
    @SerializedName("1")
    IMAGE_AND_TEXT(1),

    @SerializedName("2")
    BIG_IMAGE(2),

    @SerializedName("3")
    EXCLUSIVE_FORMAT(3),

    @SerializedName("4")
    COMMUNITY_SQUARE_IMAGE(4),

    @SerializedName("7")
    SPECIAL_APP_FORMAT(7);

    private final Integer value;

    AdsAdFormat(Integer value) {
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
