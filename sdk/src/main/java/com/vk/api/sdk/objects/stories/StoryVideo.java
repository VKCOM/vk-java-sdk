package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.video.Video;
import java.util.Objects;

/**
 * StoryVideo object
 */
public class StoryVideo extends Video implements Validable {
    /**
     * Information whether story is private (0 - no, 1 - yes).
     */
    @SerializedName("is_private")
    private BoolInt isPrivate;

    public boolean isPrivate() {
        return isPrivate == BoolInt.YES;
    }

    public BoolInt getIsPrivate() {
        return isPrivate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPrivate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoryVideo storyVideo = (StoryVideo) o;
        return Objects.equals(isPrivate, storyVideo.isPrivate);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StoryVideo{");
        sb.append("isPrivate=").append(isPrivate);
        sb.append('}');
        return sb.toString();
    }
}
