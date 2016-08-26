package com.vk.api.sdk.objects.docs;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * DocTypes object
 */
public class DocTypes {
    /**
     * Doc type ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Doc type title
     */
    @SerializedName("title")
    private String title;

    /**
     * Number of docs
     */
    @SerializedName("count")
    private Integer count;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, id, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocTypes docTypes = (DocTypes) o;
        return Objects.equals(id, docTypes.id) &&
                Objects.equals(title, docTypes.title) &&
                Objects.equals(count, docTypes.count);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocTypes{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
