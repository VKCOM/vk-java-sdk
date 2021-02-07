package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * DocTypes object
 */
public class DocTypes implements Validable {
    /**
     * Doc type ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Doc type title
     */
    @SerializedName("name")
    @Required
    private String name;

    /**
     * Number of docs
     */
    @SerializedName("count")
    @Required
    private Integer count;

    public Integer getId() {
        return id;
    }

    public DocTypes setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DocTypes setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public DocTypes setCount(Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocTypes docTypes = (DocTypes) o;
        return Objects.equals(name, docTypes.name) &&
                Objects.equals(count, docTypes.count) &&
                Objects.equals(id, docTypes.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DocTypes{");
        sb.append("name='").append(name).append("'");
        sb.append(", count=").append(count);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
