package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Likes;
import com.vk.api.sdk.objects.base.PropertyExists;
import java.net.URL;
import java.util.List;
import java.util.Objects;

/**
 * VideoFull object
 */
public class VideoFull implements Validable {
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
     * Information whether current user can add the video to favourites
     */
    @SerializedName("can_add_to_faves")
    private BoolInt canAddToFaves;

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
     * Information whether current user can comment the video
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

    @SerializedName("first_frame")
    private List<VideoImage> firstFrame;

    /**
     * URL of the first frame for the corresponding width.
     */
    @SerializedName("first_frame_640")
    private URL firstFrame640;

    /**
     * URL of the first frame for the corresponding width.
     */
    @SerializedName("first_frame_1280")
    private URL firstFrame1280;

    /**
     * Video ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("image")
    private List<VideoImage> image;

    @SerializedName("likes")
    private Likes likes;

    /**
     * Returns if the video is live translation
     */
    @SerializedName("live")
    private PropertyExists live;

    /**
     * Video owner ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

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
     * Information whether the video is repeated
     */
    @SerializedName("repeat")
    private BoolInt repeat;

    /**
     * Video title
     */
    @SerializedName("title")
    private String title;

    /**
     * Number of views
     */
    @SerializedName("views")
    private Integer views;

    public String getAccessKey() {
        return accessKey;
    }

    public VideoFull setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getAddingDate() {
        return addingDate;
    }

    public VideoFull setAddingDate(Integer addingDate) {
        this.addingDate = addingDate;
        return this;
    }

    public boolean canAdd() {
        return canAdd == BoolInt.YES;
    }

    public BoolInt getCanAdd() {
        return canAdd;
    }

    public boolean canAddToFaves() {
        return canAddToFaves == BoolInt.YES;
    }

    public BoolInt getCanAddToFaves() {
        return canAddToFaves;
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

    public boolean canRepost() {
        return canRepost == BoolInt.YES;
    }

    public BoolInt getCanRepost() {
        return canRepost;
    }

    public Integer getComments() {
        return comments;
    }

    public VideoFull setComments(Integer comments) {
        this.comments = comments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public VideoFull setDate(Integer date) {
        this.date = date;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public VideoFull setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public VideoFull setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public VideoFiles getFiles() {
        return files;
    }

    public VideoFull setFiles(VideoFiles files) {
        this.files = files;
        return this;
    }

    public List<VideoImage> getFirstFrame() {
        return firstFrame;
    }

    public VideoFull setFirstFrame(List<VideoImage> firstFrame) {
        this.firstFrame = firstFrame;
        return this;
    }

    public URL getFirstFrame640() {
        return firstFrame640;
    }

    public VideoFull setFirstFrame640(URL firstFrame640) {
        this.firstFrame640 = firstFrame640;
        return this;
    }

    public URL getFirstFrame1280() {
        return firstFrame1280;
    }

    public VideoFull setFirstFrame1280(URL firstFrame1280) {
        this.firstFrame1280 = firstFrame1280;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public VideoFull setId(Integer id) {
        this.id = id;
        return this;
    }

    public List<VideoImage> getImage() {
        return image;
    }

    public VideoFull setImage(List<VideoImage> image) {
        this.image = image;
        return this;
    }

    public Likes getLikes() {
        return likes;
    }

    public VideoFull setLikes(Likes likes) {
        this.likes = likes;
        return this;
    }

    public boolean isLive() {
        return live == PropertyExists.PROPERTY_EXISTS;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public VideoFull setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URL getPlayer() {
        return player;
    }

    public VideoFull setPlayer(URL player) {
        this.player = player;
        return this;
    }

    public boolean isProcessing() {
        return processing == PropertyExists.PROPERTY_EXISTS;
    }

    public boolean isRepeat() {
        return repeat == BoolInt.YES;
    }

    public BoolInt getRepeat() {
        return repeat;
    }

    public String getTitle() {
        return title;
    }

    public VideoFull setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public VideoFull setViews(Integer views) {
        this.views = views;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, firstFrame640, canEdit, canAdd, canAddToFaves, description, ownerId, title, duration, firstFrame, repeat, canComment, id, addingDate, live, views, likes, player, image, comments, canRepost, firstFrame1280, accessKey, files, processing);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoFull videoFull = (VideoFull) o;
        return Objects.equals(date, videoFull.date) &&
                Objects.equals(firstFrame1280, videoFull.firstFrame1280) &&
                Objects.equals(addingDate, videoFull.addingDate) &&
                Objects.equals(canAddToFaves, videoFull.canAddToFaves) &&
                Objects.equals(ownerId, videoFull.ownerId) &&
                Objects.equals(description, videoFull.description) &&
                Objects.equals(title, videoFull.title) &&
                Objects.equals(duration, videoFull.duration) &&
                Objects.equals(canComment, videoFull.canComment) &&
                Objects.equals(repeat, videoFull.repeat) &&
                Objects.equals(id, videoFull.id) &&
                Objects.equals(live, videoFull.live) &&
                Objects.equals(views, videoFull.views) &&
                Objects.equals(likes, videoFull.likes) &&
                Objects.equals(player, videoFull.player) &&
                Objects.equals(image, videoFull.image) &&
                Objects.equals(comments, videoFull.comments) &&
                Objects.equals(canEdit, videoFull.canEdit) &&
                Objects.equals(canRepost, videoFull.canRepost) &&
                Objects.equals(accessKey, videoFull.accessKey) &&
                Objects.equals(files, videoFull.files) &&
                Objects.equals(processing, videoFull.processing) &&
                Objects.equals(canAdd, videoFull.canAdd) &&
                Objects.equals(firstFrame, videoFull.firstFrame) &&
                Objects.equals(firstFrame640, videoFull.firstFrame640);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoFull{");
        sb.append("date=").append(date);
        sb.append(", firstFrame1280=").append(firstFrame1280);
        sb.append(", addingDate=").append(addingDate);
        sb.append(", canAddToFaves=").append(canAddToFaves);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", description='").append(description).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", duration=").append(duration);
        sb.append(", canComment=").append(canComment);
        sb.append(", repeat=").append(repeat);
        sb.append(", id=").append(id);
        sb.append(", live=").append(live);
        sb.append(", views=").append(views);
        sb.append(", likes=").append(likes);
        sb.append(", player=").append(player);
        sb.append(", image=").append(image);
        sb.append(", comments=").append(comments);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", canRepost=").append(canRepost);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", files=").append(files);
        sb.append(", processing=").append(processing);
        sb.append(", canAdd=").append(canAdd);
        sb.append(", firstFrame=").append(firstFrame);
        sb.append(", firstFrame640=").append(firstFrame640);
        sb.append('}');
        return sb.toString();
    }
}
