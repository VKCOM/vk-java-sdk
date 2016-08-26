package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * GetBannedResponse object
 */
public class GetBannedResponse {
    @SerializedName("groups")
    private List<Integer> groups;

    @SerializedName("members")
    private List<Integer> members;

    public List<Integer> getGroups() {
        return groups;
    }

    public List<Integer> getMembers() {
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
        GetBannedResponse getBannedResponse = (GetBannedResponse) o;
        return Objects.equals(groups, getBannedResponse.groups) &&
                Objects.equals(members, getBannedResponse.members);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetBannedResponse{");
        sb.append("groups=").append(groups);
        sb.append(", members=").append(members);
        sb.append('}');
        return sb.toString();
    }
}
