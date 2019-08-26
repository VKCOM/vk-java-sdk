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
     * New business notifications number
     */
    @SerializedName("business_notify")
    private Integer businessNotify;

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
     * Unread friends notification number
     */
    @SerializedName("friends_unread")
    private Integer friendsUnread;

    /**
     * Unread friends badge
     */
    @SerializedName("friends_unread_badge")
    private Integer friendsUnreadBadge;

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
     * Icon badge
     */
    @SerializedName("icon_badge")
    private Integer iconBadge;

    /**
     * Menu notifications badge
     */
    @SerializedName("menu_notifications_badge")
    private Integer menuNotificationsBadge;

    @SerializedName("menu_discover_badge")
    private Integer menuDiscoverBadge;

    /**
     * New messages number
     */
    @SerializedName("messages")
    private Integer messages;

    /**
     * New message requests number
     */
    @SerializedName("message_requests")
    private Integer messageRequests;

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

    public Integer getBusinessNotify() {
        return businessNotify;
    }

    public AccountCounters setBusinessNotify(Integer businessNotify) {
        this.businessNotify = businessNotify;
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

    public Integer getFriendsUnread() {
        return friendsUnread;
    }

    public AccountCounters setFriendsUnread(Integer friendsUnread) {
        this.friendsUnread = friendsUnread;
        return this;
    }

    public Integer getFriendsUnreadBadge() {
        return friendsUnreadBadge;
    }

    public AccountCounters setFriendsUnreadBadge(Integer friendsUnreadBadge) {
        this.friendsUnreadBadge = friendsUnreadBadge;
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

    public Integer getIconBadge() {
        return iconBadge;
    }

    public AccountCounters setIconBadge(Integer iconBadge) {
        this.iconBadge = iconBadge;
        return this;
    }

    public Integer getMenuNotificationsBadge() {
        return menuNotificationsBadge;
    }

    public AccountCounters setMenuNotificationsBadge(Integer menuNotificationsBadge) {
        this.menuNotificationsBadge = menuNotificationsBadge;
        return this;
    }

    public Integer getMenuDiscoverBadge() {
        return menuDiscoverBadge;
    }

    public AccountCounters setMenuDiscoverBadge(Integer menuDiscoverBadge) {
        this.menuDiscoverBadge = menuDiscoverBadge;
        return this;
    }

    public Integer getMessages() {
        return messages;
    }

    public AccountCounters setMessages(Integer messages) {
        this.messages = messages;
        return this;
    }

    public Integer getMessageRequests() {
        return messageRequests;
    }

    public AccountCounters setMessageRequests(Integer messageRequests) {
        this.messageRequests = messageRequests;
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
        return Objects.hash(faves, notes, appRequests, groups, friendsSuggestions, photos, menuDiscoverBadge, friends, friendsUnreadBadge, friendsUnread, iconBadge, menuNotificationsBadge, messageRequests, messages, businessNotify, sdk, events, notifications, friendsRecommendations, gifts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountCounters accountCounters = (AccountCounters) o;
        return Objects.equals(faves, accountCounters.faves) &&
                Objects.equals(friendsUnread, accountCounters.friendsUnread) &&
                Objects.equals(notes, accountCounters.notes) &&
                Objects.equals(businessNotify, accountCounters.businessNotify) &&
                Objects.equals(iconBadge, accountCounters.iconBadge) &&
                Objects.equals(groups, accountCounters.groups) &&
                Objects.equals(photos, accountCounters.photos) &&
                Objects.equals(friends, accountCounters.friends) &&
                Objects.equals(friendsUnreadBadge, accountCounters.friendsUnreadBadge) &&
                Objects.equals(friendsRecommendations, accountCounters.friendsRecommendations) &&
                Objects.equals(appRequests, accountCounters.appRequests) &&
                Objects.equals(menuDiscoverBadge, accountCounters.menuDiscoverBadge) &&
                Objects.equals(messageRequests, accountCounters.messageRequests) &&
                Objects.equals(menuNotificationsBadge, accountCounters.menuNotificationsBadge) &&
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
        sb.append(", friendsUnread=").append(friendsUnread);
        sb.append(", notes=").append(notes);
        sb.append(", businessNotify=").append(businessNotify);
        sb.append(", iconBadge=").append(iconBadge);
        sb.append(", groups=").append(groups);
        sb.append(", photos=").append(photos);
        sb.append(", friends=").append(friends);
        sb.append(", friendsUnreadBadge=").append(friendsUnreadBadge);
        sb.append(", friendsRecommendations=").append(friendsRecommendations);
        sb.append(", appRequests=").append(appRequests);
        sb.append(", menuDiscoverBadge=").append(menuDiscoverBadge);
        sb.append(", messageRequests=").append(messageRequests);
        sb.append(", menuNotificationsBadge=").append(menuNotificationsBadge);
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
