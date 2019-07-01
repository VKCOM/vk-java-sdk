package com.vk.api.sdk.objects.audio;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * AudioFull object
 */
public class AudioFull extends Audio implements Validable {
    /**
     * Duration in seconds
     */
    @SerializedName("duration")
    @Required
    private Integer duration;

    /**
     * Date when uploaded
     */
    @SerializedName("date")
    @Required
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

    @SerializedName("is_hq")
    private Boolean isHq;

    public Integer getDuration() {
        return duration;
    }

    public AudioFull setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public AudioFull setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public AudioFull setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public Integer getLyricsId() {
        return lyricsId;
    }

    public AudioFull setLyricsId(Integer lyricsId) {
        this.lyricsId = lyricsId;
        return this;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public AudioFull setGenreId(Integer genreId) {
        this.genreId = genreId;
        return this;
    }

    public boolean isNoSearch() {
        return noSearch == BoolInt.YES;
    }

    public BoolInt getNoSearch() {
        return noSearch;
    }

    public Boolean getIsHq() {
        return isHq;
    }

    public AudioFull setIsHq(Boolean isHq) {
        this.isHq = isHq;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, date, genreId, lyricsId, isHq, albumId, noSearch);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudioFull audioFull = (AudioFull) o;
        return Objects.equals(duration, audioFull.duration) &&
                Objects.equals(date, audioFull.date) &&
                Objects.equals(noSearch, audioFull.noSearch) &&
                Objects.equals(isHq, audioFull.isHq) &&
                Objects.equals(albumId, audioFull.albumId) &&
                Objects.equals(genreId, audioFull.genreId) &&
                Objects.equals(lyricsId, audioFull.lyricsId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AudioFull{");
        sb.append("duration=").append(duration);
        sb.append(", date=").append(date);
        sb.append(", noSearch=").append(noSearch);
        sb.append(", isHq=").append(isHq);
        sb.append(", albumId=").append(albumId);
        sb.append(", genreId=").append(genreId);
        sb.append(", lyricsId=").append(lyricsId);
        sb.append('}');
        return sb.toString();
    }
}
