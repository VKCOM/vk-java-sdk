package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.PropertyExists;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * PhotoXtrRealOffset object
 */
public class PhotoXtrRealOffset implements Validable {
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
     * Returns if the photo is hidden above the wall
     */
    @SerializedName("hidden")
    private PropertyExists hidden;

    /**
     * Photo ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

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
     * URL of image with 1280 px width
     */
    @SerializedName("photo_1280")
    private URI photo1280;

    /**
     * URL of image with 130 px width
     */
    @SerializedName("photo_130")
    private URI photo130;

    /**
     * URL of image with 2560 px width
     */
    @SerializedName("photo_2560")
    private URI photo2560;

    /**
     * URL of image with 604 px width
     */
    @SerializedName("photo_604")
    private URI photo604;

    /**
     * URL of image with 75 px width
     */
    @SerializedName("photo_75")
    private URI photo75;

    /**
     * URL of image with 807 px width
     */
    @SerializedName("photo_807")
    private URI photo807;

    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    /**
     * Real position of the photo
     */
    @SerializedName("real_offset")
    private Integer realOffset;

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

    public PhotoXtrRealOffset setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public PhotoXtrRealOffset setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public PhotoXtrRealOffset setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public PhotoXtrRealOffset setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public boolean isHidden() {
        return hidden == PropertyExists.PROPERTY_EXISTS;
    }

    public Integer getId() {
        return id;
    }

    public PhotoXtrRealOffset setId(Integer id) {
        this.id = id;
        return this;
    }

    public Float getLat() {
        return lat;
    }

    public PhotoXtrRealOffset setLat(Float lat) {
        this.lat = lat;
        return this;
    }

    public Float getLng() {
        return lng;
    }

    public PhotoXtrRealOffset setLng(Float lng) {
        this.lng = lng;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public PhotoXtrRealOffset setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URI getPhoto1280() {
        return photo1280;
    }

    public PhotoXtrRealOffset setPhoto1280(URI photo1280) {
        this.photo1280 = photo1280;
        return this;
    }

    public URI getPhoto130() {
        return photo130;
    }

    public PhotoXtrRealOffset setPhoto130(URI photo130) {
        this.photo130 = photo130;
        return this;
    }

    public URI getPhoto2560() {
        return photo2560;
    }

    public PhotoXtrRealOffset setPhoto2560(URI photo2560) {
        this.photo2560 = photo2560;
        return this;
    }

    public URI getPhoto604() {
        return photo604;
    }

    public PhotoXtrRealOffset setPhoto604(URI photo604) {
        this.photo604 = photo604;
        return this;
    }

    public URI getPhoto75() {
        return photo75;
    }

    public PhotoXtrRealOffset setPhoto75(URI photo75) {
        this.photo75 = photo75;
        return this;
    }

    public URI getPhoto807() {
        return photo807;
    }

    public PhotoXtrRealOffset setPhoto807(URI photo807) {
        this.photo807 = photo807;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public PhotoXtrRealOffset setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    public PhotoXtrRealOffset setRealOffset(Integer realOffset) {
        this.realOffset = realOffset;
        return this;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    public PhotoXtrRealOffset setSizes(List<PhotoSizes> sizes) {
        this.sizes = sizes;
        return this;
    }

    public String getText() {
        return text;
    }

    public PhotoXtrRealOffset setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public PhotoXtrRealOffset setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public PhotoXtrRealOffset setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, photo604, hidden, lng, photo807, photo1280, albumId, photo2560, postId, ownerId, userId, realOffset, photo75, sizes, accessKey, photo130, width, id, text, lat, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoXtrRealOffset photoXtrRealOffset = (PhotoXtrRealOffset) o;
        return Objects.equals(date, photoXtrRealOffset.date) &&
                Objects.equals(hidden, photoXtrRealOffset.hidden) &&
                Objects.equals(ownerId, photoXtrRealOffset.ownerId) &&
                Objects.equals(photo75, photoXtrRealOffset.photo75) &&
                Objects.equals(photo2560, photoXtrRealOffset.photo2560) &&
                Objects.equals(photo807, photoXtrRealOffset.photo807) &&
                Objects.equals(lng, photoXtrRealOffset.lng) &&
                Objects.equals(realOffset, photoXtrRealOffset.realOffset) &&
                Objects.equals(postId, photoXtrRealOffset.postId) &&
                Objects.equals(sizes, photoXtrRealOffset.sizes) &&
                Objects.equals(photo604, photoXtrRealOffset.photo604) &&
                Objects.equals(userId, photoXtrRealOffset.userId) &&
                Objects.equals(accessKey, photoXtrRealOffset.accessKey) &&
                Objects.equals(width, photoXtrRealOffset.width) &&
                Objects.equals(photo1280, photoXtrRealOffset.photo1280) &&
                Objects.equals(photo130, photoXtrRealOffset.photo130) &&
                Objects.equals(albumId, photoXtrRealOffset.albumId) &&
                Objects.equals(id, photoXtrRealOffset.id) &&
                Objects.equals(text, photoXtrRealOffset.text) &&
                Objects.equals(lat, photoXtrRealOffset.lat) &&
                Objects.equals(height, photoXtrRealOffset.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoXtrRealOffset{");
        sb.append("date=").append(date);
        sb.append(", hidden=").append(hidden);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", photo75=").append(photo75);
        sb.append(", photo2560=").append(photo2560);
        sb.append(", photo807=").append(photo807);
        sb.append(", lng=").append(lng);
        sb.append(", realOffset=").append(realOffset);
        sb.append(", postId=").append(postId);
        sb.append(", sizes=").append(sizes);
        sb.append(", photo604=").append(photo604);
        sb.append(", userId=").append(userId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", width=").append(width);
        sb.append(", photo1280=").append(photo1280);
        sb.append(", photo130=").append(photo130);
        sb.append(", albumId=").append(albumId);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", lat=").append(lat);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
