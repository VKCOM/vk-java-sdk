package com.vk.api.sdk.objects.audio;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.List;
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

    /**
     * Is album high quality
     */
    @SerializedName("is_hq")
    private Boolean isHq;

    /**
     * Audio album
     */
    @SerializedName("album")
    private AudioAlbum album;

    /**
     * Release ID
     */
    @SerializedName("release_id")
    private Integer releaseId;

    /**
     * Audio type
     */
    @SerializedName("mstcp_type")
    private AudioFullMstcpType mstcpType;

    /**
     * Audio gener ID
     */
    @SerializedName("track_genre_id")
    private AudioFullTrackGenreId trackGenreId;

    /**
     * Itunes preview
     */
    @SerializedName("itunes_preview")
    private JsonObject itunesPreview;

    /**
     * Audio restriction
     */
    @SerializedName("content_restricted")
    private AudioFullContentRestricted contentRestricted;

    /**
     * Main artists
     */
    @SerializedName("main_artists")
    private List<Artist> mainArtists;

    /**
     * Featured artists
     */
    @SerializedName("featured_artists")
    private List<Artist> featuredArtists;

    /**
     * Subtitle
     */
    @SerializedName("subtitle")
    private String subtitle;

    /**
     * Audio album part number
     */
    @SerializedName("album_part_number")
    private Integer albumPartNumber;

    /**
     * Performer name
     */
    @SerializedName("performer")
    private String performer;

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

    public AudioAlbum getAlbum() {
        return album;
    }

    public AudioFull setAlbum(AudioAlbum album) {
        this.album = album;
        return this;
    }

    public Integer getReleaseId() {
        return releaseId;
    }

    public AudioFull setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
        return this;
    }

    public AudioFullMstcpType getMstcpType() {
        return mstcpType;
    }

    public AudioFull setMstcpType(AudioFullMstcpType mstcpType) {
        this.mstcpType = mstcpType;
        return this;
    }

    public AudioFullTrackGenreId getTrackGenreId() {
        return trackGenreId;
    }

    public AudioFull setTrackGenreId(AudioFullTrackGenreId trackGenreId) {
        this.trackGenreId = trackGenreId;
        return this;
    }

    public JsonObject getItunesPreview() {
        return itunesPreview;
    }

    public AudioFull setItunesPreview(JsonObject itunesPreview) {
        this.itunesPreview = itunesPreview;
        return this;
    }

    public AudioFullContentRestricted getContentRestricted() {
        return contentRestricted;
    }

    public AudioFull setContentRestricted(AudioFullContentRestricted contentRestricted) {
        this.contentRestricted = contentRestricted;
        return this;
    }

    public List<Artist> getMainArtists() {
        return mainArtists;
    }

    public AudioFull setMainArtists(List<Artist> mainArtists) {
        this.mainArtists = mainArtists;
        return this;
    }

    public List<Artist> getFeaturedArtists() {
        return featuredArtists;
    }

    public AudioFull setFeaturedArtists(List<Artist> featuredArtists) {
        this.featuredArtists = featuredArtists;
        return this;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public AudioFull setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public Integer getAlbumPartNumber() {
        return albumPartNumber;
    }

    public AudioFull setAlbumPartNumber(Integer albumPartNumber) {
        this.albumPartNumber = albumPartNumber;
        return this;
    }

    public String getPerformer() {
        return performer;
    }

    public AudioFull setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, genreId, lyricsId, isHq, performer, trackGenreId, album, contentRestricted, albumId, mstcpType, mainArtists, featuredArtists, albumPartNumber, itunesPreview, duration, releaseId, subtitle, noSearch);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudioFull audioFull = (AudioFull) o;
        return Objects.equals(date, audioFull.date) &&
                Objects.equals(albumPartNumber, audioFull.albumPartNumber) &&
                Objects.equals(releaseId, audioFull.releaseId) &&
                Objects.equals(trackGenreId, audioFull.trackGenreId) &&
                Objects.equals(isHq, audioFull.isHq) &&
                Objects.equals(contentRestricted, audioFull.contentRestricted) &&
                Objects.equals(performer, audioFull.performer) &&
                Objects.equals(album, audioFull.album) &&
                Objects.equals(featuredArtists, audioFull.featuredArtists) &&
                Objects.equals(itunesPreview, audioFull.itunesPreview) &&
                Objects.equals(genreId, audioFull.genreId) &&
                Objects.equals(lyricsId, audioFull.lyricsId) &&
                Objects.equals(duration, audioFull.duration) &&
                Objects.equals(noSearch, audioFull.noSearch) &&
                Objects.equals(subtitle, audioFull.subtitle) &&
                Objects.equals(albumId, audioFull.albumId) &&
                Objects.equals(mstcpType, audioFull.mstcpType) &&
                Objects.equals(mainArtists, audioFull.mainArtists);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AudioFull{");
        sb.append("date=").append(date);
        sb.append(", albumPartNumber=").append(albumPartNumber);
        sb.append(", releaseId=").append(releaseId);
        sb.append(", trackGenreId=").append(trackGenreId);
        sb.append(", isHq=").append(isHq);
        sb.append(", contentRestricted=").append(contentRestricted);
        sb.append(", performer='").append(performer).append("'");
        sb.append(", album=").append(album);
        sb.append(", featuredArtists=").append(featuredArtists);
        sb.append(", itunesPreview=").append(itunesPreview);
        sb.append(", genreId=").append(genreId);
        sb.append(", lyricsId=").append(lyricsId);
        sb.append(", duration=").append(duration);
        sb.append(", noSearch=").append(noSearch);
        sb.append(", subtitle='").append(subtitle).append("'");
        sb.append(", albumId=").append(albumId);
        sb.append(", mstcpType=").append(mstcpType);
        sb.append(", mainArtists=").append(mainArtists);
        sb.append('}');
        return sb.toString();
    }
}
