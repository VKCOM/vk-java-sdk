package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Information about wall status in community
 */
public enum GroupFullWall implements EnumParam {
    @SerializedName("0")
    DISABLED(0),

    @SerializedName("1")
    OPEN(1),

    @SerializedName("2")
    LIMITED(2),

    @SerializedName("3")
    RESTRICTED(3);

    private final Integer value;

    GroupFullWall(Integer value) {
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
