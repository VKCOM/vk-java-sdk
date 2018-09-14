package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.stories.Story;
import com.vk.api.sdk.objects.users.User;

import java.util.List;
import java.util.Objects;

public class GetRepliesResponse {

    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<List<Story>> items;

    @SerializedName("profiles")
    private List<User> profiles;

    @SerializedName("groups")
    private List<Group> groups;

    public Integer getCount() {
        return count;
    }

    public List<List<Story>> getItems() {
        return items;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRepliesResponse that = (GetRepliesResponse) o;
        return Objects.equals(count, that.count) &&
            Objects.equals(items, that.items) &&
            Objects.equals(profiles, that.profiles) &&
            Objects.equals(groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items, profiles, groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRepliesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
