package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Likes;
import com.vk.api.sdk.objects.base.ObjectCount;
import com.vk.api.sdk.objects.base.RepostsInfo;
import java.util.List;
import java.util.Objects;

/**
 * PhotoFull object
 */
public class PhotoFull implements Validable {
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
     * Information whether current user can comment the photo
     */
    @SerializedName("can_comment")
    private BoolInt canComment;

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

    @SerializedName("likes")
    private Likes likes;

    @SerializedName("reposts")
    private RepostsInfo reposts;

    @SerializedName("comments")
    private ObjectCount comments;

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

    public PhotoFull setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public PhotoFull setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public BoolInt getCanComment() {
        return canComment;
    }

    public Integer getDate() {
        return date;
    }

    public PhotoFull setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public PhotoFull setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public PhotoFull setId(Integer id) {
        this.id = id;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public PhotoFull setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    public Float getLat() {
        return lat;
    }

    public PhotoFull setLat(Float lat) {
        this.lat = lat;
        return this;
    }

    public Likes getLikes() {
        return likes;
    }

    public PhotoFull setLikes(Likes likes) {
        this.likes = likes;
        return this;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public PhotoFull setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
        return this;
    }

    public ObjectCount getComments() {
        return comments;
    }

    public PhotoFull setComments(ObjectCount comments) {
        this.comments = comments;
        return this;
    }

    public Float getLng() {
        return lng;
    }

    public PhotoFull setLng(Float lng) {
        this.lng = lng;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public PhotoFull setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public PhotoFull setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public ObjectCount getTags() {
        return tags;
    }

    public PhotoFull setTags(ObjectCount tags) {
        this.tags = tags;
        return this;
    }

    public String getText() {
        return text;
    }

    public PhotoFull setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public PhotoFull setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public PhotoFull setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, images, comments, lng, albumId, postId, ownerId, userId, tags, accessKey, width, canComment, id, text, lat, reposts, height, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoFull photoFull = (PhotoFull) o;
        return Objects.equals(date, photoFull.date) &&
                Objects.equals(images, photoFull.images) &&
                Objects.equals(comments, photoFull.comments) &&
                Objects.equals(ownerId, photoFull.ownerId) &&
                Objects.equals(lng, photoFull.lng) &&
                Objects.equals(tags, photoFull.tags) &&
                Objects.equals(canComment, photoFull.canComment) &&
                Objects.equals(postId, photoFull.postId) &&
                Objects.equals(userId, photoFull.userId) &&
                Objects.equals(accessKey, photoFull.accessKey) &&
                Objects.equals(width, photoFull.width) &&
                Objects.equals(albumId, photoFull.albumId) &&
                Objects.equals(id, photoFull.id) &&
                Objects.equals(text, photoFull.text) &&
                Objects.equals(lat, photoFull.lat) &&
                Objects.equals(reposts, photoFull.reposts) &&
                Objects.equals(height, photoFull.height) &&
                Objects.equals(likes, photoFull.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoFull{");
        sb.append("date=").append(date);
        sb.append(", images=").append(images);
        sb.append(", comments=").append(comments);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", lng=").append(lng);
        sb.append(", tags=").append(tags);
        sb.append(", canComment=").append(canComment);
        sb.append(", postId=").append(postId);
        sb.append(", userId=").append(userId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", width=").append(width);
        sb.append(", albumId=").append(albumId);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", lat=").append(lat);
        sb.append(", reposts=").append(reposts);
        sb.append(", height=").append(height);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
