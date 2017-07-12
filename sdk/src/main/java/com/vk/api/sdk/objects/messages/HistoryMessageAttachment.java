package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.audio.AudioFull;
import com.vk.api.sdk.objects.base.Link;
import com.vk.api.sdk.objects.docs.Doc;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;

import java.util.Objects;

/**
 * HistoryMessageAttachment object
 */
public class HistoryMessageAttachment {
    /**
     * Attachments type
     */
    @SerializedName("type")
    private HistoryMessageAttachmentType type;

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

    @SerializedName("market")
    private Link market;

    @SerializedName("wall")
    private Link wall;

    @SerializedName("share")
    private Link share;

    public HistoryMessageAttachmentType getType() {
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

    public Link getMarket() {
        return market;
    }

    public Link getWall() {
        return wall;
    }

    public Link getShare() {
        return share;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryMessageAttachment that = (HistoryMessageAttachment) o;
        return type == that.type &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(video, that.video) &&
                Objects.equals(audio, that.audio) &&
                Objects.equals(doc, that.doc) &&
                Objects.equals(link, that.link) &&
                Objects.equals(market, that.market) &&
                Objects.equals(wall, that.wall) &&
                Objects.equals(share, that.share);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, photo, video, audio, doc, link, market, wall, share);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HistoryMessageAttachment{");
        sb.append("type=").append(type);
        sb.append(", photo=").append(photo);
        sb.append(", video=").append(video);
        sb.append(", audio=").append(audio);
        sb.append(", doc=").append(doc);
        sb.append(", link=").append(link);
        sb.append(", market=").append(market);
        sb.append(", wall=").append(wall);
        sb.append(", share=").append(share);
        sb.append('}');
        return sb.toString();
    }
}
