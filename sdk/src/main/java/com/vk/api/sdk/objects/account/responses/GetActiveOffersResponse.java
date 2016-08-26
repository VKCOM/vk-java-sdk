package com.vk.api.sdk.objects.account.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.account.Offer;

import java.util.List;
import java.util.Objects;

/**
 * GetActiveOffersResponse object
 */
public class GetActiveOffersResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Offer> items;

    public Integer getCount() {
        return count;
    }

    public List<Offer> getItems() {
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
        GetActiveOffersResponse getActiveOffersResponse = (GetActiveOffersResponse) o;
        return Objects.equals(count, getActiveOffersResponse.count) &&
                Objects.equals(items, getActiveOffersResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetActiveOffersResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
