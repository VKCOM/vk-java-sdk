package com.vk.api.sdk.queries.board;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum BoardGetCommentsSort implements EnumParam {

    /**
     * by creation date in chronological order
     */
    ASC("asc"),

    /**
     * by creation date in reverse chronological order
     */
    DESC("desc");

    private final String value;

    BoardGetCommentsSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
