package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.Objects;

/**
 * MarketAlbum object
 */
public class MarketAlbum {
    /**
     * Market album ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Market album owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Market album title
     */
    @SerializedName("title")
    private String title;

    /**
     * Items number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Date when album has been updated last time in Unixtime
     */
    @SerializedName("updated_time")
    private Integer updatedTime;

    @SerializedName("photo")
    private Photo photo;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public Photo getPhoto() {
        return photo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatedTime, count, photo, id, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketAlbum marketAlbum = (MarketAlbum) o;
        return Objects.equals(id, marketAlbum.id) &&
                Objects.equals(ownerId, marketAlbum.ownerId) &&
                Objects.equals(title, marketAlbum.title) &&
                Objects.equals(count, marketAlbum.count) &&
                Objects.equals(updatedTime, marketAlbum.updatedTime) &&
                Objects.equals(photo, marketAlbum.photo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketAlbum{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", count=").append(count);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", photo=").append(photo);
        sb.append('}');
        return sb.toString();
    }
}
