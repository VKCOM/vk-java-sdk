package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Likes;
import com.vk.api.sdk.objects.base.PropertyExists;
import com.vk.api.sdk.objects.base.RepostsInfo;
import com.vk.api.sdk.objects.media.Restriction;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * Video object
 */
public class Video implements Validable {
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
     * Information whether current user can repost the video
     */
    @SerializedName("can_repost")
    private BoolInt canRepost;

    /**
     * Information whether current user can subscribe to author of the video
     */
    @SerializedName("can_subscribe")
    private BoolInt canSubscribe;

    /**
     * Information whether current user can add the video to favourites
     */
    @SerializedName("can_add_to_faves")
    private BoolInt canAddToFaves;

    /**
     * Information whether current user can add the video
     */
    @SerializedName("can_add")
    private BoolInt canAdd;

    /**
     * Information whether current user can attach action button to the video
     */
    @SerializedName("can_attach_link")
    private BoolInt canAttachLink;

    /**
     * 1 if video is private
     */
    @SerializedName("is_private")
    private BoolInt isPrivate;

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

    @SerializedName("image")
    private List<VideoImage> image;

    @SerializedName("first_frame")
    private List<VideoImage> firstFrame;

    /**
     * Video width
     */
    @SerializedName("width")
    private Integer width;

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

    /**
     * Video owner ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Id of the user who uploaded the video if it was uploaded to a group by member
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Video title
     */
    @SerializedName("title")
    private String title;

    /**
     * Whether video is added to bookmarks
     */
    @SerializedName("is_favorite")
    private Boolean isFavorite;

    /**
     * Video embed URL
     */
    @SerializedName("player")
    private URI player;

    /**
     * Returns if the video is processing
     */
    @SerializedName("processing")
    private PropertyExists processing;

    /**
     * 1 if  video is being converted
     */
    @SerializedName("converting")
    private BoolInt converting;

    @SerializedName("restriction")
    private Restriction restriction;

    /**
     * 1 if video is added to user's albums
     */
    @SerializedName("added")
    private BoolInt added;

    /**
     * 1 if user is subscribed to author of the video
     */
    @SerializedName("is_subscribed")
    private BoolInt isSubscribed;

    @SerializedName("track_code")
    private String trackCode;

    /**
     * Information whether the video is repeated
     */
    @SerializedName("repeat")
    private PropertyExists repeat;

    @SerializedName("type")
    private VideoType type;

    /**
     * Number of views
     */
    @SerializedName("views")
    private Integer views;

    /**
     * If video is external, number of views on vk
     */
    @SerializedName("local_views")
    private Integer localViews;

    /**
     * Restriction code
     */
    @SerializedName("content_restricted")
    private Integer contentRestricted;

    /**
     * Restriction text
     */
    @SerializedName("content_restricted_message")
    private String contentRestrictedMessage;

    /**
     * Live donations balance
     */
    @SerializedName("balance")
    private Integer balance;

    /**
     * Live stream status
     */
    @SerializedName("live_status")
    private VideoLiveStatus liveStatus;

    /**
     * 1 if the video is a live stream
     */
    @SerializedName("live")
    private PropertyExists live;

    /**
     * 1 if the video is an upcoming stream
     */
    @SerializedName("upcoming")
    private PropertyExists upcoming;

    /**
     * Date in Unixtime when the live stream is scheduled to start by the author
     */
    @SerializedName("live_start_time")
    private Integer liveStartTime;

    /**
     * Whether current user is subscribed to the upcoming live stream notification (if not subscribed to the author)
     */
    @SerializedName("live_notify")
    private BoolInt liveNotify;

    /**
     * Number of spectators of the stream
     */
    @SerializedName("spectators")
    private Integer spectators;

    /**
     * External platform
     */
    @SerializedName("platform")
    private String platform;

    @SerializedName("likes")
    private Likes likes;

    @SerializedName("reposts")
    private RepostsInfo reposts;

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

    public boolean canSubscribe() {
        return canSubscribe == BoolInt.YES;
    }

    public BoolInt getCanSubscribe() {
        return canSubscribe;
    }

    public boolean canAddToFaves() {
        return canAddToFaves == BoolInt.YES;
    }

    public BoolInt getCanAddToFaves() {
        return canAddToFaves;
    }

    public boolean canAdd() {
        return canAdd == BoolInt.YES;
    }

    public BoolInt getCanAdd() {
        return canAdd;
    }

    public boolean canAttachLink() {
        return canAttachLink == BoolInt.YES;
    }

    public BoolInt getCanAttachLink() {
        return canAttachLink;
    }

    public boolean isPrivate() {
        return isPrivate == BoolInt.YES;
    }

    public BoolInt getIsPrivate() {
        return isPrivate;
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

    public List<VideoImage> getImage() {
        return image;
    }

    public Video setImage(List<VideoImage> image) {
        this.image = image;
        return this;
    }

    public List<VideoImage> getFirstFrame() {
        return firstFrame;
    }

    public Video setFirstFrame(List<VideoImage> firstFrame) {
        this.firstFrame = firstFrame;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Video setWidth(Integer width) {
        this.width = width;
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

    public Integer getOwnerId() {
        return ownerId;
    }

    public Video setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Video setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Video setTitle(String title) {
        this.title = title;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public Video setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public URI getPlayer() {
        return player;
    }

    public Video setPlayer(URI player) {
        this.player = player;
        return this;
    }

    public boolean isProcessing() {
        return processing == PropertyExists.PROPERTY_EXISTS;
    }

    public boolean isConverting() {
        return converting == BoolInt.YES;
    }

    public BoolInt getConverting() {
        return converting;
    }

    public Restriction getRestriction() {
        return restriction;
    }

    public Video setRestriction(Restriction restriction) {
        this.restriction = restriction;
        return this;
    }

    public boolean isAdded() {
        return added == BoolInt.YES;
    }

    public BoolInt getAdded() {
        return added;
    }

    public boolean isSubscribed() {
        return isSubscribed == BoolInt.YES;
    }

    public BoolInt getIsSubscribed() {
        return isSubscribed;
    }

    public String getTrackCode() {
        return trackCode;
    }

    public Video setTrackCode(String trackCode) {
        this.trackCode = trackCode;
        return this;
    }

    public boolean isRepeat() {
        return repeat == PropertyExists.PROPERTY_EXISTS;
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

    public Integer getLocalViews() {
        return localViews;
    }

    public Video setLocalViews(Integer localViews) {
        this.localViews = localViews;
        return this;
    }

    public Integer getContentRestricted() {
        return contentRestricted;
    }

    public Video setContentRestricted(Integer contentRestricted) {
        this.contentRestricted = contentRestricted;
        return this;
    }

    public String getContentRestrictedMessage() {
        return contentRestrictedMessage;
    }

    public Video setContentRestrictedMessage(String contentRestrictedMessage) {
        this.contentRestrictedMessage = contentRestrictedMessage;
        return this;
    }

    public Integer getBalance() {
        return balance;
    }

    public Video setBalance(Integer balance) {
        this.balance = balance;
        return this;
    }

    public VideoLiveStatus getLiveStatus() {
        return liveStatus;
    }

    public Video setLiveStatus(VideoLiveStatus liveStatus) {
        this.liveStatus = liveStatus;
        return this;
    }

    public boolean isLive() {
        return live == PropertyExists.PROPERTY_EXISTS;
    }

    public boolean isUpcoming() {
        return upcoming == PropertyExists.PROPERTY_EXISTS;
    }

    public Integer getLiveStartTime() {
        return liveStartTime;
    }

    public Video setLiveStartTime(Integer liveStartTime) {
        this.liveStartTime = liveStartTime;
        return this;
    }

    public boolean isLiveNotify() {
        return liveNotify == BoolInt.YES;
    }

    public BoolInt getLiveNotify() {
        return liveNotify;
    }

    public Integer getSpectators() {
        return spectators;
    }

    public Video setSpectators(Integer spectators) {
        this.spectators = spectators;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public Video setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public Likes getLikes() {
        return likes;
    }

    public Video setLikes(Likes likes) {
        this.likes = likes;
        return this;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public Video setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, added, converting, canLike, canEdit, canAdd, canAddToFaves, description, isPrivate, ownerId, liveNotify, title, type, liveStartTime, platform, duration, canSubscribe, isSubscribed, balance, firstFrame, repeat, canComment, id, addingDate, views, live, liveStatus, height, player, likes, trackCode, image, comments, contentRestrictedMessage, canRepost, contentRestricted, spectators, userId, localViews, canAttachLink, accessKey, width, restriction, processing, upcoming, reposts, isFavorite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(isPrivate, video.isPrivate) &&
                Objects.equals(date, video.date) &&
                Objects.equals(isFavorite, video.isFavorite) &&
                Objects.equals(addingDate, video.addingDate) &&
                Objects.equals(canAddToFaves, video.canAddToFaves) &&
                Objects.equals(added, video.added) &&
                Objects.equals(ownerId, video.ownerId) &&
                Objects.equals(converting, video.converting) &&
                Objects.equals(liveNotify, video.liveNotify) &&
                Objects.equals(description, video.description) &&
                Objects.equals(contentRestrictedMessage, video.contentRestrictedMessage) &&
                Objects.equals(canAttachLink, video.canAttachLink) &&
                Objects.equals(title, video.title) &&
                Objects.equals(type, video.type) &&
                Objects.equals(platform, video.platform) &&
                Objects.equals(duration, video.duration) &&
                Objects.equals(canComment, video.canComment) &&
                Objects.equals(localViews, video.localViews) &&
                Objects.equals(balance, video.balance) &&
                Objects.equals(canLike, video.canLike) &&
                Objects.equals(repeat, video.repeat) &&
                Objects.equals(id, video.id) &&
                Objects.equals(views, video.views) &&
                Objects.equals(live, video.live) &&
                Objects.equals(height, video.height) &&
                Objects.equals(player, video.player) &&
                Objects.equals(liveStatus, video.liveStatus) &&
                Objects.equals(likes, video.likes) &&
                Objects.equals(liveStartTime, video.liveStartTime) &&
                Objects.equals(image, video.image) &&
                Objects.equals(comments, video.comments) &&
                Objects.equals(contentRestricted, video.contentRestricted) &&
                Objects.equals(canEdit, video.canEdit) &&
                Objects.equals(spectators, video.spectators) &&
                Objects.equals(canSubscribe, video.canSubscribe) &&
                Objects.equals(canRepost, video.canRepost) &&
                Objects.equals(userId, video.userId) &&
                Objects.equals(accessKey, video.accessKey) &&
                Objects.equals(width, video.width) &&
                Objects.equals(restriction, video.restriction) &&
                Objects.equals(processing, video.processing) &&
                Objects.equals(isSubscribed, video.isSubscribed) &&
                Objects.equals(trackCode, video.trackCode) &&
                Objects.equals(canAdd, video.canAdd) &&
                Objects.equals(upcoming, video.upcoming) &&
                Objects.equals(reposts, video.reposts) &&
                Objects.equals(firstFrame, video.firstFrame);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Video{");
        sb.append("isPrivate=").append(isPrivate);
        sb.append(", date=").append(date);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", addingDate=").append(addingDate);
        sb.append(", canAddToFaves=").append(canAddToFaves);
        sb.append(", added=").append(added);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", converting=").append(converting);
        sb.append(", liveNotify=").append(liveNotify);
        sb.append(", description='").append(description).append("'");
        sb.append(", contentRestrictedMessage='").append(contentRestrictedMessage).append("'");
        sb.append(", canAttachLink=").append(canAttachLink);
        sb.append(", title='").append(title).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", platform='").append(platform).append("'");
        sb.append(", duration=").append(duration);
        sb.append(", canComment=").append(canComment);
        sb.append(", localViews=").append(localViews);
        sb.append(", balance=").append(balance);
        sb.append(", canLike=").append(canLike);
        sb.append(", repeat=").append(repeat);
        sb.append(", id=").append(id);
        sb.append(", views=").append(views);
        sb.append(", live=").append(live);
        sb.append(", height=").append(height);
        sb.append(", player=").append(player);
        sb.append(", liveStatus='").append(liveStatus).append("'");
        sb.append(", likes=").append(likes);
        sb.append(", liveStartTime=").append(liveStartTime);
        sb.append(", image=").append(image);
        sb.append(", comments=").append(comments);
        sb.append(", contentRestricted=").append(contentRestricted);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", spectators=").append(spectators);
        sb.append(", canSubscribe=").append(canSubscribe);
        sb.append(", canRepost=").append(canRepost);
        sb.append(", userId=").append(userId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", width=").append(width);
        sb.append(", restriction=").append(restriction);
        sb.append(", processing=").append(processing);
        sb.append(", isSubscribed=").append(isSubscribed);
        sb.append(", trackCode='").append(trackCode).append("'");
        sb.append(", canAdd=").append(canAdd);
        sb.append(", upcoming=").append(upcoming);
        sb.append(", reposts=").append(reposts);
        sb.append(", firstFrame=").append(firstFrame);
        sb.append('}');
        return sb.toString();
    }
}
