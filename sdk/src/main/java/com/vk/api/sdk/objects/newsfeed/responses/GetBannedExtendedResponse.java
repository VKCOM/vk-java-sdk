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

    @SerializedName("profiles")
    private List<GroupFull> profiles;

    public List<UserFull> getGroups() {
        return groups;
    }

    public GetBannedExtendedResponse setGroups(List<UserFull> groups) {
        this.groups = groups;
        return this;
    }

    public List<GroupFull> getProfiles() {
        return profiles;
    }

    public GetBannedExtendedResponse setProfiles(List<GroupFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, groups);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBannedExtendedResponse getBannedExtendedResponse = (GetBannedExtendedResponse) o;
        return Objects.equals(profiles, getBannedExtendedResponse.profiles) &&
                Objects.equals(groups, getBannedExtendedResponse.groups);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetBannedExtendedResponse{");
        sb.append("profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
