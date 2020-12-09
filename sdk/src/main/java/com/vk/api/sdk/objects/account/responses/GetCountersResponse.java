package com.vk.api.sdk.objects.account.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GetCountersResponse object
 */
public class GetCountersResponse implements Validable {
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

    public GetCountersResponse setAppRequests(Integer appRequests) {
        this.appRequests = appRequests;
        return this;
    }

    public Integer getEvents() {
        return events;
    }

    public GetCountersResponse setEvents(Integer events) {
        this.events = events;
        return this;
    }

    public Integer getFaves() {
        return faves;
    }

    public GetCountersResponse setFaves(Integer faves) {
        this.faves = faves;
        return this;
    }

    public Integer getFriends() {
        return friends;
    }

    public GetCountersResponse setFriends(Integer friends) {
        this.friends = friends;
        return this;
    }

    public Integer getFriendsSuggestions() {
        return friendsSuggestions;
    }

    public GetCountersResponse setFriendsSuggestions(Integer friendsSuggestions) {
        this.friendsSuggestions = friendsSuggestions;
        return this;
    }

    public Integer getFriendsRecommendations() {
        return friendsRecommendations;
    }

    public GetCountersResponse setFriendsRecommendations(Integer friendsRecommendations) {
        this.friendsRecommendations = friendsRecommendations;
        return this;
    }

    public Integer getGifts() {
        return gifts;
    }

    public GetCountersResponse setGifts(Integer gifts) {
        this.gifts = gifts;
        return this;
    }

    public Integer getGroups() {
        return groups;
    }

    public GetCountersResponse setGroups(Integer groups) {
        this.groups = groups;
        return this;
    }

    public Integer getMenuDiscoverBadge() {
        return menuDiscoverBadge;
    }

    public GetCountersResponse setMenuDiscoverBadge(Integer menuDiscoverBadge) {
        this.menuDiscoverBadge = menuDiscoverBadge;
        return this;
    }

    public Integer getMenuClipsBadge() {
        return menuClipsBadge;
    }

    public GetCountersResponse setMenuClipsBadge(Integer menuClipsBadge) {
        this.menuClipsBadge = menuClipsBadge;
        return this;
    }

    public Integer getMessages() {
        return messages;
    }

    public GetCountersResponse setMessages(Integer messages) {
        this.messages = messages;
        return this;
    }

    public Integer getMemories() {
        return memories;
    }

    public GetCountersResponse setMemories(Integer memories) {
        this.memories = memories;
        return this;
    }

    public Integer getNotes() {
        return notes;
    }

    public GetCountersResponse setNotes(Integer notes) {
        this.notes = notes;
        return this;
    }

    public Integer getNotifications() {
        return notifications;
    }

    public GetCountersResponse setNotifications(Integer notifications) {
        this.notifications = notifications;
        return this;
    }

    public Integer getPhotos() {
        return photos;
    }

    public GetCountersResponse setPhotos(Integer photos) {
        this.photos = photos;
        return this;
    }

    public Integer getSdk() {
        return sdk;
    }

    public GetCountersResponse setSdk(Integer sdk) {
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
        GetCountersResponse getCountersResponse = (GetCountersResponse) o;
        return Objects.equals(faves, getCountersResponse.faves) &&
                Objects.equals(menuClipsBadge, getCountersResponse.menuClipsBadge) &&
                Objects.equals(notes, getCountersResponse.notes) &&
                Objects.equals(groups, getCountersResponse.groups) &&
                Objects.equals(photos, getCountersResponse.photos) &&
                Objects.equals(friends, getCountersResponse.friends) &&
                Objects.equals(friendsRecommendations, getCountersResponse.friendsRecommendations) &&
                Objects.equals(appRequests, getCountersResponse.appRequests) &&
                Objects.equals(menuDiscoverBadge, getCountersResponse.menuDiscoverBadge) &&
                Objects.equals(memories, getCountersResponse.memories) &&
                Objects.equals(messages, getCountersResponse.messages) &&
                Objects.equals(sdk, getCountersResponse.sdk) &&
                Objects.equals(events, getCountersResponse.events) &&
                Objects.equals(notifications, getCountersResponse.notifications) &&
                Objects.equals(friendsSuggestions, getCountersResponse.friendsSuggestions) &&
                Objects.equals(gifts, getCountersResponse.gifts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCountersResponse{");
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
