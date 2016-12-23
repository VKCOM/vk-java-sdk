package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * PhotoXtrTagInfo object
 */
public class PhotoXtrTagInfo {
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

    /**
     * ID of the tag creator
     */
    @SerializedName("placer_id")
    private Integer placerId;

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

    public Integer getPlacerId() {
        return placerId;
    }

    public Integer getTagCreated() {
        return tagCreated;
    }

    public Integer getTagId() {
        return tagId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, photo604, lng, tagId, photo807, photo1280, photo2560, albumId, postId, placerId, ownerId, userId, sizes, photo75, accessKey, photo130, width, id, text, tagCreated, lat, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoXtrTagInfo photoXtrTagInfo = (PhotoXtrTagInfo) o;
        return Objects.equals(id, photoXtrTagInfo.id) &&
                Objects.equals(albumId, photoXtrTagInfo.albumId) &&
                Objects.equals(ownerId, photoXtrTagInfo.ownerId) &&
                Objects.equals(userId, photoXtrTagInfo.userId) &&
                Objects.equals(sizes, photoXtrTagInfo.sizes) &&
                Objects.equals(photo75, photoXtrTagInfo.photo75) &&
                Objects.equals(photo130, photoXtrTagInfo.photo130) &&
                Objects.equals(photo604, photoXtrTagInfo.photo604) &&
                Objects.equals(photo807, photoXtrTagInfo.photo807) &&
                Objects.equals(photo1280, photoXtrTagInfo.photo1280) &&
                Objects.equals(photo2560, photoXtrTagInfo.photo2560) &&
                Objects.equals(postId, photoXtrTagInfo.postId) &&
                Objects.equals(width, photoXtrTagInfo.width) &&
                Objects.equals(height, photoXtrTagInfo.height) &&
                Objects.equals(text, photoXtrTagInfo.text) &&
                Objects.equals(date, photoXtrTagInfo.date) &&
                Objects.equals(lat, photoXtrTagInfo.lat) &&
                Objects.equals(lng, photoXtrTagInfo.lng) &&
                Objects.equals(accessKey, photoXtrTagInfo.accessKey) &&
                Objects.equals(placerId, photoXtrTagInfo.placerId) &&
                Objects.equals(tagCreated, photoXtrTagInfo.tagCreated) &&
                Objects.equals(tagId, photoXtrTagInfo.tagId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhotoXtrTagInfo{");
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
        sb.append(", placerId=").append(placerId);
        sb.append(", tagCreated=").append(tagCreated);
        sb.append(", tagId=").append(tagId);
        sb.append('}');
        return sb.toString();
    }
}
