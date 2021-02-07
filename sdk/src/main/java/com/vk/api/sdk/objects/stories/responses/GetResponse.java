package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.stories.PromoBlock;
import com.vk.api.sdk.objects.stories.Story;
import com.vk.api.sdk.objects.users.User;
import java.util.List;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    /**
     * Stories count
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<List<Story>> items;

    @SerializedName("promo_data")
    private PromoBlock promoData;

    @SerializedName("profiles")
    private List<User> profiles;

    @SerializedName("groups")
    private List<Group> groups;

    @SerializedName("need_upload_screen")
    private Boolean needUploadScreen;

    public Integer getCount() {
        return count;
    }

    public GetResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<List<Story>> getItems() {
        return items;
    }

    public GetResponse setItems(List<List<Story>> items) {
        this.items = items;
        return this;
    }

    public PromoBlock getPromoData() {
        return promoData;
    }

    public GetResponse setPromoData(PromoBlock promoData) {
        this.promoData = promoData;
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

    public Boolean getNeedUploadScreen() {
        return needUploadScreen;
    }

    public GetResponse setNeedUploadScreen(Boolean needUploadScreen) {
        this.needUploadScreen = needUploadScreen;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, profiles, needUploadScreen, groups, items, promoData);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(promoData, getResponse.promoData) &&
                Objects.equals(count, getResponse.count) &&
                Objects.equals(profiles, getResponse.profiles) &&
                Objects.equals(groups, getResponse.groups) &&
                Objects.equals(needUploadScreen, getResponse.needUploadScreen) &&
                Objects.equals(items, getResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("promoData=").append(promoData);
        sb.append(", count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", needUploadScreen=").append(needUploadScreen);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
