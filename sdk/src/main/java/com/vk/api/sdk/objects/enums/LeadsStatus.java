package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Action type. Possible values: *'0' — start,, *'1' — finish,, *'2' — blocking users,, *'3' — start in a test mode,, *'4' — finish in a test mode.
 */
public enum LeadsStatus implements EnumParam {
    @SerializedName("0")
    START(0),

    @SerializedName("1")
    FINISH(1),

    @SerializedName("2")
    BLOCKING_USERS(2),

    @SerializedName("3")
    START_IN_TEST_MODE(3),

    @SerializedName("4")
    FINISH_IN_TEST_MODE(4);

    private final Integer value;

    LeadsStatus(Integer value) {
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
