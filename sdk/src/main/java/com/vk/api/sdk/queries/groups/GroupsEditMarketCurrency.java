package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsEditMarketCurrency implements EnumParam {

    /**
     * Russian rubles;
     */
    RUSSIAN_RUBLES("643"),

    /**
     * Ukrainian hryvnia;
     */
    UKRAINIAN_HRYVNIA("980"),

    /**
     * Kazakh tenge;
     */
    KAZAKH_TENGE("398"),

    /**
     * Euro;
     */
    EURO("978"),

    /**
     * US dollars
     */
    US_DOLLARS("840");


    private final String value;

    GroupsEditMarketCurrency(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
