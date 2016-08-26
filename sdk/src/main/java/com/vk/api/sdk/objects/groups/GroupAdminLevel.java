package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

/**
 * Level of current user's credentials as manager
 */
public enum GroupAdminLevel {
    @SerializedName("1")
    MODERATOR(1),

    @SerializedName("2")
    EDITOR(2),

    @SerializedName("3")
    ADMINISTRATOR(3);

    private final Integer value;

    GroupAdminLevel(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
