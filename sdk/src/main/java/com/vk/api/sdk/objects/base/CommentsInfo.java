package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.wall.WallpostCommentsDonut;
import java.util.Objects;

/**
 * CommentsInfo object
 */
public class CommentsInfo implements Validable {
    /**
     * Information whether current user can comment the post
     */
    @SerializedName("can_post")
    private BoolInt canPost;

    /**
     * Comments number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Information whether groups can comment the post
     */
    @SerializedName("groups_can_post")
    private Boolean groupsCanPost;

    @SerializedName("donut")
    private WallpostCommentsDonut donut;

    public boolean canPost() {
        return canPost == BoolInt.YES;
    }

    public BoolInt getCanPost() {
        return canPost;
    }

    public Integer getCount() {
        return count;
    }

    public CommentsInfo setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Boolean getGroupsCanPost() {
        return groupsCanPost;
    }

    public CommentsInfo setGroupsCanPost(Boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
        return this;
    }

    public WallpostCommentsDonut getDonut() {
        return donut;
    }

    public CommentsInfo setDonut(WallpostCommentsDonut donut) {
        this.donut = donut;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canPost, donut, count, groupsCanPost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsInfo commentsInfo = (CommentsInfo) o;
        return Objects.equals(donut, commentsInfo.donut) &&
                Objects.equals(count, commentsInfo.count) &&
                Objects.equals(groupsCanPost, commentsInfo.groupsCanPost) &&
                Objects.equals(canPost, commentsInfo.canPost);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CommentsInfo{");
        sb.append("donut=").append(donut);
        sb.append(", count=").append(count);
        sb.append(", groupsCanPost=").append(groupsCanPost);
        sb.append(", canPost=").append(canPost);
        sb.append('}');
        return sb.toString();
    }
}
