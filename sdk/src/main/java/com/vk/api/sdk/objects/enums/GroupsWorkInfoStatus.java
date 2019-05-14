package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GroupsWorkInfoStatus implements EnumParam {
    @SerializedName("always_opened")
    ALWAYS_OPENED("always_opened"),

    @SerializedName("forever_closed")
    FOREVER_CLOSED("forever_closed"),

    @SerializedName("no_information")
    NO_INFORMATION("no_information"),

    @SerializedName("temporarily_closed")
    TEMPORARILY_CLOSED("temporarily_closed"),

    @SerializedName("timetable")
    TIMETABLE("timetable");

    private final String value;

    GroupsWorkInfoStatus(String value) {
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
