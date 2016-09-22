package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum NewsfeedGetFilter implements EnumParam {

    POST("post"),
    PHOTO("photo"),
    PHOTO_TAG("photo_tag"),
    WALL_PHOTO("wall_photo"),
    FRIEND("friend"),
    VIDEO("video"),
    AUDIO("audio"),
    NOTE("note");

    private final String value;

    NewsfeedGetFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
