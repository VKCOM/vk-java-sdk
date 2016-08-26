package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.friends.RequestsXtrMessage;

import java.util.List;
import java.util.Objects;

/**
 * GetRequestsExtendedResponse object
 */
public class GetRequestsExtendedResponse {
    /**
     * Total requests number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<RequestsXtrMessage> items;

    public Integer getCount() {
        return count;
    }

    public List<RequestsXtrMessage> getItems() {
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
        GetRequestsExtendedResponse getRequestsExtendedResponse = (GetRequestsExtendedResponse) o;
        return Objects.equals(count, getRequestsExtendedResponse.count) &&
                Objects.equals(items, getRequestsExtendedResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRequestsExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
