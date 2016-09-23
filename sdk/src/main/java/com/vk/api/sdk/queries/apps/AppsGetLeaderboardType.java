package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AppsGetLeaderboardType implements EnumParam {

    LEVEL("level"),
    POINTS("points"),
    SCORE("score");

    private final String value;

    AppsGetLeaderboardType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
