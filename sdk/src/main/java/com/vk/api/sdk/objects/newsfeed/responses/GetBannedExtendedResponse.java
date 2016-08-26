package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetBannedExtendedResponse object
 */
public class GetBannedExtendedResponse {
    @SerializedName("groups")
    private List<UserFull> groups;

    @SerializedName("members")
    private List<GroupFull> members;

    public List<UserFull> getGroups() {
        return groups;
    }

    public List<GroupFull> getMembers() {
        return members;
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, groups);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBannedExtendedResponse getBannedExtendedResponse = (GetBannedExtendedResponse) o;
        return Objects.equals(groups, getBannedExtendedResponse.groups) &&
                Objects.equals(members, getBannedExtendedResponse.members);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetBannedExtendedResponse{");
        sb.append("groups=").append(groups);
        sb.append(", members=").append(members);
        sb.append('}');
        return sb.toString();
    }
}
