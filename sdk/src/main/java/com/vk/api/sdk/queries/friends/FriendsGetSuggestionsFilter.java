package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum FriendsGetSuggestionsFilter implements EnumParam {

    MUTUAL("mutual"),
    CONTACTS("contacts"),
    MUTUAL_CONTACTS("mutual_contacts");

    private final String value;

    FriendsGetSuggestionsFilter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
