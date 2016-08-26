package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * CatElement object
 */
public class CatElement {
    /**
     * Element ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Element owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Element title
     */
    @SerializedName("title")
    private String title;

    /**
     * Element type
     */
    @SerializedName("type")
    private CatElementType type;

    /**
     * Element description
     */
    @SerializedName("description")
    private String description;

    /**
     * Duration in seconds
     */
    @SerializedName("duration")
    private Integer duration;

    /**
     * URL of the preview image with 130 px in width
     */
    @SerializedName("photo_130")
    private String photo130;

    /**
     * URL of the preview image with 160 px in width
     */
    @SerializedName("photo_160")
    private String photo160;

    /**
     * URL of the preview image with 320 px in width
     */
    @SerializedName("photo_320")
    private String photo320;

    /**
     * URL of the preview image with 640 px in width
     */
    @SerializedName("photo_640")
    private String photo640;

    /**
     * URL of the preview image with 800 px in width
     */
    @SerializedName("photo_800")
    private String photo800;

    /**
     * Date when the element has been created
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Views number
     */
    @SerializedName("views")
    private Integer views;

    /**
     * Comments number
     */
    @SerializedName("comments")
    private Integer comments;

    /**
     * Information whether current user can add the video
     */
    @SerializedName("can_add")
    private Integer canAdd;

    /**
     * Information whether current user can edit the video
     */
    @SerializedName("can_edit")
    private Integer canEdit;

    /**
     * Information whether the video is private
     */
    @SerializedName("is_private")
    private Integer isPrivate;

    /**
     * Videos number (for album)
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Date of last update (for album) in Unixtime
     */
    @SerializedName("updated_time")
    private Integer updatedTime;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public CatElementType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getPhoto130() {
        return photo130;
    }

    public String getPhoto160() {
        return photo160;
    }

    public String getPhoto320() {
        return photo320;
    }

    public String getPhoto640() {
        return photo640;
    }

    public String getPhoto800() {
        return photo800;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getViews() {
        return views;
    }

    public Integer getComments() {
        return comments;
    }

    public Integer getCanAdd() {
        return canAdd;
    }

    public Integer getCanEdit() {
        return canEdit;
    }

    public Integer getIsPrivate() {
        return isPrivate;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, updatedTime, comments, canEdit, canAdd, count, description, photo640, isPrivate, ownerId, title, type, photo800, duration, photo160, photo320, photo130, id, views);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatElement catElement = (CatElement) o;
        return Objects.equals(id, catElement.id) &&
                Objects.equals(ownerId, catElement.ownerId) &&
                Objects.equals(title, catElement.title) &&
                Objects.equals(type, catElement.type) &&
                Objects.equals(description, catElement.description) &&
                Objects.equals(duration, catElement.duration) &&
                Objects.equals(photo130, catElement.photo130) &&
                Objects.equals(photo160, catElement.photo160) &&
                Objects.equals(photo320, catElement.photo320) &&
                Objects.equals(photo640, catElement.photo640) &&
                Objects.equals(photo800, catElement.photo800) &&
                Objects.equals(date, catElement.date) &&
                Objects.equals(views, catElement.views) &&
                Objects.equals(comments, catElement.comments) &&
                Objects.equals(canAdd, catElement.canAdd) &&
                Objects.equals(canEdit, catElement.canEdit) &&
                Objects.equals(isPrivate, catElement.isPrivate) &&
                Objects.equals(count, catElement.count) &&
                Objects.equals(updatedTime, catElement.updatedTime);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CatElement{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", duration=").append(duration);
        sb.append(", photo130='").append(photo130).append("'");
        sb.append(", photo160='").append(photo160).append("'");
        sb.append(", photo320='").append(photo320).append("'");
        sb.append(", photo640='").append(photo640).append("'");
        sb.append(", photo800='").append(photo800).append("'");
        sb.append(", date=").append(date);
        sb.append(", views=").append(views);
        sb.append(", comments=").append(comments);
        sb.append(", canAdd=").append(canAdd);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", isPrivate=").append(isPrivate);
        sb.append(", count=").append(count);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append('}');
        return sb.toString();
    }
}
