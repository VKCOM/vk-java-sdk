package com.vk.api.sdk.objects.audio;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URL;
import java.util.Objects;

/**
 * Audio object
 */
public class Audio implements Validable {
    /**
     * Artist name
     */
    @SerializedName("artist")
    @Required
    private String artist;

    /**
     * Audio ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * URL of mp3 file
     */
    @SerializedName("url")
    private URL url;

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
    private Integer date;

    /**
     * Album ID
     */
    @SerializedName("album_id")
    private Integer albumId;

    /**
     * Genre ID
     */
    @SerializedName("genre_id")
    private Integer genreId;

    /**
     * Performer name
     */
    @SerializedName("performer")
    private String performer;

    public String getArtist() {
        return artist;
    }

    public Audio setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Audio setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Audio setTitle(String title) {
        this.title = title;
        return this;
    }

    public URL getUrl() {
        return url;
    }

    public Audio setUrl(URL url) {
        this.url = url;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public Audio setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Audio setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public Audio setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public Audio setGenreId(Integer genreId) {
        this.genreId = genreId;
        return this;
    }

    public String getPerformer() {
        return performer;
    }

    public Audio setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, date, genreId, performer, artist, albumId, id, title, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audio audio = (Audio) o;
        return Objects.equals(duration, audio.duration) &&
                Objects.equals(date, audio.date) &&
                Objects.equals(performer, audio.performer) &&
                Objects.equals(artist, audio.artist) &&
                Objects.equals(albumId, audio.albumId) &&
                Objects.equals(id, audio.id) &&
                Objects.equals(title, audio.title) &&
                Objects.equals(url, audio.url) &&
                Objects.equals(genreId, audio.genreId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Audio{");
        sb.append("duration=").append(duration);
        sb.append(", date=").append(date);
        sb.append(", performer='").append(performer).append("'");
        sb.append(", artist='").append(artist).append("'");
        sb.append(", albumId=").append(albumId);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", url=").append(url);
        sb.append(", genreId=").append(genreId);
        sb.append('}');
        return sb.toString();
    }
}
