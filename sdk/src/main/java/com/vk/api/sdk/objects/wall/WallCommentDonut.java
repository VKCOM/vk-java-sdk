package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * WallCommentDonut object
 */
public class WallCommentDonut implements Validable {
    /**
     * Means commentator is donator
     */
    @SerializedName("is_donator")
    private Boolean isDonator;

    public Boolean getIsDonator() {
        return isDonator;
    }

    public WallCommentDonut setIsDonator(Boolean isDonator) {
        this.isDonator = isDonator;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDonator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallCommentDonut wallCommentDonut = (WallCommentDonut) o;
        return Objects.equals(isDonator, wallCommentDonut.isDonator);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallCommentDonut{");
        sb.append("isDonator=").append(isDonator);
        sb.append('}');
        return sb.toString();
    }
}
