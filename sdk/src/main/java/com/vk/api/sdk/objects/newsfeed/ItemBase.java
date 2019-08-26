package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * ItemBase object
 */
public class ItemBase implements Validable {
    @SerializedName("type")
    @Required
    private NewsfeedItemType type;

    /**
     * Item source ID
     */
    @SerializedName("source_id")
    private Integer sourceId;

    /**
     * Date when item has been added in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    public NewsfeedItemType getType() {
        return type;
    }

    public ItemBase setType(NewsfeedItemType type) {
        this.type = type;
        return this;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public ItemBase setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public ItemBase setDate(Integer date) {
        this.date = date;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, sourceId, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemBase itemBase = (ItemBase) o;
        return Objects.equals(date, itemBase.date) &&
                Objects.equals(sourceId, itemBase.sourceId) &&
                Objects.equals(type, itemBase.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemBase{");
        sb.append("date=").append(date);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
