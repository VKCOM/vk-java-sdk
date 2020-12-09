package com.vk.api.sdk.objects.video.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * SaveResponse object
 */
public class SaveResponse implements Validable {
    /**
     * Video access key
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Video description
     */
    @SerializedName("description")
    private String description;

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
     * URL for the video uploading
     */
    @SerializedName("upload_url")
    private URI uploadUrl;

    /**
     * Video ID
     */
    @SerializedName("video_id")
    private Integer videoId;

    public String getAccessKey() {
        return accessKey;
    }

    public SaveResponse setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SaveResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public SaveResponse setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SaveResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public URI getUploadUrl() {
        return uploadUrl;
    }

    public SaveResponse setUploadUrl(URI uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public SaveResponse setVideoId(Integer videoId) {
        this.videoId = videoId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrl, accessKey, description, videoId, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveResponse saveResponse = (SaveResponse) o;
        return Objects.equals(ownerId, saveResponse.ownerId) &&
                Objects.equals(accessKey, saveResponse.accessKey) &&
                Objects.equals(description, saveResponse.description) &&
                Objects.equals(uploadUrl, saveResponse.uploadUrl) &&
                Objects.equals(title, saveResponse.title) &&
                Objects.equals(videoId, saveResponse.videoId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SaveResponse{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", uploadUrl=").append(uploadUrl);
        sb.append(", title='").append(title).append("'");
        sb.append(", videoId=").append(videoId);
        sb.append('}');
        return sb.toString();
    }
}
