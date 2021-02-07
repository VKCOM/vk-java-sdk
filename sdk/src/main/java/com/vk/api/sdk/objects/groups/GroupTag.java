package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GroupTag object
 */
public class GroupTag implements Validable {
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("name")
    @Required
    private String name;

    @SerializedName("color")
    @Required
    private GroupTagColor color;

    @SerializedName("uses")
    private Integer uses;

    public Integer getId() {
        return id;
    }

    public GroupTag setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GroupTag setName(String name) {
        this.name = name;
        return this;
    }

    public GroupTagColor getColor() {
        return color;
    }

    public GroupTag setColor(GroupTagColor color) {
        this.color = color;
        return this;
    }

    public Integer getUses() {
        return uses;
    }

    public GroupTag setUses(Integer uses) {
        this.uses = uses;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name, uses, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupTag groupTag = (GroupTag) o;
        return Objects.equals(color, groupTag.color) &&
                Objects.equals(name, groupTag.name) &&
                Objects.equals(uses, groupTag.uses) &&
                Objects.equals(id, groupTag.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupTag{");
        sb.append("color='").append(color).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", uses=").append(uses);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
