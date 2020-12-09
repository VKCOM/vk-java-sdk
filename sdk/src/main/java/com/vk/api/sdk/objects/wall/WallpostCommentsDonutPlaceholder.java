package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Info about paid comments feature
 */
public class WallpostCommentsDonutPlaceholder implements Validable {
    @SerializedName("text")
    @Required
    private String text;

    public String getText() {
        return text;
    }

    public WallpostCommentsDonutPlaceholder setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostCommentsDonutPlaceholder wallpostCommentsDonutPlaceholder = (WallpostCommentsDonutPlaceholder) o;
        return Objects.equals(text, wallpostCommentsDonutPlaceholder.text);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallpostCommentsDonutPlaceholder{");
        sb.append("text='").append(text).append("'");
        sb.append('}');
        return sb.toString();
    }
}
