package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.wall.WallComment;
import java.util.List;
import java.util.Objects;

/**
 * GetCommentsResponse object
 */
public class GetCommentsResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<WallComment> items;

    /**
     * Information whether current user can comment the post
     */
    @SerializedName("can_post")
    private Boolean canPost;

    /**
     * Information whether groups can comment the post
     */
    @SerializedName("groups_can_post")
    private Boolean groupsCanPost;

    /**
     * Count of replies of current level
     */
    @SerializedName("current_level_count")
    private Integer currentLevelCount;

    public Integer getCount() {
        return count;
    }

    public GetCommentsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<WallComment> getItems() {
        return items;
    }

    public GetCommentsResponse setItems(List<WallComment> items) {
        this.items = items;
        return this;
    }

    public Boolean getCanPost() {
        return canPost;
    }

    public GetCommentsResponse setCanPost(Boolean canPost) {
        this.canPost = canPost;
        return this;
    }

    public Boolean getGroupsCanPost() {
        return groupsCanPost;
    }

    public GetCommentsResponse setGroupsCanPost(Boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
        return this;
    }

    public Integer getCurrentLevelCount() {
        return currentLevelCount;
    }

    public GetCommentsResponse setCurrentLevelCount(Integer currentLevelCount) {
        this.currentLevelCount = currentLevelCount;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canPost, count, groupsCanPost, currentLevelCount, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsResponse getCommentsResponse = (GetCommentsResponse) o;
        return Objects.equals(currentLevelCount, getCommentsResponse.currentLevelCount) &&
                Objects.equals(count, getCommentsResponse.count) &&
                Objects.equals(groupsCanPost, getCommentsResponse.groupsCanPost) &&
                Objects.equals(canPost, getCommentsResponse.canPost) &&
                Objects.equals(items, getCommentsResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCommentsResponse{");
        sb.append("currentLevelCount=").append(currentLevelCount);
        sb.append(", count=").append(count);
        sb.append(", groupsCanPost=").append(groupsCanPost);
        sb.append(", canPost=").append(canPost);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
