package com.vk.api.sdk.queries.ads;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AdsGetSuggestionsLang implements EnumParam {

    RU("ru"),
    EN("en"),
    UA("ua");

    private final String value;

    AdsGetSuggestionsLang(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
