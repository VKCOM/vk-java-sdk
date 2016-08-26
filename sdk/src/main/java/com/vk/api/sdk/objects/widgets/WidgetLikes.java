package com.vk.api.sdk.objects.widgets;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * WidgetLikes object
 */
public class WidgetLikes {
    /**
     * Likes number
     */
    @SerializedName("count")
    private Integer count;

    public Integer getCount() {
        return count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WidgetLikes widgetLikes = (WidgetLikes) o;
        return Objects.equals(count, widgetLikes.count);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WidgetLikes{");
        sb.append("count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
