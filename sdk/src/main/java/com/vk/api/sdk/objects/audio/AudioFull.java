package com.vk.api.sdk.objects.audio;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * AudioFull object
 */
public class AudioFull extends Audio {
    /**
     * Duration in seconds
     */
    @SerializedName("duration")
    private Integer duration;

    /**
     * Date when uploaded
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Album ID
     */
    @SerializedName("album_id")
    private Integer albumId;

    /**
     * Lyrics ID
     */
    @SerializedName("lyrics_id")
    private Integer lyricsId;

    /**
     * Genre ID
     */
    @SerializedName("genre_id")
    private Integer genreId;

    /**
     * Information whether the audio is hidden from search
     */
    @SerializedName("no_search")
    private BoolInt noSearch;

    public Integer getDuration() {
        return duration;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public Integer getLyricsId() {
        return lyricsId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public boolean isNoSearch() {
        return noSearch == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration, date, lyricsId, genreId, albumId, noSearch);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AudioFull audioFull = (AudioFull) o;
        return Objects.equals(duration, audioFull.duration) &&
                Objects.equals(date, audioFull.date) &&
                Objects.equals(albumId, audioFull.albumId) &&
                Objects.equals(lyricsId, audioFull.lyricsId) &&
                Objects.equals(genreId, audioFull.genreId) &&
                Objects.equals(noSearch, audioFull.noSearch);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AudioFull{");
        sb.append("duration=").append(duration);
        sb.append(", date=").append(date);
        sb.append(", albumId=").append(albumId);
        sb.append(", lyricsId=").append(lyricsId);
        sb.append(", genreId=").append(genreId);
        sb.append(", noSearch=").append(noSearch);
        sb.append('}');
        return sb.toString();
    }
}
