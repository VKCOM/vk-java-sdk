package com.vk.api.sdk.objects.places.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.places.Checkin;

import java.util.List;
import java.util.Objects;

/**
 * GetCheckinsResponse object
 */
public class GetCheckinsResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Checkin> items;

    public Integer getCount() {
        return count;
    }

    public List<Checkin> getItems() {
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
        GetCheckinsResponse getCheckinsResponse = (GetCheckinsResponse) o;
        return Objects.equals(count, getCheckinsResponse.count) &&
                Objects.equals(items, getCheckinsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCheckinsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
