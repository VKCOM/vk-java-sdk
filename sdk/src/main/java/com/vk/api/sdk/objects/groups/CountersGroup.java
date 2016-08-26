package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * CountersGroup object
 */
public class CountersGroup {
    /**
     * Photos number
     */
    @SerializedName("photos")
    private Integer photos;

    /**
     * Photo albums number
     */
    @SerializedName("albums")
    private Integer albums;

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

    /**
     * Audios number
     */
    @SerializedName("audios")
    private Integer audios;

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

    public Integer getPhotos() {
        return photos;
    }

    public Integer getAlbums() {
        return albums;
    }

    public Integer getTopics() {
        return topics;
    }

    public Integer getVideos() {
        return videos;
    }

    public Integer getAudios() {
        return audios;
    }

    public Integer getDocs() {
        return docs;
    }

    public Integer getMarket() {
        return market;
    }

    @Override
    public int hashCode() {
        return Objects.hash(market, albums, docs, topics, audios, videos, photos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountersGroup countersGroup = (CountersGroup) o;
        return Objects.equals(photos, countersGroup.photos) &&
                Objects.equals(albums, countersGroup.albums) &&
                Objects.equals(topics, countersGroup.topics) &&
                Objects.equals(videos, countersGroup.videos) &&
                Objects.equals(audios, countersGroup.audios) &&
                Objects.equals(docs, countersGroup.docs) &&
                Objects.equals(market, countersGroup.market);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CountersGroup{");
        sb.append("photos=").append(photos);
        sb.append(", albums=").append(albums);
        sb.append(", topics=").append(topics);
        sb.append(", videos=").append(videos);
        sb.append(", audios=").append(audios);
        sb.append(", docs=").append(docs);
        sb.append(", market=").append(market);
        sb.append('}');
        return sb.toString();
    }
}
