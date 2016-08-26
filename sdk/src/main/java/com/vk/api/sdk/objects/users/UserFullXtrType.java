package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * UserFullXtrType object
 */
public class UserFullXtrType extends UserFull {
    /**
     * Object type
     */
    @SerializedName("type")
    private UserFullXtrTypeType type;

    public UserFullXtrTypeType getType() {
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
        UserFullXtrType userFullXtrType = (UserFullXtrType) o;
        return Objects.equals(type, userFullXtrType.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserFullXtrType{");
        sb.append("type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
