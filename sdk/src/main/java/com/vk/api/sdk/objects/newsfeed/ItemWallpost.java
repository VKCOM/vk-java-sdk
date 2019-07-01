package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.base.Geo;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;
import com.vk.api.sdk.objects.wall.PostSource;
import com.vk.api.sdk.objects.wall.Wallpost;
import com.vk.api.sdk.objects.wall.WallpostAttachment;
import java.util.List;
import java.util.Objects;

/**
 * ItemWallpost object
 */
public class ItemWallpost implements Validable {
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

    @SerializedName("likes")
    private LikesInfo likes;

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
     * Post text
     */
    @SerializedName("text")
    private String text;

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

    public LikesInfo getLikes() {
        return likes;
    }

    public ItemWallpost setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
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

    public String getText() {
        return text;
    }

    public ItemWallpost setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(geo, attachments, comments, activity, postType, postSource, postId, text, reposts, copyHistory, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemWallpost itemWallpost = (ItemWallpost) o;
        return Objects.equals(geo, itemWallpost.geo) &&
                Objects.equals(attachments, itemWallpost.attachments) &&
                Objects.equals(comments, itemWallpost.comments) &&
                Objects.equals(activity, itemWallpost.activity) &&
                Objects.equals(postId, itemWallpost.postId) &&
                Objects.equals(postSource, itemWallpost.postSource) &&
                Objects.equals(postType, itemWallpost.postType) &&
                Objects.equals(text, itemWallpost.text) &&
                Objects.equals(reposts, itemWallpost.reposts) &&
                Objects.equals(copyHistory, itemWallpost.copyHistory) &&
                Objects.equals(likes, itemWallpost.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemWallpost{");
        sb.append("geo=").append(geo);
        sb.append(", attachments=").append(attachments);
        sb.append(", comments=").append(comments);
        sb.append(", activity=").append(activity);
        sb.append(", postId=").append(postId);
        sb.append(", postSource=").append(postSource);
        sb.append(", postType=").append(postType);
        sb.append(", text='").append(text).append("'");
        sb.append(", reposts=").append(reposts);
        sb.append(", copyHistory=").append(copyHistory);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
