// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * MessageNew object
 */
public class MessageNew extends Base implements Validable {
    @SerializedName("object")
    @Required
    private MessageObject object;

    public MessageObject getObject() {
        return object;
    }

    public MessageNew setObject(MessageObject object) {
        this.object = object;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageNew messageNew = (MessageNew) o;
        return Objects.equals(object, messageNew.object);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageNew{");
        sb.append("object=").append(object);
        sb.append('}');
        return sb.toString();
    }
}