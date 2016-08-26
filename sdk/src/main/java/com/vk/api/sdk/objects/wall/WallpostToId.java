package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.base.Geo;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;

import java.util.List;
import java.util.Objects;

/**
 * WallpostToId object
 */
public class WallpostToId {
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
     * Wall owner's ID
     */
    @SerializedName("to_id")
    private Integer toId;

    /**
     * Date of publishing in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * wall post ID (if comment)
     */
    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("post_type")
    private PostType postType;

    /**
     * Post text
     */
    @SerializedName("text")
    private String text;

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
     * ID of the source post owner
     */
    @SerializedName("copy_owner_id")
    private Integer copyOwnerId;

    /**
     * ID of the source post
     */
    @SerializedName("copy_post_id")
    private Integer copyPostId;

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

    public Integer getPostId() {
        return postId;
    }

    public PostType getPostType() {
        return postType;
    }

    public String getText() {
        return text;
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

    @Override
    public int hashCode() {
        return Objects.hash(toId, date, attachments, comments, postType, postSource, postId, fromId, copyPostId, geo, signerId, id, text, copyOwnerId, reposts, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostToId wallpostToId = (WallpostToId) o;
        return Objects.equals(id, wallpostToId.id) &&
                Objects.equals(fromId, wallpostToId.fromId) &&
                Objects.equals(toId, wallpostToId.toId) &&
                Objects.equals(date, wallpostToId.date) &&
                Objects.equals(postId, wallpostToId.postId) &&
                Objects.equals(postType, wallpostToId.postType) &&
                Objects.equals(text, wallpostToId.text) &&
                Objects.equals(signerId, wallpostToId.signerId) &&
                Objects.equals(attachments, wallpostToId.attachments) &&
                Objects.equals(geo, wallpostToId.geo) &&
                Objects.equals(postSource, wallpostToId.postSource) &&
                Objects.equals(comments, wallpostToId.comments) &&
                Objects.equals(likes, wallpostToId.likes) &&
                Objects.equals(reposts, wallpostToId.reposts) &&
                Objects.equals(copyOwnerId, wallpostToId.copyOwnerId) &&
                Objects.equals(copyPostId, wallpostToId.copyPostId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WallpostToId{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", toId=").append(toId);
        sb.append(", date=").append(date);
        sb.append(", postId=").append(postId);
        sb.append(", postType=").append(postType);
        sb.append(", text='").append(text).append("'");
        sb.append(", signerId=").append(signerId);
        sb.append(", attachments=").append(attachments);
        sb.append(", geo=").append(geo);
        sb.append(", postSource=").append(postSource);
        sb.append(", comments=").append(comments);
        sb.append(", likes=").append(likes);
        sb.append(", reposts=").append(reposts);
        sb.append(", copyOwnerId=").append(copyOwnerId);
        sb.append(", copyPostId=").append(copyPostId);
        sb.append('}');
        return sb.toString();
    }
}
