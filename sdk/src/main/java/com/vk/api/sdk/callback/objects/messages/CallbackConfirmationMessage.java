package com.vk.api.sdk.callback.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackConfirmationMessage {

    @SerializedName("type")
    private CallbackMessageType type;

    @SerializedName("group_id")
    private Integer groupId;

    @SerializedName("secret")
    private String secret;

    public CallbackMessageType getType() {
        return type;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public String getSecret() {
        return secret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackConfirmationMessage that = (CallbackConfirmationMessage) o;
        return type == that.type &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, groupId, secret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackConfirmationMessage{");
        sb.append("type=").append(type);
        sb.append(", groupId=").append(groupId);
        sb.append(", secret='").append(secret).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
