package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Likes;
import com.vk.api.sdk.objects.base.PropertyExists;
import java.net.URL;
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
     * Video ID
     */
    @SerializedName("id")
    private Integer id;

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

    public URL getFirstFrame130() {
        return firstFrame130;
    }

    public VideoFull setFirstFrame130(URL firstFrame130) {
        this.firstFrame130 = firstFrame130;
        return this;
    }

    public URL getFirstFrame160() {
        return firstFrame160;
    }

    public VideoFull setFirstFrame160(URL firstFrame160) {
        this.firstFrame160 = firstFrame160;
        return this;
    }

    public URL getFirstFrame320() {
        return firstFrame320;
    }

    public VideoFull setFirstFrame320(URL firstFrame320) {
        this.firstFrame320 = firstFrame320;
        return this;
    }

    public URL getFirstFrame800() {
        return firstFrame800;
    }

    public VideoFull setFirstFrame800(URL firstFrame800) {
        this.firstFrame800 = firstFrame800;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public VideoFull setId(Integer id) {
        this.id = id;
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

    public URL getPhoto130() {
        return photo130;
    }

    public VideoFull setPhoto130(URL photo130) {
        this.photo130 = photo130;
        return this;
    }

    public URL getPhoto320() {
        return photo320;
    }

    public VideoFull setPhoto320(URL photo320) {
        this.photo320 = photo320;
        return this;
    }

    public URL getPhoto800() {
        return photo800;
    }

    public VideoFull setPhoto800(URL photo800) {
        this.photo800 = photo800;
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
        return Objects.hash(date, firstFrame320, canEdit, canAdd, description, ownerId, title, photo800, firstFrame800, duration, repeat, photo130, firstFrame160, canComment, id, addingDate, live, views, likes, player, comments, canRepost, firstFrame130, photo320, accessKey, files, processing);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoFull videoFull = (VideoFull) o;
        return Objects.equals(date, videoFull.date) &&
                Objects.equals(firstFrame130, videoFull.firstFrame130) &&
                Objects.equals(addingDate, videoFull.addingDate) &&
                Objects.equals(ownerId, videoFull.ownerId) &&
                Objects.equals(description, videoFull.description) &&
                Objects.equals(title, videoFull.title) &&
                Objects.equals(duration, videoFull.duration) &&
                Objects.equals(canComment, videoFull.canComment) &&
                Objects.equals(photo800, videoFull.photo800) &&
                Objects.equals(repeat, videoFull.repeat) &&
                Objects.equals(id, videoFull.id) &&
                Objects.equals(photo320, videoFull.photo320) &&
                Objects.equals(live, videoFull.live) &&
                Objects.equals(views, videoFull.views) &&
                Objects.equals(likes, videoFull.likes) &&
                Objects.equals(player, videoFull.player) &&
                Objects.equals(comments, videoFull.comments) &&
                Objects.equals(firstFrame160, videoFull.firstFrame160) &&
                Objects.equals(canEdit, videoFull.canEdit) &&
                Objects.equals(canRepost, videoFull.canRepost) &&
                Objects.equals(accessKey, videoFull.accessKey) &&
                Objects.equals(files, videoFull.files) &&
                Objects.equals(firstFrame800, videoFull.firstFrame800) &&
                Objects.equals(photo130, videoFull.photo130) &&
                Objects.equals(processing, videoFull.processing) &&
                Objects.equals(canAdd, videoFull.canAdd) &&
                Objects.equals(firstFrame320, videoFull.firstFrame320);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoFull{");
        sb.append("date=").append(date);
        sb.append(", firstFrame130=").append(firstFrame130);
        sb.append(", addingDate=").append(addingDate);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", description='").append(description).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", duration=").append(duration);
        sb.append(", canComment=").append(canComment);
        sb.append(", photo800=").append(photo800);
        sb.append(", repeat=").append(repeat);
        sb.append(", id=").append(id);
        sb.append(", photo320=").append(photo320);
        sb.append(", live=").append(live);
        sb.append(", views=").append(views);
        sb.append(", likes=").append(likes);
        sb.append(", player=").append(player);
        sb.append(", comments=").append(comments);
        sb.append(", firstFrame160=").append(firstFrame160);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", canRepost=").append(canRepost);
        sb.append(", accessKey='").append(accessKey).append("'");
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
