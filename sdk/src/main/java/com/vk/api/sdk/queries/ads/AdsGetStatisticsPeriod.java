package com.vk.api.sdk.queries.ads;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AdsGetStatisticsPeriod implements EnumParam {

    DAY("day"),
    MONTH("month"),
    OVERALL("overall");

    private final String value;

    AdsGetStatisticsPeriod(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
