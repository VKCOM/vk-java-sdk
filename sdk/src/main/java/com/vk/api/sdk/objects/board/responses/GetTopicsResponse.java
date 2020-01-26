package com.vk.api.sdk.objects.board.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.board.DefaultOrder;
import com.vk.api.sdk.objects.board.Topic;
import java.util.List;
import java.util.Objects;

/**
 * GetTopicsResponse object
 */
public class GetTopicsResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Topic> items;

    @SerializedName("default_order")
    private DefaultOrder defaultOrder;

    /**
     * Information whether current user can add topic
     */
    @SerializedName("can_add_topics")
    private BoolInt canAddTopics;

    public Integer getCount() {
        return count;
    }

    public GetTopicsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Topic> getItems() {
        return items;
    }

    public GetTopicsResponse setItems(List<Topic> items) {
        this.items = items;
        return this;
    }

    public DefaultOrder getDefaultOrder() {
        return defaultOrder;
    }

    public GetTopicsResponse setDefaultOrder(DefaultOrder defaultOrder) {
        this.defaultOrder = defaultOrder;
        return this;
    }

    public boolean canAddTopics() {
        return canAddTopics == BoolInt.YESBOOL;
    }

    public BoolInt getCanAddTopics() {
        return canAddTopics;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canAddTopics, defaultOrder, count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) o;
        return Objects.equals(canAddTopics, getTopicsResponse.canAddTopics) &&
                Objects.equals(count, getTopicsResponse.count) &&
                Objects.equals(items, getTopicsResponse.items) &&
                Objects.equals(defaultOrder, getTopicsResponse.defaultOrder);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetTopicsResponse{");
        sb.append("canAddTopics=").append(canAddTopics);
        sb.append(", count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", defaultOrder=").append(defaultOrder);
        sb.append('}');
        return sb.toString();
    }
}
