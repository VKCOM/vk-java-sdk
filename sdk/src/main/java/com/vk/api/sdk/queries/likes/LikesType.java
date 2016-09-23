package com.vk.api.sdk.queries.likes;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum LikesType implements EnumParam {

    POST("post"),
    COMMENT("comment"),
    PHOTO("photo"),
    AUDIO("audio"),
    VIDEO("video"),
    NOTE("note"),
    MARKET("market"),
    PHOTO_COMMENT("photo_comment"),
    VIDEO_COMMENT("video_comment"),
    TOPIC_COMMENT("topic_comment"),
    MARKET_COMMENT("market_comment"),
    SITEPAGE("sitepage");

    private final String value;

    LikesType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
