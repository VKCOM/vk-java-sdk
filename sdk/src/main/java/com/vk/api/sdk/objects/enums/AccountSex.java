package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * User sex. Possible values: , * '1' – female,, * '2' – male.
 */
public enum AccountSex implements EnumParam {
    @SerializedName("0")
    UNDEFINED(0),

    @SerializedName("1")
    FEMALE(1),

    @SerializedName("2")
    MALE(2);

    private final Integer value;

    AccountSex(Integer value) {
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
