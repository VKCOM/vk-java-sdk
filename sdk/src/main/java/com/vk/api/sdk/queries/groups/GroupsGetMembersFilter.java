package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsGetMembersFilter implements EnumParam {

    FRIENDS("friends"),
    UNSURE("unsure"),
    MANAGERS("managers");

    private final String value;

    GroupsGetMembersFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
