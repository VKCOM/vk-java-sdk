package com.vk.api.sdk.queries.utils;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum UtilsLinkStatsInterval implements EnumParam {

    /**
     * Hour
     */
    HOUR("hour"),

    /**
     * Day
     */
    DAY("day"),

    /**
     * Hour
     */
    WEEK("week"),

    /**
     * Hour
     */
    MONTH("month"),

    /**
     * Hour
     */
    FOREVER("forever");

    private final String value;

    UtilsLinkStatsInterval(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
