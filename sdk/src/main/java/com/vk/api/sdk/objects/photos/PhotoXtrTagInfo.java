package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * PhotoXtrTagInfo object
 */
public class PhotoXtrTagInfo implements Validable {
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
     * ID of the tag creator
     */
    @SerializedName("placer_id")
    private Integer placerId;

    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("sizes")
    private List<PhotoSizes> sizes;

    /**
     * Date when tag has been added in Unixtime
     */
    @SerializedName("tag_created")
    private Integer tagCreated;

    /**
     * Tag ID
     */
    @SerializedName("tag_id")
    private Integer tagId;

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

    public PhotoXtrTagInfo setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public PhotoXtrTagInfo setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public PhotoXtrTagInfo setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public PhotoXtrTagInfo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public PhotoXtrTagInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    public Float getLat() {
        return lat;
    }

    public PhotoXtrTagInfo setLat(Float lat) {
        this.lat = lat;
        return this;
    }

    public Float getLng() {
        return lng;
    }

    public PhotoXtrTagInfo setLng(Float lng) {
        this.lng = lng;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public PhotoXtrTagInfo setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URI getPhoto1280() {
        return photo1280;
    }

    public PhotoXtrTagInfo setPhoto1280(URI photo1280) {
        this.photo1280 = photo1280;
        return this;
    }

    public URI getPhoto130() {
        return photo130;
    }

    public PhotoXtrTagInfo setPhoto130(URI photo130) {
        this.photo130 = photo130;
        return this;
    }

    public URI getPhoto2560() {
        return photo2560;
    }

    public PhotoXtrTagInfo setPhoto2560(URI photo2560) {
        this.photo2560 = photo2560;
        return this;
    }

    public URI getPhoto604() {
        return photo604;
    }

    public PhotoXtrTagInfo setPhoto604(URI photo604) {
        this.photo604 = photo604;
        return this;
    }

    public URI getPhoto75() {
        return photo75;
    }

    public PhotoXtrTagInfo setPhoto75(URI photo75) {
        this.photo75 = photo75;
        return this;
    }

    public URI getPhoto807() {
        return photo807;
    }

    public PhotoXtrTagInfo setPhoto807(URI photo807) {
        this.photo807 = photo807;
        return this;
    }

    public Integer getPlacerId() {
        return placerId;
    }

    public PhotoXtrTagInfo setPlacerId(Integer placerId) {
        this.placerId = placerId;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public PhotoXtrTagInfo setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    public PhotoXtrTagInfo setSizes(List<PhotoSizes> sizes) {
        this.sizes = sizes;
        return this;
    }

    public Integer getTagCreated() {
        return tagCreated;
    }

    public PhotoXtrTagInfo setTagCreated(Integer tagCreated) {
        this.tagCreated = tagCreated;
        return this;
    }

    public Integer getTagId() {
        return tagId;
    }

    public PhotoXtrTagInfo setTagId(Integer tagId) {
        this.tagId = tagId;
        return this;
    }

    public String getText() {
        return text;
    }

    public PhotoXtrTagInfo setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public PhotoXtrTagInfo setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public PhotoXtrTagInfo setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, photo604, lng, tagId, photo807, photo1280, albumId, photo2560, placerId, postId, ownerId, userId, photo75, sizes, accessKey, photo130, width, tagCreated, id, text, lat, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoXtrTagInfo photoXtrTagInfo = (PhotoXtrTagInfo) o;
        return Objects.equals(date, photoXtrTagInfo.date) &&
                Objects.equals(ownerId, photoXtrTagInfo.ownerId) &&
                Objects.equals(photo75, photoXtrTagInfo.photo75) &&
                Objects.equals(photo2560, photoXtrTagInfo.photo2560) &&
                Objects.equals(photo807, photoXtrTagInfo.photo807) &&
                Objects.equals(lng, photoXtrTagInfo.lng) &&
                Objects.equals(placerId, photoXtrTagInfo.placerId) &&
                Objects.equals(postId, photoXtrTagInfo.postId) &&
                Objects.equals(sizes, photoXtrTagInfo.sizes) &&
                Objects.equals(photo604, photoXtrTagInfo.photo604) &&
                Objects.equals(userId, photoXtrTagInfo.userId) &&
                Objects.equals(accessKey, photoXtrTagInfo.accessKey) &&
                Objects.equals(tagCreated, photoXtrTagInfo.tagCreated) &&
                Objects.equals(width, photoXtrTagInfo.width) &&
                Objects.equals(photo1280, photoXtrTagInfo.photo1280) &&
                Objects.equals(photo130, photoXtrTagInfo.photo130) &&
                Objects.equals(tagId, photoXtrTagInfo.tagId) &&
                Objects.equals(albumId, photoXtrTagInfo.albumId) &&
                Objects.equals(id, photoXtrTagInfo.id) &&
                Objects.equals(text, photoXtrTagInfo.text) &&
                Objects.equals(lat, photoXtrTagInfo.lat) &&
                Objects.equals(height, photoXtrTagInfo.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoXtrTagInfo{");
        sb.append("date=").append(date);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", photo75=").append(photo75);
        sb.append(", photo2560=").append(photo2560);
        sb.append(", photo807=").append(photo807);
        sb.append(", lng=").append(lng);
        sb.append(", placerId=").append(placerId);
        sb.append(", postId=").append(postId);
        sb.append(", sizes=").append(sizes);
        sb.append(", photo604=").append(photo604);
        sb.append(", userId=").append(userId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", tagCreated=").append(tagCreated);
        sb.append(", width=").append(width);
        sb.append(", photo1280=").append(photo1280);
        sb.append(", photo130=").append(photo130);
        sb.append(", tagId=").append(tagId);
        sb.append(", albumId=").append(albumId);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", lat=").append(lat);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
