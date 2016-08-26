package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * Users object
 */
public class Users {
    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("accesses")
    private List<Accesses> accesses;

    public Integer getUserId() {
        return userId;
    }

    public List<Accesses> getAccesses() {
        return accesses;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, accesses);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(userId, users.userId) &&
                Objects.equals(accesses, users.accesses);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Users{");
        sb.append("userId=").append(userId);
        sb.append(", accesses=").append(accesses);
        sb.append('}');
        return sb.toString();
    }
}
