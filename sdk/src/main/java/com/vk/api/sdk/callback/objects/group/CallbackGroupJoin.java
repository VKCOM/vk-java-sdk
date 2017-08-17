package com.vk.api.sdk.callback.objects.group;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackGroupJoin {

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("join_type")
    private CallbackGroupJoinType joinType;

    public Integer getUserId() {
        return userId;
    }

    public CallbackGroupJoinType getJoinType() {
        return joinType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackGroupJoin that = (CallbackGroupJoin) o;
        return Objects.equals(userId, that.userId) &&
                joinType == that.joinType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, joinType);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackGroupJoin{");
        sb.append("userId=").append(userId);
        sb.append(", joinType=").append(joinType);
        sb.append('}');
        return sb.toString();
    }
}
