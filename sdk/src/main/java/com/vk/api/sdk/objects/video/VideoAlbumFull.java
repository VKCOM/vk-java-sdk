package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.net.URL;
import java.util.List;
import java.util.Objects;

/**
 * VideoAlbumFull object
 */
public class VideoAlbumFull {
    /**
     * Total number of videos in album
     */
    @SerializedName("count")
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
     * Information whether album is system
     */
    @SerializedName("is_system")
    private Integer isSystem;

    /**
     * Album owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * URL of the preview image with 160px in width
     */
    @SerializedName("photo_160")
    private URL photo160;

    /**
     * URL of the preview image with 320px in width
     */
    @SerializedName("photo_320")
    private URL photo320;

    /**
     * Album title
     */
    @SerializedName("title")
    private String title;

    /**
     * Date when the album has been updated last time in Unixtime
     */
    @SerializedName("updated_time")
    private Integer updatedTime;

    public Integer getCount() {
        return count;
    }

    public VideoAlbumFull setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public VideoAlbumFull setId(Integer id) {
        this.id = id;
        return this;
    }

    public List<VideoImage> getImage() {
        return image;
    }

    public VideoAlbumFull setImage(List<VideoImage> image) {
        this.image = image;
        return this;
    }

    public Integer getIsSystem() {
        return isSystem;
    }

    public VideoAlbumFull setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public VideoAlbumFull setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URL getPhoto160() {
        return photo160;
    }

    public VideoAlbumFull setPhoto160(URL photo160) {
        this.photo160 = photo160;
        return this;
    }

    public URL getPhoto320() {
        return photo320;
    }

    public VideoAlbumFull setPhoto320(URL photo320) {
        this.photo320 = photo320;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public VideoAlbumFull setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public VideoAlbumFull setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSystem, image, updatedTime, photo160, photo320, count, id, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoAlbumFull videoAlbumFull = (VideoAlbumFull) o;
        return Objects.equals(image, videoAlbumFull.image) &&
                Objects.equals(isSystem, videoAlbumFull.isSystem) &&
                Objects.equals(updatedTime, videoAlbumFull.updatedTime) &&
                Objects.equals(ownerId, videoAlbumFull.ownerId) &&
                Objects.equals(photo160, videoAlbumFull.photo160) &&
                Objects.equals(count, videoAlbumFull.count) &&
                Objects.equals(id, videoAlbumFull.id) &&
                Objects.equals(photo320, videoAlbumFull.photo320) &&
                Objects.equals(title, videoAlbumFull.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoAlbumFull{");
        sb.append("image=").append(image);
        sb.append(", isSystem=").append(isSystem);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", photo160=").append(photo160);
        sb.append(", count=").append(count);
        sb.append(", id=").append(id);
        sb.append(", photo320=").append(photo320);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
