package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.users.UserXtrType;

import java.util.Objects;

/**
 * UserXtrInvitedBy object
 */
public class UserXtrInvitedBy extends UserXtrType {
    /**
     * ID of the inviter
     */
    @SerializedName("invited_by")
    private Integer invitedBy;

    public Integer getInvitedBy() {
        return invitedBy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), invitedBy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserXtrInvitedBy userXtrInvitedBy = (UserXtrInvitedBy) o;
        return Objects.equals(invitedBy, userXtrInvitedBy.invitedBy);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrInvitedBy{");
        sb.append("invitedBy=").append(invitedBy);
        sb.append('}');
        return sb.toString();
    }
}
