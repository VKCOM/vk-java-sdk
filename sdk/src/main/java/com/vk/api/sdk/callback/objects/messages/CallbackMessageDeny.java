package com.vk.api.sdk.callback.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 15.10.16.
 */
public class CallbackMessageDeny {

    @SerializedName("user_id")
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackMessageDeny that = (CallbackMessageDeny) o;
        return Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackMessageDeny{");
        sb.append("userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}
