package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * UserCounters object
 */
public class UserCounters {
    /**
     * Albums number
     */
    @SerializedName("albums")
    private Integer albums;

    /**
     * Videos number
     */
    @SerializedName("videos")
    private Integer videos;

    /**
     * Audios number
     */
    @SerializedName("audios")
    private Integer audios;

    /**
     * Notes number
     */
    @SerializedName("notes")
    private Integer notes;

    /**
     * Photos number
     */
    @SerializedName("photos")
    private Integer photos;

    /**
     * Communities number
     */
    @SerializedName("groups")
    private Integer groups;

    /**
     * Gifts number
     */
    @SerializedName("gifts")
    private Integer gifts;

    /**
     * Friends number
     */
    @SerializedName("friends")
    private Integer friends;

    /**
     * Online friends number
     */
    @SerializedName("online_friends")
    private Integer onlineFriends;

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
     * Followers number
     */
    @SerializedName("followers")
    private Integer followers;

    /**
     * Subscriptions number
     */
    @SerializedName("subscriptions")
    private Integer subscriptions;

    /**
     * Public pages number
     */
    @SerializedName("pages")
    private Integer pages;

    public Integer getAlbums() {
        return albums;
    }

    public Integer getVideos() {
        return videos;
    }

    public Integer getAudios() {
        return audios;
    }

    public Integer getNotes() {
        return notes;
    }

    public Integer getPhotos() {
        return photos;
    }

    public Integer getGroups() {
        return groups;
    }

    public Integer getGifts() {
        return gifts;
    }

    public Integer getFriends() {
        return friends;
    }

    public Integer getOnlineFriends() {
        return onlineFriends;
    }

    public Integer getUserPhotos() {
        return userPhotos;
    }

    public Integer getUserVideos() {
        return userVideos;
    }

    public Integer getFollowers() {
        return followers;
    }

    public Integer getSubscriptions() {
        return subscriptions;
    }

    public Integer getPages() {
        return pages;
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
                Objects.equals(videos, userCounters.videos) &&
                Objects.equals(audios, userCounters.audios) &&
                Objects.equals(notes, userCounters.notes) &&
                Objects.equals(photos, userCounters.photos) &&
                Objects.equals(groups, userCounters.groups) &&
                Objects.equals(gifts, userCounters.gifts) &&
                Objects.equals(friends, userCounters.friends) &&
                Objects.equals(onlineFriends, userCounters.onlineFriends) &&
                Objects.equals(userPhotos, userCounters.userPhotos) &&
                Objects.equals(userVideos, userCounters.userVideos) &&
                Objects.equals(followers, userCounters.followers) &&
                Objects.equals(subscriptions, userCounters.subscriptions) &&
                Objects.equals(pages, userCounters.pages);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserCounters{");
        sb.append("albums=").append(albums);
        sb.append(", videos=").append(videos);
        sb.append(", audios=").append(audios);
        sb.append(", notes=").append(notes);
        sb.append(", photos=").append(photos);
        sb.append(", groups=").append(groups);
        sb.append(", gifts=").append(gifts);
        sb.append(", friends=").append(friends);
        sb.append(", onlineFriends=").append(onlineFriends);
        sb.append(", userPhotos=").append(userPhotos);
        sb.append(", userVideos=").append(userVideos);
        sb.append(", followers=").append(followers);
        sb.append(", subscriptions=").append(subscriptions);
        sb.append(", pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }
}
