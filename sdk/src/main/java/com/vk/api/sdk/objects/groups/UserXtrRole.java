package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.Objects;

/**
 * UserXtrRole object
 */
public class UserXtrRole extends UserFull {
    @SerializedName("role")
    private RoleOptions role;

    public RoleOptions getRole() {
        return role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserXtrRole userXtrRole = (UserXtrRole) o;
        return Objects.equals(role, userXtrRole.role);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrRole{");
        sb.append("role=").append(role);
        sb.append('}');
        return sb.toString();
    }
}
