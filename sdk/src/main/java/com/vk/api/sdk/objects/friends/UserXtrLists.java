package com.vk.api.sdk.objects.friends;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * UserXtrLists object
 */
public class UserXtrLists extends UserFull implements Validable {
    @SerializedName("lists")
    private List<Integer> lists;

    public List<Integer> getLists() {
        return lists;
    }

    public UserXtrLists setLists(List<Integer> lists) {
        this.lists = lists;
        return this;
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
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserXtrLists{");
        sb.append("lists=").append(lists);
        sb.append('}');
        return sb.toString();
    }
}
