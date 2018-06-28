package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class GetVideoUploadServerResponse {

    @SerializedName("upload_url")
    private String uploadUrl;

    @SerializedName("user_ids")
    private List<Integer> userIds;

    public String getUploadUrl() {
        return uploadUrl;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetVideoUploadServerResponse that = (GetVideoUploadServerResponse) o;
        return Objects.equals(uploadUrl, that.uploadUrl) &&
            Objects.equals(userIds, that.userIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrl, userIds);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetVideoUploadServerResponse{");
        sb.append("uploadUrl='").append(uploadUrl).append('\'');
        sb.append(", userIds=").append(userIds);
        sb.append('}');
        return sb.toString();
    }
}
