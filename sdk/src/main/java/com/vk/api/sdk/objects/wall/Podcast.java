package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * Podcast object
 */
public class Podcast implements Validable {
    /**
     * Podcast ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Podcast ARTIST
     */
    @SerializedName("artist")
    private String artist;

    /**
     * Podcast TITILE
     */
    @SerializedName("title")
    private String title;

    /**
     * Podcast owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Podcast DURATION
     */
    @SerializedName("duration")
    private Integer duration;

    /**
     * Podcast TRACK_CODE
     */
    @SerializedName("track_code")
    private String trackCode;

    /**
     * Podcast URL
     */
    @SerializedName("url")
    private String url;

    /**
     * Podcast DATE
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Podcast LYRICS_ID
     */
    @SerializedName("lyrics_id")
    private Integer lyricsId;

    /**
     * Podcast NO_SEARCH
     */
    @SerializedName("no_search")
    private BoolInt noSearch;

    /**
     * Podcast INFO
     */
    @SerializedName("podcast_info")
    private PodcastInfo podcastInfo;

    public Integer getId() {
        return id;
    }

    public Podcast setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public Podcast setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Podcast setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public Podcast setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Podcast setTitle(String title) {
        this.title = title;
        return this;
    }

    public BoolInt getNoSearch() {
        return noSearch;
    }

    public Podcast setNoSearch(BoolInt noSearch) {
        this.noSearch = noSearch;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Podcast setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getLyricsId() {
        return lyricsId;
    }

    public Podcast setLyricsId(Integer lyricsId) {
        this.lyricsId = lyricsId;
        return this;
    }

    public String getTrackCode() {
        return trackCode;
    }

    public Podcast setTrackCode(String trackCode) {
        this.trackCode = trackCode;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Podcast setUrl(String url) {
        this.url = url;
        return this;
    }

    public PodcastInfo getPodcastInfo() {
        return podcastInfo;
    }

    public Podcast setPodcastInfo(PodcastInfo podcastInfo) {
        this.podcastInfo = podcastInfo;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ownerId, artist, date, duration, lyricsId, noSearch, podcastInfo, title, trackCode, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Podcast podcast = (Podcast) o;
        return Objects.equals(ownerId, podcast.ownerId) &&
                Objects.equals(id, podcast.id) &&
                Objects.equals(date, podcast.date) &&
                Objects.equals(duration, podcast.duration) &&
                Objects.equals(lyricsId, podcast.lyricsId) &&
                Objects.equals(noSearch, podcast.noSearch) &&
                Objects.equals(podcastInfo, podcast.podcastInfo) &&
                Objects.equals(title, podcast.title) &&
                Objects.equals(trackCode, podcast.trackCode) &&
                Objects.equals(url, podcast.url) &&
                Objects.equals(artist, podcast.artist);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Podcast{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", duration=").append(duration);
        sb.append(", lyricsId=").append(lyricsId);
        sb.append(", noSearch=").append(noSearch);
        sb.append(", podcastInfo=").append(podcastInfo);
        sb.append(", title=").append(title);
        sb.append(", trackCode=").append(trackCode);
        sb.append(", url=").append(url);
        sb.append(", artist=").append(artist);
        sb.append('}');
        return sb.toString();
    }
}
