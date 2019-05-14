package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Level of current user's credentials as manager
 */
public enum GroupXtrInvitedByAdminLevel implements EnumParam {
    @SerializedName("1")
    MODERATOR(1),

    @SerializedName("2")
    EDITOR(2),

    @SerializedName("3")
    ADMINISTRATOR(3);

    private final Integer value;

    GroupXtrInvitedByAdminLevel(Integer value) {
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
