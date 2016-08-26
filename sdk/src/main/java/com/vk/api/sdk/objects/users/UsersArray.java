package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * UsersArray object
 */
public class UsersArray {
    /**
     * Users number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Integer> items;

    public Integer getCount() {
        return count;
    }

    public List<Integer> getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersArray usersArray = (UsersArray) o;
        return Objects.equals(count, usersArray.count) &&
                Objects.equals(items, usersArray.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UsersArray{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
