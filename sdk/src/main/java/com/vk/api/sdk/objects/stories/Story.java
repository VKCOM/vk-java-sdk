package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.photos.Photo;
import java.util.List;
import java.util.Objects;

/**
 * Story object
 */
public class Story {
    /**
     * Access key for private object.
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Information whether current user can comment the story (0 - no, 1 - yes).
     */
    @SerializedName("can_comment")
    private BoolInt canComment;

    /**
     * Information whether current user can reply to the story (0 - no, 1 - yes).
     */
    @SerializedName("can_reply")
    private BoolInt canReply;

    /**
     * Information whether current user can see the story (0 - no, 1 - yes).
     */
    @SerializedName("can_see")
    private BoolInt canSee;

    /**
     * Information whether current user can share the story (0 - no, 1 - yes).
     */
    @SerializedName("can_share")
    private BoolInt canShare;

    /**
     * Date when story has been added in Unixtime.
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Story ID.
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Information whether the story is deleted (false - no, true - yes).
     */
    @SerializedName("is_deleted")
    private Boolean isDeleted;

    /**
     * Information whether the story is expired (false - no, true - yes).
     */
    @SerializedName("is_expired")
    private Boolean isExpired;

    @SerializedName("link")
    private StoryLink link;

    /**
     * Story owner's ID.
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("parent_story")
    private Story parentStory;

    /**
     * Access key for private object.
     */
    @SerializedName("parent_story_access_key")
    private String parentStoryAccessKey;

    /**
     * Parent story ID.
     */
    @SerializedName("parent_story_id")
    private Integer parentStoryId;

    /**
     * Parent story owner's ID.
     */
    @SerializedName("parent_story_owner_id")
    private Integer parentStoryOwnerId;

    @SerializedName("photo")
    private Photo photo;

    /**
     * Replies to current story.
     */
    @SerializedName("replies")
    private List<Replies> replies;

    /**
     * Information whether current user has seen the story or not (0 - no, 1 - yes).
     */
    @SerializedName("seen")
    private BoolInt seen;

    @SerializedName("type")
    private StoryType type;

    @SerializedName("video")
    private StoryVideo video;

    /**
     * Views number.
     */
    @SerializedName("views")
    private Integer views;

    public String getAccessKey() {
        return accessKey;
    }

    public Story setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public BoolInt getCanComment() {
        return canComment;
    }

    public boolean canReply() {
        return canReply == BoolInt.YES;
    }

    public BoolInt getCanReply() {
        return canReply;
    }

    public boolean canSee() {
        return canSee == BoolInt.YES;
    }

    public BoolInt getCanSee() {
        return canSee;
    }

    public boolean canShare() {
        return canShare == BoolInt.YES;
    }

    public BoolInt getCanShare() {
        return canShare;
    }

    public Integer getDate() {
        return date;
    }

    public Story setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Story setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public Story setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public Boolean getIsExpired() {
        return isExpired;
    }

    public Story setIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
        return this;
    }

    public StoryLink getLink() {
        return link;
    }

    public Story setLink(StoryLink link) {
        this.link = link;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Story setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Story getParentStory() {
        return parentStory;
    }

    public Story setParentStory(Story parentStory) {
        this.parentStory = parentStory;
        return this;
    }

    public String getParentStoryAccessKey() {
        return parentStoryAccessKey;
    }

    public Story setParentStoryAccessKey(String parentStoryAccessKey) {
        this.parentStoryAccessKey = parentStoryAccessKey;
        return this;
    }

    public Integer getParentStoryId() {
        return parentStoryId;
    }

    public Story setParentStoryId(Integer parentStoryId) {
        this.parentStoryId = parentStoryId;
        return this;
    }

    public Integer getParentStoryOwnerId() {
        return parentStoryOwnerId;
    }

    public Story setParentStoryOwnerId(Integer parentStoryOwnerId) {
        this.parentStoryOwnerId = parentStoryOwnerId;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Story setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public List<Replies> getReplies() {
        return replies;
    }

    public Story setReplies(List<Replies> replies) {
        this.replies = replies;
        return this;
    }

    public boolean isSeen() {
        return seen == BoolInt.YES;
    }

    public BoolInt getSeen() {
        return seen;
    }

    public StoryType getType() {
        return type;
    }

    public Story setType(StoryType type) {
        this.type = type;
        return this;
    }

    public StoryVideo getVideo() {
        return video;
    }

    public Story setVideo(StoryVideo video) {
        this.video = video;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public Story setViews(Integer views) {
        this.views = views;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, canReply, canShare, link, photo, parentStoryId, video, ownerId, type, seen, parentStory, isDeleted, replies, accessKey, parentStoryOwnerId, canSee, canComment, id, isExpired, parentStoryAccessKey, views);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Story story = (Story) o;
        return Objects.equals(date, story.date) &&
                Objects.equals(ownerId, story.ownerId) &&
                Objects.equals(canShare, story.canShare) &&
                Objects.equals(link, story.link) &&
                Objects.equals(photo, story.photo) &&
                Objects.equals(video, story.video) &&
                Objects.equals(type, story.type) &&
                Objects.equals(parentStoryAccessKey, story.parentStoryAccessKey) &&
                Objects.equals(canSee, story.canSee) &&
                Objects.equals(seen, story.seen) &&
                Objects.equals(parentStory, story.parentStory) &&
                Objects.equals(parentStoryOwnerId, story.parentStoryOwnerId) &&
                Objects.equals(parentStoryId, story.parentStoryId) &&
                Objects.equals(canComment, story.canComment) &&
                Objects.equals(canReply, story.canReply) &&
                Objects.equals(isDeleted, story.isDeleted) &&
                Objects.equals(isExpired, story.isExpired) &&
                Objects.equals(replies, story.replies) &&
                Objects.equals(accessKey, story.accessKey) &&
                Objects.equals(id, story.id) &&
                Objects.equals(views, story.views);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Story{");
        sb.append("date=").append(date);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", canShare=").append(canShare);
        sb.append(", link=").append(link);
        sb.append(", photo=").append(photo);
        sb.append(", video=").append(video);
        sb.append(", type=").append(type);
        sb.append(", parentStoryAccessKey='").append(parentStoryAccessKey).append("'");
        sb.append(", canSee=").append(canSee);
        sb.append(", seen=").append(seen);
        sb.append(", parentStory=").append(parentStory);
        sb.append(", parentStoryOwnerId=").append(parentStoryOwnerId);
        sb.append(", parentStoryId=").append(parentStoryId);
        sb.append(", canComment=").append(canComment);
        sb.append(", canReply=").append(canReply);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", isExpired=").append(isExpired);
        sb.append(", replies=").append(replies);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", id=").append(id);
        sb.append(", views=").append(views);
        sb.append('}');
        return sb.toString();
    }
}
