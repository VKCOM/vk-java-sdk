package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;

import java.util.List;
import java.util.Objects;

/**
 * WallPostFull object
 */
public class WallPostFull extends WallPost {
    @SerializedName("copy_history")
    private List<WallPost> copyHistory;

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

    public List<WallPost> getCopyHistory() {
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
        return Objects.hash(super.hashCode(), comments, createdBy, isPinned, canEdit, canDelete, canPin, reposts, copyHistory, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WallPostFull wallpostFull = (WallPostFull) o;
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
        final StringBuilder sb = new StringBuilder("WallPostFull{");
        sb.append("attachments=").append(getAttachments());
        sb.append(", canDelete=").append(canDelete);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", canPin=").append(canPin);
        sb.append(", comments=").append(comments);
        sb.append(", copyHistory=").append(copyHistory);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", date=").append(getDate());
        sb.append(", fromId=").append(getFromId());
        sb.append(", geo=").append(getGeo());
        sb.append(", id=").append(getId());
        sb.append(", isPinned=").append(isPinned);
        sb.append(", likes=").append(likes);
        sb.append(", ownerId=").append(getOwnerId());
        sb.append(", postSource=").append(getPostSource());
        sb.append(", postType=").append(getPostType());
        sb.append(", reposts=").append(reposts);
        sb.append(", signerId=").append(getSignerId());
        sb.append(", text='").append(getText()).append('\'');
        sb.append(", views=").append(getViews());
        sb.append('}');
        return sb.toString();
    }
}
