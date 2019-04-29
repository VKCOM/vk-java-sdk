package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.users.User;
import com.vk.api.sdk.objects.wall.WallComment;
import java.util.List;
import java.util.Objects;

/**
 * GetCommentsExtendedResponse object
 */
public class GetCommentsExtendedResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<WallComment> items;

    @SerializedName("show_reply_button")
    private Boolean showReplyButton;

    /**
     * Information whether current user can comment the post
     */
    @SerializedName("can_post")
    private BoolInt canPost;

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

    @SerializedName("profiles")
    private List<User> profiles;

    @SerializedName("groups")
    private List<Group> groups;

    public Integer getCount() {
        return count;
    }

    public GetCommentsExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<WallComment> getItems() {
        return items;
    }

    public GetCommentsExtendedResponse setItems(List<WallComment> items) {
        this.items = items;
        return this;
    }

    public Boolean getShowReplyButton() {
        return showReplyButton;
    }

    public GetCommentsExtendedResponse setShowReplyButton(Boolean showReplyButton) {
        this.showReplyButton = showReplyButton;
        return this;
    }

    public boolean canPost() {
        return canPost == BoolInt.YES;
    }

    public BoolInt getCanPost() {
        return canPost;
    }

    public Boolean getGroupsCanPost() {
        return groupsCanPost;
    }

    public GetCommentsExtendedResponse setGroupsCanPost(Boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
        return this;
    }

    public Integer getCurrentLevelCount() {
        return currentLevelCount;
    }

    public GetCommentsExtendedResponse setCurrentLevelCount(Integer currentLevelCount) {
        this.currentLevelCount = currentLevelCount;
        return this;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public GetCommentsExtendedResponse setProfiles(List<User> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public GetCommentsExtendedResponse setGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canPost, count, profiles, groups, groupsCanPost, currentLevelCount, items, showReplyButton);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsExtendedResponse getCommentsExtendedResponse = (GetCommentsExtendedResponse) o;
        return Objects.equals(currentLevelCount, getCommentsExtendedResponse.currentLevelCount) &&
                Objects.equals(count, getCommentsExtendedResponse.count) &&
                Objects.equals(groupsCanPost, getCommentsExtendedResponse.groupsCanPost) &&
                Objects.equals(profiles, getCommentsExtendedResponse.profiles) &&
                Objects.equals(groups, getCommentsExtendedResponse.groups) &&
                Objects.equals(canPost, getCommentsExtendedResponse.canPost) &&
                Objects.equals(showReplyButton, getCommentsExtendedResponse.showReplyButton) &&
                Objects.equals(items, getCommentsExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCommentsExtendedResponse{");
        sb.append("currentLevelCount=").append(currentLevelCount);
        sb.append(", count=").append(count);
        sb.append(", groupsCanPost=").append(groupsCanPost);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", canPost=").append(canPost);
        sb.append(", showReplyButton=").append(showReplyButton);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
