package com.vk.api.sdk.objects.callback.messages;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.events.Events;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackMessage {

    @SerializedName("type")
    private Events type;

    @SerializedName("group_id")
    private Integer groupId;

    @SerializedName("object")
    private JsonObject object;

    @SerializedName("secret")
    private String secret;

    public Events getType() {
        return type;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public JsonObject getObject() {
        return object;
    }

    public String getSecret() {
        return secret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackMessage that = (CallbackMessage) o;
        return type == that.type &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(object, that.object) &&
                Objects.equals(secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, groupId, object);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackMessage{");
        sb.append("type=").append(type);
        sb.append(", groupId=").append(groupId);
        sb.append(", object=").append(object);
        sb.append(", secret='").append(secret).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
