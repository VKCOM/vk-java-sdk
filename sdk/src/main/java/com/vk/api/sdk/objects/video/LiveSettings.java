package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * Video live settings
 */
public class LiveSettings implements Validable {
    /**
     * If user car rewind live or not
     */
    @SerializedName("can_rewind")
    private BoolInt canRewind;

    /**
     * If live is endless or not
     */
    @SerializedName("is_endless")
    private BoolInt isEndless;

    /**
     * Max possible time for rewind
     */
    @SerializedName("max_duration")
    private Integer maxDuration;

    public boolean canRewind() {
        return canRewind == BoolInt.YES;
    }

    public BoolInt getCanRewind() {
        return canRewind;
    }

    public boolean isEndless() {
        return isEndless == BoolInt.YES;
    }

    public BoolInt getIsEndless() {
        return isEndless;
    }

    public Integer getMaxDuration() {
        return maxDuration;
    }

    public LiveSettings setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canRewind, isEndless, maxDuration);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiveSettings liveSettings = (LiveSettings) o;
        return Objects.equals(isEndless, liveSettings.isEndless) &&
                Objects.equals(maxDuration, liveSettings.maxDuration) &&
                Objects.equals(canRewind, liveSettings.canRewind);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LiveSettings{");
        sb.append("isEndless=").append(isEndless);
        sb.append(", maxDuration=").append(maxDuration);
        sb.append(", canRewind=").append(canRewind);
        sb.append('}');
        return sb.toString();
    }
}
