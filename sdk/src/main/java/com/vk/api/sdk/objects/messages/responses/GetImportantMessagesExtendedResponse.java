package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.messages.Conversation;
import com.vk.api.sdk.objects.messages.MessagesArray;
import com.vk.api.sdk.objects.users.User;
import java.util.List;
import java.util.Objects;

/**
 * GetImportantMessagesExtendedResponse object
 */
public class GetImportantMessagesExtendedResponse implements Validable {
    @SerializedName("messages")
    @Required
    private MessagesArray messages;

    @SerializedName("profiles")
    private List<User> profiles;

    @SerializedName("groups")
    private List<Group> groups;

    @SerializedName("conversations")
    private List<Conversation> conversations;

    public MessagesArray getMessages() {
        return messages;
    }

    public GetImportantMessagesExtendedResponse setMessages(MessagesArray messages) {
        this.messages = messages;
        return this;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public GetImportantMessagesExtendedResponse setProfiles(List<User> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public GetImportantMessagesExtendedResponse setGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    public List<Conversation> getConversations() {
        return conversations;
    }

    public GetImportantMessagesExtendedResponse setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, messages, groups, conversations);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetImportantMessagesExtendedResponse getImportantMessagesExtendedResponse = (GetImportantMessagesExtendedResponse) o;
        return Objects.equals(profiles, getImportantMessagesExtendedResponse.profiles) &&
                Objects.equals(messages, getImportantMessagesExtendedResponse.messages) &&
                Objects.equals(groups, getImportantMessagesExtendedResponse.groups) &&
                Objects.equals(conversations, getImportantMessagesExtendedResponse.conversations);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetImportantMessagesExtendedResponse{");
        sb.append("profiles=").append(profiles);
        sb.append(", messages=").append(messages);
        sb.append(", groups=").append(groups);
        sb.append(", conversations=").append(conversations);
        sb.append('}');
        return sb.toString();
    }
}
