package com.vk.api.sdk.queries.likes;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum LikesGetListFilter implements EnumParam {

    LIKES("likes"),
    COPIES("copies");

    private final String value;

    LikesGetListFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
