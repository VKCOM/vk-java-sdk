package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.users.User;
import com.vk.api.sdk.objects.wall.WallPostFull;

import java.util.List;
import java.util.Objects;

/**
 * GetRepostsResponse object
 */
public class GetRepostsResponse {
    @SerializedName("items")
    private List<WallPostFull> items;

    @SerializedName("profiles")
    private List<User> profiles;

    @SerializedName("groups")
    private List<Group> groups;

    public List<WallPostFull> getItems() {
        return items;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRepostsResponse getRepostsResponse = (GetRepostsResponse) o;
        return Objects.equals(items, getRepostsResponse.items) &&
                Objects.equals(profiles, getRepostsResponse.profiles) &&
                Objects.equals(groups, getRepostsResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRepostsResponse{");
        sb.append("items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
