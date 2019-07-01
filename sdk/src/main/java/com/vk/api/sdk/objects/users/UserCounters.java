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

    @Override
    public int hashCode() {
        return Objects.hash(userVideos, albums, subscriptions, notes, groups, videos, photos, friends, userPhotos, onlineFriends, followers, pages, audios, gifts);
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
                Objects.equals(userVideos, userCounters.userVideos) &&
                Objects.equals(groups, userCounters.groups) &&
                Objects.equals(videos, userCounters.videos) &&
                Objects.equals(photos, userCounters.photos) &&
                Objects.equals(friends, userCounters.friends) &&
                Objects.equals(userPhotos, userCounters.userPhotos) &&
                Objects.equals(followers, userCounters.followers) &&
                Objects.equals(pages, userCounters.pages) &&
                Objects.equals(audios, userCounters.audios) &&
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
        sb.append(", userVideos=").append(userVideos);
        sb.append(", groups=").append(groups);
        sb.append(", videos=").append(videos);
        sb.append(", photos=").append(photos);
        sb.append(", friends=").append(friends);
        sb.append(", userPhotos=").append(userPhotos);
        sb.append(", followers=").append(followers);
        sb.append(", pages=").append(pages);
        sb.append(", audios=").append(audios);
        sb.append(", gifts=").append(gifts);
        sb.append('}');
        return sb.toString();
    }
}
