package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * DocTypes object
 */
public class DocTypes implements Validable {
    /**
     * Number of docs
     */
    @SerializedName("count")
    private Integer count;

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

    public Integer getCount() {
        return count;
    }

    public DocTypes setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public DocTypes setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public DocTypes setTitle(String title) {
        this.title = title;
        return this;
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
        return Objects.equals(count, docTypes.count) &&
                Objects.equals(id, docTypes.id) &&
                Objects.equals(title, docTypes.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DocTypes{");
        sb.append("count=").append(count);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
