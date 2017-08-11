package com.vk.api.sdk.callback.objects.board;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackBoardPostDelete {

    @SerializedName("topic_owner_id")
    private Integer topicOwnerId;

    @SerializedName("topic_id")
    private Integer topicId;

    @SerializedName("id")
    private Integer id;

    public Integer getTopicOwnerId() {
        return topicOwnerId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackBoardPostDelete that = (CallbackBoardPostDelete) o;
        return Objects.equals(topicOwnerId, that.topicOwnerId) &&
                Objects.equals(topicId, that.topicId) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicOwnerId, topicId, id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackBoardPostDelete{");
        sb.append("topicOwnerId=").append(topicOwnerId);
        sb.append(", topicId=").append(topicId);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
