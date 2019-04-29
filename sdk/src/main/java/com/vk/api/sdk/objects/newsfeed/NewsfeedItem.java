package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * NewsfeedItem object
 */
public class NewsfeedItem {
    @SerializedName("type")
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
    private Integer date;

    public NewsfeedItemType getType() {
        return type;
    }

    public NewsfeedItem setType(NewsfeedItemType type) {
        this.type = type;
        return this;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public NewsfeedItem setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public NewsfeedItem setDate(Integer date) {
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
        NewsfeedItem newsfeedItem = (NewsfeedItem) o;
        return Objects.equals(date, newsfeedItem.date) &&
                Objects.equals(sourceId, newsfeedItem.sourceId) &&
                Objects.equals(type, newsfeedItem.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("NewsfeedItem{");
        sb.append("date=").append(date);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
