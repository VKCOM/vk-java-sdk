package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * AudioMessage object
 */
public class AudioMessage implements Validable {
    /**
     * Access key for audio message
     */
    @SerializedName("access_key")
    private String accessKey;

    @SerializedName("transcript_error")
    private Integer transcriptError;

    /**
     * Audio message duration in seconds
     */
    @SerializedName("duration")
    @Required
    private Integer duration;

    /**
     * Audio message ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * MP3 file URL
     */
    @SerializedName("link_mp3")
    private URI linkMp3;

    /**
     * OGG file URL
     */
    @SerializedName("link_ogg")
    private URI linkOgg;

    /**
     * Audio message owner ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("waveform")
    @Required
    private List<Integer> waveform;

    public String getAccessKey() {
        return accessKey;
    }

    public AudioMessage setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getTranscriptError() {
        return transcriptError;
    }

    public AudioMessage setTranscriptError(Integer transcriptError) {
        this.transcriptError = transcriptError;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public AudioMessage setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public AudioMessage setId(Integer id) {
        this.id = id;
        return this;
    }

    public URI getLinkMp3() {
        return linkMp3;
    }

    public AudioMessage setLinkMp3(URI linkMp3) {
        this.linkMp3 = linkMp3;
        return this;
    }

    public URI getLinkOgg() {
        return linkOgg;
    }

    public AudioMessage setLinkOgg(URI linkOgg) {
        this.linkOgg = linkOgg;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public AudioMessage setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public List<Integer> getWaveform() {
        return waveform;
    }

    public AudioMessage setWaveform(List<Integer> waveform) {
        this.waveform = waveform;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, transcriptError, accessKey, linkOgg, linkMp3, id, ownerId, waveform);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudioMessage audioMessage = (AudioMessage) o;
        return Objects.equals(duration, audioMessage.duration) &&
                Objects.equals(ownerId, audioMessage.ownerId) &&
                Objects.equals(accessKey, audioMessage.accessKey) &&
                Objects.equals(linkOgg, audioMessage.linkOgg) &&
                Objects.equals(linkMp3, audioMessage.linkMp3) &&
                Objects.equals(id, audioMessage.id) &&
                Objects.equals(waveform, audioMessage.waveform) &&
                Objects.equals(transcriptError, audioMessage.transcriptError);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AudioMessage{");
        sb.append("duration=").append(duration);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", linkOgg=").append(linkOgg);
        sb.append(", linkMp3=").append(linkMp3);
        sb.append(", id=").append(id);
        sb.append(", waveform=").append(waveform);
        sb.append(", transcriptError=").append(transcriptError);
        sb.append('}');
        return sb.toString();
    }
}
