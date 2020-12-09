package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;
import com.vk.api.sdk.objects.wall.Geo;
import com.vk.api.sdk.objects.wall.PostCopyright;
import com.vk.api.sdk.objects.wall.PostSource;
import com.vk.api.sdk.objects.wall.PostType;
import com.vk.api.sdk.objects.wall.Views;
import com.vk.api.sdk.objects.wall.WallpostAttachment;
import java.util.List;
import java.util.Objects;

/**
 * ItemDigestItem object
 */
public class ItemDigestItem implements Validable {
    /**
     * Access key to private object
     */
    @SerializedName("access_key")
    private String accessKey;

    @SerializedName("attachments")
    private List<WallpostAttachment> attachments;

    /**
     * Information about the source of the post
     */
    @SerializedName("copyright")
    private PostCopyright copyright;

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

    @SerializedName("poster")
    private JsonObject poster;

    /**
     * If post type 'reply', contains original post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    /**
     * If post type 'reply', contains original parent IDs stack
     */
    @SerializedName("parents_stack")
    private List<Integer> parentsStack;

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
     * Count of views
     */
    @SerializedName("views")
    private Views views;

    public String getAccessKey() {
        return accessKey;
    }

    public ItemDigestItem setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public List<WallpostAttachment> getAttachments() {
        return attachments;
    }

    public ItemDigestItem setAttachments(List<WallpostAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public PostCopyright getCopyright() {
        return copyright;
    }

    public ItemDigestItem setCopyright(PostCopyright copyright) {
        this.copyright = copyright;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public ItemDigestItem setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getEdited() {
        return edited;
    }

    public ItemDigestItem setEdited(Integer edited) {
        this.edited = edited;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public ItemDigestItem setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public ItemDigestItem setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public ItemDigestItem setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }

    public ItemDigestItem setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public ItemDigestItem setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public ItemDigestItem setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public ItemDigestItem setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public JsonObject getPoster() {
        return poster;
    }

    public ItemDigestItem setPoster(JsonObject poster) {
        this.poster = poster;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public ItemDigestItem setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public List<Integer> getParentsStack() {
        return parentsStack;
    }

    public ItemDigestItem setParentsStack(List<Integer> parentsStack) {
        this.parentsStack = parentsStack;
        return this;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public ItemDigestItem setPostSource(PostSource postSource) {
        this.postSource = postSource;
        return this;
    }

    public PostType getPostType() {
        return postType;
    }

    public ItemDigestItem setPostType(PostType postType) {
        this.postType = postType;
        return this;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public ItemDigestItem setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
        return this;
    }

    public Integer getSignerId() {
        return signerId;
    }

    public ItemDigestItem setSignerId(Integer signerId) {
        this.signerId = signerId;
        return this;
    }

    public String getText() {
        return text;
    }

    public ItemDigestItem setText(String text) {
        this.text = text;
        return this;
    }

    public Views getViews() {
        return views;
    }

    public ItemDigestItem setViews(Views views) {
        this.views = views;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, copyright, attachments, edited, postType, isArchived, postSource, postId, ownerId, fromId, geo, parentsStack, signerId, accessKey, id, text, poster, reposts, views, isFavorite, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDigestItem itemDigestItem = (ItemDigestItem) o;
        return Objects.equals(date, itemDigestItem.date) &&
                Objects.equals(copyright, itemDigestItem.copyright) &&
                Objects.equals(attachments, itemDigestItem.attachments) &&
                Objects.equals(fromId, itemDigestItem.fromId) &&
                Objects.equals(isFavorite, itemDigestItem.isFavorite) &&
                Objects.equals(signerId, itemDigestItem.signerId) &&
                Objects.equals(edited, itemDigestItem.edited) &&
                Objects.equals(parentsStack, itemDigestItem.parentsStack) &&
                Objects.equals(ownerId, itemDigestItem.ownerId) &&
                Objects.equals(geo, itemDigestItem.geo) &&
                Objects.equals(isArchived, itemDigestItem.isArchived) &&
                Objects.equals(postId, itemDigestItem.postId) &&
                Objects.equals(postSource, itemDigestItem.postSource) &&
                Objects.equals(accessKey, itemDigestItem.accessKey) &&
                Objects.equals(postType, itemDigestItem.postType) &&
                Objects.equals(id, itemDigestItem.id) &&
                Objects.equals(text, itemDigestItem.text) &&
                Objects.equals(poster, itemDigestItem.poster) &&
                Objects.equals(reposts, itemDigestItem.reposts) &&
                Objects.equals(views, itemDigestItem.views) &&
                Objects.equals(likes, itemDigestItem.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemDigestItem{");
        sb.append("date=").append(date);
        sb.append(", copyright=").append(copyright);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", signerId=").append(signerId);
        sb.append(", edited=").append(edited);
        sb.append(", parentsStack=").append(parentsStack);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", geo=").append(geo);
        sb.append(", isArchived=").append(isArchived);
        sb.append(", postId=").append(postId);
        sb.append(", postSource=").append(postSource);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", postType=").append(postType);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", poster=").append(poster);
        sb.append(", reposts=").append(reposts);
        sb.append(", views=").append(views);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
