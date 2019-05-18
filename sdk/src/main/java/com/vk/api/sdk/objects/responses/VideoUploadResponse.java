package com.vk.api.sdk.objects.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * VideoUploadResponse object
 */
public class VideoUploadResponse {
    /**
     * Video size
     */
    @SerializedName("size")
    private Integer size;

    /**
     * Video ID
     */
    @SerializedName("video_id")
    private Integer videoId;

    public Integer getSize() {
        return size;
    }

    public Integer getVideoId() {
        return videoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, videoId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoUploadResponse videoUploadResponse = (VideoUploadResponse) o;
        return Objects.equals(size, videoUploadResponse.size) &&
                Objects.equals(videoId, videoUploadResponse.videoId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoUploadResponse{");
        sb.append("size=").append(size);
        sb.append(", videoId=").append(videoId);
        sb.append('}');
        return sb.toString();
    }
}
