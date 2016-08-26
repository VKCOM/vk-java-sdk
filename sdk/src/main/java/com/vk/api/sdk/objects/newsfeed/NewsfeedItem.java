package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * NewsfeedItem object
 */
public class NewsfeedItem {
    /**
     * Item type
     */
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

    public Integer getSourceId() {
        return sourceId;
    }

    public Integer getDate() {
        return date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, date, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsfeedItem newsfeedItem = (NewsfeedItem) o;
        return Objects.equals(type, newsfeedItem.type) &&
                Objects.equals(sourceId, newsfeedItem.sourceId) &&
                Objects.equals(date, newsfeedItem.date);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NewsfeedItem{");
        sb.append("type='").append(type).append("'");
        sb.append(", sourceId=").append(sourceId);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
