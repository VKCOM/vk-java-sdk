package com.vk.api.sdk.objects.docs.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * GetWallUploadServerResponse object
 */
public class GetWallUploadServerResponse {
    /**
     * Upload URL
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
        GetWallUploadServerResponse getWallUploadServerResponse = (GetWallUploadServerResponse) o;
        return Objects.equals(uploadUrl, getWallUploadServerResponse.uploadUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetWallUploadServerResponse{");
        sb.append("uploadUrl='").append(uploadUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
