package com.vk.api.sdk.objects.market.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.market.MarketItem;

import java.util.List;
import java.util.Objects;

/**
 * GetByIdResponse object
 */
public class GetByIdResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<MarketItem> items;

    public Integer getCount() {
        return count;
    }

    public List<MarketItem> getItems() {
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
        GetByIdResponse getByIdResponse = (GetByIdResponse) o;
        return Objects.equals(count, getByIdResponse.count) &&
                Objects.equals(items, getByIdResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetByIdResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
