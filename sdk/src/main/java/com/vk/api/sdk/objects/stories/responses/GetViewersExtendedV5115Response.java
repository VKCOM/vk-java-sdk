package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.stories.ViewersItem;
import java.util.List;
import java.util.Objects;

/**
 * GetViewersExtendedV5115Response object
 */
public class GetViewersExtendedV5115Response implements Validable {
    /**
     * Viewers count
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<ViewersItem> items;

    @SerializedName("hidden_reason")
    private String hiddenReason;

    public Integer getCount() {
        return count;
    }

    public GetViewersExtendedV5115Response setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<ViewersItem> getItems() {
        return items;
    }

    public GetViewersExtendedV5115Response setItems(List<ViewersItem> items) {
        this.items = items;
        return this;
    }

    public String getHiddenReason() {
        return hiddenReason;
    }

    public GetViewersExtendedV5115Response setHiddenReason(String hiddenReason) {
        this.hiddenReason = hiddenReason;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, hiddenReason, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetViewersExtendedV5115Response getViewersExtendedV5115Response = (GetViewersExtendedV5115Response) o;
        return Objects.equals(count, getViewersExtendedV5115Response.count) &&
                Objects.equals(items, getViewersExtendedV5115Response.items) &&
                Objects.equals(hiddenReason, getViewersExtendedV5115Response.hiddenReason);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetViewersExtendedV5115Response{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", hiddenReason='").append(hiddenReason).append("'");
        sb.append('}');
        return sb.toString();
    }
}
