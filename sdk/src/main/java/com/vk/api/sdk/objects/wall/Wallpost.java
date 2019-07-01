package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;
import java.util.List;
import java.util.Objects;

/**
 * Wallpost object
 */
public class Wallpost implements Validable {
    /**
     * Access key to private object
     */
    @SerializedName("access_key")
    private String accessKey;

    @SerializedName("attachments")
    private List<WallpostAttachment> attachments;

    /**
     * Date of publishing in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Date of editing in Unixtime
     */
    @SerializedName("edited")
    private Integer edited;

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
     * Is post archived, only for post owners
     */
    @SerializedName("is_archived")
    private Boolean isArchived;

    /**
     * Information whether the post in favorites list
     */
    @SerializedName("is_favorite")
    private Boolean isFavorite;

    /**
     * Count of likes
     */
    @SerializedName("likes")
    private LikesInfo likes;

    /**
     * Wall owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("post_source")
    private PostSource postSource;

    @SerializedName("post_type")
    private PostType postType;

    /**
     * Count of views
     */
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
     * Count of views
     */
    @SerializedName("views")
    private Views views;

    public String getAccessKey() {
        return accessKey;
    }

    public Wallpost setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public List<WallpostAttachment> getAttachments() {
        return attachments;
    }

    public Wallpost setAttachments(List<WallpostAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Wallpost setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getEdited() {
        return edited;
    }

    public Wallpost setEdited(Integer edited) {
        this.edited = edited;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Wallpost setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public Wallpost setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Wallpost setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }

    public Wallpost setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public Wallpost setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public Wallpost setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Wallpost setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public Wallpost setPostSource(PostSource postSource) {
        this.postSource = postSource;
        return this;
    }

    public PostType getPostType() {
        return postType;
    }

    public Wallpost setPostType(PostType postType) {
        this.postType = postType;
        return this;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public Wallpost setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
        return this;
    }

    public Integer getSignerId() {
        return signerId;
    }

    public Wallpost setSignerId(Integer signerId) {
        this.signerId = signerId;
        return this;
    }

    public String getText() {
        return text;
    }

    public Wallpost setText(String text) {
        this.text = text;
        return this;
    }

    public Views getViews() {
        return views;
    }

    public Wallpost setViews(Views views) {
        this.views = views;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, attachments, edited, postType, isArchived, postSource, ownerId, fromId, geo, signerId, accessKey, id, text, reposts, views, isFavorite, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wallpost wallpost = (Wallpost) o;
        return Objects.equals(date, wallpost.date) &&
                Objects.equals(attachments, wallpost.attachments) &&
                Objects.equals(fromId, wallpost.fromId) &&
                Objects.equals(isFavorite, wallpost.isFavorite) &&
                Objects.equals(signerId, wallpost.signerId) &&
                Objects.equals(edited, wallpost.edited) &&
                Objects.equals(ownerId, wallpost.ownerId) &&
                Objects.equals(geo, wallpost.geo) &&
                Objects.equals(isArchived, wallpost.isArchived) &&
                Objects.equals(postSource, wallpost.postSource) &&
                Objects.equals(accessKey, wallpost.accessKey) &&
                Objects.equals(postType, wallpost.postType) &&
                Objects.equals(id, wallpost.id) &&
                Objects.equals(text, wallpost.text) &&
                Objects.equals(reposts, wallpost.reposts) &&
                Objects.equals(views, wallpost.views) &&
                Objects.equals(likes, wallpost.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Wallpost{");
        sb.append("date=").append(date);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", signerId=").append(signerId);
        sb.append(", edited=").append(edited);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", geo=").append(geo);
        sb.append(", isArchived=").append(isArchived);
        sb.append(", postSource=").append(postSource);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", postType=").append(postType);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", reposts=").append(reposts);
        sb.append(", views=").append(views);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
