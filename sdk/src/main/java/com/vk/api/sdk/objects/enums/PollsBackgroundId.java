package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum PollsBackgroundId implements EnumParam {
    @SerializedName("0")
    _0("0"),

    @SerializedName("1")
    _1("1"),

    @SerializedName("2")
    _2("2"),

    @SerializedName("3")
    _3("3"),

    @SerializedName("4")
    _4("4"),

    @SerializedName("6")
    _6("6"),

    @SerializedName("8")
    _8("8"),

    @SerializedName("9")
    _9("9");

    private final String value;

    PollsBackgroundId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
