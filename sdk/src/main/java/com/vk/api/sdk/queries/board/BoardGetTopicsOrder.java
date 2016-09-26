package com.vk.api.sdk.queries.board;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum BoardGetTopicsOrder implements EnumParam {

    /**
     * by date updated in reverse chronological order.
     */
    BY_UPDATED_DATE_DESC("1"),

    /**
     * by date created in reverse chronological order.
     */
    BY_CREATED_DATE_DESC("2"),

    /**
     * by date updated in chronological order.
     */
    BY_UPDATED_DATE_ASC("-1"),

    /**
     * by date created in chronological order.
     */
    BY_CREATED_DATE_ASC("-2");


    private final String value;

    BoardGetTopicsOrder(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
