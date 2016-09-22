package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsGetFilter implements EnumParam {

    ADMIN("admin"),
    EDITOR("editor"),
    MODER("moder"),
    GROUPS("groups"),
    PUBLICS("publics"),
    EVENTS("events");

    private final String value;

    GroupsGetFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
