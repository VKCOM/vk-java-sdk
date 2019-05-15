package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Community age limits. Possible values: *'1' — no limits,, *'2' — 16+,, *'3' — 18+.
 */
public enum GroupsAgeLimits implements EnumParam {
    @SerializedName("1")
    _1(1),

    @SerializedName("2")
    _2(2),

    @SerializedName("3")
    _3(3);

    private final Integer value;

    GroupsAgeLimits(Integer value) {
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
