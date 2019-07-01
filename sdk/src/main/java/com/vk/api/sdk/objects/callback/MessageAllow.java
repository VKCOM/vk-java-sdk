package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * MessageAllow object
 */
public class MessageAllow implements Validable {
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("key")
    @Required
    private String key;

    public Integer getUserId() {
        return userId;
    }

    public MessageAllow setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getKey() {
        return key;
    }

    public MessageAllow setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageAllow messageAllow = (MessageAllow) o;
        return Objects.equals(userId, messageAllow.userId) &&
                Objects.equals(key, messageAllow.key);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageAllow{");
        sb.append("userId=").append(userId);
        sb.append(", key='").append(key).append("'");
        sb.append('}');
        return sb.toString();
    }
}
