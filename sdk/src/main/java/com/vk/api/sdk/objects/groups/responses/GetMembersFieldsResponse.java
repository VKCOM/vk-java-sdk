package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.UserXtrRole;

import java.util.List;
import java.util.Objects;

/**
 * GetMembersFieldsResponse object
 */
public class GetMembersFieldsResponse {
    /**
     * Total members number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<UserXtrRole> items;

    public Integer getCount() {
        return count;
    }

    public List<UserXtrRole> getItems() {
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
        GetMembersFieldsResponse getMembersFieldsResponse = (GetMembersFieldsResponse) o;
        return Objects.equals(count, getMembersFieldsResponse.count) &&
                Objects.equals(items, getMembersFieldsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMembersFieldsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
