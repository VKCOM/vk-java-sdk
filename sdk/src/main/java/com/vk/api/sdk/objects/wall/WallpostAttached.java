package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.base.Geo;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;

import java.util.List;
import java.util.Objects;

/**
 * WallpostAttached object
 */
public class WallpostAttached {
    /**
     * Post ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Post author ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Post addresse
     */
    @SerializedName("to_id")
    private Integer toId;

    /**
     * Date of publishing in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    @SerializedName("post_type")
    private PostType postType;

    /**
     * Post text
     */
    @SerializedName("text")
    private String text;

    /**
     * Information whether current user can delete the post
     */
    @SerializedName("can_delete")
    private Integer canDelete;

    /**
     * Post signer ID
     */
    @SerializedName("signer_id")
    private Integer signerId;

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

    /**
     * Source post owner's ID
     */
    @SerializedName("copy_owner_id")
    private Integer copyOwnerId;

    /**
     * Source post ID
     */
    @SerializedName("copy_post_id")
    private Integer copyPostId;

    /**
     * Repost comment
     */
    @SerializedName("copy_text")
    private String copyText;

    public Integer getId() {
        return id;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public Integer getDate() {
        return date;
    }

    public PostType getPostType() {
        return postType;
    }

    public String getText() {
        return text;
    }

    public Integer getCanDelete() {
        return canDelete;
    }

    public Integer getSignerId() {
        return signerId;
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

    public Integer getCopyOwnerId() {
        return copyOwnerId;
    }

    public Integer getCopyPostId() {
        return copyPostId;
    }

    public String getCopyText() {
        return copyText;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toId, date, attachments, comments, postType, postSource, fromId, copyPostId, geo, signerId, copyText, canDelete, id, text, copyOwnerId, reposts, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostAttached wallpostAttached = (WallpostAttached) o;
        return Objects.equals(id, wallpostAttached.id) &&
                Objects.equals(fromId, wallpostAttached.fromId) &&
                Objects.equals(toId, wallpostAttached.toId) &&
                Objects.equals(date, wallpostAttached.date) &&
                Objects.equals(postType, wallpostAttached.postType) &&
                Objects.equals(text, wallpostAttached.text) &&
                Objects.equals(canDelete, wallpostAttached.canDelete) &&
                Objects.equals(signerId, wallpostAttached.signerId) &&
                Objects.equals(attachments, wallpostAttached.attachments) &&
                Objects.equals(geo, wallpostAttached.geo) &&
                Objects.equals(postSource, wallpostAttached.postSource) &&
                Objects.equals(comments, wallpostAttached.comments) &&
                Objects.equals(likes, wallpostAttached.likes) &&
                Objects.equals(reposts, wallpostAttached.reposts) &&
                Objects.equals(copyOwnerId, wallpostAttached.copyOwnerId) &&
                Objects.equals(copyPostId, wallpostAttached.copyPostId) &&
                Objects.equals(copyText, wallpostAttached.copyText);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WallpostAttached{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", toId=").append(toId);
        sb.append(", date=").append(date);
        sb.append(", postType=").append(postType);
        sb.append(", text='").append(text).append("'");
        sb.append(", canDelete=").append(canDelete);
        sb.append(", signerId=").append(signerId);
        sb.append(", attachments=").append(attachments);
        sb.append(", geo=").append(geo);
        sb.append(", postSource=").append(postSource);
        sb.append(", comments=").append(comments);
        sb.append(", likes=").append(likes);
        sb.append(", reposts=").append(reposts);
        sb.append(", copyOwnerId=").append(copyOwnerId);
        sb.append(", copyPostId=").append(copyPostId);
        sb.append(", copyText='").append(copyText).append("'");
        sb.append('}');
        return sb.toString();
    }
}
