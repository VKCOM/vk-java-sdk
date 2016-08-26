package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * SubjectItem object
 */
public class SubjectItem {
    /**
     * Subject ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Subject title
     */
    @SerializedName("name")
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
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
        return Objects.equals(id, subjectItem.id) &&
                Objects.equals(name, subjectItem.name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SubjectItem{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append('}');
        return sb.toString();
    }
}
