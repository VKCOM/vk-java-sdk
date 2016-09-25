package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AppsGetCatalogFilter implements EnumParam {

    INSTALLED("installed"),
    FEATURED("featured");

    private final String value;

    AppsGetCatalogFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
