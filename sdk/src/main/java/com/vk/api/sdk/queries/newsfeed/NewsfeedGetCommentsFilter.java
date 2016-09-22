package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum NewsfeedGetCommentsFilter implements EnumParam {

    POST("post"),
    PHOTO("photo"),
    VIDEO("video"),
    TOPIC("topic"),
    MARKET("market"),
    NOTE("note");

    private final String value;

    NewsfeedGetCommentsFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
