package com.vk.api.sdk.objects.database;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * University object
 */
public class University {
    /**
     * University ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * University title
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
        University university = (University) o;
        return Objects.equals(id, university.id) &&
                Objects.equals(title, university.title);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("University{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
