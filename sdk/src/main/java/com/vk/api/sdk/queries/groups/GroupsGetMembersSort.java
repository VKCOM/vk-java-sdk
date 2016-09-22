package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsGetMembersSort implements EnumParam {

    ID_ASC("id_asc"),
    ID_DESC("id_desc"),
    TIME_ASC("time_asc"),
    TIME_DESC("time_desc");

    private final String value;

    GroupsGetMembersSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
