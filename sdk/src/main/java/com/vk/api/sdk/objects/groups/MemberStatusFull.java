package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * MemberStatusFull object
 */
public class MemberStatusFull implements Validable {
    /**
     * Information whether user has been invited to the group
     */
    @SerializedName("invitation")
    private BoolInt invitation;

    /**
     * Information whether user is a member of the group
     */
    @SerializedName("member")
    @Required
    private BoolInt member;

    /**
     * Information whether user has send request to the group
     */
    @SerializedName("request")
    private BoolInt request;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public boolean isInvitation() {
        return invitation == BoolInt.YES;
    }

    public BoolInt getInvitation() {
        return invitation;
    }

    public boolean isMember() {
        return member == BoolInt.YES;
    }

    public BoolInt getMember() {
        return member;
    }

    public boolean isRequest() {
        return request == BoolInt.YES;
    }

    public BoolInt getRequest() {
        return request;
    }

    public Integer getUserId() {
        return userId;
    }

    public MemberStatusFull setUserId(Integer userId) {
        this.userId = userId;
        return this;
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
        return Objects.equals(request, memberStatusFull.request) &&
                Objects.equals(userId, memberStatusFull.userId) &&
                Objects.equals(invitation, memberStatusFull.invitation) &&
                Objects.equals(member, memberStatusFull.member);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MemberStatusFull{");
        sb.append("request=").append(request);
        sb.append(", userId=").append(userId);
        sb.append(", invitation=").append(invitation);
        sb.append(", member=").append(member);
        sb.append('}');
        return sb.toString();
    }
}
