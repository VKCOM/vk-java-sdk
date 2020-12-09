package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.stories.Story;
import java.util.List;
import java.util.Objects;

/**
 * SaveResponse object
 */
public class SaveResponse implements Validable {
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Story> items;

    public Integer getCount() {
        return count;
    }

    public SaveResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Story> getItems() {
        return items;
    }

    public SaveResponse setItems(List<Story> items) {
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
        SaveResponse saveResponse = (SaveResponse) o;
        return Objects.equals(count, saveResponse.count) &&
                Objects.equals(items, saveResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SaveResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
