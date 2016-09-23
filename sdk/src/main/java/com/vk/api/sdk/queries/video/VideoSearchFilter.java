package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum VideoSearchFilter implements EnumParam {

    YOUTUBE("youtube"),
    VIMEO("vimeo"),
    SHORT_VIDEOS("short"),
    LONG_VIDEOS("long");

    private final String value;

    VideoSearchFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
