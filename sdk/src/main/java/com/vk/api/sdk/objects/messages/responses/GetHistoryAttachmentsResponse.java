package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.messages.HistoryAttachment;

import java.util.List;
import java.util.Objects;

/**
 * GetHistoryAttachmentsResponse object
 */
public class GetHistoryAttachmentsResponse {
    @SerializedName("items")
    private List<HistoryAttachment> items;

    /**
     * Value for pagination
     */
    @SerializedName("next_from")
    private String nextFrom;

    public List<HistoryAttachment> getItems() {
        return items;
    }

    public String getNextFrom() {
        return nextFrom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, nextFrom);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetHistoryAttachmentsResponse getHistoryAttachmentsResponse = (GetHistoryAttachmentsResponse) o;
        return Objects.equals(items, getHistoryAttachmentsResponse.items) &&
                Objects.equals(nextFrom, getHistoryAttachmentsResponse.nextFrom);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetHistoryAttachmentsResponse{");
        sb.append("items=").append(items);
        sb.append(", nextFrom='").append(nextFrom).append("'");
        sb.append('}');
        return sb.toString();
    }
}
