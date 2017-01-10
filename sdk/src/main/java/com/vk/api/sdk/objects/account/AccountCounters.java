package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * AccountCounters object
 */
public class AccountCounters {
    /**
     * New friends requests number
     */
    @SerializedName("friends")
    private Integer friends;

    /**
     * New messages number
     */
    @SerializedName("messages")
    private Integer messages;

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

    /**
     * New gifts number
     */
    @SerializedName("gifts")
    private Integer gifts;

    /**
     * New events number
     */
    @SerializedName("events")
    private Integer events;

    /**
     * New groups number
     */
    @SerializedName("groups")
    private Integer groups;

    /**
     * New notifications number
     */
    @SerializedName("notifications")
    private Integer notifications;

    /**
     * New app_requests number
     */
    @SerializedName("app_requests")
    private Integer appRequests;

    /**
     * New friends suggestions number
     */
    @SerializedName("friends_suggestions")
    private Integer friendsSuggestions;

    public Integer getFriends() {
        return friends;
    }

    public Integer getMessages() {
        return messages;
    }

    public Integer getPhotos() {
        return photos;
    }

    public Integer getVideos() {
        return videos;
    }

    public Integer getGifts() {
        return gifts;
    }

    public Integer getEvents() {
        return events;
    }

    public Integer getGroups() {
        return groups;
    }

    public Integer getNotifications() {
        return notifications;
    }

    public Integer getAppRequests() {
        return appRequests;
    }

    public Integer getFriendsSuggestions() {
        return friendsSuggestions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(appRequests, messages, groups, videos, photos, friends, events, notifications, gifts, friendsSuggestions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountCounters accountCounters = (AccountCounters) o;
        return Objects.equals(friends, accountCounters.friends) &&
                Objects.equals(messages, accountCounters.messages) &&
                Objects.equals(photos, accountCounters.photos) &&
                Objects.equals(videos, accountCounters.videos) &&
                Objects.equals(gifts, accountCounters.gifts) &&
                Objects.equals(events, accountCounters.events) &&
                Objects.equals(groups, accountCounters.groups) &&
                Objects.equals(notifications, accountCounters.notifications) &&
                Objects.equals(friendsSuggestions, accountCounters.friendsSuggestions) &&
                Objects.equals(appRequests, accountCounters.appRequests);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccountCounters{");
        sb.append("friends=").append(friends);
        sb.append(", messages=").append(messages);
        sb.append(", photos=").append(photos);
        sb.append(", videos=").append(videos);
        sb.append(", gifts=").append(gifts);
        sb.append(", events=").append(events);
        sb.append(", groups=").append(groups);
        sb.append(", notifications=").append(notifications);
        sb.append(", appRequests=").append(appRequests);
        sb.append(", friendsSuggestions=").append(friendsSuggestions);
        sb.append('}');
        return sb.toString();
    }
}
