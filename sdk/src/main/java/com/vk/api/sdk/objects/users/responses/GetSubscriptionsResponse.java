package com.vk.api.sdk.objects.users.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupsArray;
import com.vk.api.sdk.objects.users.UsersArray;

import java.util.Objects;

/**
 * GetSubscriptionsResponse object
 */
public class GetSubscriptionsResponse {
    @SerializedName("users")
    private UsersArray users;

    @SerializedName("groups")
    private GroupsArray groups;

    public UsersArray getUsers() {
        return users;
    }

    public GroupsArray getGroups() {
        return groups;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups, users);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSubscriptionsResponse getSubscriptionsResponse = (GetSubscriptionsResponse) o;
        return Objects.equals(users, getSubscriptionsResponse.users) &&
                Objects.equals(groups, getSubscriptionsResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetSubscriptionsResponse{");
        sb.append("users=").append(users);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
