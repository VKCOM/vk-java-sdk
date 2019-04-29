package com.vk.api.sdk.objects.friends;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * FriendsList object
 */
public class FriendsList {
    /**
     * List ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * List title
     */
    @SerializedName("name")
    private String name;

    public Integer getId() {
        return id;
    }

    public FriendsList setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public FriendsList setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendsList friendsList = (FriendsList) o;
        return Objects.equals(name, friendsList.name) &&
                Objects.equals(id, friendsList.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("FriendsList{");
        sb.append("name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
