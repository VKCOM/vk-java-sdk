package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * AccountCounters object
 */
public class AccountCounters implements Validable {
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
     * New faves number
     */
    @SerializedName("faves")
    private Integer faves;

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
     * New friends recommendations number
     */
    @SerializedName("friends_recommendations")
    private Integer friendsRecommendations;

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

    @SerializedName("menu_discover_badge")
    private Integer menuDiscoverBadge;

    @SerializedName("menu_clips_badge")
    private Integer menuClipsBadge;

    /**
     * New messages number
     */
    @SerializedName("messages")
    private Integer messages;

    /**
     * New memories number
     */
    @SerializedName("memories")
    private Integer memories;

    /**
     * New notes number
     */
    @SerializedName("notes")
    private Integer notes;

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
     * New sdk number
     */
    @SerializedName("sdk")
    private Integer sdk;

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

    public Integer getFaves() {
        return faves;
    }

    public AccountCounters setFaves(Integer faves) {
        this.faves = faves;
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

    public Integer getFriendsRecommendations() {
        return friendsRecommendations;
    }

    public AccountCounters setFriendsRecommendations(Integer friendsRecommendations) {
        this.friendsRecommendations = friendsRecommendations;
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

    public Integer getMenuDiscoverBadge() {
        return menuDiscoverBadge;
    }

    public AccountCounters setMenuDiscoverBadge(Integer menuDiscoverBadge) {
        this.menuDiscoverBadge = menuDiscoverBadge;
        return this;
    }

    public Integer getMenuClipsBadge() {
        return menuClipsBadge;
    }

    public AccountCounters setMenuClipsBadge(Integer menuClipsBadge) {
        this.menuClipsBadge = menuClipsBadge;
        return this;
    }

    public Integer getMessages() {
        return messages;
    }

    public AccountCounters setMessages(Integer messages) {
        this.messages = messages;
        return this;
    }

    public Integer getMemories() {
        return memories;
    }

    public AccountCounters setMemories(Integer memories) {
        this.memories = memories;
        return this;
    }

    public Integer getNotes() {
        return notes;
    }

    public AccountCounters setNotes(Integer notes) {
        this.notes = notes;
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

    public Integer getSdk() {
        return sdk;
    }

    public AccountCounters setSdk(Integer sdk) {
        this.sdk = sdk;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(faves, notes, appRequests, groups, menuClipsBadge, friendsSuggestions, photos, menuDiscoverBadge, friends, memories, messages, sdk, events, notifications, friendsRecommendations, gifts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountCounters accountCounters = (AccountCounters) o;
        return Objects.equals(faves, accountCounters.faves) &&
                Objects.equals(menuClipsBadge, accountCounters.menuClipsBadge) &&
                Objects.equals(notes, accountCounters.notes) &&
                Objects.equals(groups, accountCounters.groups) &&
                Objects.equals(photos, accountCounters.photos) &&
                Objects.equals(friends, accountCounters.friends) &&
                Objects.equals(friendsRecommendations, accountCounters.friendsRecommendations) &&
                Objects.equals(appRequests, accountCounters.appRequests) &&
                Objects.equals(menuDiscoverBadge, accountCounters.menuDiscoverBadge) &&
                Objects.equals(memories, accountCounters.memories) &&
                Objects.equals(messages, accountCounters.messages) &&
                Objects.equals(sdk, accountCounters.sdk) &&
                Objects.equals(events, accountCounters.events) &&
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
        sb.append("faves=").append(faves);
        sb.append(", menuClipsBadge=").append(menuClipsBadge);
        sb.append(", notes=").append(notes);
        sb.append(", groups=").append(groups);
        sb.append(", photos=").append(photos);
        sb.append(", friends=").append(friends);
        sb.append(", friendsRecommendations=").append(friendsRecommendations);
        sb.append(", appRequests=").append(appRequests);
        sb.append(", menuDiscoverBadge=").append(menuDiscoverBadge);
        sb.append(", memories=").append(memories);
        sb.append(", messages=").append(messages);
        sb.append(", sdk=").append(sdk);
        sb.append(", events=").append(events);
        sb.append(", notifications=").append(notifications);
        sb.append(", friendsSuggestions=").append(friendsSuggestions);
        sb.append(", gifts=").append(gifts);
        sb.append('}');
        return sb.toString();
    }
}
