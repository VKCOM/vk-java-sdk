package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum MessagesGetHistoryAttachmentsType implements EnumParam {

    LINK("link"),
    PHOTO("photo"),
    VIDEO("video"),
    AUDIO("audio"),
    MARKET("market"),
    DOC("doc"),
    WALL("wall"),
    SHARE("share");

    private final String value;

    MessagesGetHistoryAttachmentsType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
