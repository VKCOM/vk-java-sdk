package com.vk.api.sdk.callback.objects;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackBoardPostDelete {

    @SerializedName("topic_id")
    private Integer topicId;

    @SerializedName("id")
    private Integer id;

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
        return Objects.equals(topicId, that.topicId) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicId, id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackBoardPostDelete{");
        sb.append("topicId=").append(topicId);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
