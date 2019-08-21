package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URL;
import java.util.Objects;

/**
 * SaveResult object
 */
public class SaveResult implements Validable {
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
    private URL uploadUrl;

    /**
     * Video ID
     */
    @SerializedName("video_id")
    private Integer videoId;

    public String getAccessKey() {
        return accessKey;
    }

    public SaveResult setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SaveResult setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public SaveResult setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SaveResult setTitle(String title) {
        this.title = title;
        return this;
    }

    public URL getUploadUrl() {
        return uploadUrl;
    }

    public SaveResult setUploadUrl(URL uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public SaveResult setVideoId(Integer videoId) {
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
        SaveResult saveResult = (SaveResult) o;
        return Objects.equals(ownerId, saveResult.ownerId) &&
                Objects.equals(accessKey, saveResult.accessKey) &&
                Objects.equals(description, saveResult.description) &&
                Objects.equals(uploadUrl, saveResult.uploadUrl) &&
                Objects.equals(title, saveResult.title) &&
                Objects.equals(videoId, saveResult.videoId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SaveResult{");
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
