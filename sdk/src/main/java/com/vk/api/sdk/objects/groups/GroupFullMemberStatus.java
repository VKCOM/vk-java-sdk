package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

/**
 * Current user's member status
 */
public enum GroupFullMemberStatus {
    @SerializedName("0")
    NOT_A_MEMBER(0),

    @SerializedName("1")
    MEMBER(1),

    @SerializedName("2")
    NOT_SURE(2),

    @SerializedName("3")
    DECLINED(3),

    @SerializedName("4")
    HAS_SENT_A_REQUEST(4),

    @SerializedName("5")
    INVITED(5);

    private final Integer value;

    GroupFullMemberStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
