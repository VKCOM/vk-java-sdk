package com.vk.api.sdk.objects.friends;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * UserXtrLists object
 */
public class UserXtrLists extends UserFull {
    /**
     * IDs of friend lists with user
     */
    @SerializedName("lists")
    private List<Integer> lists;

    public List<Integer> getLists() {
        return lists;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lists);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserXtrLists userXtrLists = (UserXtrLists) o;
        return Objects.equals(lists, userXtrLists.lists);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrLists{");
        sb.append("lists=").append(lists);
        sb.append('}');
        return sb.toString();
    }
}
