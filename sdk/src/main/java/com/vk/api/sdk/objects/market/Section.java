package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Section object
 */
public class Section {
    /**
     * Section ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Section name
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
        Section section = (Section) o;
        return Objects.equals(id, section.id) &&
                Objects.equals(name, section.name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Section{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append('}');
        return sb.toString();
    }
}
