package com.vk.api.sdk.objects.comment;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.wall.WallComment;
import java.util.List;
import java.util.Objects;

/**
 * Thread object
 */
public class Thread implements Validable {
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

    /**
     * Information whether recommended to display reply button
     */
    @SerializedName("show_reply_button")
    private Boolean showReplyButton;

    public Boolean getCanPost() {
        return canPost;
    }

    public Thread setCanPost(Boolean canPost) {
        this.canPost = canPost;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public Thread setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Boolean getGroupsCanPost() {
        return groupsCanPost;
    }

    public Thread setGroupsCanPost(Boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
        return this;
    }

    public List<WallComment> getItems() {
        return items;
    }

    public Thread setItems(List<WallComment> items) {
        this.items = items;
        return this;
    }

    public Boolean getShowReplyButton() {
        return showReplyButton;
    }

    public Thread setShowReplyButton(Boolean showReplyButton) {
        this.showReplyButton = showReplyButton;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canPost, count, groupsCanPost, items, showReplyButton);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thread thread = (Thread) o;
        return Objects.equals(count, thread.count) &&
                Objects.equals(groupsCanPost, thread.groupsCanPost) &&
                Objects.equals(canPost, thread.canPost) &&
                Objects.equals(showReplyButton, thread.showReplyButton) &&
                Objects.equals(items, thread.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Thread{");
        sb.append("count=").append(count);
        sb.append(", groupsCanPost=").append(groupsCanPost);
        sb.append(", canPost=").append(canPost);
        sb.append(", showReplyButton=").append(showReplyButton);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
