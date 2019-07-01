package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * GetBannedExtendedResponse object
 */
public class GetBannedExtendedResponse implements Validable {
    @SerializedName("groups")
    private List<UserFull> groups;

    @SerializedName("members")
    private List<GroupFull> members;

    public List<UserFull> getGroups() {
        return groups;
    }

    public GetBannedExtendedResponse setGroups(List<UserFull> groups) {
        this.groups = groups;
        return this;
    }

    public List<GroupFull> getMembers() {
        return members;
    }

    public GetBannedExtendedResponse setMembers(List<GroupFull> members) {
        this.members = members;
        return this;
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
        return Objects.equals(members, getBannedExtendedResponse.members) &&
                Objects.equals(groups, getBannedExtendedResponse.groups);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetBannedExtendedResponse{");
        sb.append("members=").append(members);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
