package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.friends.FriendStatusStatus;
import java.util.Objects;

/**
 * AreFriendsResponse object
 */
public class AreFriendsResponse implements Validable {
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

    public AreFriendsResponse setFriendStatus(FriendStatusStatus friendStatus) {
        this.friendStatus = friendStatus;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public AreFriendsResponse setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public AreFriendsResponse setUserId(Integer userId) {
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
        AreFriendsResponse areFriendsResponse = (AreFriendsResponse) o;
        return Objects.equals(friendStatus, areFriendsResponse.friendStatus) &&
                Objects.equals(userId, areFriendsResponse.userId) &&
                Objects.equals(sign, areFriendsResponse.sign);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AreFriendsResponse{");
        sb.append("friendStatus=").append(friendStatus);
        sb.append(", userId=").append(userId);
        sb.append(", sign='").append(sign).append("'");
        sb.append('}');
        return sb.toString();
    }
}
