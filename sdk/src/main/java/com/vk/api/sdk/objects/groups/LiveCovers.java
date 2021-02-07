package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * LiveCovers object
 */
public class LiveCovers implements Validable {
    /**
     * Information whether live covers is enabled
     */
    @SerializedName("is_enabled")
    private Boolean isEnabled;

    /**
     * Information whether live covers photo scaling is enabled
     */
    @SerializedName("is_scalable")
    private Boolean isScalable;

    @SerializedName("story_ids")
    private List<String> storyIds;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public LiveCovers setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    public Boolean getIsScalable() {
        return isScalable;
    }

    public LiveCovers setIsScalable(Boolean isScalable) {
        this.isScalable = isScalable;
        return this;
    }

    public List<String> getStoryIds() {
        return storyIds;
    }

    public LiveCovers setStoryIds(List<String> storyIds) {
        this.storyIds = storyIds;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(storyIds, isScalable, isEnabled);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiveCovers liveCovers = (LiveCovers) o;
        return Objects.equals(isEnabled, liveCovers.isEnabled) &&
                Objects.equals(storyIds, liveCovers.storyIds) &&
                Objects.equals(isScalable, liveCovers.isScalable);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LiveCovers{");
        sb.append("isEnabled=").append(isEnabled);
        sb.append(", storyIds='").append(storyIds).append("'");
        sb.append(", isScalable=").append(isScalable);
        sb.append('}');
        return sb.toString();
    }
}
