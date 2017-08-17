package com.vk.api.sdk.callback.objects.group;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackGroupLeave {

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("self")
    private BoolInt self;

    public Integer getUserId() {
        return userId;
    }

    public BoolInt getSelf() {
        return self;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackGroupLeave that = (CallbackGroupLeave) o;
        return Objects.equals(userId, that.userId) &&
                self == that.self;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, self);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackGroupLeave{");
        sb.append("userId=").append(userId);
        sb.append(", self=").append(self);
        sb.append('}');
        return sb.toString();
    }
}
