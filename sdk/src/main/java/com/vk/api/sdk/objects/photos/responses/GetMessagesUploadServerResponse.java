package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * GetMessagesUploadServerResponse object
 */
public class GetMessagesUploadServerResponse implements Validable {
    /**
     * Album ID
     */
    @SerializedName("album_id")
    private Integer albumId;

    /**
     * URL to upload photo
     */
    @SerializedName("upload_url")
    private URI uploadUrl;

    /**
     * Fallback URL if upload_url returned error
     */
    @SerializedName("fallback_upload_url")
    private URI fallbackUploadUrl;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Group ID
     */
    @SerializedName("group_id")
    private Integer groupId;

    public Integer getAlbumId() {
        return albumId;
    }

    public GetMessagesUploadServerResponse setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public URI getUploadUrl() {
        return uploadUrl;
    }

    public GetMessagesUploadServerResponse setUploadUrl(URI uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    public URI getFallbackUploadUrl() {
        return fallbackUploadUrl;
    }

    public GetMessagesUploadServerResponse setFallbackUploadUrl(URI fallbackUploadUrl) {
        this.fallbackUploadUrl = fallbackUploadUrl;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public GetMessagesUploadServerResponse setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public GetMessagesUploadServerResponse setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fallbackUploadUrl, uploadUrl, groupId, albumId, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMessagesUploadServerResponse getMessagesUploadServerResponse = (GetMessagesUploadServerResponse) o;
        return Objects.equals(userId, getMessagesUploadServerResponse.userId) &&
                Objects.equals(groupId, getMessagesUploadServerResponse.groupId) &&
                Objects.equals(uploadUrl, getMessagesUploadServerResponse.uploadUrl) &&
                Objects.equals(fallbackUploadUrl, getMessagesUploadServerResponse.fallbackUploadUrl) &&
                Objects.equals(albumId, getMessagesUploadServerResponse.albumId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetMessagesUploadServerResponse{");
        sb.append("userId=").append(userId);
        sb.append(", groupId=").append(groupId);
        sb.append(", uploadUrl=").append(uploadUrl);
        sb.append(", fallbackUploadUrl=").append(fallbackUploadUrl);
        sb.append(", albumId=").append(albumId);
        sb.append('}');
        return sb.toString();
    }
}
