package com.vk.api.sdk.objects.market.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.market.Order;
import java.util.List;
import java.util.Objects;

/**
 * GetOrdersResponse object
 */
public class GetOrdersResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Order> items;

    public Integer getCount() {
        return count;
    }

    public GetOrdersResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Order> getItems() {
        return items;
    }

    public GetOrdersResponse setItems(List<Order> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOrdersResponse getOrdersResponse = (GetOrdersResponse) o;
        return Objects.equals(count, getOrdersResponse.count) &&
                Objects.equals(items, getOrdersResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetOrdersResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
