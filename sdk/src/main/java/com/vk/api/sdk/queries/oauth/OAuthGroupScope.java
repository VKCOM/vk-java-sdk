package com.vk.api.sdk.queries.oauth;

/**
 * Created by tsivarev on 16.08.16.
 */
public enum OAuthGroupScope {

    PHOTOS("photos"),
    DOCS("docs"),
    MESSAGES("messages"),
    MANAGE("manage");

    private String value;

    OAuthGroupScope(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
