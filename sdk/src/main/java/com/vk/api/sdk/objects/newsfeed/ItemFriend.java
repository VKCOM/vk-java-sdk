package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ItemFriend object
 */
public class ItemFriend extends ItemBase implements Validable {
    @SerializedName("friends")
    private ItemFriendFriends friends;

    public ItemFriendFriends getFriends() {
        return friends;
    }

    public ItemFriend setFriends(ItemFriendFriends friends) {
        this.friends = friends;
        return this;
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
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemFriend{");
        sb.append("friends=").append(friends);
        sb.append('}');
        return sb.toString();
    }
}
