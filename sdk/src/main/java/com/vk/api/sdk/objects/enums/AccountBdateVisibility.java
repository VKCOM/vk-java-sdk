package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Birth date visibility. Returned values: , * '1' – show birth date,, * '2' – show only month and day,, * '0' – hide birth date.
 */
public enum AccountBdateVisibility implements EnumParam {
    @SerializedName("1")
    SHOW(1),

    @SerializedName("2")
    HIDE_YEAR(2),

    @SerializedName("0")
    HIDE(0);

    private final Integer value;

    AccountBdateVisibility(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
