package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsEditManagerRole implements EnumParam {

    MODERATOR("moderator"),
    EDITOR("editor"),
    ADMINISTRATOR("administrator");

    private final String value;

    GroupsEditManagerRole(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
