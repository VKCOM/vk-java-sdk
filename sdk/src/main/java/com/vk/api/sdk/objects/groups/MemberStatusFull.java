package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * MemberStatusFull object
 */
public class MemberStatusFull {
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

    /**
     * Information whether user has been invited to the group
     */
    @SerializedName("invitation")
    private BoolInt invitation;

    /**
     * Information whether user has send request to the group
     */
    @SerializedName("request")
    private BoolInt request;

    public boolean isMember() {
        return member == BoolInt.YES;
    }

    public Integer getUserId() {
        return userId;
    }

    public boolean isInvitation() {
        return invitation == BoolInt.YES;
    }

    public boolean isRequest() {
        return request == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, invitation, member, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberStatusFull memberStatusFull = (MemberStatusFull) o;
        return Objects.equals(member, memberStatusFull.member) &&
                Objects.equals(userId, memberStatusFull.userId) &&
                Objects.equals(invitation, memberStatusFull.invitation) &&
                Objects.equals(request, memberStatusFull.request);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MemberStatusFull{");
        sb.append("member=").append(member);
        sb.append(", userId=").append(userId);
        sb.append(", invitation=").append(invitation);
        sb.append(", request=").append(request);
        sb.append('}');
        return sb.toString();
    }
}
