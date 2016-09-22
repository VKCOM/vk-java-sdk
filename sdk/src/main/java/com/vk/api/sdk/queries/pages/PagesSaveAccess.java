package com.vk.api.sdk.queries.pages;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum PagesSaveAccess implements EnumParam {

    ONLY_COMMUNITY_MEMBERS("1"),
    ALL_USERS("2"),
    ONLY_COMMUNITY_MANAGERS("2");

    private final String value;

    PagesSaveAccess(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
