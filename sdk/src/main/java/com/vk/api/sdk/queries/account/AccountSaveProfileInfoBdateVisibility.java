package com.vk.api.sdk.queries.account;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AccountSaveProfileInfoBdateVisibility implements EnumParam {

    SHOW("1"),
    SHOW_ONLY_MONTH_AND_DATE("2"),
    HIDE("0");

    private final String value;

    AccountSaveProfileInfoBdateVisibility(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
