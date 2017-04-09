package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Views object
 */
public class Views {

    /**
     * Count
     */
    @SerializedName("count")
    private Integer count;

    public Integer getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Views views = (Views) o;
        return Objects.equals(count, views.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Views{");
        sb.append("count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
