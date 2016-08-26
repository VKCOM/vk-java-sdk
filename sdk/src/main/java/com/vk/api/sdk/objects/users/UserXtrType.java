package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * UserXtrType object
 */
public class UserXtrType extends User {
    /**
     * Object type
     */
    @SerializedName("type")
    private UserXtrTypeType type;

    public UserXtrTypeType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserXtrType userXtrType = (UserXtrType) o;
        return Objects.equals(type, userXtrType.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrType{");
        sb.append("type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
