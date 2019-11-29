package com.vk.api.sdk.objects.callback.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.callback.MessageType;
import com.vk.api.sdk.objects.messages.Message;

import java.util.Objects;

public class MessageWithClientInfo {

    @SerializedName("message")
    private Message message;

    @SerializedName("client_info")
    private ClientInfo clientInfo;

    public Message getMessage() {
        return message;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageWithClientInfo that = (MessageWithClientInfo) o;
        return message == that.message &&
                Objects.equals(clientInfo, that.clientInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, clientInfo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MessageWithClientInfo{");
        sb.append("message=").append(message);
        sb.append(", clientInfo=").append(clientInfo);
        sb.append('}');
        return sb.toString();
    }
}
