package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * GetMarketAlbumUploadServerResponse object
 */
public class GetMarketAlbumUploadServerResponse {
    /**
     * URL to upload the photo
     */
    @SerializedName("upload_url")
    private String uploadUrl;

    public String getUploadUrl() {
        return uploadUrl;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrl);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMarketAlbumUploadServerResponse getMarketAlbumUploadServerResponse = (GetMarketAlbumUploadServerResponse) o;
        return Objects.equals(uploadUrl, getMarketAlbumUploadServerResponse.uploadUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMarketAlbumUploadServerResponse{");
        sb.append("uploadUrl='").append(uploadUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
