package com.vk.api.sdk.objects.friends;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.Objects;

/**
 * UserXtrLists object
 */
public class UserXtrLists extends UserFull {
    /**
     * IDs of friend lists with user
     */
    @SerializedName("lists")
    private String lists;

    public String getLists() {
        return lists;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lists);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserXtrLists userXtrLists = (UserXtrLists) o;
        return Objects.equals(lists, userXtrLists.lists);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrLists{");
        sb.append("lists='").append(lists).append("'");
        sb.append('}');
        return sb.toString();
    }
}
