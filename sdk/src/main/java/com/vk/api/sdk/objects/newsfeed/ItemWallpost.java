package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.base.Geo;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;
import com.vk.api.sdk.objects.wall.PostSource;
import com.vk.api.sdk.objects.wall.WallPost;
import com.vk.api.sdk.objects.wall.WallpostAttachment;

import java.util.List;
import java.util.Objects;

/**
 * ItemWallpost object
 */
public class ItemWallpost {
    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    /**
     * Post type
     */
    @SerializedName("post_type")
    private ItemWallpostPostType postType;

    /**
     * Post text
     */
    @SerializedName("text")
    private String text;

    @SerializedName("copy_history")
    private List<WallPost> copyHistory;

    @SerializedName("attachments")
    private List<WallpostAttachment> attachments;

    @SerializedName("geo")
    private Geo geo;

    @SerializedName("post_source")
    private PostSource postSource;

    @SerializedName("comments")
    private CommentsInfo comments;

    @SerializedName("likes")
    private LikesInfo likes;

    @SerializedName("reposts")
    private RepostsInfo reposts;

    public Integer getPostId() {
        return postId;
    }

    public ItemWallpostPostType getPostType() {
        return postType;
    }

    public String getText() {
        return text;
    }

    public List<WallPost> getCopyHistory() {
        return copyHistory;
    }

    public List<WallpostAttachment> getAttachments() {
        return attachments;
    }

    public Geo getGeo() {
        return geo;
    }

    public PostSource getPostSource() {
        return postSource;
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
        return Objects.hash(geo, attachments, comments, postType, postSource, postId, text, reposts, copyHistory, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemWallpost itemWallpost = (ItemWallpost) o;
        return Objects.equals(postId, itemWallpost.postId) &&
                Objects.equals(postType, itemWallpost.postType) &&
                Objects.equals(text, itemWallpost.text) &&
                Objects.equals(copyHistory, itemWallpost.copyHistory) &&
                Objects.equals(attachments, itemWallpost.attachments) &&
                Objects.equals(geo, itemWallpost.geo) &&
                Objects.equals(postSource, itemWallpost.postSource) &&
                Objects.equals(comments, itemWallpost.comments) &&
                Objects.equals(likes, itemWallpost.likes) &&
                Objects.equals(reposts, itemWallpost.reposts);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemWallpost{");
        sb.append("postId=").append(postId);
        sb.append(", postType='").append(postType).append("'");
        sb.append(", text='").append(text).append("'");
        sb.append(", copyHistory=").append(copyHistory);
        sb.append(", attachments=").append(attachments);
        sb.append(", geo=").append(geo);
        sb.append(", postSource=").append(postSource);
        sb.append(", comments=").append(comments);
        sb.append(", likes=").append(likes);
        sb.append(", reposts=").append(reposts);
        sb.append('}');
        return sb.toString();
    }
}
