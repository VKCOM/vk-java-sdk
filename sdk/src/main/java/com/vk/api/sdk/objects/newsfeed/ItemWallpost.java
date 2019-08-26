package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.base.Geo;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;
import com.vk.api.sdk.objects.wall.PostSource;
import com.vk.api.sdk.objects.wall.Views;
import com.vk.api.sdk.objects.wall.Wallpost;
import com.vk.api.sdk.objects.wall.WallpostAttachment;
import java.util.List;
import java.util.Objects;

/**
 * ItemWallpost object
 */
public class ItemWallpost extends ItemBase implements Validable {
    @SerializedName("activity")
    private EventActivity activity;

    @SerializedName("attachments")
    private List<WallpostAttachment> attachments;

    @SerializedName("comments")
    private CommentsInfo comments;

    @SerializedName("copy_history")
    private List<Wallpost> copyHistory;

    @SerializedName("geo")
    private Geo geo;

    /**
     * Information whether the post in favorites list
     */
    @SerializedName("is_favorite")
    private Boolean isFavorite;

    @SerializedName("likes")
    private LikesInfo likes;

    /**
     * Information whether the post is marked as ads
     */
    @SerializedName("marked_as_ads")
    private BoolInt markedAsAds;

    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("post_source")
    private PostSource postSource;

    @SerializedName("post_type")
    private ItemWallpostType postType;

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

    public EventActivity getActivity() {
        return activity;
    }

    public ItemWallpost setActivity(EventActivity activity) {
        this.activity = activity;
        return this;
    }

    public List<WallpostAttachment> getAttachments() {
        return attachments;
    }

    public ItemWallpost setAttachments(List<WallpostAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public ItemWallpost setComments(CommentsInfo comments) {
        this.comments = comments;
        return this;
    }

    public List<Wallpost> getCopyHistory() {
        return copyHistory;
    }

    public ItemWallpost setCopyHistory(List<Wallpost> copyHistory) {
        this.copyHistory = copyHistory;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public ItemWallpost setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public ItemWallpost setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public ItemWallpost setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds == BoolInt.YES;
    }

    public BoolInt getMarkedAsAds() {
        return markedAsAds;
    }

    public Integer getPostId() {
        return postId;
    }

    public ItemWallpost setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public ItemWallpost setPostSource(PostSource postSource) {
        this.postSource = postSource;
        return this;
    }

    public ItemWallpostType getPostType() {
        return postType;
    }

    public ItemWallpost setPostType(ItemWallpostType postType) {
        this.postType = postType;
        return this;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public ItemWallpost setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
        return this;
    }

    public Integer getSignerId() {
        return signerId;
    }

    public ItemWallpost setSignerId(Integer signerId) {
        this.signerId = signerId;
        return this;
    }

    public String getText() {
        return text;
    }

    public ItemWallpost setText(String text) {
        this.text = text;
        return this;
    }

    public Views getViews() {
        return views;
    }

    public ItemWallpost setViews(Views views) {
        this.views = views;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachments, comments, activity, postType, postSource, postId, geo, signerId, text, markedAsAds, reposts, views, isFavorite, copyHistory, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemWallpost itemWallpost = (ItemWallpost) o;
        return Objects.equals(attachments, itemWallpost.attachments) &&
                Objects.equals(comments, itemWallpost.comments) &&
                Objects.equals(isFavorite, itemWallpost.isFavorite) &&
                Objects.equals(activity, itemWallpost.activity) &&
                Objects.equals(signerId, itemWallpost.signerId) &&
                Objects.equals(copyHistory, itemWallpost.copyHistory) &&
                Objects.equals(geo, itemWallpost.geo) &&
                Objects.equals(postId, itemWallpost.postId) &&
                Objects.equals(postSource, itemWallpost.postSource) &&
                Objects.equals(markedAsAds, itemWallpost.markedAsAds) &&
                Objects.equals(postType, itemWallpost.postType) &&
                Objects.equals(text, itemWallpost.text) &&
                Objects.equals(reposts, itemWallpost.reposts) &&
                Objects.equals(views, itemWallpost.views) &&
                Objects.equals(likes, itemWallpost.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemWallpost{");
        sb.append("attachments=").append(attachments);
        sb.append(", comments=").append(comments);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", activity=").append(activity);
        sb.append(", signerId=").append(signerId);
        sb.append(", copyHistory=").append(copyHistory);
        sb.append(", geo=").append(geo);
        sb.append(", postId=").append(postId);
        sb.append(", postSource=").append(postSource);
        sb.append(", markedAsAds=").append(markedAsAds);
        sb.append(", postType=").append(postType);
        sb.append(", text='").append(text).append("'");
        sb.append(", reposts=").append(reposts);
        sb.append(", views=").append(views);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
