package com.vk.api.sdk.objects.friends;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * FriendStatus object
 */
public class FriendStatus {
    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Friend status with the user
     */
    @SerializedName("friend_status")
    private FriendStatusFriendStatus friendStatus;

    /**
     * Message sent with request
     */
    @SerializedName("request_message")
    private String requestMessage;

    /**
     * Information whether request is unviewed
     */
    @SerializedName("read_state")
    private BoolInt readState;

    /**
     * MD5 hash for the result validation
     */
    @SerializedName("sign")
    private String sign;

    public Integer getUserId() {
        return userId;
    }

    public FriendStatusFriendStatus getFriendStatus() {
        return friendStatus;
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public boolean isReadState() {
        return readState == BoolInt.YES;
    }

    public String getSign() {
        return sign;
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestMessage, friendStatus, readState, sign, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendStatus friendStatus = (FriendStatus) o;
        return Objects.equals(userId, friendStatus.userId) &&
                Objects.equals(friendStatus, friendStatus.friendStatus) &&
                Objects.equals(requestMessage, friendStatus.requestMessage) &&
                Objects.equals(readState, friendStatus.readState) &&
                Objects.equals(sign, friendStatus.sign);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FriendStatus{");
        sb.append("userId=").append(userId);
        sb.append(", friendStatus=").append(friendStatus);
        sb.append(", requestMessage='").append(requestMessage).append("'");
        sb.append(", readState=").append(readState);
        sb.append(", sign='").append(sign).append("'");
        sb.append('}');
        return sb.toString();
    }
}
