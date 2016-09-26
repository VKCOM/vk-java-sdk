package com.vk.api.sdk.queries.ads;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AdsGetUploadURLAdFormat implements EnumParam {

    /**
     * image and text
     */
    IMAGE_AND_TEXT("1"),
    /**
     * big image
     */
    BIG_IMAGE("2"),

    /**
     * exclusive format
     */
    EXCLUSIVE_FORMAT("3"),

    /**
     * community, square image
     */
    COMMUNITY_SQUARE_IMAGE("4"),

    /**
     * special app format
     */
    SPECIAL_APP_FORMAT("7");


    private final String value;

    AdsGetUploadURLAdFormat(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
