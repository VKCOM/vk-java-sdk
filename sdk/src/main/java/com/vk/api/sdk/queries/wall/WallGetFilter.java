package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum WallGetFilter implements EnumParam {
    /**
     * posts by the wall owner
     */
    OWNER("owner"),

    /**
     * posts by someone else
     */
    OTHERS("others"),

    /**
     * posts by the wall owner and others (default)
     */
    ALL("all"),

    /**
     *  timed posts (only available for calls with an "access_token")
     */
    POSTPONED("postponed"),

    /**
     * suggested posts on a community wall
     */
    SUGGESTS("suggests");


    private final String value;

    WallGetFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
