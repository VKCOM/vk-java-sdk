package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.photos.Photo;
import java.util.Objects;

/**
 * MarketAlbum object
 */
public class MarketAlbum implements Validable {
    /**
     * Market album ID
     */
    @SerializedName("id")
    @Required
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
    @Required
    private String title;

    /**
     * Items number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("photo")
    private Photo photo;

    /**
     * Date when album has been updated last time in Unixtime
     */
    @SerializedName("updated_time")
    private Integer updatedTime;

    public Integer getId() {
        return id;
    }

    public MarketAlbum setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public MarketAlbum setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MarketAlbum setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public MarketAlbum setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public MarketAlbum setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public MarketAlbum setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
        return this;
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
        return Objects.equals(updatedTime, marketAlbum.updatedTime) &&
                Objects.equals(ownerId, marketAlbum.ownerId) &&
                Objects.equals(count, marketAlbum.count) &&
                Objects.equals(photo, marketAlbum.photo) &&
                Objects.equals(id, marketAlbum.id) &&
                Objects.equals(title, marketAlbum.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketAlbum{");
        sb.append("updatedTime=").append(updatedTime);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", count=").append(count);
        sb.append(", photo=").append(photo);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
