package com.vk.api.sdk.objects.video.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.PropertyExists;
import com.vk.api.sdk.objects.video.VideoImage;
import java.util.List;
import java.util.Objects;

/**
 * GetAlbumByIdResponse object
 */
public class GetAlbumByIdResponse implements Validable {
    /**
     * Total number of videos in album
     */
    @SerializedName("count")
    @Required
    private Integer count;

    /**
     * Album ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Album cover image in different sizes
     */
    @SerializedName("image")
    private List<VideoImage> image;

    /**
     * Need blur album thumb or not
     */
    @SerializedName("image_blur")
    private PropertyExists imageBlur;

    /**
     * Information whether album is system
     */
    @SerializedName("is_system")
    private PropertyExists isSystem;

    /**
     * Album owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Album title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Date when the album has been updated last time in Unixtime
     */
    @SerializedName("updated_time")
    private Integer updatedTime;

    public Integer getCount() {
        return count;
    }

    public GetAlbumByIdResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetAlbumByIdResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public List<VideoImage> getImage() {
        return image;
    }

    public GetAlbumByIdResponse setImage(List<VideoImage> image) {
        this.image = image;
        return this;
    }

    public boolean isImageBlur() {
        return imageBlur == PropertyExists.PROPERTY_EXISTS;
    }

    public boolean isSystem() {
        return isSystem == PropertyExists.PROPERTY_EXISTS;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public GetAlbumByIdResponse setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetAlbumByIdResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public GetAlbumByIdResponse setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSystem, image, updatedTime, imageBlur, count, id, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAlbumByIdResponse getAlbumByIdResponse = (GetAlbumByIdResponse) o;
        return Objects.equals(image, getAlbumByIdResponse.image) &&
                Objects.equals(isSystem, getAlbumByIdResponse.isSystem) &&
                Objects.equals(updatedTime, getAlbumByIdResponse.updatedTime) &&
                Objects.equals(imageBlur, getAlbumByIdResponse.imageBlur) &&
                Objects.equals(ownerId, getAlbumByIdResponse.ownerId) &&
                Objects.equals(count, getAlbumByIdResponse.count) &&
                Objects.equals(id, getAlbumByIdResponse.id) &&
                Objects.equals(title, getAlbumByIdResponse.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAlbumByIdResponse{");
        sb.append("image=").append(image);
        sb.append(", isSystem=").append(isSystem);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", imageBlur=").append(imageBlur);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", count=").append(count);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
