package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * MessageRequestData object
 */
public class MessageRequestData implements Validable {
    /**
     * Status of message request
     */
    @SerializedName("status")
    private String status;

    /**
     * Message request sender id
     */
    @SerializedName("inviter_id")
    private Integer inviterId;

    /**
     * Message request date
     */
    @SerializedName("request_date")
    private Integer requestDate;

    public String getStatus() {
        return status;
    }

    public MessageRequestData setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getInviterId() {
        return inviterId;
    }

    public MessageRequestData setInviterId(Integer inviterId) {
        this.inviterId = inviterId;
        return this;
    }

    public Integer getRequestDate() {
        return requestDate;
    }

    public MessageRequestData setRequestDate(Integer requestDate) {
        this.requestDate = requestDate;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviterId, requestDate, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageRequestData messageRequestData = (MessageRequestData) o;
        return Objects.equals(inviterId, messageRequestData.inviterId) &&
                Objects.equals(requestDate, messageRequestData.requestDate) &&
                Objects.equals(status, messageRequestData.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageRequestData{");
        sb.append("inviterId=").append(inviterId);
        sb.append(", requestDate=").append(requestDate);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
