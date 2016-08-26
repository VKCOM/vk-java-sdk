package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupXtrInvitedBy;

import java.util.List;
import java.util.Objects;

/**
 * GetInvitesResponse object
 */
public class GetInvitesResponse {
    /**
     * Total communities number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<GroupXtrInvitedBy> items;

    public Integer getCount() {
        return count;
    }

    public List<GroupXtrInvitedBy> getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetInvitesResponse getInvitesResponse = (GetInvitesResponse) o;
        return Objects.equals(count, getInvitesResponse.count) &&
                Objects.equals(items, getInvitesResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetInvitesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
