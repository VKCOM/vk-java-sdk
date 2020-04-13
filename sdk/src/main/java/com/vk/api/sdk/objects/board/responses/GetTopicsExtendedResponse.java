package com.vk.api.sdk.objects.board.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.board.DefaultOrder;
import com.vk.api.sdk.objects.board.Topic;
import com.vk.api.sdk.objects.users.UserMin;
import java.util.List;
import java.util.Objects;

/**
 * GetTopicsExtendedResponse object
 */
public class GetTopicsExtendedResponse implements Validable {
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

    @SerializedName("profiles")
    @Required
    private List<UserMin> profiles;

    public Integer getCount() {
        return count;
    }

    public GetTopicsExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Topic> getItems() {
        return items;
    }

    public GetTopicsExtendedResponse setItems(List<Topic> items) {
        this.items = items;
        return this;
    }

    public DefaultOrder getDefaultOrder() {
        return defaultOrder;
    }

    public GetTopicsExtendedResponse setDefaultOrder(DefaultOrder defaultOrder) {
        this.defaultOrder = defaultOrder;
        return this;
    }

    public boolean canAddTopics() {
        return canAddTopics == BoolInt.YESBOOL;
    }

    public BoolInt getCanAddTopics() {
        return canAddTopics;
    }

    public List<UserMin> getProfiles() {
        return profiles;
    }

    public GetTopicsExtendedResponse setProfiles(List<UserMin> profiles) {
        this.profiles = profiles;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canAddTopics, defaultOrder, count, profiles, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTopicsExtendedResponse getTopicsExtendedResponse = (GetTopicsExtendedResponse) o;
        return Objects.equals(canAddTopics, getTopicsExtendedResponse.canAddTopics) &&
                Objects.equals(count, getTopicsExtendedResponse.count) &&
                Objects.equals(profiles, getTopicsExtendedResponse.profiles) &&
                Objects.equals(items, getTopicsExtendedResponse.items) &&
                Objects.equals(defaultOrder, getTopicsExtendedResponse.defaultOrder);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetTopicsExtendedResponse{");
        sb.append("canAddTopics=").append(canAddTopics);
        sb.append(", count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", items=").append(items);
        sb.append(", defaultOrder=").append(defaultOrder);
        sb.append('}');
        return sb.toString();
    }
}
