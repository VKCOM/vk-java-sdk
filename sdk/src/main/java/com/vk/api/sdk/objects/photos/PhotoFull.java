package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BaseCount;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Likes;

import java.util.List;
import java.util.Objects;

/**
 * PhotoFull object
 */
public class PhotoFull {
    /**
     * Photo ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Album ID
     */
    @SerializedName("album_id")
    private Integer albumId;

    /**
     * Photo owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * ID of the user who have uploaded the photo
     */
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("sizes")
    private List<PhotoSizes> sizes;

    /**
     * URL of image with 75 px width
     */
    @SerializedName("photo_75")
    private String photo75;

    /**
     * URL of image with 130 px width
     */
    @SerializedName("photo_130")
    private String photo130;

    /**
     * URL of image with 604 px width
     */
    @SerializedName("photo_604")
    private String photo604;

    /**
     * URL of image with 807 px width
     */
    @SerializedName("photo_807")
    private String photo807;

    /**
     * URL of image with 1280 px width
     */
    @SerializedName("photo_1280")
    private String photo1280;

    /**
     * URL of image with 2560 px width
     */
    @SerializedName("photo_2560")
    private String photo2560;

    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    /**
     * Original photo width
     */
    @SerializedName("width")
    private Integer width;

    /**
     * Original photo height
     */
    @SerializedName("height")
    private Integer height;

    /**
     * Photo caption
     */
    @SerializedName("text")
    private String text;

    /**
     * Date when uploaded
     */
    @SerializedName("date")
    private Integer date;

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
     * Access key for the photo
     */
    @SerializedName("access_key")
    private String accessKey;

    @SerializedName("likes")
    private Likes likes;

    @SerializedName("reposts")
    private BaseCount reposts;

    @SerializedName("comments")
    private BaseCount comments;

    /**
     * Information whether current user can comment the photo
     */
    @SerializedName("can_comment")
    private BoolInt canComment;

    @SerializedName("tags")
    private BaseCount tags;

    public Integer getId() {
        return id;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    public String getPhoto75() {
        return photo75;
    }

    public String getPhoto130() {
        return photo130;
    }

    public String getPhoto604() {
        return photo604;
    }

    public String getPhoto807() {
        return photo807;
    }

    public String getPhoto1280() {
        return photo1280;
    }

    public String getPhoto2560() {
        return photo2560;
    }

    public Integer getPostId() {
        return postId;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getText() {
        return text;
    }

    public Integer getDate() {
        return date;
    }

    public Float getLat() {
        return lat;
    }

    public Float getLng() {
        return lng;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public Likes getLikes() {
        return likes;
    }

    public BaseCount getReposts() {
        return reposts;
    }

    public BaseCount getComments() {
        return comments;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public BaseCount getTags() {
        return tags;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, photo604, comments, lng, photo807, photo1280, photo2560, albumId, postId, ownerId, userId, tags, sizes, photo75, accessKey, photo130, width, id, text, canComment, lat, reposts, height, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoFull photoFull = (PhotoFull) o;
        return Objects.equals(id, photoFull.id) &&
                Objects.equals(albumId, photoFull.albumId) &&
                Objects.equals(ownerId, photoFull.ownerId) &&
                Objects.equals(userId, photoFull.userId) &&
                Objects.equals(sizes, photoFull.sizes) &&
                Objects.equals(photo75, photoFull.photo75) &&
                Objects.equals(photo130, photoFull.photo130) &&
                Objects.equals(photo604, photoFull.photo604) &&
                Objects.equals(photo807, photoFull.photo807) &&
                Objects.equals(photo1280, photoFull.photo1280) &&
                Objects.equals(photo2560, photoFull.photo2560) &&
                Objects.equals(postId, photoFull.postId) &&
                Objects.equals(width, photoFull.width) &&
                Objects.equals(height, photoFull.height) &&
                Objects.equals(text, photoFull.text) &&
                Objects.equals(date, photoFull.date) &&
                Objects.equals(lat, photoFull.lat) &&
                Objects.equals(lng, photoFull.lng) &&
                Objects.equals(accessKey, photoFull.accessKey) &&
                Objects.equals(likes, photoFull.likes) &&
                Objects.equals(reposts, photoFull.reposts) &&
                Objects.equals(comments, photoFull.comments) &&
                Objects.equals(canComment, photoFull.canComment) &&
                Objects.equals(tags, photoFull.tags);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhotoFull{");
        sb.append("id=").append(id);
        sb.append(", albumId=").append(albumId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", userId=").append(userId);
        sb.append(", sizes=").append(sizes);
        sb.append(", photo75='").append(photo75).append("'");
        sb.append(", photo130='").append(photo130).append("'");
        sb.append(", photo604='").append(photo604).append("'");
        sb.append(", photo807='").append(photo807).append("'");
        sb.append(", photo1280='").append(photo1280).append("'");
        sb.append(", photo2560='").append(photo2560).append("'");
        sb.append(", postId=").append(postId);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", text='").append(text).append("'");
        sb.append(", date=").append(date);
        sb.append(", lat=").append(lat);
        sb.append(", lng=").append(lng);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", likes=").append(likes);
        sb.append(", reposts=").append(reposts);
        sb.append(", comments=").append(comments);
        sb.append(", canComment=").append(canComment);
        sb.append(", tags=").append(tags);
        sb.append('}');
        return sb.toString();
    }
}
