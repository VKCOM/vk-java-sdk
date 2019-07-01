package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * CommentThread object
 */
public class CommentThread implements Validable {
    /**
     * Information whether current user can comment the post
     */
    @SerializedName("can_post")
    private Boolean canPost;

    /**
     * Comments number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    /**
     * Information whether groups can comment the post
     */
    @SerializedName("groups_can_post")
    private Boolean groupsCanPost;

    @SerializedName("items")
    private List<WallComment> items;

    public Boolean getCanPost() {
        return canPost;
    }

    public CommentThread setCanPost(Boolean canPost) {
        this.canPost = canPost;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public CommentThread setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Boolean getGroupsCanPost() {
        return groupsCanPost;
    }

    public CommentThread setGroupsCanPost(Boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
        return this;
    }

    public List<WallComment> getItems() {
        return items;
    }

    public CommentThread setItems(List<WallComment> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canPost, count, groupsCanPost, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentThread commentThread = (CommentThread) o;
        return Objects.equals(count, commentThread.count) &&
                Objects.equals(groupsCanPost, commentThread.groupsCanPost) &&
                Objects.equals(canPost, commentThread.canPost) &&
                Objects.equals(items, commentThread.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CommentThread{");
        sb.append("count=").append(count);
        sb.append(", groupsCanPost=").append(groupsCanPost);
        sb.append(", canPost=").append(canPost);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
