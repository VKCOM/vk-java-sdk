package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum VideoGetCatalogFilter implements EnumParam {

    FEED("feed"),
    UGC("ugc"),
    TOP("top"),
    SERIES("series"),
    OTHER("other");

    private final String value;

    VideoGetCatalogFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
