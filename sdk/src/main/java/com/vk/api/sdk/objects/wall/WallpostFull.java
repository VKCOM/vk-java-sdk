package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;

import java.util.List;
import java.util.Objects;

/**
 * WallpostFull object
 */
public class WallpostFull extends Wallpost {
    @SerializedName("copy_history")
    private List<Wallpost> copyHistory;

    /**
     * Information whether current user can edit the post
     */
    @SerializedName("can_edit")
    private Integer canEdit;

    /**
     * Post creator ID (if post still can be edited)
     */
    @SerializedName("created_by")
    private Integer createdBy;

    /**
     * Information whether current user can delete the post
     */
    @SerializedName("can_delete")
    private Integer canDelete;

    /**
     * Information whether current user can pin the post
     */
    @SerializedName("can_pin")
    private Integer canPin;

    /**
     * Information whether the post is pinned
     */
    @SerializedName("is_pinned")
    private Integer isPinned;

    @SerializedName("comments")
    private CommentsInfo comments;

    @SerializedName("likes")
    private LikesInfo likes;

    @SerializedName("reposts")
    private RepostsInfo reposts;

    public List<Wallpost> getCopyHistory() {
        return copyHistory;
    }

    public Integer getCanEdit() {
        return canEdit;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public Integer getCanDelete() {
        return canDelete;
    }

    public Integer getCanPin() {
        return canPin;
    }

    public Integer getIsPinned() {
        return isPinned;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, createdBy, isPinned, canEdit, canDelete, canPin, reposts, copyHistory, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostFull wallpostFull = (WallpostFull) o;
        return Objects.equals(copyHistory, wallpostFull.copyHistory) &&
                Objects.equals(canEdit, wallpostFull.canEdit) &&
                Objects.equals(createdBy, wallpostFull.createdBy) &&
                Objects.equals(canDelete, wallpostFull.canDelete) &&
                Objects.equals(canPin, wallpostFull.canPin) &&
                Objects.equals(isPinned, wallpostFull.isPinned) &&
                Objects.equals(comments, wallpostFull.comments) &&
                Objects.equals(likes, wallpostFull.likes) &&
                Objects.equals(reposts, wallpostFull.reposts);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WallpostFull{");
        sb.append("copyHistory=").append(copyHistory);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", canDelete=").append(canDelete);
        sb.append(", canPin=").append(canPin);
        sb.append(", isPinned=").append(isPinned);
        sb.append(", comments=").append(comments);
        sb.append(", likes=").append(likes);
        sb.append(", reposts=").append(reposts);
        sb.append('}');
        return sb.toString();
    }
}
