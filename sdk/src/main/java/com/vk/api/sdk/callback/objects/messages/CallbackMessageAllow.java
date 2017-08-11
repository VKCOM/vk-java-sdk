package com.vk.api.sdk.callback.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 15.10.16.
 */
public class CallbackMessageAllow {

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("key")
    private String key;

    public Integer getUserId() {
        return userId;
    }

    public String getKey() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackMessageAllow that = (CallbackMessageAllow) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, key);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackMessageAllow{");
        sb.append("userId=").append(userId);
        sb.append(", key=\"").append(key).append("\"");
        sb.append('}');
        return sb.toString();
    }
}
