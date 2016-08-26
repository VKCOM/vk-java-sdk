package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PhotoUpload object
 */
public class PhotoUpload {
    /**
     * URL to upload photo
     */
    @SerializedName("upload_url")
    private String uploadUrl;

    /**
     * Album ID
     */
    @SerializedName("album_id")
    private Integer albumId;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public String getUploadUrl() {
        return uploadUrl;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrl, albumId, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoUpload photoUpload = (PhotoUpload) o;
        return Objects.equals(uploadUrl, photoUpload.uploadUrl) &&
                Objects.equals(albumId, photoUpload.albumId) &&
                Objects.equals(userId, photoUpload.userId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhotoUpload{");
        sb.append("uploadUrl='").append(uploadUrl).append("'");
        sb.append(", albumId=").append(albumId);
        sb.append(", userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}
