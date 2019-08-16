package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.base.Link;
import com.vk.api.sdk.objects.docs.Doc;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import java.util.Objects;

/**
 * HistoryMessageAttachment object
 */
public class HistoryMessageAttachment implements Validable {
    @SerializedName("audio")
    private Audio audio;

    @SerializedName("audio_message")
    private AudioMessage audioMessage;

    @SerializedName("doc")
    private Doc doc;

    @SerializedName("graffiti")
    private Graffiti graffiti;

    @SerializedName("link")
    private Link link;

    @SerializedName("market")
    private Link market;

    @SerializedName("photo")
    private Photo photo;

    @SerializedName("share")
    private Link share;

    @SerializedName("type")
    @Required
    private HistoryMessageAttachmentType type;

    @SerializedName("video")
    private Video video;

    @SerializedName("wall")
    private Link wall;

    public Audio getAudio() {
        return audio;
    }

    public HistoryMessageAttachment setAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public AudioMessage getAudioMessage() {
        return audioMessage;
    }

    public HistoryMessageAttachment setAudioMessage(AudioMessage audioMessage) {
        this.audioMessage = audioMessage;
        return this;
    }

    public Doc getDoc() {
        return doc;
    }

    public HistoryMessageAttachment setDoc(Doc doc) {
        this.doc = doc;
        return this;
    }

    public Graffiti getGraffiti() {
        return graffiti;
    }

    public HistoryMessageAttachment setGraffiti(Graffiti graffiti) {
        this.graffiti = graffiti;
        return this;
    }

    public Link getLink() {
        return link;
    }

    public HistoryMessageAttachment setLink(Link link) {
        this.link = link;
        return this;
    }

    public Link getMarket() {
        return market;
    }

    public HistoryMessageAttachment setMarket(Link market) {
        this.market = market;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public HistoryMessageAttachment setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public Link getShare() {
        return share;
    }

    public HistoryMessageAttachment setShare(Link share) {
        this.share = share;
        return this;
    }

    public HistoryMessageAttachmentType getType() {
        return type;
    }

    public HistoryMessageAttachment setType(HistoryMessageAttachmentType type) {
        this.type = type;
        return this;
    }

    public Video getVideo() {
        return video;
    }

    public HistoryMessageAttachment setVideo(Video video) {
        this.video = video;
        return this;
    }

    public Link getWall() {
        return wall;
    }

    public HistoryMessageAttachment setWall(Link wall) {
        this.wall = wall;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(market, link, doc, photo, graffiti, share, audio, video, audioMessage, type, wall);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryMessageAttachment historyMessageAttachment = (HistoryMessageAttachment) o;
        return Objects.equals(market, historyMessageAttachment.market) &&
                Objects.equals(link, historyMessageAttachment.link) &&
                Objects.equals(doc, historyMessageAttachment.doc) &&
                Objects.equals(photo, historyMessageAttachment.photo) &&
                Objects.equals(graffiti, historyMessageAttachment.graffiti) &&
                Objects.equals(share, historyMessageAttachment.share) &&
                Objects.equals(audio, historyMessageAttachment.audio) &&
                Objects.equals(video, historyMessageAttachment.video) &&
                Objects.equals(audioMessage, historyMessageAttachment.audioMessage) &&
                Objects.equals(type, historyMessageAttachment.type) &&
                Objects.equals(wall, historyMessageAttachment.wall);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("HistoryMessageAttachment{");
        sb.append("market=").append(market);
        sb.append(", link=").append(link);
        sb.append(", doc=").append(doc);
        sb.append(", photo=").append(photo);
        sb.append(", graffiti=").append(graffiti);
        sb.append(", share=").append(share);
        sb.append(", audio=").append(audio);
        sb.append(", video=").append(video);
        sb.append(", audioMessage=").append(audioMessage);
        sb.append(", type=").append(type);
        sb.append(", wall=").append(wall);
        sb.append('}');
        return sb.toString();
    }
}
