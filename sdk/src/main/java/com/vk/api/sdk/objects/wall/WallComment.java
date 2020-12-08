package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.comment.Thread;
import java.util.List;
import java.util.Objects;

/**
 * WallComment object
 */
public class WallComment implements Validable {
    @SerializedName("attachments")
    private List<CommentAttachment> attachments;

    /**
     * Date when the comment has been added in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    @SerializedName("donut")
    private WallCommentDonut donut;

    /**
     * Author ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Comment ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("likes")
    private LikesInfo likes;

    /**
     * Real position of the comment
     */
    @SerializedName("real_offset")
    private Integer realOffset;

    /**
     * Replied comment ID
     */
    @SerializedName("reply_to_comment")
    private Integer replyToComment;

    /**
     * Replied user ID
     */
    @SerializedName("reply_to_user")
    private Integer replyToUser;

    /**
     * Comment text
     */
    @SerializedName("text")
    @Required
    private String text;

    @SerializedName("thread")
    private Thread thread;

    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("parents_stack")
    private List<Integer> parentsStack;

    @SerializedName("deleted")
    private Boolean deleted;

    public List<CommentAttachment> getAttachments() {
        return attachments;
    }

    public WallComment setAttachments(List<CommentAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public WallComment setDate(Integer date) {
        this.date = date;
        return this;
    }

    public WallCommentDonut getDonut() {
        return donut;
    }

    public WallComment setDonut(WallCommentDonut donut) {
        this.donut = donut;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public WallComment setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public WallComment setId(Integer id) {
        this.id = id;
        return this;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public WallComment setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    public WallComment setRealOffset(Integer realOffset) {
        this.realOffset = realOffset;
        return this;
    }

    public Integer getReplyToComment() {
        return replyToComment;
    }

    public WallComment setReplyToComment(Integer replyToComment) {
        this.replyToComment = replyToComment;
        return this;
    }

    public Integer getReplyToUser() {
        return replyToUser;
    }

    public WallComment setReplyToUser(Integer replyToUser) {
        this.replyToUser = replyToUser;
        return this;
    }

    public String getText() {
        return text;
    }

    public WallComment setText(String text) {
        this.text = text;
        return this;
    }

    public Thread getThread() {
        return thread;
    }

    public WallComment setThread(Thread thread) {
        this.thread = thread;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public WallComment setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public WallComment setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public List<Integer> getParentsStack() {
        return parentsStack;
    }

    public WallComment setParentsStack(List<Integer> parentsStack) {
        this.parentsStack = parentsStack;
        return this;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public WallComment setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, attachments, thread, postId, ownerId, fromId, replyToComment, parentsStack, realOffset, deleted, donut, id, text, replyToUser, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallComment wallComment = (WallComment) o;
        return Objects.equals(date, wallComment.date) &&
                Objects.equals(attachments, wallComment.attachments) &&
                Objects.equals(fromId, wallComment.fromId) &&
                Objects.equals(replyToComment, wallComment.replyToComment) &&
                Objects.equals(parentsStack, wallComment.parentsStack) &&
                Objects.equals(ownerId, wallComment.ownerId) &&
                Objects.equals(thread, wallComment.thread) &&
                Objects.equals(realOffset, wallComment.realOffset) &&
                Objects.equals(deleted, wallComment.deleted) &&
                Objects.equals(postId, wallComment.postId) &&
                Objects.equals(replyToUser, wallComment.replyToUser) &&
                Objects.equals(donut, wallComment.donut) &&
                Objects.equals(id, wallComment.id) &&
                Objects.equals(text, wallComment.text) &&
                Objects.equals(likes, wallComment.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallComment{");
        sb.append("date=").append(date);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", replyToComment=").append(replyToComment);
        sb.append(", parentsStack=").append(parentsStack);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", thread=").append(thread);
        sb.append(", realOffset=").append(realOffset);
        sb.append(", deleted=").append(deleted);
        sb.append(", postId=").append(postId);
        sb.append(", replyToUser=").append(replyToUser);
        sb.append(", donut=").append(donut);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
