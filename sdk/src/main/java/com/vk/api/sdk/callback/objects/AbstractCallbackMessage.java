package com.vk.api.sdk.callback.objects;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public abstract class AbstractCallbackMessage<T> {

    @SerializedName("type")
    private CallbackMessageType type;

    @SerializedName("group_id")
    private Integer groupId;

    @SerializedName("object")
    private T object;

    public CallbackMessageType getType() {
        return type;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public T getObject() {
        return object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCallbackMessage<?> that = (AbstractCallbackMessage<?>) o;
        return type == that.type &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(object, that.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, groupId, object);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractCallbackMessage{");
        sb.append("type=").append(type);
        sb.append(", groupId=").append(groupId);
        sb.append(", object=").append(object);
        sb.append('}');
        return sb.toString();
    }
}
