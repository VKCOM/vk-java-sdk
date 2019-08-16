package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Relationship status: '1' — Not married, '2' — In a relationship, '3' — Engaged, '4' — Married, '5' — It's complicated, '6' — Actively searching, '7' — In love */
public enum UsersStatus implements EnumParam {
    @SerializedName("0")
    NOT_SPECIFIED(0),

    @SerializedName("1")
    NOT_MARRIED(1),

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
    IN_LOVE(7);

    private final Integer value;

    UsersStatus(Integer value) {
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
