package com.vk.api.sdk.objects.notifications.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.notifications.Notification;
import com.vk.api.sdk.objects.users.User;

import java.util.List;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Notification> items;

    @SerializedName("profiles")
    private List<User> profiles;

    @SerializedName("groups")
    private List<Group> groups;

    /**
     * Time when user has been checked notifications last time
     */
    @SerializedName("last_viewed")
    private Integer lastViewed;

    public Integer getCount() {
        return count;
    }

    public List<Notification> getItems() {
        return items;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public Integer getLastViewed() {
        return lastViewed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastViewed, count, profiles, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(count, getResponse.count) &&
                Objects.equals(items, getResponse.items) &&
                Objects.equals(profiles, getResponse.profiles) &&
                Objects.equals(groups, getResponse.groups) &&
                Objects.equals(lastViewed, getResponse.lastViewed);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", lastViewed=").append(lastViewed);
        sb.append('}');
        return sb.toString();
    }
}
