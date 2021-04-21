package com.vk.api.sdk.objects.market.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.market.MarketItem;
import com.vk.api.sdk.objects.market.ServicesViewType;
import java.util.List;
import java.util.Objects;

/**
 * SearchResponse object
 */
public class SearchResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("view_type")
    private ServicesViewType viewType;

    @SerializedName("items")
    @Required
    private List<MarketItem> items;

    public Integer getCount() {
        return count;
    }

    public SearchResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public ServicesViewType getViewType() {
        return viewType;
    }

    public SearchResponse setViewType(ServicesViewType viewType) {
        this.viewType = viewType;
        return this;
    }

    public List<MarketItem> getItems() {
        return items;
    }

    public SearchResponse setItems(List<MarketItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, viewType, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResponse searchResponse = (SearchResponse) o;
        return Objects.equals(count, searchResponse.count) &&
                Objects.equals(viewType, searchResponse.viewType) &&
                Objects.equals(items, searchResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SearchResponse{");
        sb.append("count=").append(count);
        sb.append(", viewType=").append(viewType);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
