package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * WallpostCommentsDonut object
 */
public class WallpostCommentsDonut implements Validable {
    @SerializedName("placeholder")
    private WallpostCommentsDonutPlaceholder placeholder;

    public WallpostCommentsDonutPlaceholder getPlaceholder() {
        return placeholder;
    }

    public WallpostCommentsDonut setPlaceholder(WallpostCommentsDonutPlaceholder placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeholder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostCommentsDonut wallpostCommentsDonut = (WallpostCommentsDonut) o;
        return Objects.equals(placeholder, wallpostCommentsDonut.placeholder);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallpostCommentsDonut{");
        sb.append("placeholder=").append(placeholder);
        sb.append('}');
        return sb.toString();
    }
}
