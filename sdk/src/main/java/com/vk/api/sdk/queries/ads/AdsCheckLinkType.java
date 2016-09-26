package com.vk.api.sdk.queries.ads;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AdsCheckLinkType implements EnumParam {

    COMMUNITY("community"),
    POST("post"),
    TWITTER("application"),
    VIDEO("video"),
    SITE("site");

    private final String value;

    AdsCheckLinkType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
