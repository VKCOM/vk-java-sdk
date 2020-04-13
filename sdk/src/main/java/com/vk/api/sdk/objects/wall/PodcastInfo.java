package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.groups.Cover;
import com.vk.api.sdk.objects.photos.Image;

import java.util.List;
import java.util.Objects;

/**
 * Podcast object
 */
public class PodcastInfo implements Validable {
    /**
     * Podcast COVER
     */
    @SerializedName("cover")
    private PodcastCover cover;

    /**
     * Podcast COVER DESCRIPTION
     */
    @SerializedName("description")
    private String description;

    /**
     * Podcast PLAYS
     */
    @SerializedName("plays")
    private Integer plays;

    public PodcastCover getCover() {
        return cover;
    }

    public PodcastInfo setCover(PodcastCover cover) {
        this.cover = cover;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public PodcastInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getPlays() {
        return plays;
    }

    public PodcastInfo setPlays(Integer plays) {
        this.plays = plays;
        return this;
    }


    @Override
    public int hashCode() {
        return Objects.hash(cover, description, plays);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PodcastInfo podcastInfo = (PodcastInfo) o;
        return Objects.equals(cover, podcastInfo.cover) &&
                Objects.equals(description, podcastInfo.description) &&
                Objects.equals(plays, podcastInfo.plays);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PodcastInfo{");
        sb.append("cover=").append(cover);
        sb.append(", description=").append(description);
        sb.append(", plays=").append(plays);
        sb.append('}');
        return sb.toString();
    }
}
