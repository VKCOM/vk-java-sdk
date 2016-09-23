package com.vk.api.sdk.queries.account;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AccountLookupContactsService implements EnumParam {

    EMAIL("email"),
    PHONE("phone"),
    TWITTER("twitter"),
    FACEBOOK("facebook"),
    OK("odnoklassniki"),
    INSGTAGRAM("instagram"),
    GOOGLE("google");

    private final String value;

    AccountLookupContactsService(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
