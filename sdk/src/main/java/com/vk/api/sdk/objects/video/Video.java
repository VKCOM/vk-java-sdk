package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.PropertyExists;
import java.net.URL;
import java.util.Objects;

/**
 * Video object
 */
public class Video {
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
     * Information whether current user can add the video
     */
    @SerializedName("can_add")
    private BoolInt canAdd;

    /**
     * Information whether current user can comment the video
     */
    @SerializedName("can_comment")
    private BoolInt canComment;

    /**
     * Information whether current user can edit the video
     */
    @SerializedName("can_edit")
    private BoolInt canEdit;

    /**
     * Information whether current user can like the video
     */
    @SerializedName("can_like")
    private BoolInt canLike;

    /**
     * Information whether current user can repost this video
     */
    @SerializedName("can_repost")
    private BoolInt canRepost;

    /**
     * Number of comments
     */
    @SerializedName("comments")
    private Integer comments;

    /**
     * Date when video has been uploaded in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Video description
     */
    @SerializedName("description")
    private String description;

    /**
     * Video duration in seconds
     */
    @SerializedName("duration")
    private Integer duration;

    @SerializedName("files")
    private VideoFiles files;

    /**
     * URL of the first frame for the corresponding width.
     */
    @SerializedName("first_frame_130")
    private URL firstFrame130;

    /**
     * URL of the first frame for the corresponding width.
     */
    @SerializedName("first_frame_160")
    private URL firstFrame160;

    /**
     * URL of the first frame for the corresponding width.
     */
    @SerializedName("first_frame_320")
    private URL firstFrame320;

    /**
     * URL of the first frame for the corresponding width.
     */
    @SerializedName("first_frame_800")
    private URL firstFrame800;

    /**
     * Video height
     */
    @SerializedName("height")
    private Integer height;

    /**
     * Video ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("is_favorite")
    private Boolean isFavorite;

    /**
     * Returns if the video is a live stream
     */
    @SerializedName("live")
    private PropertyExists live;

    /**
     * Video owner ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * URL of the preview image with 130 px in width
     */
    @SerializedName("photo_130")
    private URL photo130;

    /**
     * URL of the preview image with 320 px in width
     */
    @SerializedName("photo_320")
    private URL photo320;

    /**
     * URL of the preview image with 800 px in width
     */
    @SerializedName("photo_800")
    private URL photo800;

    /**
     * URL of the page with a player that can be used to play the video in the browser.
     */
    @SerializedName("player")
    private URL player;

    /**
     * Returns if the video is processing
     */
    @SerializedName("processing")
    private PropertyExists processing;

    /**
     * Video title
     */
    @SerializedName("title")
    private String title;

    @SerializedName("type")
    private VideoType type;

    /**
     * Number of views
     */
    @SerializedName("views")
    private Integer views;

    /**
     * Video width
     */
    @SerializedName("width")
    private Integer width;

    public String getAccessKey() {
        return accessKey;
    }

    public Video setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getAddingDate() {
        return addingDate;
    }

    public Video setAddingDate(Integer addingDate) {
        this.addingDate = addingDate;
        return this;
    }

    public boolean canAdd() {
        return canAdd == BoolInt.YES;
    }

    public BoolInt getCanAdd() {
        return canAdd;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public BoolInt getCanComment() {
        return canComment;
    }

    public boolean canEdit() {
        return canEdit == BoolInt.YES;
    }

    public BoolInt getCanEdit() {
        return canEdit;
    }

    public boolean canLike() {
        return canLike == BoolInt.YES;
    }

    public BoolInt getCanLike() {
        return canLike;
    }

    public boolean canRepost() {
        return canRepost == BoolInt.YES;
    }

    public BoolInt getCanRepost() {
        return canRepost;
    }

    public Integer getComments() {
        return comments;
    }

    public Video setComments(Integer comments) {
        this.comments = comments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Video setDate(Integer date) {
        this.date = date;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Video setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public Video setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public VideoFiles getFiles() {
        return files;
    }

    public Video setFiles(VideoFiles files) {
        this.files = files;
        return this;
    }

    public URL getFirstFrame130() {
        return firstFrame130;
    }

    public Video setFirstFrame130(URL firstFrame130) {
        this.firstFrame130 = firstFrame130;
        return this;
    }

    public URL getFirstFrame160() {
        return firstFrame160;
    }

    public Video setFirstFrame160(URL firstFrame160) {
        this.firstFrame160 = firstFrame160;
        return this;
    }

    public URL getFirstFrame320() {
        return firstFrame320;
    }

    public Video setFirstFrame320(URL firstFrame320) {
        this.firstFrame320 = firstFrame320;
        return this;
    }

    public URL getFirstFrame800() {
        return firstFrame800;
    }

    public Video setFirstFrame800(URL firstFrame800) {
        this.firstFrame800 = firstFrame800;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Video setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Video setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public Video setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public boolean isLive() {
        return live == PropertyExists.PROPERTY_EXISTS;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Video setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URL getPhoto130() {
        return photo130;
    }

    public Video setPhoto130(URL photo130) {
        this.photo130 = photo130;
        return this;
    }

    public URL getPhoto320() {
        return photo320;
    }

    public Video setPhoto320(URL photo320) {
        this.photo320 = photo320;
        return this;
    }

    public URL getPhoto800() {
        return photo800;
    }

    public Video setPhoto800(URL photo800) {
        this.photo800 = photo800;
        return this;
    }

    public URL getPlayer() {
        return player;
    }

    public Video setPlayer(URL player) {
        this.player = player;
        return this;
    }

    public boolean isProcessing() {
        return processing == PropertyExists.PROPERTY_EXISTS;
    }

    public String getTitle() {
        return title;
    }

    public Video setTitle(String title) {
        this.title = title;
        return this;
    }

    public VideoType getType() {
        return type;
    }

    public Video setType(VideoType type) {
        this.type = type;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public Video setViews(Integer views) {
        this.views = views;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Video setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, firstFrame320, canLike, canEdit, canAdd, description, ownerId, title, type, photo800, firstFrame800, duration, photo130, firstFrame160, canComment, id, addingDate, live, views, height, player, comments, canRepost, firstFrame130, photo320, accessKey, width, files, processing, isFavorite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(date, video.date) &&
                Objects.equals(firstFrame130, video.firstFrame130) &&
                Objects.equals(isFavorite, video.isFavorite) &&
                Objects.equals(addingDate, video.addingDate) &&
                Objects.equals(ownerId, video.ownerId) &&
                Objects.equals(description, video.description) &&
                Objects.equals(title, video.title) &&
                Objects.equals(type, video.type) &&
                Objects.equals(duration, video.duration) &&
                Objects.equals(canComment, video.canComment) &&
                Objects.equals(photo800, video.photo800) &&
                Objects.equals(canLike, video.canLike) &&
                Objects.equals(id, video.id) &&
                Objects.equals(photo320, video.photo320) &&
                Objects.equals(live, video.live) &&
                Objects.equals(views, video.views) &&
                Objects.equals(height, video.height) &&
                Objects.equals(player, video.player) &&
                Objects.equals(comments, video.comments) &&
                Objects.equals(firstFrame160, video.firstFrame160) &&
                Objects.equals(canEdit, video.canEdit) &&
                Objects.equals(canRepost, video.canRepost) &&
                Objects.equals(accessKey, video.accessKey) &&
                Objects.equals(width, video.width) &&
                Objects.equals(files, video.files) &&
                Objects.equals(firstFrame800, video.firstFrame800) &&
                Objects.equals(photo130, video.photo130) &&
                Objects.equals(processing, video.processing) &&
                Objects.equals(canAdd, video.canAdd) &&
                Objects.equals(firstFrame320, video.firstFrame320);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Video{");
        sb.append("date=").append(date);
        sb.append(", firstFrame130=").append(firstFrame130);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", addingDate=").append(addingDate);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", description='").append(description).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", duration=").append(duration);
        sb.append(", canComment=").append(canComment);
        sb.append(", photo800=").append(photo800);
        sb.append(", canLike=").append(canLike);
        sb.append(", id=").append(id);
        sb.append(", photo320=").append(photo320);
        sb.append(", live=").append(live);
        sb.append(", views=").append(views);
        sb.append(", height=").append(height);
        sb.append(", player=").append(player);
        sb.append(", comments=").append(comments);
        sb.append(", firstFrame160=").append(firstFrame160);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", canRepost=").append(canRepost);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", width=").append(width);
        sb.append(", files=").append(files);
        sb.append(", firstFrame800=").append(firstFrame800);
        sb.append(", photo130=").append(photo130);
        sb.append(", processing=").append(processing);
        sb.append(", canAdd=").append(canAdd);
        sb.append(", firstFrame320=").append(firstFrame320);
        sb.append('}');
        return sb.toString();
    }
}
