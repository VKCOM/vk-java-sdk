package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Likes;
import com.vk.api.sdk.objects.base.ObjectCount;
import com.vk.api.sdk.objects.base.PropertyExists;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * PhotoFullXtrRealOffset object
 */
public class PhotoFullXtrRealOffset implements Validable {
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

    @SerializedName("can_comment")
    private BoolInt canComment;

    @SerializedName("comments")
    private ObjectCount comments;

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

    @SerializedName("likes")
    private Likes likes;

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

    @SerializedName("reposts")
    private ObjectCount reposts;

    @SerializedName("sizes")
    private List<PhotoSizes> sizes;

    @SerializedName("tags")
    private ObjectCount tags;

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

    public PhotoFullXtrRealOffset setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public PhotoFullXtrRealOffset setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public BoolInt getCanComment() {
        return canComment;
    }

    public ObjectCount getComments() {
        return comments;
    }

    public PhotoFullXtrRealOffset setComments(ObjectCount comments) {
        this.comments = comments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public PhotoFullXtrRealOffset setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public PhotoFullXtrRealOffset setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public boolean isHidden() {
        return hidden == PropertyExists.PROPERTY_EXISTS;
    }

    public Integer getId() {
        return id;
    }

    public PhotoFullXtrRealOffset setId(Integer id) {
        this.id = id;
        return this;
    }

    public Float getLat() {
        return lat;
    }

    public PhotoFullXtrRealOffset setLat(Float lat) {
        this.lat = lat;
        return this;
    }

    public Likes getLikes() {
        return likes;
    }

    public PhotoFullXtrRealOffset setLikes(Likes likes) {
        this.likes = likes;
        return this;
    }

    public Float getLng() {
        return lng;
    }

    public PhotoFullXtrRealOffset setLng(Float lng) {
        this.lng = lng;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public PhotoFullXtrRealOffset setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URI getPhoto1280() {
        return photo1280;
    }

    public PhotoFullXtrRealOffset setPhoto1280(URI photo1280) {
        this.photo1280 = photo1280;
        return this;
    }

    public URI getPhoto130() {
        return photo130;
    }

    public PhotoFullXtrRealOffset setPhoto130(URI photo130) {
        this.photo130 = photo130;
        return this;
    }

    public URI getPhoto2560() {
        return photo2560;
    }

    public PhotoFullXtrRealOffset setPhoto2560(URI photo2560) {
        this.photo2560 = photo2560;
        return this;
    }

    public URI getPhoto604() {
        return photo604;
    }

    public PhotoFullXtrRealOffset setPhoto604(URI photo604) {
        this.photo604 = photo604;
        return this;
    }

    public URI getPhoto75() {
        return photo75;
    }

    public PhotoFullXtrRealOffset setPhoto75(URI photo75) {
        this.photo75 = photo75;
        return this;
    }

    public URI getPhoto807() {
        return photo807;
    }

    public PhotoFullXtrRealOffset setPhoto807(URI photo807) {
        this.photo807 = photo807;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public PhotoFullXtrRealOffset setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    public PhotoFullXtrRealOffset setRealOffset(Integer realOffset) {
        this.realOffset = realOffset;
        return this;
    }

    public ObjectCount getReposts() {
        return reposts;
    }

    public PhotoFullXtrRealOffset setReposts(ObjectCount reposts) {
        this.reposts = reposts;
        return this;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    public PhotoFullXtrRealOffset setSizes(List<PhotoSizes> sizes) {
        this.sizes = sizes;
        return this;
    }

    public ObjectCount getTags() {
        return tags;
    }

    public PhotoFullXtrRealOffset setTags(ObjectCount tags) {
        this.tags = tags;
        return this;
    }

    public String getText() {
        return text;
    }

    public PhotoFullXtrRealOffset setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public PhotoFullXtrRealOffset setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public PhotoFullXtrRealOffset setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, photo604, hidden, photo807, albumId, photo2560, ownerId, realOffset, photo75, sizes, photo130, canComment, id, text, lat, height, likes, comments, lng, photo1280, postId, userId, tags, accessKey, width, reposts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoFullXtrRealOffset photoFullXtrRealOffset = (PhotoFullXtrRealOffset) o;
        return Objects.equals(date, photoFullXtrRealOffset.date) &&
                Objects.equals(hidden, photoFullXtrRealOffset.hidden) &&
                Objects.equals(ownerId, photoFullXtrRealOffset.ownerId) &&
                Objects.equals(photo75, photoFullXtrRealOffset.photo75) &&
                Objects.equals(photo2560, photoFullXtrRealOffset.photo2560) &&
                Objects.equals(photo807, photoFullXtrRealOffset.photo807) &&
                Objects.equals(lng, photoFullXtrRealOffset.lng) &&
                Objects.equals(canComment, photoFullXtrRealOffset.canComment) &&
                Objects.equals(sizes, photoFullXtrRealOffset.sizes) &&
                Objects.equals(photo604, photoFullXtrRealOffset.photo604) &&
                Objects.equals(photo1280, photoFullXtrRealOffset.photo1280) &&
                Objects.equals(id, photoFullXtrRealOffset.id) &&
                Objects.equals(text, photoFullXtrRealOffset.text) &&
                Objects.equals(lat, photoFullXtrRealOffset.lat) &&
                Objects.equals(height, photoFullXtrRealOffset.height) &&
                Objects.equals(likes, photoFullXtrRealOffset.likes) &&
                Objects.equals(comments, photoFullXtrRealOffset.comments) &&
                Objects.equals(tags, photoFullXtrRealOffset.tags) &&
                Objects.equals(realOffset, photoFullXtrRealOffset.realOffset) &&
                Objects.equals(postId, photoFullXtrRealOffset.postId) &&
                Objects.equals(userId, photoFullXtrRealOffset.userId) &&
                Objects.equals(accessKey, photoFullXtrRealOffset.accessKey) &&
                Objects.equals(width, photoFullXtrRealOffset.width) &&
                Objects.equals(photo130, photoFullXtrRealOffset.photo130) &&
                Objects.equals(albumId, photoFullXtrRealOffset.albumId) &&
                Objects.equals(reposts, photoFullXtrRealOffset.reposts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoFullXtrRealOffset{");
        sb.append("date=").append(date);
        sb.append(", hidden=").append(hidden);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", photo75=").append(photo75);
        sb.append(", photo2560=").append(photo2560);
        sb.append(", photo807=").append(photo807);
        sb.append(", lng=").append(lng);
        sb.append(", canComment=").append(canComment);
        sb.append(", sizes=").append(sizes);
        sb.append(", photo604=").append(photo604);
        sb.append(", photo1280=").append(photo1280);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", lat=").append(lat);
        sb.append(", height=").append(height);
        sb.append(", likes=").append(likes);
        sb.append(", comments=").append(comments);
        sb.append(", tags=").append(tags);
        sb.append(", realOffset=").append(realOffset);
        sb.append(", postId=").append(postId);
        sb.append(", userId=").append(userId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", width=").append(width);
        sb.append(", photo130=").append(photo130);
        sb.append(", albumId=").append(albumId);
        sb.append(", reposts=").append(reposts);
        sb.append('}');
        return sb.toString();
    }
}
