package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Status of information about timetable */
public enum AddressWorkInfoStatus implements EnumParam {
    @SerializedName("no_information")
    NO_INFORMATION("no_information"),

    @SerializedName("temporarily_closed")
    TEMPORARILY_CLOSED("temporarily_closed"),

    @SerializedName("always_opened")
    ALWAYS_OPENED("always_opened"),

    @SerializedName("timetable")
    TIMETABLE("timetable"),

    @SerializedName("forever_closed")
    FOREVER_CLOSED("forever_closed");

    private final String value;

    AddressWorkInfoStatus(String value) {
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
