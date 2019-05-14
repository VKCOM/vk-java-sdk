package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort order. Possible values: *'0' — default sorting (similar the full version of the site),, *'1' — by growth speed,, *'2'— by the "day attendance/members number" ratio,, *'3' — by the "Likes number/members number" ratio,, *'4' — by the "comments number/members number" ratio,, *'5' — by the "boards entries number/members number" ratio.
 */
public enum GroupsSort implements EnumParam {
    @SerializedName("0")
    DEFAULT(0),

    @SerializedName("1")
    GROWTH(1),

    @SerializedName("2")
    ATTENDANCE(2),

    @SerializedName("3")
    LIKES(3),

    @SerializedName("4")
    COMMENTS(4),

    @SerializedName("5")
    ENTRIES(5);

    private final Integer value;

    GroupsSort(Integer value) {
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
