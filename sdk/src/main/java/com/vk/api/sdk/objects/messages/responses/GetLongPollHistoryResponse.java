package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.messages.Chat;
import com.vk.api.sdk.objects.messages.Conversation;
import com.vk.api.sdk.objects.messages.LongpollMessages;
import com.vk.api.sdk.objects.messages.LongpollParams;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * GetLongPollHistoryResponse object
 */
public class GetLongPollHistoryResponse implements Validable {
    @SerializedName("history")
    private List<List<Integer>> history;

    @SerializedName("messages")
    private LongpollMessages messages;

    @SerializedName("credentials")
    private LongpollParams credentials;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    @SerializedName("groups")
    private List<Group> groups;

    @SerializedName("chats")
    private List<Chat> chats;

    /**
     * Persistence timestamp
     */
    @SerializedName("new_pts")
    private Integer newPts;

    @SerializedName("from_pts")
    private Integer fromPts;

    /**
     * Has more
     */
    @SerializedName("more")
    private Boolean more;

    @SerializedName("conversations")
    private List<Conversation> conversations;

    public List<List<Integer>> getHistory() {
        return history;
    }

    public GetLongPollHistoryResponse setHistory(List<List<Integer>> history) {
        this.history = history;
        return this;
    }

    public LongpollMessages getMessages() {
        return messages;
    }

    public GetLongPollHistoryResponse setMessages(LongpollMessages messages) {
        this.messages = messages;
        return this;
    }

    public LongpollParams getCredentials() {
        return credentials;
    }

    public GetLongPollHistoryResponse setCredentials(LongpollParams credentials) {
        this.credentials = credentials;
        return this;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetLongPollHistoryResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public GetLongPollHistoryResponse setGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public GetLongPollHistoryResponse setChats(List<Chat> chats) {
        this.chats = chats;
        return this;
    }

    public Integer getNewPts() {
        return newPts;
    }

    public GetLongPollHistoryResponse setNewPts(Integer newPts) {
        this.newPts = newPts;
        return this;
    }

    public Integer getFromPts() {
        return fromPts;
    }

    public GetLongPollHistoryResponse setFromPts(Integer fromPts) {
        this.fromPts = fromPts;
        return this;
    }

    public Boolean getMore() {
        return more;
    }

    public GetLongPollHistoryResponse setMore(Boolean more) {
        this.more = more;
        return this;
    }

    public List<Conversation> getConversations() {
        return conversations;
    }

    public GetLongPollHistoryResponse setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPts, credentials, more, fromPts, profiles, chats, messages, groups, history, conversations);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLongPollHistoryResponse getLongPollHistoryResponse = (GetLongPollHistoryResponse) o;
        return Objects.equals(newPts, getLongPollHistoryResponse.newPts) &&
                Objects.equals(credentials, getLongPollHistoryResponse.credentials) &&
                Objects.equals(more, getLongPollHistoryResponse.more) &&
                Objects.equals(profiles, getLongPollHistoryResponse.profiles) &&
                Objects.equals(chats, getLongPollHistoryResponse.chats) &&
                Objects.equals(messages, getLongPollHistoryResponse.messages) &&
                Objects.equals(groups, getLongPollHistoryResponse.groups) &&
                Objects.equals(history, getLongPollHistoryResponse.history) &&
                Objects.equals(conversations, getLongPollHistoryResponse.conversations) &&
                Objects.equals(fromPts, getLongPollHistoryResponse.fromPts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetLongPollHistoryResponse{");
        sb.append("newPts=").append(newPts);
        sb.append(", credentials=").append(credentials);
        sb.append(", more=").append(more);
        sb.append(", profiles=").append(profiles);
        sb.append(", chats=").append(chats);
        sb.append(", messages=").append(messages);
        sb.append(", groups=").append(groups);
        sb.append(", history=").append(history);
        sb.append(", conversations=").append(conversations);
        sb.append(", fromPts=").append(fromPts);
        sb.append('}');
        return sb.toString();
    }
}
