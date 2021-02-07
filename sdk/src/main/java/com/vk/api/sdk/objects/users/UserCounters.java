package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * UserCounters object
 */
public class UserCounters implements Validable {
    /**
     * Albums number
     */
    @SerializedName("albums")
    private Integer albums;

    /**
     * Audios number
     */
    @SerializedName("audios")
    private Integer audios;

    /**
     * Followers number
     */
    @SerializedName("followers")
    private Integer followers;

    /**
     * Friends number
     */
    @SerializedName("friends")
    private Integer friends;

    /**
     * Gifts number
     */
    @SerializedName("gifts")
    private Integer gifts;

    /**
     * Communities number
     */
    @SerializedName("groups")
    private Integer groups;

    /**
     * Notes number
     */
    @SerializedName("notes")
    private Integer notes;

    /**
     * Online friends number
     */
    @SerializedName("online_friends")
    private Integer onlineFriends;

    /**
     * Public pages number
     */
    @SerializedName("pages")
    private Integer pages;

    /**
     * Photos number
     */
    @SerializedName("photos")
    private Integer photos;

    /**
     * Subscriptions number
     */
    @SerializedName("subscriptions")
    private Integer subscriptions;

    /**
     * Number of photos with user
     */
    @SerializedName("user_photos")
    private Integer userPhotos;

    /**
     * Number of videos with user
     */
    @SerializedName("user_videos")
    private Integer userVideos;

    /**
     * Videos number
     */
    @SerializedName("videos")
    private Integer videos;

    @SerializedName("new_photo_tags")
    private Integer newPhotoTags;

    @SerializedName("new_recognition_tags")
    private Integer newRecognitionTags;

    @SerializedName("mutual_friends")
    private Integer mutualFriends;

    @SerializedName("posts")
    private Integer posts;

    @SerializedName("articles")
    private Integer articles;

    @SerializedName("wishes")
    private Integer wishes;

    @SerializedName("podcasts")
    private Integer podcasts;

    @SerializedName("clips")
    private Integer clips;

    @SerializedName("clips_followers")
    private Integer clipsFollowers;

    public Integer getAlbums() {
        return albums;
    }

    public UserCounters setAlbums(Integer albums) {
        this.albums = albums;
        return this;
    }

    public Integer getAudios() {
        return audios;
    }

    public UserCounters setAudios(Integer audios) {
        this.audios = audios;
        return this;
    }

    public Integer getFollowers() {
        return followers;
    }

    public UserCounters setFollowers(Integer followers) {
        this.followers = followers;
        return this;
    }

    public Integer getFriends() {
        return friends;
    }

    public UserCounters setFriends(Integer friends) {
        this.friends = friends;
        return this;
    }

    public Integer getGifts() {
        return gifts;
    }

    public UserCounters setGifts(Integer gifts) {
        this.gifts = gifts;
        return this;
    }

    public Integer getGroups() {
        return groups;
    }

    public UserCounters setGroups(Integer groups) {
        this.groups = groups;
        return this;
    }

    public Integer getNotes() {
        return notes;
    }

    public UserCounters setNotes(Integer notes) {
        this.notes = notes;
        return this;
    }

    public Integer getOnlineFriends() {
        return onlineFriends;
    }

    public UserCounters setOnlineFriends(Integer onlineFriends) {
        this.onlineFriends = onlineFriends;
        return this;
    }

    public Integer getPages() {
        return pages;
    }

    public UserCounters setPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    public Integer getPhotos() {
        return photos;
    }

    public UserCounters setPhotos(Integer photos) {
        this.photos = photos;
        return this;
    }

    public Integer getSubscriptions() {
        return subscriptions;
    }

    public UserCounters setSubscriptions(Integer subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public Integer getUserPhotos() {
        return userPhotos;
    }

    public UserCounters setUserPhotos(Integer userPhotos) {
        this.userPhotos = userPhotos;
        return this;
    }

    public Integer getUserVideos() {
        return userVideos;
    }

    public UserCounters setUserVideos(Integer userVideos) {
        this.userVideos = userVideos;
        return this;
    }

    public Integer getVideos() {
        return videos;
    }

    public UserCounters setVideos(Integer videos) {
        this.videos = videos;
        return this;
    }

    public Integer getNewPhotoTags() {
        return newPhotoTags;
    }

    public UserCounters setNewPhotoTags(Integer newPhotoTags) {
        this.newPhotoTags = newPhotoTags;
        return this;
    }

    public Integer getNewRecognitionTags() {
        return newRecognitionTags;
    }

    public UserCounters setNewRecognitionTags(Integer newRecognitionTags) {
        this.newRecognitionTags = newRecognitionTags;
        return this;
    }

    public Integer getMutualFriends() {
        return mutualFriends;
    }

    public UserCounters setMutualFriends(Integer mutualFriends) {
        this.mutualFriends = mutualFriends;
        return this;
    }

    public Integer getPosts() {
        return posts;
    }

    public UserCounters setPosts(Integer posts) {
        this.posts = posts;
        return this;
    }

    public Integer getArticles() {
        return articles;
    }

    public UserCounters setArticles(Integer articles) {
        this.articles = articles;
        return this;
    }

    public Integer getWishes() {
        return wishes;
    }

    public UserCounters setWishes(Integer wishes) {
        this.wishes = wishes;
        return this;
    }

    public Integer getPodcasts() {
        return podcasts;
    }

    public UserCounters setPodcasts(Integer podcasts) {
        this.podcasts = podcasts;
        return this;
    }

    public Integer getClips() {
        return clips;
    }

    public UserCounters setClips(Integer clips) {
        this.clips = clips;
        return this;
    }

    public Integer getClipsFollowers() {
        return clipsFollowers;
    }

    public UserCounters setClipsFollowers(Integer clipsFollowers) {
        this.clipsFollowers = clipsFollowers;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userVideos, albums, subscriptions, notes, clips, newRecognitionTags, groups, videos, photos, posts, mutualFriends, friends, userPhotos, newPhotoTags, onlineFriends, followers, pages, podcasts, audios, wishes, articles, clipsFollowers, gifts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCounters userCounters = (UserCounters) o;
        return Objects.equals(albums, userCounters.albums) &&
                Objects.equals(subscriptions, userCounters.subscriptions) &&
                Objects.equals(notes, userCounters.notes) &&
                Objects.equals(onlineFriends, userCounters.onlineFriends) &&
                Objects.equals(clips, userCounters.clips) &&
                Objects.equals(userVideos, userCounters.userVideos) &&
                Objects.equals(groups, userCounters.groups) &&
                Objects.equals(videos, userCounters.videos) &&
                Objects.equals(newPhotoTags, userCounters.newPhotoTags) &&
                Objects.equals(newRecognitionTags, userCounters.newRecognitionTags) &&
                Objects.equals(photos, userCounters.photos) &&
                Objects.equals(posts, userCounters.posts) &&
                Objects.equals(friends, userCounters.friends) &&
                Objects.equals(userPhotos, userCounters.userPhotos) &&
                Objects.equals(followers, userCounters.followers) &&
                Objects.equals(pages, userCounters.pages) &&
                Objects.equals(podcasts, userCounters.podcasts) &&
                Objects.equals(audios, userCounters.audios) &&
                Objects.equals(mutualFriends, userCounters.mutualFriends) &&
                Objects.equals(wishes, userCounters.wishes) &&
                Objects.equals(clipsFollowers, userCounters.clipsFollowers) &&
                Objects.equals(articles, userCounters.articles) &&
                Objects.equals(gifts, userCounters.gifts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserCounters{");
        sb.append("albums=").append(albums);
        sb.append(", subscriptions=").append(subscriptions);
        sb.append(", notes=").append(notes);
        sb.append(", onlineFriends=").append(onlineFriends);
        sb.append(", clips=").append(clips);
        sb.append(", userVideos=").append(userVideos);
        sb.append(", groups=").append(groups);
        sb.append(", videos=").append(videos);
        sb.append(", newPhotoTags=").append(newPhotoTags);
        sb.append(", newRecognitionTags=").append(newRecognitionTags);
        sb.append(", photos=").append(photos);
        sb.append(", posts=").append(posts);
        sb.append(", friends=").append(friends);
        sb.append(", userPhotos=").append(userPhotos);
        sb.append(", followers=").append(followers);
        sb.append(", pages=").append(pages);
        sb.append(", podcasts=").append(podcasts);
        sb.append(", audios=").append(audios);
        sb.append(", mutualFriends=").append(mutualFriends);
        sb.append(", wishes=").append(wishes);
        sb.append(", clipsFollowers=").append(clipsFollowers);
        sb.append(", articles=").append(articles);
        sb.append(", gifts=").append(gifts);
        sb.append('}');
        return sb.toString();
    }
}
