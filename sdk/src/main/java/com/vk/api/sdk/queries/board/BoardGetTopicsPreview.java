package com.vk.api.sdk.queries.board;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum BoardGetTopicsPreview implements EnumParam {

    /**
     * to return the first comment in each topic
     */
    FIRST_COMMENT("1"),

    /**
     * to return the last comment in each topic
     */
    LAST_COMMENT("2"),

    /**
     * to return no comments (default)
     */
    NO_COMMENTS("0");

    private final String value;

    BoardGetTopicsPreview(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
