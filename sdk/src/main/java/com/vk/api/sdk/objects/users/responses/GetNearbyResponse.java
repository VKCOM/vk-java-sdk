package com.vk.api.sdk.objects.users.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetNearbyResponse object
 */
public class GetNearbyResponse {
    /**
     * Users number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<UserFull> items;

    public Integer getCount() {
        return count;
    }

    public List<UserFull> getItems() {
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
        GetNearbyResponse getNearbyResponse = (GetNearbyResponse) o;
        return Objects.equals(count, getNearbyResponse.count) &&
                Objects.equals(items, getNearbyResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetNearbyResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
