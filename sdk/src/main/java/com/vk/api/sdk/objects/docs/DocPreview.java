package com.vk.api.sdk.objects.docs;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * DocPreview object
 */
public class DocPreview {

    @SerializedName("photo")
    private DocPreviewPhoto photo;

    @SerializedName("video")
    private DocPreviewVideo video;

    public DocPreviewPhoto getPhoto() {
        return photo;
    }

    public DocPreviewVideo getVideo() {
        return video;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreview that = (DocPreview) o;
        return Objects.equals(photo, that.photo) &&
                Objects.equals(video, that.video);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo, video);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocPreview{");
        sb.append("photo=").append(photo);
        sb.append(", video=").append(video);
        sb.append('}');
        return sb.toString();
    }
}
