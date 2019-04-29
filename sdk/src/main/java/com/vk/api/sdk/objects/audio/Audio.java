package com.vk.api.sdk.objects.audio;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.net.URL;
import java.util.Objects;

/**
 * Audio object
 */
public class Audio {
    /**
     * Access key for the audio
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Artist name
     */
    @SerializedName("artist")
    private String artist;

    /**
     * Audio ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("is_explicit")
    private Boolean isExplicit;

    @SerializedName("is_focus_track")
    private Boolean isFocusTrack;

    @SerializedName("is_licensed")
    private Boolean isLicensed;

    /**
     * Audio owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Title
     */
    @SerializedName("title")
    private String title;

    /**
     * URL of mp3 file
     */
    @SerializedName("url")
    private URL url;

    public String getAccessKey() {
        return accessKey;
    }

    public Audio setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

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

    public Boolean getIsExplicit() {
        return isExplicit;
    }

    public Audio setIsExplicit(Boolean isExplicit) {
        this.isExplicit = isExplicit;
        return this;
    }

    public Boolean getIsFocusTrack() {
        return isFocusTrack;
    }

    public Audio setIsFocusTrack(Boolean isFocusTrack) {
        this.isFocusTrack = isFocusTrack;
        return this;
    }

    public Boolean getIsLicensed() {
        return isLicensed;
    }

    public Audio setIsLicensed(Boolean isLicensed) {
        this.isLicensed = isLicensed;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Audio setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
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

    @Override
    public int hashCode() {
        return Objects.hash(isExplicit, isFocusTrack, artist, accessKey, isLicensed, id, ownerId, title, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audio audio = (Audio) o;
        return Objects.equals(artist, audio.artist) &&
                Objects.equals(ownerId, audio.ownerId) &&
                Objects.equals(accessKey, audio.accessKey) &&
                Objects.equals(isFocusTrack, audio.isFocusTrack) &&
                Objects.equals(isLicensed, audio.isLicensed) &&
                Objects.equals(id, audio.id) &&
                Objects.equals(title, audio.title) &&
                Objects.equals(isExplicit, audio.isExplicit) &&
                Objects.equals(url, audio.url);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Audio{");
        sb.append("artist='").append(artist).append("'");
        sb.append(", ownerId=").append(ownerId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", isFocusTrack=").append(isFocusTrack);
        sb.append(", isLicensed=").append(isLicensed);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", isExplicit=").append(isExplicit);
        sb.append(", url=").append(url);
        sb.append('}');
        return sb.toString();
    }
}
