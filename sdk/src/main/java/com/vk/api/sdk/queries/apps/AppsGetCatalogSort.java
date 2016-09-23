package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AppsGetCatalogSort implements EnumParam {

    VISITORS("visitors"),
    CREATE_DATE("create_date"),
    GROWTH_RATE("growth_rate"),
    POPULAR_WEEK("popular_week"),

    /**
     * Default
     */
    POPULAR_TODAY("popular_today");

    private final String value;

    AppsGetCatalogSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
