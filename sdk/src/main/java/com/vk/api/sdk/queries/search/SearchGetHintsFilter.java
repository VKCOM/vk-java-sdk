package com.vk.api.sdk.queries.search;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum SearchGetHintsFilter implements EnumParam {

    FRIENDS("friends"),
    IDOLS("idols"),
    PUBLICS("publics"),
    GROUPS("groups"),
    EVENTS("events"),
    CORRESPONDENTS("correspondents"),
    MUTUAL_FRIENDS("mutual_friends");

    private final String value;

    SearchGetHintsFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
