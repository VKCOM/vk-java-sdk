package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum MarketSearchSort implements EnumParam {

    /**
     * default sorting (user's sort);
     */
    DEFAULT("0"),

    /**
     * by creation date
     */
    BY_DATE_CREATION("1"),

    /**
     * by price
     */
    BY_PRICE("2"),

    /**
     * by popular
     */
    BY_POPULAR("3");


    private final String value;

    MarketSearchSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
