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
    @SerializedName("is_don")
    private Boolean isDon;

    @SerializedName("placeholder")
    private WallCommentDonutPlaceholder placeholder;

    public Boolean getIsDon() {
        return isDon;
    }

    public WallCommentDonut setIsDon(Boolean isDon) {
        this.isDon = isDon;
        return this;
    }

    public WallCommentDonutPlaceholder getPlaceholder() {
        return placeholder;
    }

    public WallCommentDonut setPlaceholder(WallCommentDonutPlaceholder placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDon, placeholder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallCommentDonut wallCommentDonut = (WallCommentDonut) o;
        return Objects.equals(isDon, wallCommentDonut.isDon) &&
                Objects.equals(placeholder, wallCommentDonut.placeholder);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallCommentDonut{");
        sb.append("isDon=").append(isDon);
        sb.append(", placeholder=").append(placeholder);
        sb.append('}');
        return sb.toString();
    }
}
