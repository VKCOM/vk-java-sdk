package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.client.InfoForBots;
import java.util.Objects;

/**
 * MessageData object
 */
public class MessageData implements Validable {
    @SerializedName("client_info")
    private InfoForBots clientInfo;

    @SerializedName("message")
    private JsonObject message;

    public InfoForBots getClientInfo() {
        return clientInfo;
    }

    public MessageData setClientInfo(InfoForBots clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }

    public JsonObject getMessage() {
        return message;
    }

    public MessageData setMessage(JsonObject message) {
        this.message = message;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientInfo, message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageData messageData = (MessageData) o;
        return Objects.equals(clientInfo, messageData.clientInfo) &&
                Objects.equals(message, messageData.message);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageData{");
        sb.append("clientInfo=").append(clientInfo);
        sb.append(", message=").append(message);
        sb.append('}');
        return sb.toString();
    }
}
