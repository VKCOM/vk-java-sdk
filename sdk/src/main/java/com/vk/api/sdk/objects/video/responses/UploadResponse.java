package com.vk.api.sdk.objects.video.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * UploadResponse object
 */
public class UploadResponse {
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
        UploadResponse uploadResponse = (UploadResponse) o;
        return Objects.equals(size, uploadResponse.size) &&
                Objects.equals(videoId, uploadResponse.videoId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UploadResponse{");
        sb.append("size=").append(size);
        sb.append(", videoId=").append(videoId);
        sb.append('}');
        return sb.toString();
    }
}
