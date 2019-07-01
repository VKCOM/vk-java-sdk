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

    @SerializedName("subtypes_list")
    private List<GroupCategoryType> subtypesList;

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

    public List<GroupCategoryType> getSubtypesList() {
        return subtypesList;
    }

    public GroupPublicCategoryList setSubtypesList(List<GroupCategoryType> subtypesList) {
        this.subtypesList = subtypesList;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subtypesList, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupPublicCategoryList groupPublicCategoryList = (GroupPublicCategoryList) o;
        return Objects.equals(name, groupPublicCategoryList.name) &&
                Objects.equals(subtypesList, groupPublicCategoryList.subtypesList) &&
                Objects.equals(id, groupPublicCategoryList.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupPublicCategoryList{");
        sb.append("name='").append(name).append("'");
        sb.append(", subtypesList=").append(subtypesList);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
