package com.vk.api.sdk.objects.widgets;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;
import com.vk.api.sdk.objects.users.UserFull;
import com.vk.api.sdk.objects.wall.CommentAttachment;
import com.vk.api.sdk.objects.wall.PostSource;
import java.util.List;
import java.util.Objects;

/**
 * WidgetComment object
 */
public class WidgetComment implements Validable {
    @SerializedName("attachments")
    private List<CommentAttachment> attachments;

    /**
     * Information whether current user can delete the comment
     */
    @SerializedName("can_delete")
    private BoolInt canDelete;

    @SerializedName("comments")
    private CommentReplies comments;

    /**
     * Date when the comment has been added in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Comment author ID
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

    @SerializedName("media")
    private CommentMedia media;

    @SerializedName("post_source")
    private PostSource postSource;

    /**
     * Post type
     */
    @SerializedName("post_type")
    private Integer postType;

    @SerializedName("reposts")
    private RepostsInfo reposts;

    /**
     * Comment text
     */
    @SerializedName("text")
    @Required
    private String text;

    /**
     * Wall owner
     */
    @SerializedName("to_id")
    private Integer toId;

    @SerializedName("user")
    private UserFull user;

    public List<CommentAttachment> getAttachments() {
        return attachments;
    }

    public WidgetComment setAttachments(List<CommentAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public boolean canDelete() {
        return canDelete == BoolInt.YESBOOL;
    }

    public BoolInt getCanDelete() {
        return canDelete;
    }

    public CommentReplies getComments() {
        return comments;
    }

    public WidgetComment setComments(CommentReplies comments) {
        this.comments = comments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public WidgetComment setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public WidgetComment setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public WidgetComment setId(Integer id) {
        this.id = id;
        return this;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public WidgetComment setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public CommentMedia getMedia() {
        return media;
    }

    public WidgetComment setMedia(CommentMedia media) {
        this.media = media;
        return this;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public WidgetComment setPostSource(PostSource postSource) {
        this.postSource = postSource;
        return this;
    }

    public Integer getPostType() {
        return postType;
    }

    public WidgetComment setPostType(Integer postType) {
        this.postType = postType;
        return this;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public WidgetComment setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
        return this;
    }

    public String getText() {
        return text;
    }

    public WidgetComment setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getToId() {
        return toId;
    }

    public WidgetComment setToId(Integer toId) {
        this.toId = toId;
        return this;
    }

    public UserFull getUser() {
        return user;
    }

    public WidgetComment setUser(UserFull user) {
        this.user = user;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, toId, attachments, comments, postType, postSource, media, fromId, canDelete, id, text, user, reposts, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WidgetComment widgetComment = (WidgetComment) o;
        return Objects.equals(date, widgetComment.date) &&
                Objects.equals(attachments, widgetComment.attachments) &&
                Objects.equals(comments, widgetComment.comments) &&
                Objects.equals(fromId, widgetComment.fromId) &&
                Objects.equals(toId, widgetComment.toId) &&
                Objects.equals(media, widgetComment.media) &&
                Objects.equals(canDelete, widgetComment.canDelete) &&
                Objects.equals(postSource, widgetComment.postSource) &&
                Objects.equals(postType, widgetComment.postType) &&
                Objects.equals(id, widgetComment.id) &&
                Objects.equals(text, widgetComment.text) &&
                Objects.equals(user, widgetComment.user) &&
                Objects.equals(reposts, widgetComment.reposts) &&
                Objects.equals(likes, widgetComment.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WidgetComment{");
        sb.append("date=").append(date);
        sb.append(", attachments=").append(attachments);
        sb.append(", comments=").append(comments);
        sb.append(", fromId=").append(fromId);
        sb.append(", toId=").append(toId);
        sb.append(", media=").append(media);
        sb.append(", canDelete=").append(canDelete);
        sb.append(", postSource=").append(postSource);
        sb.append(", postType=").append(postType);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", user=").append(user);
        sb.append(", reposts=").append(reposts);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
