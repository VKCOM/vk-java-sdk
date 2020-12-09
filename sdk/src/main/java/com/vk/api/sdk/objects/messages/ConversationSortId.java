package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ConversationSortId object
 */
public class ConversationSortId implements Validable {
    /**
     * Major id for sorting conversations
     */
    @SerializedName("major_id")
    private Integer majorId;

    /**
     * Minor id for sorting conversations
     */
    @SerializedName("minor_id")
    private Integer minorId;

    public Integer getMajorId() {
        return majorId;
    }

    public ConversationSortId setMajorId(Integer majorId) {
        this.majorId = majorId;
        return this;
    }

    public Integer getMinorId() {
        return minorId;
    }

    public ConversationSortId setMinorId(Integer minorId) {
        this.minorId = minorId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(majorId, minorId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConversationSortId conversationSortId = (ConversationSortId) o;
        return Objects.equals(minorId, conversationSortId.minorId) &&
                Objects.equals(majorId, conversationSortId.majorId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ConversationSortId{");
        sb.append("minorId=").append(minorId);
        sb.append(", majorId=").append(majorId);
        sb.append('}');
        return sb.toString();
    }
}
