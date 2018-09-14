package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.List;
import java.util.Objects;

public class GetBannedResponse {

    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Integer> items;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    @SerializedName("groups")
    private List<GroupFull> groups;

    public Integer getCount() {
        return count;
    }

    public List<Integer> getItems() {
        return items;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBannedResponse that = (GetBannedResponse) o;
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
        final StringBuilder sb = new StringBuilder("GetBannedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
