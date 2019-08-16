package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum UserRelation implements EnumParam {
    @SerializedName("0")
    NOT_SPECIFIED(0),

    @SerializedName("1")
    SINGLE(1),

    @SerializedName("2")
    IN_A_RELATIONSHIP(2),

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

    @SerializedName("8")
    IN_A_CIVIL_UNION(8);

    private final Integer value;

    UserRelation(Integer value) {
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
