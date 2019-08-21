package com.vk.api.sdk.objects.status;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.audio.Audio;
import java.util.Objects;

/**
 * Status object
 */
public class Status implements Validable {
    @SerializedName("audio")
    private Audio audio;

    /**
     * Status text
     */
    @SerializedName("text")
    private String text;

    public Audio getAudio() {
        return audio;
    }

    public Status setAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public String getText() {
        return text;
    }

    public Status setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(audio, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(audio, status.audio) &&
                Objects.equals(text, status.text);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Status{");
        sb.append("audio=").append(audio);
        sb.append(", text='").append(text).append("'");
        sb.append('}');
        return sb.toString();
    }
}
