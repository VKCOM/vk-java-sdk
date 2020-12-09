package com.vk.api.sdk.objects.notifications.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.apps.App;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.users.User;
import com.vk.api.sdk.objects.video.Video;
import java.util.List;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<String> items;

    @SerializedName("profiles")
    private List<User> profiles;

    @SerializedName("groups")
    private List<Group> groups;

    /**
     * Time when user has been checked notifications last time
     */
    @SerializedName("last_viewed")
    private Integer lastViewed;

    @SerializedName("photos")
    private List<Photo> photos;

    @SerializedName("videos")
    private List<Video> videos;

    @SerializedName("apps")
    private List<App> apps;

    @SerializedName("next_from")
    private String nextFrom;

    @SerializedName("ttl")
    private Integer ttl;

    public Integer getCount() {
        return count;
    }

    public GetResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<String> getItems() {
        return items;
    }

    public GetResponse setItems(List<String> items) {
        this.items = items;
        return this;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public GetResponse setProfiles(List<User> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public GetResponse setGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    public Integer getLastViewed() {
        return lastViewed;
    }

    public GetResponse setLastViewed(Integer lastViewed) {
        this.lastViewed = lastViewed;
        return this;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public GetResponse setPhotos(List<Photo> photos) {
        this.photos = photos;
        return this;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public GetResponse setVideos(List<Video> videos) {
        this.videos = videos;
        return this;
    }

    public List<App> getApps() {
        return apps;
    }

    public GetResponse setApps(List<App> apps) {
        this.apps = apps;
        return this;
    }

    public String getNextFrom() {
        return nextFrom;
    }

    public GetResponse setNextFrom(String nextFrom) {
        this.nextFrom = nextFrom;
        return this;
    }

    public Integer getTtl() {
        return ttl;
    }

    public GetResponse setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastViewed, count, profiles, groups, videos, nextFrom, items, photos, ttl, apps);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(nextFrom, getResponse.nextFrom) &&
                Objects.equals(lastViewed, getResponse.lastViewed) &&
                Objects.equals(count, getResponse.count) &&
                Objects.equals(profiles, getResponse.profiles) &&
                Objects.equals(groups, getResponse.groups) &&
                Objects.equals(videos, getResponse.videos) &&
                Objects.equals(items, getResponse.items) &&
                Objects.equals(photos, getResponse.photos) &&
                Objects.equals(ttl, getResponse.ttl) &&
                Objects.equals(apps, getResponse.apps);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("nextFrom='").append(nextFrom).append("'");
        sb.append(", lastViewed=").append(lastViewed);
        sb.append(", count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", videos=").append(videos);
        sb.append(", items='").append(items).append("'");
        sb.append(", photos=").append(photos);
        sb.append(", ttl=").append(ttl);
        sb.append(", apps=").append(apps);
        sb.append('}');
        return sb.toString();
    }
}
