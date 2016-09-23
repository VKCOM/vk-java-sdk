package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AppsGetPlatform implements EnumParam {

    IOS("ios"),
    ANDROID("android"),
    WINPHONE("winphone"),

    /**
     * Default
     */
    WEB("web");

    private final String value;

    AppsGetPlatform(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
