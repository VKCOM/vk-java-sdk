package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.messages.Message;

import java.util.List;
import java.util.Objects;

/**
 * GetHistoryResponse object
 */
public class GetHistoryResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Unread dialogs number
     */
    @SerializedName("unread")
    private Integer unread;

    @SerializedName("items")
    private List<Message> items;

    /**
     * Id of last read inbound message
     */
    @SerializedName("in_read")
    private Integer inRead;

    /**
     * Id of last read outbound message
     */
    @SerializedName("out_read")
    private Integer outRead;

    public Integer getCount() {
        return count;
    }

    public Integer getUnread() {
        return unread;
    }

    public List<Message> getItems() {
        return items;
    }

    public Integer getInRead() {
        return inRead;
    }

    public Integer getOutRead() {
        return outRead;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unread, count, items, inRead, outRead);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetHistoryResponse that = (GetHistoryResponse) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(unread, that.unread) &&
                Objects.equals(items, that.items) &&
                Objects.equals(inRead, that.inRead) &&
                Objects.equals(outRead, that.outRead);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetHistoryResponse{");
        sb.append("count=").append(count);
        sb.append(", unread=").append(unread);
        sb.append(", items=").append(items);
        sb.append(", inRead=").append(inRead);
        sb.append(", outRead=").append(outRead);
        sb.append('}');
        return sb.toString();
    }
}
