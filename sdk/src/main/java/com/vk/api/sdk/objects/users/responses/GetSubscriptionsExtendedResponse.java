package com.vk.api.sdk.objects.users.responses;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.oneofs.UsersSubscriptionsItemOneOf;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * GetSubscriptionsExtendedResponse object
 */
public class GetSubscriptionsExtendedResponse implements Validable {
    /**
     * Total number of available results
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<JsonObject> items;

    public Integer getCount() {
        return count;
    }

    public GetSubscriptionsExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<UsersSubscriptionsItemOneOf> getItems() {
        return items.stream().map(UsersSubscriptionsItemOneOf::new).collect(Collectors.toList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSubscriptionsExtendedResponse getSubscriptionsExtendedResponse = (GetSubscriptionsExtendedResponse) o;
        return Objects.equals(count, getSubscriptionsExtendedResponse.count) &&
                Objects.equals(items, getSubscriptionsExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSubscriptionsExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
