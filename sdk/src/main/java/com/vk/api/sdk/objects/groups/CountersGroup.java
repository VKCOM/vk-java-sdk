package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * CountersGroup object
 */
public class CountersGroup implements Validable {
    /**
     * Addresses number
     */
    @SerializedName("addresses")
    private Integer addresses;

    /**
     * Photo albums number
     */
    @SerializedName("albums")
    private Integer albums;

    /**
     * Audios number
     */
    @SerializedName("audios")
    private Integer audios;

    /**
     * Audio playlists number
     */
    @SerializedName("audio_playlists")
    private Integer audioPlaylists;

    /**
     * Docs number
     */
    @SerializedName("docs")
    private Integer docs;

    /**
     * Market items number
     */
    @SerializedName("market")
    private Integer market;

    /**
     * Photos number
     */
    @SerializedName("photos")
    private Integer photos;

    /**
     * Topics number
     */
    @SerializedName("topics")
    private Integer topics;

    /**
     * Videos number
     */
    @SerializedName("videos")
    private Integer videos;

    public Integer getAddresses() {
        return addresses;
    }

    public CountersGroup setAddresses(Integer addresses) {
        this.addresses = addresses;
        return this;
    }

    public Integer getAlbums() {
        return albums;
    }

    public CountersGroup setAlbums(Integer albums) {
        this.albums = albums;
        return this;
    }

    public Integer getAudios() {
        return audios;
    }

    public CountersGroup setAudios(Integer audios) {
        this.audios = audios;
        return this;
    }

    public Integer getAudioPlaylists() {
        return audioPlaylists;
    }

    public CountersGroup setAudioPlaylists(Integer audioPlaylists) {
        this.audioPlaylists = audioPlaylists;
        return this;
    }

    public Integer getDocs() {
        return docs;
    }

    public CountersGroup setDocs(Integer docs) {
        this.docs = docs;
        return this;
    }

    public Integer getMarket() {
        return market;
    }

    public CountersGroup setMarket(Integer market) {
        this.market = market;
        return this;
    }

    public Integer getPhotos() {
        return photos;
    }

    public CountersGroup setPhotos(Integer photos) {
        this.photos = photos;
        return this;
    }

    public Integer getTopics() {
        return topics;
    }

    public CountersGroup setTopics(Integer topics) {
        this.topics = topics;
        return this;
    }

    public Integer getVideos() {
        return videos;
    }

    public CountersGroup setVideos(Integer videos) {
        this.videos = videos;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(market, addresses, albums, docs, topics, audios, audioPlaylists, videos, photos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountersGroup countersGroup = (CountersGroup) o;
        return Objects.equals(market, countersGroup.market) &&
                Objects.equals(addresses, countersGroup.addresses) &&
                Objects.equals(albums, countersGroup.albums) &&
                Objects.equals(docs, countersGroup.docs) &&
                Objects.equals(topics, countersGroup.topics) &&
                Objects.equals(audioPlaylists, countersGroup.audioPlaylists) &&
                Objects.equals(audios, countersGroup.audios) &&
                Objects.equals(videos, countersGroup.videos) &&
                Objects.equals(photos, countersGroup.photos);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CountersGroup{");
        sb.append("market=").append(market);
        sb.append(", addresses=").append(addresses);
        sb.append(", albums=").append(albums);
        sb.append(", docs=").append(docs);
        sb.append(", topics=").append(topics);
        sb.append(", audioPlaylists=").append(audioPlaylists);
        sb.append(", audios=").append(audios);
        sb.append(", videos=").append(videos);
        sb.append(", photos=").append(photos);
        sb.append('}');
        return sb.toString();
    }
}
