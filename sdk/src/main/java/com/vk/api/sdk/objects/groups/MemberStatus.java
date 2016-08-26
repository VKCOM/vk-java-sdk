package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * MemberStatus object
 */
public class MemberStatus {
    /**
     * Information whether user is a member of the group
     */
    @SerializedName("member")
    private BoolInt member;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public boolean isMember() {
        return member == BoolInt.YES;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(member, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberStatus memberStatus = (MemberStatus) o;
        return Objects.equals(member, memberStatus.member) &&
                Objects.equals(userId, memberStatus.userId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MemberStatus{");
        sb.append("member=").append(member);
        sb.append(", userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}
