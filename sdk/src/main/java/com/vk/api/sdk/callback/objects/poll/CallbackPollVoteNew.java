package com.vk.api.sdk.callback.objects.poll;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackPollVoteNew {

    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("poll_id")
    private Integer pollId;

    @SerializedName("option_id")
    private Integer optionId;

    @SerializedName("user_id")
    private Integer userId;

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getPollId() {
        return pollId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getOptionId() {
        return optionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackPollVoteNew that = (CallbackPollVoteNew) o;
        return Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(pollId, that.pollId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(optionId, that.optionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, pollId, userId, optionId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackPollVoteNew{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", pollId=").append(pollId);
        sb.append(", userId=").append(userId);
        sb.append(", optionId=").append(optionId);
        sb.append('}');
        return sb.toString();
    }
}
