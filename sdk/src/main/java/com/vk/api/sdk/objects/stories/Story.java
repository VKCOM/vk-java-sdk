package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.Objects;

public class Story {

    @SerializedName("id")
    private Integer id;

    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("date")
    private Integer date;

    @SerializedName("is_expired")
    private Boolean isExpired;

    @SerializedName("is_deleted")
    private Boolean isDeleted;

    @SerializedName("can_see")
    private BoolInt canSee;

    @SerializedName("seen")
    private BoolInt seen;

    @SerializedName("type")
    private StoryType type;

    @SerializedName("photo")
    private Photo photo;

    @SerializedName("video")
    private StoryVideo video;

    @SerializedName("link")
    private Link link;

    @SerializedName("parent_story_owner_id")
    private Integer parentStoryOwnerId;

    @SerializedName("parent_story_id")
    private Integer parentStoryId;

    @SerializedName("parent_story")
    private Story parentStory;

    @SerializedName("replies")
    private Replies replies;

    @SerializedName("can_reply")
    private BoolInt canReply;

    @SerializedName("can_share")
    private BoolInt canShare;

    @SerializedName("can_comment")
    private BoolInt canComment;

    @SerializedName("views")
    private Integer views;

    @SerializedName("access_key")
    private String accessKey;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getDate() {
        return date;
    }

    public boolean isExpired() {
        return isExpired != null && isExpired.equals(true);
    }

    public boolean isDeleted() {
        return isDeleted != null && isDeleted.equals(true);
    }

    public boolean canSee() {
        return canSee == BoolInt.YES;
    }

    public boolean isSeen() {
        return seen == BoolInt.YES;
    }

    public StoryType getType() {
        return type;
    }

    public Photo getPhoto() {
        return photo;
    }

    public StoryVideo getVideo() {
        return video;
    }

    public Link getLink() {
        return link;
    }

    public Integer getParentStoryOwnerId() {
        return parentStoryOwnerId;
    }

    public Integer getParentStoryId() {
        return parentStoryId;
    }

    public Story getParentStory() {
        return parentStory;
    }

    public Replies getReplies() {
        return replies;
    }

    public boolean canReply() {
        return canReply == BoolInt.YES;
    }

    public boolean canShare() {
        return canShare == BoolInt.YES;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public Integer getViews() {
        return views;
    }

    public String getAccessKey() {
        return accessKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Story story = (Story) o;
        return Objects.equals(id, story.id) &&
            Objects.equals(ownerId, story.ownerId) &&
            Objects.equals(date, story.date) &&
            Objects.equals(isExpired, story.isExpired) &&
            Objects.equals(isDeleted, story.isDeleted) &&
            canSee == story.canSee &&
            Objects.equals(seen, story.seen) &&
            type == story.type &&
            Objects.equals(photo, story.photo) &&
            Objects.equals(video, story.video) &&
            Objects.equals(link, story.link) &&
            Objects.equals(parentStoryOwnerId, story.parentStoryOwnerId) &&
            Objects.equals(parentStoryId, story.parentStoryId) &&
            Objects.equals(parentStory, story.parentStory) &&
            Objects.equals(replies, story.replies) &&
            canReply == story.canReply &&
            canShare == story.canShare &&
            canComment == story.canComment &&
            Objects.equals(views, story.views) &&
            Objects.equals(accessKey, story.accessKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ownerId, date, isExpired, isDeleted, canSee, seen, type, photo, video, link, parentStoryOwnerId, parentStoryId, parentStory, replies, canReply, canShare, canComment, views, accessKey);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Story{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", date=").append(date);
        sb.append(", isExpired=").append(isExpired());
        sb.append(", isDeleted=").append(isDeleted());
        sb.append(", canSee=").append(canSee());
        sb.append(", seen=").append(isSeen());
        sb.append(", type=").append(type);
        sb.append(", photo=").append(photo);
        sb.append(", video=").append(video);
        sb.append(", link=").append(link);
        sb.append(", parentStoryOwnerId=").append(parentStoryOwnerId);
        sb.append(", parentStoryId=").append(parentStoryId);
        sb.append(", parentStory=").append(parentStory);
        sb.append(", replies=").append(replies);
        sb.append(", canReply=").append(canReply());
        sb.append(", canShare=").append(canShare());
        sb.append(", canComment=").append(canComment());
        sb.append(", views=").append(views);
        sb.append(", accessKey=").append(accessKey);
        sb.append('}');
        return sb.toString();
    }
}
