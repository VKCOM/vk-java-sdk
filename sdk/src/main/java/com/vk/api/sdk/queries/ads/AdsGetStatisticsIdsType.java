package com.vk.api.sdk.queries.ads;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AdsGetStatisticsIdsType implements EnumParam {

    AD("ad"),
    CAMPAIGN("campaign"),
    CLIENT("client"),
    OFFICE("office");

    private final String value;

    AdsGetStatisticsIdsType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
