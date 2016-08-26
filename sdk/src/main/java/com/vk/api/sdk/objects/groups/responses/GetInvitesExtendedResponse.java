package com.vk.api.sdk.objects.groups.responses;

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

    public List<GroupXtrInvitedBy> getItems() {
        return items;
    }

    public List<UserMin> getProfiles() {
        return profiles;
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
                Objects.equals(items, getInvitesExtendedResponse.items) &&
                Objects.equals(profiles, getInvitesExtendedResponse.profiles);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetInvitesExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append('}');
        return sb.toString();
    }
}
