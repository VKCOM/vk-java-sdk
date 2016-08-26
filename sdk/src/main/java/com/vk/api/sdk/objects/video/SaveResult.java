package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * SaveResult object
 */
public class SaveResult {
    /**
     * URL for the video uploading
     */
    @SerializedName("upload_url")
    private String uploadUrl;

    /**
     * Video ID
     */
    @SerializedName("video_id")
    private Integer videoId;

    /**
     * Video owner ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Video title
     */
    @SerializedName("title")
    private String title;

    /**
     * Video description
     */
    @SerializedName("description")
    private String description;

    public String getUploadUrl() {
        return uploadUrl;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrl, description, videoId, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveResult saveResult = (SaveResult) o;
        return Objects.equals(uploadUrl, saveResult.uploadUrl) &&
                Objects.equals(videoId, saveResult.videoId) &&
                Objects.equals(ownerId, saveResult.ownerId) &&
                Objects.equals(title, saveResult.title) &&
                Objects.equals(description, saveResult.description);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SaveResult{");
        sb.append("uploadUrl='").append(uploadUrl).append("'");
        sb.append(", videoId=").append(videoId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append('}');
        return sb.toString();
    }
}
