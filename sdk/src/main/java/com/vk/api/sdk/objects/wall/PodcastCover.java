package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.photos.Image;

import java.util.List;
import java.util.Objects;

/**
 * Podcast object
 */
public class PodcastCover implements Validable {
    /**
     * Cover SIZES
     */
    @SerializedName("sizes")
    private List<Image> sizes;

    public List<Image> getSizes() {
        return sizes;
    }

    public PodcastCover setCover(List<Image> sizes) {
        this.sizes = sizes;
        return this;
    }


    @Override
    public int hashCode() {
        return Objects.hash(sizes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PodcastCover podcastCover= (PodcastCover) o;
        return Objects.equals(sizes, podcastCover.sizes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PodcastCover{");
        sb.append("sizes=").append(sizes);
        sb.append('}');
        return sb.toString();
    }
}
