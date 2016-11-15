package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.PropertyExists;

import java.util.Objects;

/**
 * VideoTagInfo object
 */
public class VideoTagInfo {
    /**
     * Video ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Video owner ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Video title
     */
    @SerializedName("title")
    private String title;

    /**
     * Video duration in seconds
     */
    @SerializedName("duration")
    private Integer duration;

    /**
     * Video description
     */
    @SerializedName("description")
    private String description;

    /**
     * Date when video has been uploaded in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Number of views
     */
    @SerializedName("views")
    private Integer views;

    /**
     * Number of comments
     */
    @SerializedName("comments")
    private Integer comments;

    /**
     * URL of the preview image with 130 px in width
     */
    @SerializedName("photo_130")
    private String photo130;

    /**
     * URL of the preview image with 320 px in width
     */
    @SerializedName("photo_320")
    private String photo320;

    /**
     * URL of the preview image with 800 px in width
     */
    @SerializedName("photo_800")
    private String photo800;

    /**
     * Video access key
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Date when the video has been added in Unixtime
     */
    @SerializedName("adding_date")
    private Integer addingDate;

    /**
     * URL of the page with a player that can be used to play the video in the browser.
     */
    @SerializedName("player")
    private String player;

    /**
     * Information whether current user can edit the video
     */
    @SerializedName("can_edit")
    private BoolInt canEdit;

    /**
     * Information whether current user can add the video
     */
    @SerializedName("can_add")
    private BoolInt canAdd;

    /**
     * Returns if the video is processing
     */
    @SerializedName("processing")
    private PropertyExists processing;

    /**
     * Returns if the video is live translation
     */
    @SerializedName("live")
    private PropertyExists live;

    @SerializedName("files")
    private VideoFiles files;

    /**
     * ID of the tag creator
     */
    @SerializedName("placer_id")
    private Integer placerId;

    /**
     * Date when tag has been added in Unixtime
     */
    @SerializedName("tag_created")
    private Integer tagCreated;

    /**
     * Tag ID
     */
    @SerializedName("tag_id")
    private Integer tagId;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
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

    public String getPhoto130() {
        return photo130;
    }

    public String getPhoto320() {
        return photo320;
    }

    public String getPhoto800() {
        return photo800;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public Integer getAddingDate() {
        return addingDate;
    }

    public String getPlayer() {
        return player;
    }

    public boolean canEdit() {
        return canEdit == BoolInt.YES;
    }

    public boolean canAdd() {
        return canAdd == BoolInt.YES;
    }

    public boolean isProcessing() {
        return processing == PropertyExists.PROPERTY_EXISTS;
    }

    public boolean isLive() {
        return live == PropertyExists.PROPERTY_EXISTS;
    }

    public VideoFiles getFiles() {
        return files;
    }

    public Integer getPlacerId() {
        return placerId;
    }

    public Integer getTagCreated() {
        return tagCreated;
    }

    public Integer getTagId() {
        return tagId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, comments, tagId, canEdit, canAdd, description, placerId, ownerId, title, photo800, duration, photo320, accessKey, photo130, processing, files, id, tagCreated, addingDate, views, live, player);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoTagInfo videoTagInfo = (VideoTagInfo) o;
        return Objects.equals(id, videoTagInfo.id) &&
                Objects.equals(ownerId, videoTagInfo.ownerId) &&
                Objects.equals(title, videoTagInfo.title) &&
                Objects.equals(duration, videoTagInfo.duration) &&
                Objects.equals(description, videoTagInfo.description) &&
                Objects.equals(date, videoTagInfo.date) &&
                Objects.equals(views, videoTagInfo.views) &&
                Objects.equals(comments, videoTagInfo.comments) &&
                Objects.equals(photo130, videoTagInfo.photo130) &&
                Objects.equals(photo320, videoTagInfo.photo320) &&
                Objects.equals(photo800, videoTagInfo.photo800) &&
                Objects.equals(accessKey, videoTagInfo.accessKey) &&
                Objects.equals(addingDate, videoTagInfo.addingDate) &&
                Objects.equals(player, videoTagInfo.player) &&
                Objects.equals(canEdit, videoTagInfo.canEdit) &&
                Objects.equals(canAdd, videoTagInfo.canAdd) &&
                Objects.equals(processing, videoTagInfo.processing) &&
                Objects.equals(live, videoTagInfo.live) &&
                Objects.equals(files, videoTagInfo.files) &&
                Objects.equals(placerId, videoTagInfo.placerId) &&
                Objects.equals(tagCreated, videoTagInfo.tagCreated) &&
                Objects.equals(tagId, videoTagInfo.tagId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoTagInfo{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", duration=").append(duration);
        sb.append(", description='").append(description).append("'");
        sb.append(", date=").append(date);
        sb.append(", views=").append(views);
        sb.append(", comments=").append(comments);
        sb.append(", photo130='").append(photo130).append("'");
        sb.append(", photo320='").append(photo320).append("'");
        sb.append(", photo800='").append(photo800).append("'");
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", addingDate=").append(addingDate);
        sb.append(", player='").append(player).append("'");
        sb.append(", canEdit=").append(canEdit);
        sb.append(", canAdd=").append(canAdd);
        sb.append(", processing=").append(processing);
        sb.append(", live=").append(live);
        sb.append(", files=").append(files);
        sb.append(", placerId=").append(placerId);
        sb.append(", tagCreated=").append(tagCreated);
        sb.append(", tagId=").append(tagId);
        sb.append('}');
        return sb.toString();
    }
}
