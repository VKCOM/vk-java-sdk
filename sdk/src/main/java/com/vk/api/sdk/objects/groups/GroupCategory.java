package com.vk.api.sdk.objects.groups;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * GroupCategory object
 */
public class GroupCategory {
    /**
     * Category ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Category name
     */
    @SerializedName("name")
    private String name;

    @SerializedName("subcategories")
    private List<JsonObject> subcategories;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<JsonObject> getSubcategories() {
        return subcategories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, subcategories);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupCategory groupCategory = (GroupCategory) o;
        return Objects.equals(id, groupCategory.id) &&
                Objects.equals(name, groupCategory.name) &&
                Objects.equals(subcategories, groupCategory.subcategories);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupCategory{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", subcategories=").append(subcategories);
        sb.append('}');
        return sb.toString();
    }
}
