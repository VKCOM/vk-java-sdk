package com.vk.api.sdk.queries.oauth;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by tsivarev on 16.08.16.
 */
public enum OAuthUserScope implements EnumParam {

    NOTIFY("notify"),
    FRIENDS("friends"),
    PHOTOS("photos"),
    AUDIO("audio"),
    VIDEO("video"),
    DOCS("docs"),
    NOTES("notes"),
    PAGES("pages"),
    STATUS("status"),
    WALL("wall"),
    GROUPS("groups"),
    MESSAGES("messages"),
    EMAIL("email"),
    NOTIFICATIONS("notifications"),
    STATS("stats"),
    ADS("ads"),
    OFFLINE("offline"),
    MARKET("market");

    private String value;

    OAuthUserScope(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
