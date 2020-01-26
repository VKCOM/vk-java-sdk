package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * MemberStatus object
 */
public class MemberStatus implements Validable {
    /**
     * Information whether user is a member of the group
     */
    @SerializedName("member")
    @Required
    private BoolInt member;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public boolean isMember() {
        return member == BoolInt.YESBOOL;
    }

    public BoolInt getMember() {
        return member;
    }

    public Integer getUserId() {
        return userId;
    }

    public MemberStatus setUserId(Integer userId) {
        this.userId = userId;
        return this;
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
        return Objects.equals(userId, memberStatus.userId) &&
                Objects.equals(member, memberStatus.member);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MemberStatus{");
        sb.append("userId=").append(userId);
        sb.append(", member=").append(member);
        sb.append('}');
        return sb.toString();
    }
}
