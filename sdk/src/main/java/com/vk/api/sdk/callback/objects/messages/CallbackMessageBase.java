package com.vk.api.sdk.callback.objects.messages;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 09.09.16.
 */
public class CallbackMessageBase {

    @SerializedName("type")
    private CallbackMessageType type;

    @SerializedName("object")
    private JsonObject object;

    @SerializedName("group_id")
    private Integer groupId;

    public CallbackMessageType getType() {
        return type;
    }

    public JsonObject getObject() {
        return object;
    }

    public Integer getGroupId() {
        return groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackMessageBase that = (CallbackMessageBase) o;
        return type == that.type &&
                Objects.equals(object, that.object) &&
                Objects.equals(groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, object, groupId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackMessageBase{");
        sb.append("type=").append(type);
        sb.append(", object=").append(object);
        sb.append(", groupId=").append(groupId);
        sb.append('}');
        return sb.toString();
    }
}
