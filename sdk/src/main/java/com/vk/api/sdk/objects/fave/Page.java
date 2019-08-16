package com.vk.api.sdk.objects.fave;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * Page object
 */
public class Page implements Validable {
    /**
     * Some info about user or group
     */
    @SerializedName("description")
    @Required
    private String description;

    @SerializedName("group")
    private GroupFull group;

    @SerializedName("tags")
    @Required
    private List<Tag> tags;

    /**
     * Item type
     */
    @SerializedName("type")
    @Required
    private PageType type;

    /**
     * Timestamp, when this page was bookmarked
     */
    @SerializedName("updated_date")
    private Integer updatedDate;

    @SerializedName("user")
    private UserFull user;

    public String getDescription() {
        return description;
    }

    public Page setDescription(String description) {
        this.description = description;
        return this;
    }

    public GroupFull getGroup() {
        return group;
    }

    public Page setGroup(GroupFull group) {
        this.group = group;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public Page setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public PageType getType() {
        return type;
    }

    public Page setType(PageType type) {
        this.type = type;
        return this;
    }

    public Integer getUpdatedDate() {
        return updatedDate;
    }

    public Page setUpdatedDate(Integer updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public UserFull getUser() {
        return user;
    }

    public Page setUser(UserFull user) {
        this.user = user;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, updatedDate, type, user, group, tags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Page page = (Page) o;
        return Objects.equals(description, page.description) &&
                Objects.equals(updatedDate, page.updatedDate) &&
                Objects.equals(type, page.type) &&
                Objects.equals(user, page.user) &&
                Objects.equals(group, page.group) &&
                Objects.equals(tags, page.tags);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Page{");
        sb.append("description='").append(description).append("'");
        sb.append(", updatedDate=").append(updatedDate);
        sb.append(", type=").append(type);
        sb.append(", user=").append(user);
        sb.append(", group=").append(group);
        sb.append(", tags=").append(tags);
        sb.append('}');
        return sb.toString();
    }
}
