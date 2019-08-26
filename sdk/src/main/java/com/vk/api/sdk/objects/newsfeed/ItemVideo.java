package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ItemVideo object
 */
public class ItemVideo extends ItemBase implements Validable {
    @SerializedName("video")
    private ItemVideoVideo video;

    public ItemVideoVideo getVideo() {
        return video;
    }

    public ItemVideo setVideo(ItemVideoVideo video) {
        this.video = video;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(video);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemVideo itemVideo = (ItemVideo) o;
        return Objects.equals(video, itemVideo.video);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemVideo{");
        sb.append("video=").append(video);
        sb.append('}');
        return sb.toString();
    }
}
