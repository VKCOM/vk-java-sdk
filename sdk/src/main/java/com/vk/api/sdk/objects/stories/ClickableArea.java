package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ClickableArea object
 */
public class ClickableArea implements Validable {
    @SerializedName("x")
    private Integer x;

    @SerializedName("y")
    private Integer y;

    public Integer getX() {
        return x;
    }

    public ClickableArea setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return y;
    }

    public ClickableArea setY(Integer y) {
        this.y = y;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClickableArea clickableArea = (ClickableArea) o;
        return Objects.equals(x, clickableArea.x) &&
                Objects.equals(y, clickableArea.y);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ClickableArea{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
