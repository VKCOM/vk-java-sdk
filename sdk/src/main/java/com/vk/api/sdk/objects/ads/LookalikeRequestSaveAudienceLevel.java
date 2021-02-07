package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * LookalikeRequestSaveAudienceLevel object
 */
public class LookalikeRequestSaveAudienceLevel implements Validable {
    /**
     * Save audience level id, which is used in save audience queries
     */
    @SerializedName("level")
    private Integer level;

    /**
     * Saved audience audience size for according level
     */
    @SerializedName("audience_count")
    private Integer audienceCount;

    public Integer getLevel() {
        return level;
    }

    public LookalikeRequestSaveAudienceLevel setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getAudienceCount() {
        return audienceCount;
    }

    public LookalikeRequestSaveAudienceLevel setAudienceCount(Integer audienceCount) {
        this.audienceCount = audienceCount;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, audienceCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LookalikeRequestSaveAudienceLevel lookalikeRequestSaveAudienceLevel = (LookalikeRequestSaveAudienceLevel) o;
        return Objects.equals(level, lookalikeRequestSaveAudienceLevel.level) &&
                Objects.equals(audienceCount, lookalikeRequestSaveAudienceLevel.audienceCount);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LookalikeRequestSaveAudienceLevel{");
        sb.append("level=").append(level);
        sb.append(", audienceCount=").append(audienceCount);
        sb.append('}');
        return sb.toString();
    }
}
