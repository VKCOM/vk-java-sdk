package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum NewsfeedItemType implements EnumParam {

    WALL("wall"),
    TAG("tag"),
    PROFILE_INFO("profilephoto"),
    VIDEO("video"),
    PHOTO("photo"),
    AUDIO("audio");

    private final String value;

    NewsfeedItemType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
