package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * User relationship status. Possible values: , * '1' – single,, * '2' – in a relationship,, * '3' – engaged,, * '4' – married,, * '5' – it's complicated,, * '6' – actively searching,, * '7' – in love,, * '0' – not specified.
 */
public enum AccountRelation implements EnumParam {
    @SerializedName("1")
    SINGLE(1),

    @SerializedName("2")
    RELATIONSHIP(2),

    @SerializedName("3")
    ENGAGED(3),

    @SerializedName("4")
    MARRIED(4),

    @SerializedName("5")
    COMPLICATED(5),

    @SerializedName("6")
    ACTIVELY_SEARCHING(6),

    @SerializedName("7")
    IN_LOVE(7),

    @SerializedName("0")
    NOT_SPECIFIED(0);

    private final Integer value;

    AccountRelation(Integer value) {
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
