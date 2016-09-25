package com.vk.api.sdk.queries.ads;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AdsGetDemographicsIdsType implements EnumParam {

    AD("ad"),
    CAMPAIGN("campaign");

    private final String value;

    AdsGetDemographicsIdsType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
