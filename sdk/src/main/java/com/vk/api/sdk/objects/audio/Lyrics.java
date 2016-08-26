package com.vk.api.sdk.objects.audio;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Lyrics object
 */
public class Lyrics {
    /**
     * Lyrics ID
     */
    @SerializedName("lyrics_id")
    private Integer lyricsId;

    /**
     * Lyrics text
     */
    @SerializedName("text")
    private String text;

    public Integer getLyricsId() {
        return lyricsId;
    }

    public String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lyricsId, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lyrics lyrics = (Lyrics) o;
        return Objects.equals(lyricsId, lyrics.lyricsId) &&
                Objects.equals(text, lyrics.text);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lyrics{");
        sb.append("lyricsId=").append(lyricsId);
        sb.append(", text='").append(text).append("'");
        sb.append('}');
        return sb.toString();
    }
}
