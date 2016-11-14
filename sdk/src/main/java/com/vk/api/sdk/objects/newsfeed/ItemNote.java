package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * ItemNote object
 */
public class ItemNote {

    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<NewsfeedNote> items;

    public Integer getCount() {
        return count;
    }

    public List<NewsfeedNote> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemNote itemNote = (ItemNote) o;
        return Objects.equals(count, itemNote.count) &&
                Objects.equals(items, itemNote.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemNote{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
