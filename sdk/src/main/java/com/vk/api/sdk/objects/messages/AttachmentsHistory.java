package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.audio.AudioFull;
import com.vk.api.sdk.objects.base.Link;
import com.vk.api.sdk.objects.docs.Doc;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;

import java.util.Objects;

/**
 * AttachmentsHistory object
 */
public class AttachmentsHistory {
    /**
     * Attachments type
     */
    @SerializedName("type")
    private AttachmentsHistoryType type;

    @SerializedName("photo")
    private Photo photo;

    @SerializedName("video")
    private Video video;

    @SerializedName("audio")
    private AudioFull audio;

    @SerializedName("doc")
    private Doc doc;

    @SerializedName("link")
    private Link link;

    public AttachmentsHistoryType getType() {
        return type;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Video getVideo() {
        return video;
    }

    public AudioFull getAudio() {
        return audio;
    }

    public Doc getDoc() {
        return doc;
    }

    public Link getLink() {
        return link;
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, photo, doc, video, audio, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttachmentsHistory attachmentsHistory = (AttachmentsHistory) o;
        return Objects.equals(type, attachmentsHistory.type) &&
                Objects.equals(photo, attachmentsHistory.photo) &&
                Objects.equals(video, attachmentsHistory.video) &&
                Objects.equals(audio, attachmentsHistory.audio) &&
                Objects.equals(doc, attachmentsHistory.doc) &&
                Objects.equals(link, attachmentsHistory.link);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AttachmentsHistory{");
        sb.append("type='").append(type).append("'");
        sb.append(", photo=").append(photo);
        sb.append(", video=").append(video);
        sb.append(", audio=").append(audio);
        sb.append(", doc=").append(doc);
        sb.append(", link=").append(link);
        sb.append('}');
        return sb.toString();
    }
}
