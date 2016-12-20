package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.messages.Chat;
import com.vk.api.sdk.objects.messages.LongpollMessages;
import com.vk.api.sdk.objects.users.User;

import java.util.List;
import java.util.Objects;

/**
 * GetLongPollHistoryResponse object
 */
public class GetLongPollHistoryResponse {

    @SerializedName("history")
    private List<List<Integer>> history;

    @SerializedName("messages")
    private LongpollMessages messages;

    @SerializedName("profiles")
    private List<User> profiles;

    @SerializedName("chats")
    private List<Chat> chats;

    @SerializedName("new_pts")
    private Integer newPts;

    @SerializedName("more")
    private BoolInt more;

    public List<List<Integer>> getHistory() {
        return history;
    }

    public LongpollMessages getMessages() {
        return messages;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public Integer getNewPts() {
        return newPts;
    }

    public BoolInt getMore() {
        return more;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLongPollHistoryResponse that = (GetLongPollHistoryResponse) o;
        return Objects.equals(history, that.history) &&
                Objects.equals(messages, that.messages) &&
                Objects.equals(profiles, that.profiles) &&
                Objects.equals(chats, that.chats) &&
                Objects.equals(newPts, that.newPts) &&
                more == that.more;
    }

    @Override
    public int hashCode() {
        return Objects.hash(history, messages, profiles, chats, newPts, more);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetLongPollHistoryResponse{");
        sb.append("history=").append(history);
        sb.append(", messages=").append(messages);
        sb.append(", profiles=").append(profiles);
        sb.append(", chats=").append(chats);
        sb.append(", newPts=").append(newPts);
        sb.append(", more=").append(more);
        sb.append('}');
        return sb.toString();
    }
}
