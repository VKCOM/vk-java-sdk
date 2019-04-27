package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
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

    @SerializedName("role")
    private MemberRoleStatus role;

    public Integer getId() {
        return id;
    }

    public MemberRole setId(Integer id) {
        this.id = id;
        return this;
    }

    public MemberRoleStatus getRole() {
        return role;
    }

    public MemberRole setRole(MemberRoleStatus role) {
        this.role = role;
        return this;
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
        return Objects.equals(role, memberRole.role) &&
                Objects.equals(id, memberRole.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MemberRole{");
        sb.append("role=").append(role);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
