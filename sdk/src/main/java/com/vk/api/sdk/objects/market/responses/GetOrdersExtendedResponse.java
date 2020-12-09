package com.vk.api.sdk.objects.market.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.market.Order;
import java.util.List;
import java.util.Objects;

/**
 * GetOrdersExtendedResponse object
 */
public class GetOrdersExtendedResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Order> items;

    @SerializedName("groups")
    private List<GroupFull> groups;

    public Integer getCount() {
        return count;
    }

    public GetOrdersExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Order> getItems() {
        return items;
    }

    public GetOrdersExtendedResponse setItems(List<Order> items) {
        this.items = items;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetOrdersExtendedResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOrdersExtendedResponse getOrdersExtendedResponse = (GetOrdersExtendedResponse) o;
        return Objects.equals(count, getOrdersExtendedResponse.count) &&
                Objects.equals(groups, getOrdersExtendedResponse.groups) &&
                Objects.equals(items, getOrdersExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetOrdersExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", groups=").append(groups);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
