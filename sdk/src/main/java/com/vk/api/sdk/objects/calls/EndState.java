package com.vk.api.sdk.objects.calls;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * State in which call ended up
 */
public enum EndState implements EnumParam {
    @SerializedName("canceled_by_initiator")
    CANCELED_BY_INITIATOR("canceled_by_initiator"),

    @SerializedName("canceled_by_receiver")
    CANCELED_BY_RECEIVER("canceled_by_receiver"),

    @SerializedName("reached")
    REACHED("reached");

    private final String value;

    EndState(String value) {
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
