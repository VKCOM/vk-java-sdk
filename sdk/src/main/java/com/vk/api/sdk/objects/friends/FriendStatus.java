package com.vk.api.sdk.objects.friends;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * FriendStatus object
 */
public class FriendStatus implements Validable {
    @SerializedName("friend_status")
    private FriendStatusStatus friendStatus;

    /**
     * MD5 hash for the result validation
     */
    @SerializedName("sign")
    private String sign;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public FriendStatusStatus getFriendStatus() {
        return friendStatus;
    }

    public FriendStatus setFriendStatus(FriendStatusStatus friendStatus) {
        this.friendStatus = friendStatus;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public FriendStatus setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public FriendStatus setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(friendStatus, sign, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendStatus friendStatus = (FriendStatus) o;
        return Objects.equals(friendStatus, friendStatus.friendStatus) &&
                Objects.equals(userId, friendStatus.userId) &&
                Objects.equals(sign, friendStatus.sign);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("FriendStatus{");
        sb.append("friendStatus=").append(friendStatus);
        sb.append(", userId=").append(userId);
        sb.append(", sign='").append(sign).append("'");
        sb.append('}');
        return sb.toString();
    }
}
