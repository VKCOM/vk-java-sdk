package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupXtrInvitedBy;
import com.vk.api.sdk.objects.users.UserMin;
import java.util.List;
import java.util.Objects;

/**
 * GetInvitesExtendedResponse object
 */
public class GetInvitesExtendedResponse {
    /**
     * Total communities number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<GroupXtrInvitedBy> items;

    @SerializedName("profiles")
    private List<UserMin> profiles;

    public Integer getCount() {
        return count;
    }

    public GetInvitesExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<GroupXtrInvitedBy> getItems() {
        return items;
    }

    public GetInvitesExtendedResponse setItems(List<GroupXtrInvitedBy> items) {
        this.items = items;
        return this;
    }

    public List<UserMin> getProfiles() {
        return profiles;
    }

    public GetInvitesExtendedResponse setProfiles(List<UserMin> profiles) {
        this.profiles = profiles;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, profiles, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetInvitesExtendedResponse getInvitesExtendedResponse = (GetInvitesExtendedResponse) o;
        return Objects.equals(count, getInvitesExtendedResponse.count) &&
                Objects.equals(profiles, getInvitesExtendedResponse.profiles) &&
                Objects.equals(items, getInvitesExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetInvitesExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
