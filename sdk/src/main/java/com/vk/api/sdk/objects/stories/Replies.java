package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Replies {

    @SerializedName("count")
    private Integer count;

    @SerializedName("new")
    private Integer countNew;

    public Integer getCount() {
        return count;
    }

    public Integer getNew() {
        return countNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Replies that = (Replies) o;
        return Objects.equals(count, that.count) &&
            Objects.equals(countNew, that.countNew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, countNew);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Replies{");
        sb.append("count=").append(count);
        sb.append(", new=").append(countNew);
        sb.append('}');
        return sb.toString();
    }
}
