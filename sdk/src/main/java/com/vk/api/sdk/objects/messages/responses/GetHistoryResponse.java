package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.messages.Message;
import java.util.List;
import java.util.Objects;

/**
 * GetHistoryResponse object
 */
public class GetHistoryResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Message> items;

    public Integer getCount() {
        return count;
    }

    public GetHistoryResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Message> getItems() {
        return items;
    }

    public GetHistoryResponse setItems(List<Message> items) {
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
        GetHistoryResponse getHistoryResponse = (GetHistoryResponse) o;
        return Objects.equals(count, getHistoryResponse.count) &&
                Objects.equals(items, getHistoryResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetHistoryResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
