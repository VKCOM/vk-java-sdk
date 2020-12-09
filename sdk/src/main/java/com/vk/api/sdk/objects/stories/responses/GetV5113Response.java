package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.stories.FeedItem;
import com.vk.api.sdk.objects.users.User;
import java.util.List;
import java.util.Objects;

/**
 * GetV5113Response object
 */
public class GetV5113Response implements Validable {
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<FeedItem> items;

    @SerializedName("profiles")
    private List<User> profiles;

    @SerializedName("groups")
    private List<Group> groups;

    @SerializedName("need_upload_screen")
    private Boolean needUploadScreen;

    public Integer getCount() {
        return count;
    }

    public GetV5113Response setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<FeedItem> getItems() {
        return items;
    }

    public GetV5113Response setItems(List<FeedItem> items) {
        this.items = items;
        return this;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public GetV5113Response setProfiles(List<User> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public GetV5113Response setGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    public Boolean getNeedUploadScreen() {
        return needUploadScreen;
    }

    public GetV5113Response setNeedUploadScreen(Boolean needUploadScreen) {
        this.needUploadScreen = needUploadScreen;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, profiles, needUploadScreen, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetV5113Response getV5113Response = (GetV5113Response) o;
        return Objects.equals(count, getV5113Response.count) &&
                Objects.equals(profiles, getV5113Response.profiles) &&
                Objects.equals(groups, getV5113Response.groups) &&
                Objects.equals(needUploadScreen, getV5113Response.needUploadScreen) &&
                Objects.equals(items, getV5113Response.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetV5113Response{");
        sb.append("count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", needUploadScreen=").append(needUploadScreen);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
