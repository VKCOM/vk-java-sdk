package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * GetIntentUsersResponse object
 */
public class GetIntentUsersResponse implements Validable {
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Integer> items;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    public Integer getCount() {
        return count;
    }

    public GetIntentUsersResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Integer> getItems() {
        return items;
    }

    public GetIntentUsersResponse setItems(List<Integer> items) {
        this.items = items;
        return this;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetIntentUsersResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, profiles, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetIntentUsersResponse getIntentUsersResponse = (GetIntentUsersResponse) o;
        return Objects.equals(count, getIntentUsersResponse.count) &&
                Objects.equals(profiles, getIntentUsersResponse.profiles) &&
                Objects.equals(items, getIntentUsersResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetIntentUsersResponse{");
        sb.append("count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
