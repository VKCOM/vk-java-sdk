package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * DocPreviewAudioMsg object
 */
public class DocPreviewAudioMsg implements Validable {
    /**
     * Audio message duration in seconds
     */
    @SerializedName("duration")
    @Required
    private Integer duration;

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

    @SerializedName("waveform")
    @Required
    private List<Integer> waveform;

    public Integer getDuration() {
        return duration;
    }

    public DocPreviewAudioMsg setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public URI getLinkMp3() {
        return linkMp3;
    }

    public DocPreviewAudioMsg setLinkMp3(URI linkMp3) {
        this.linkMp3 = linkMp3;
        return this;
    }

    public URI getLinkOgg() {
        return linkOgg;
    }

    public DocPreviewAudioMsg setLinkOgg(URI linkOgg) {
        this.linkOgg = linkOgg;
        return this;
    }

    public List<Integer> getWaveform() {
        return waveform;
    }

    public DocPreviewAudioMsg setWaveform(List<Integer> waveform) {
        this.waveform = waveform;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, linkOgg, linkMp3, waveform);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreviewAudioMsg docPreviewAudioMsg = (DocPreviewAudioMsg) o;
        return Objects.equals(duration, docPreviewAudioMsg.duration) &&
                Objects.equals(linkOgg, docPreviewAudioMsg.linkOgg) &&
                Objects.equals(linkMp3, docPreviewAudioMsg.linkMp3) &&
                Objects.equals(waveform, docPreviewAudioMsg.waveform);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DocPreviewAudioMsg{");
        sb.append("duration=").append(duration);
        sb.append(", linkOgg=").append(linkOgg);
        sb.append(", linkMp3=").append(linkMp3);
        sb.append(", waveform=").append(waveform);
        sb.append('}');
        return sb.toString();
    }
}
