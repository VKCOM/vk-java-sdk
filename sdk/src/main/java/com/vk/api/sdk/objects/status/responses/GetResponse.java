package com.vk.api.sdk.objects.status.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.audio.Audio;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    /**
     * Status text
     */
    @SerializedName("text")
    @Required
    private String text;

    @SerializedName("audio")
    private Audio audio;

    public String getText() {
        return text;
    }

    public GetResponse setText(String text) {
        this.text = text;
        return this;
    }

    public Audio getAudio() {
        return audio;
    }

    public GetResponse setAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, audio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(text, getResponse.text) &&
                Objects.equals(audio, getResponse.audio);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("text='").append(text).append("'");
        sb.append(", audio=").append(audio);
        sb.append('}');
        return sb.toString();
    }
}
