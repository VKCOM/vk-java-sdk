package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URL;
import java.util.Objects;

/**
 * PhotoUpload object
 */
public class PhotoUpload implements Validable {
    /**
     * Album ID
     */
    @SerializedName("album_id")
    private Integer albumId;

    /**
     * URL to upload photo
     */
    @SerializedName("upload_url")
    private URL uploadUrl;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public Integer getAlbumId() {
        return albumId;
    }

    public PhotoUpload setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public URL getUploadUrl() {
        return uploadUrl;
    }

    public PhotoUpload setUploadUrl(URL uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public PhotoUpload setUserId(Integer userId) {
        this.userId = userId;
        return this;
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
        return Objects.equals(userId, photoUpload.userId) &&
                Objects.equals(uploadUrl, photoUpload.uploadUrl) &&
                Objects.equals(albumId, photoUpload.albumId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoUpload{");
        sb.append("userId=").append(userId);
        sb.append(", uploadUrl=").append(uploadUrl);
        sb.append(", albumId=").append(albumId);
        sb.append('}');
        return sb.toString();
    }
}
