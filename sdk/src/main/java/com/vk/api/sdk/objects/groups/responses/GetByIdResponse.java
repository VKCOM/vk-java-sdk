package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.groups.ProfileItem;
import java.util.List;
import java.util.Objects;

/**
 * GetByIdResponse object
 */
public class GetByIdResponse implements Validable {
    @SerializedName("groups")
    private List<GroupFull> groups;

    @SerializedName("profiles")
    private List<ProfileItem> profiles;

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetByIdResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    public List<ProfileItem> getProfiles() {
        return profiles;
    }

    public GetByIdResponse setProfiles(List<ProfileItem> profiles) {
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
        GetByIdResponse getByIdResponse = (GetByIdResponse) o;
        return Objects.equals(profiles, getByIdResponse.profiles) &&
                Objects.equals(groups, getByIdResponse.groups);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetByIdResponse{");
        sb.append("profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
