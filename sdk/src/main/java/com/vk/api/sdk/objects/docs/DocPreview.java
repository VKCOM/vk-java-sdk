package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * DocPreview object
 */
public class DocPreview implements Validable {
    @SerializedName("photo")
    private DocPreviewPhoto photo;

    @SerializedName("video")
    private DocPreviewVideo video;

    public DocPreviewPhoto getPhoto() {
        return photo;
    }

    public DocPreview setPhoto(DocPreviewPhoto photo) {
        this.photo = photo;
        return this;
    }

    public DocPreviewVideo getVideo() {
        return video;
    }

    public DocPreview setVideo(DocPreviewVideo video) {
        this.video = video;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo, video);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreview docPreview = (DocPreview) o;
        return Objects.equals(photo, docPreview.photo) &&
                Objects.equals(video, docPreview.video);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DocPreview{");
        sb.append("photo=").append(photo);
        sb.append(", video=").append(video);
        sb.append('}');
        return sb.toString();
    }
}
