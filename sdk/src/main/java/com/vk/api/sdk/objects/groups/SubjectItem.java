package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * SubjectItem object
 */
public class SubjectItem implements Validable {
    /**
     * Subject ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Subject title
     */
    @SerializedName("name")
    @Required
    private String name;

    public Integer getId() {
        return id;
    }

    public SubjectItem setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SubjectItem setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectItem subjectItem = (SubjectItem) o;
        return Objects.equals(name, subjectItem.name) &&
                Objects.equals(id, subjectItem.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SubjectItem{");
        sb.append("name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
