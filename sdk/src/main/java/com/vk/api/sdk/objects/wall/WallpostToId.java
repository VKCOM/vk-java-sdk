package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;
import java.util.List;
import java.util.Objects;

/**
 * WallpostToId object
 */
public class WallpostToId implements Validable {
    @SerializedName("attachments")
    private List<WallpostAttachment> attachments;

    @SerializedName("comments")
    private CommentsInfo comments;

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

    /**
     * Date of publishing in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Post author ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    @SerializedName("geo")
    private Geo geo;

    /**
     * Post ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Information whether the post in favorites list
     */
    @SerializedName("is_favorite")
    private Boolean isFavorite;

    @SerializedName("likes")
    private LikesInfo likes;

    /**
     * wall post ID (if comment)
     */
    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("post_source")
    private PostSource postSource;

    @SerializedName("post_type")
    private PostType postType;

    @SerializedName("reposts")
    private RepostsInfo reposts;

    /**
     * Post signer ID
     */
    @SerializedName("signer_id")
    private Integer signerId;

    /**
     * Post text
     */
    @SerializedName("text")
    private String text;

    /**
     * Wall owner's ID
     */
    @SerializedName("to_id")
    private Integer toId;

    public List<WallpostAttachment> getAttachments() {
        return attachments;
    }

    public WallpostToId setAttachments(List<WallpostAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public WallpostToId setComments(CommentsInfo comments) {
        this.comments = comments;
        return this;
    }

    public Integer getCopyOwnerId() {
        return copyOwnerId;
    }

    public WallpostToId setCopyOwnerId(Integer copyOwnerId) {
        this.copyOwnerId = copyOwnerId;
        return this;
    }

    public Integer getCopyPostId() {
        return copyPostId;
    }

    public WallpostToId setCopyPostId(Integer copyPostId) {
        this.copyPostId = copyPostId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public WallpostToId setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public WallpostToId setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public WallpostToId setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public WallpostToId setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public WallpostToId setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public WallpostToId setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public WallpostToId setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public WallpostToId setPostSource(PostSource postSource) {
        this.postSource = postSource;
        return this;
    }

    public PostType getPostType() {
        return postType;
    }

    public WallpostToId setPostType(PostType postType) {
        this.postType = postType;
        return this;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public WallpostToId setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
        return this;
    }

    public Integer getSignerId() {
        return signerId;
    }

    public WallpostToId setSignerId(Integer signerId) {
        this.signerId = signerId;
        return this;
    }

    public String getText() {
        return text;
    }

    public WallpostToId setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getToId() {
        return toId;
    }

    public WallpostToId setToId(Integer toId) {
        this.toId = toId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, toId, attachments, comments, postType, postSource, postId, fromId, copyPostId, geo, signerId, copyOwnerId, id, text, reposts, isFavorite, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostToId wallpostToId = (WallpostToId) o;
        return Objects.equals(date, wallpostToId.date) &&
                Objects.equals(attachments, wallpostToId.attachments) &&
                Objects.equals(comments, wallpostToId.comments) &&
                Objects.equals(fromId, wallpostToId.fromId) &&
                Objects.equals(isFavorite, wallpostToId.isFavorite) &&
                Objects.equals(copyPostId, wallpostToId.copyPostId) &&
                Objects.equals(signerId, wallpostToId.signerId) &&
                Objects.equals(toId, wallpostToId.toId) &&
                Objects.equals(copyOwnerId, wallpostToId.copyOwnerId) &&
                Objects.equals(geo, wallpostToId.geo) &&
                Objects.equals(postId, wallpostToId.postId) &&
                Objects.equals(postSource, wallpostToId.postSource) &&
                Objects.equals(postType, wallpostToId.postType) &&
                Objects.equals(id, wallpostToId.id) &&
                Objects.equals(text, wallpostToId.text) &&
                Objects.equals(reposts, wallpostToId.reposts) &&
                Objects.equals(likes, wallpostToId.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallpostToId{");
        sb.append("date=").append(date);
        sb.append(", attachments=").append(attachments);
        sb.append(", comments=").append(comments);
        sb.append(", fromId=").append(fromId);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", copyPostId=").append(copyPostId);
        sb.append(", signerId=").append(signerId);
        sb.append(", toId=").append(toId);
        sb.append(", copyOwnerId=").append(copyOwnerId);
        sb.append(", geo=").append(geo);
        sb.append(", postId=").append(postId);
        sb.append(", postSource=").append(postSource);
        sb.append(", postType=").append(postType);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", reposts=").append(reposts);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
