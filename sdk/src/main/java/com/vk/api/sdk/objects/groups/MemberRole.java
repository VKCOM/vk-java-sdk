package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * MemberRole object
 */
public class MemberRole {
    /**
     * User ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * User's credentials as community admin
     */
    @SerializedName("role")
    private MemberRoleRole role;

    public Integer getId() {
        return id;
    }

    public MemberRoleRole getRole() {
        return role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberRole memberRole = (MemberRole) o;
        return Objects.equals(id, memberRole.id) &&
                Objects.equals(role, memberRole.role);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MemberRole{");
        sb.append("id=").append(id);
        sb.append(", role='").append(role).append("'");
        sb.append('}');
        return sb.toString();
    }
}
