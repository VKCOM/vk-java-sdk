package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BaseUserId;

import java.util.List;
import java.util.Objects;

/**
 * ItemFriend object
 */
public class ItemFriend {

    @SerializedName("friends")
    private List<BaseUserId> friends;

    public List<BaseUserId> getFriends() {
        return friends;
    }

    @Override
    public int hashCode() {
        return Objects.hash(friends);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemFriend itemFriend = (ItemFriend) o;
        return Objects.equals(friends, itemFriend.friends);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemFriend{");
        sb.append("friends=").append(friends);
        sb.append('}');
        return sb.toString();
    }
}
