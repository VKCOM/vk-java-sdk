package com.vk.api.sdk.objects.docs.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * GetUploadServerResponse object
 */
public class GetUploadServerResponse {
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
        GetUploadServerResponse getUploadServerResponse = (GetUploadServerResponse) o;
        return Objects.equals(uploadUrl, getUploadServerResponse.uploadUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetUploadServerResponse{");
        sb.append("uploadUrl='").append(uploadUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
