package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsGetFilter implements EnumParam {

    /**
     * to return communities administered by the user
     */
    ADMIN("admin"),

    /**
     * to return communities where the user is an administrator or editor
     */
    EDITOR("editor"),

    /**
     * to return communities where the user is an administrator, editor, or moderator
     */
    MODER("moder"),

    /**
     * to return only groups
     */
    GROUPS("groups"),

    /**
     * to return only public pages
     */
    PUBLICS("publics"),

    /**
     * to return only events
     */
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
