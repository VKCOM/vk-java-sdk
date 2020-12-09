package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * DocPreview object
 */
public class DocPreview implements Validable {
    @SerializedName("audio_msg")
    private DocPreviewAudioMsg audioMsg;

    @SerializedName("graffiti")
    private DocPreviewGraffiti graffiti;

    @SerializedName("photo")
    private DocPreviewPhoto photo;

    @SerializedName("video")
    private DocPreviewVideo video;

    public DocPreviewAudioMsg getAudioMsg() {
        return audioMsg;
    }

    public DocPreview setAudioMsg(DocPreviewAudioMsg audioMsg) {
        this.audioMsg = audioMsg;
        return this;
    }

    public DocPreviewGraffiti getGraffiti() {
        return graffiti;
    }

    public DocPreview setGraffiti(DocPreviewGraffiti graffiti) {
        this.graffiti = graffiti;
        return this;
    }

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
        return Objects.hash(audioMsg, photo, graffiti, video);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreview docPreview = (DocPreview) o;
        return Objects.equals(audioMsg, docPreview.audioMsg) &&
                Objects.equals(photo, docPreview.photo) &&
                Objects.equals(graffiti, docPreview.graffiti) &&
                Objects.equals(video, docPreview.video);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DocPreview{");
        sb.append("audioMsg=").append(audioMsg);
        sb.append(", photo=").append(photo);
        sb.append(", graffiti=").append(graffiti);
        sb.append(", video=").append(video);
        sb.append('}');
        return sb.toString();
    }
}
