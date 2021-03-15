package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

public class MessageNew  implements Validable {
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
    public int hashCode() {
        return Objects.hash(message, clientInfo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageNew messageNew = (MessageNew) o;
        return Objects.equals(message, messageNew.message) &&
                Objects.equals(clientInfo, messageNew.clientInfo);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageNew{");
        sb.append("message=").append(message);
        sb.append(", clientInfo=").append(clientInfo);
        sb.append('}');
        return sb.toString();
    }
}
