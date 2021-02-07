package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * ConfirmationMessage object
 */
public class ConfirmationMessage implements Validable {
    @SerializedName("type")
    @Required
    private MessageType type;

    @SerializedName("group_id")
    private Integer groupId;

    @SerializedName("secret")
    private String secret;

    public MessageType getType() {
        return type;
    }

    public ConfirmationMessage setType(MessageType type) {
        this.type = type;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public ConfirmationMessage setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public ConfirmationMessage setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, secret, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfirmationMessage confirmationMessage = (ConfirmationMessage) o;
        return Objects.equals(groupId, confirmationMessage.groupId) &&
                Objects.equals(secret, confirmationMessage.secret) &&
                Objects.equals(type, confirmationMessage.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ConfirmationMessage{");
        sb.append("groupId=").append(groupId);
        sb.append(", secret='").append(secret).append("'");
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
