package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AudioGetBroadcastListFilter implements EnumParam {

    FRIENDS("friends"),
    GROUPS("groups"),

    /**
     * Default
     */
    ALL("all");

    private final String value;

    AudioGetBroadcastListFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
