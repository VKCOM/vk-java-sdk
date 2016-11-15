package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * BaseCount object
 */
public class BaseCount {

    /**
     * Items count
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
        BaseCount baseObject = (BaseCount) o;
        return Objects.equals(count, baseObject.count);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseObject{");
        sb.append("count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
