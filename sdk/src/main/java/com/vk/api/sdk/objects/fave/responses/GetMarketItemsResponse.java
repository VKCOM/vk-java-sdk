package com.vk.api.sdk.objects.fave.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.market.MarketItem;

import java.util.List;
import java.util.Objects;

/**
 * GetMarketItemsResponse object
 */
public class GetMarketItemsResponse {
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
        GetMarketItemsResponse getMarketItemsResponse = (GetMarketItemsResponse) o;
        return Objects.equals(count, getMarketItemsResponse.count) &&
                Objects.equals(items, getMarketItemsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMarketItemsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
