package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * BaseObject object
 */
public class BaseObject {
    /**
     * Object ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Object title
     */
    @SerializedName("title")
    private String title;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseObject baseObject = (BaseObject) o;
        return Objects.equals(id, baseObject.id) &&
                Objects.equals(title, baseObject.title);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseObject{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
