package com.vk.api.sdk.objects.status;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.audio.AudioFull;

import java.util.Objects;

/**
 * Status object
 */
public class Status {
    /**
     * Status text
     */
    @SerializedName("text")
    private String text;

    @SerializedName("audio")
    private AudioFull audio;

    public String getText() {
        return text;
    }

    public AudioFull getAudio() {
        return audio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, audio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(text, status.text) &&
                Objects.equals(audio, status.audio);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Status{");
        sb.append("text='").append(text).append("'");
        sb.append(", audio=").append(audio);
        sb.append('}');
        return sb.toString();
    }
}
