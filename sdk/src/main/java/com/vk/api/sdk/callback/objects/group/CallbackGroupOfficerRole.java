package com.vk.api.sdk.callback.objects.group;

import com.google.gson.annotations.SerializedName;

/**
 * Level of user credentials as manager
 */
public enum CallbackGroupOfficerRole {
    @SerializedName("0")
    NONE(0),

    @SerializedName("1")
    MODERATOR(1),

    @SerializedName("2")
    EDITOR(2),

    @SerializedName("3")
    ADMINISTRATOR(3);

    private final Integer value;

    CallbackGroupOfficerRole(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
