package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * Photo object
 */
public class Photo implements Validable {
    /**
     * Access key for the photo
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Album ID
     */
    @SerializedName("album_id")
    private Integer albumId;

    /**
     * Date when uploaded
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Original photo height
     */
    @SerializedName("height")
    private Integer height;

    /**
     * Photo ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("images")
    private List<Image> images;

    /**
     * Latitude
     */
    @SerializedName("lat")
    private Float lat;

    /**
     * Longitude
     */
    @SerializedName("long")
    private Float lng;

    /**
     * Photo owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("sizes")
    private List<PhotoSizes> sizes;

    /**
     * Photo caption
     */
    @SerializedName("text")
    private String text;

    /**
     * ID of the user who have uploaded the photo
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Original photo width
     */
    @SerializedName("width")
    private Integer width;

    public String getAccessKey() {
        return accessKey;
    }

    public Photo setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public Photo setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Photo setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Photo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Photo setId(Integer id) {
        this.id = id;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public Photo setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    public Float getLat() {
        return lat;
    }

    public Photo setLat(Float lat) {
        this.lat = lat;
        return this;
    }

    public Float getLng() {
        return lng;
    }

    public Photo setLng(Float lng) {
        this.lng = lng;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Photo setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public Photo setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    public Photo setSizes(List<PhotoSizes> sizes) {
        this.sizes = sizes;
        return this;
    }

    public String getText() {
        return text;
    }

    public Photo setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Photo setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Photo setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, images, lng, albumId, postId, ownerId, userId, sizes, accessKey, width, id, text, lat, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Objects.equals(date, photo.date) &&
                Objects.equals(images, photo.images) &&
                Objects.equals(ownerId, photo.ownerId) &&
                Objects.equals(lng, photo.lng) &&
                Objects.equals(postId, photo.postId) &&
                Objects.equals(sizes, photo.sizes) &&
                Objects.equals(userId, photo.userId) &&
                Objects.equals(accessKey, photo.accessKey) &&
                Objects.equals(width, photo.width) &&
                Objects.equals(albumId, photo.albumId) &&
                Objects.equals(id, photo.id) &&
                Objects.equals(text, photo.text) &&
                Objects.equals(lat, photo.lat) &&
                Objects.equals(height, photo.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Photo{");
        sb.append("date=").append(date);
        sb.append(", images=").append(images);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", lng=").append(lng);
        sb.append(", postId=").append(postId);
        sb.append(", sizes=").append(sizes);
        sb.append(", userId=").append(userId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", width=").append(width);
        sb.append(", albumId=").append(albumId);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", lat=").append(lat);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
