package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.messages.Conversation;
import com.vk.api.sdk.objects.users.User;
import java.util.List;
import java.util.Objects;

/**
 * GetConversationsByIdExtendedResponse object
 */
public class GetConversationsByIdExtendedResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Conversation> items;

    @SerializedName("profiles")
    private List<User> profiles;

    public Integer getCount() {
        return count;
    }

    public GetConversationsByIdExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Conversation> getItems() {
        return items;
    }

    public GetConversationsByIdExtendedResponse setItems(List<Conversation> items) {
        this.items = items;
        return this;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public GetConversationsByIdExtendedResponse setProfiles(List<User> profiles) {
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
        GetConversationsByIdExtendedResponse getConversationsByIdExtendedResponse = (GetConversationsByIdExtendedResponse) o;
        return Objects.equals(count, getConversationsByIdExtendedResponse.count) &&
                Objects.equals(profiles, getConversationsByIdExtendedResponse.profiles) &&
                Objects.equals(items, getConversationsByIdExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetConversationsByIdExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
