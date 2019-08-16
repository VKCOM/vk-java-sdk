package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.base.LikesInfo;
import java.util.Objects;

/**
 * ItemTopic object
 */
public class ItemTopic extends ItemBase implements Validable {
    @SerializedName("comments")
    private CommentsInfo comments;

    @SerializedName("likes")
    private LikesInfo likes;

    /**
     * Topic post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    /**
     * Post text
     */
    @SerializedName("text")
    @Required
    private String text;

    public CommentsInfo getComments() {
        return comments;
    }

    public ItemTopic setComments(CommentsInfo comments) {
        this.comments = comments;
        return this;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public ItemTopic setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public ItemTopic setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public String getText() {
        return text;
    }

    public ItemTopic setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, postId, text, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemTopic itemTopic = (ItemTopic) o;
        return Objects.equals(comments, itemTopic.comments) &&
                Objects.equals(postId, itemTopic.postId) &&
                Objects.equals(text, itemTopic.text) &&
                Objects.equals(likes, itemTopic.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemTopic{");
        sb.append("comments=").append(comments);
        sb.append(", postId=").append(postId);
        sb.append(", text='").append(text).append("'");
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
