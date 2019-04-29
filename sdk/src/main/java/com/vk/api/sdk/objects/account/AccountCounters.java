package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * AccountCounters object
 */
public class AccountCounters {
    /**
     * New app requests number
     */
    @SerializedName("app_requests")
    private Integer appRequests;

    /**
     * New events number
     */
    @SerializedName("events")
    private Integer events;

    /**
     * New friends requests number
     */
    @SerializedName("friends")
    private Integer friends;

    /**
     * New friends suggestions number
     */
    @SerializedName("friends_suggestions")
    private Integer friendsSuggestions;

    /**
     * New gifts number
     */
    @SerializedName("gifts")
    private Integer gifts;

    /**
     * New groups number
     */
    @SerializedName("groups")
    private Integer groups;

    /**
     * New messages number
     */
    @SerializedName("messages")
    private Integer messages;

    /**
     * New notifications number
     */
    @SerializedName("notifications")
    private Integer notifications;

    /**
     * New photo tags number
     */
    @SerializedName("photos")
    private Integer photos;

    /**
     * New video tags number
     */
    @SerializedName("videos")
    private Integer videos;

    public Integer getAppRequests() {
        return appRequests;
    }

    public AccountCounters setAppRequests(Integer appRequests) {
        this.appRequests = appRequests;
        return this;
    }

    public Integer getEvents() {
        return events;
    }

    public AccountCounters setEvents(Integer events) {
        this.events = events;
        return this;
    }

    public Integer getFriends() {
        return friends;
    }

    public AccountCounters setFriends(Integer friends) {
        this.friends = friends;
        return this;
    }

    public Integer getFriendsSuggestions() {
        return friendsSuggestions;
    }

    public AccountCounters setFriendsSuggestions(Integer friendsSuggestions) {
        this.friendsSuggestions = friendsSuggestions;
        return this;
    }

    public Integer getGifts() {
        return gifts;
    }

    public AccountCounters setGifts(Integer gifts) {
        this.gifts = gifts;
        return this;
    }

    public Integer getGroups() {
        return groups;
    }

    public AccountCounters setGroups(Integer groups) {
        this.groups = groups;
        return this;
    }

    public Integer getMessages() {
        return messages;
    }

    public AccountCounters setMessages(Integer messages) {
        this.messages = messages;
        return this;
    }

    public Integer getNotifications() {
        return notifications;
    }

    public AccountCounters setNotifications(Integer notifications) {
        this.notifications = notifications;
        return this;
    }

    public Integer getPhotos() {
        return photos;
    }

    public AccountCounters setPhotos(Integer photos) {
        this.photos = photos;
        return this;
    }

    public Integer getVideos() {
        return videos;
    }

    public AccountCounters setVideos(Integer videos) {
        this.videos = videos;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(appRequests, groups, messages, videos, friendsSuggestions, photos, events, friends, notifications, gifts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountCounters accountCounters = (AccountCounters) o;
        return Objects.equals(appRequests, accountCounters.appRequests) &&
                Objects.equals(groups, accountCounters.groups) &&
                Objects.equals(messages, accountCounters.messages) &&
                Objects.equals(videos, accountCounters.videos) &&
                Objects.equals(photos, accountCounters.photos) &&
                Objects.equals(events, accountCounters.events) &&
                Objects.equals(friends, accountCounters.friends) &&
                Objects.equals(notifications, accountCounters.notifications) &&
                Objects.equals(friendsSuggestions, accountCounters.friendsSuggestions) &&
                Objects.equals(gifts, accountCounters.gifts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AccountCounters{");
        sb.append("appRequests=").append(appRequests);
        sb.append(", groups=").append(groups);
        sb.append(", messages=").append(messages);
        sb.append(", videos=").append(videos);
        sb.append(", photos=").append(photos);
        sb.append(", events=").append(events);
        sb.append(", friends=").append(friends);
        sb.append(", notifications=").append(notifications);
        sb.append(", friendsSuggestions=").append(friendsSuggestions);
        sb.append(", gifts=").append(gifts);
        sb.append('}');
        return sb.toString();
    }
}
