package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * TargSuggestionsCities object
 */
public class TargSuggestionsCities {
    /**
     * Object ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Object name
     */
    @SerializedName("name")
    private String name;

    /**
     * Parent object
     */
    @SerializedName("parent")
    private String parent;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParent() {
        return parent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargSuggestionsCities targSuggestionsCities = (TargSuggestionsCities) o;
        return Objects.equals(id, targSuggestionsCities.id) &&
                Objects.equals(name, targSuggestionsCities.name) &&
                Objects.equals(parent, targSuggestionsCities.parent);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TargSuggestionsCities{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", parent='").append(parent).append("'");
        sb.append('}');
        return sb.toString();
    }
}
