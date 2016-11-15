package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.messages.LongpollMessages;

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

    public List<List<Integer>> getHistory() {
        return history;
    }

    public LongpollMessages getMessages() {
        return messages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(messages, history);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLongPollHistoryResponse getLongPollHistoryResponse = (GetLongPollHistoryResponse) o;
        return Objects.equals(history, getLongPollHistoryResponse.history) &&
                Objects.equals(messages, getLongPollHistoryResponse.messages);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetLongPollHistoryResponse{");
        sb.append("history=").append(history);
        sb.append(", messages=").append(messages);
        sb.append('}');
        return sb.toString();
    }
}
