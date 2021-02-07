package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * GroupPublicCategoryList object
 */
public class GroupPublicCategoryList implements Validable {
    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("subcategories")
    private List<GroupCategoryType> subcategories;

    public Integer getId() {
        return id;
    }

    public GroupPublicCategoryList setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GroupPublicCategoryList setName(String name) {
        this.name = name;
        return this;
    }

    public List<GroupCategoryType> getSubcategories() {
        return subcategories;
    }

    public GroupPublicCategoryList setSubcategories(List<GroupCategoryType> subcategories) {
        this.subcategories = subcategories;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, subcategories);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupPublicCategoryList groupPublicCategoryList = (GroupPublicCategoryList) o;
        return Objects.equals(name, groupPublicCategoryList.name) &&
                Objects.equals(id, groupPublicCategoryList.id) &&
                Objects.equals(subcategories, groupPublicCategoryList.subcategories);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupPublicCategoryList{");
        sb.append("name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", subcategories=").append(subcategories);
        sb.append('}');
        return sb.toString();
    }
}
