package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * ConversationCanWrite object
 */
public class ConversationCanWrite implements Validable {
    @SerializedName("allowed")
    @Required
    private Boolean allowed;

    @SerializedName("reason")
    private Integer reason;

    public Boolean getAllowed() {
        return allowed;
    }

    public ConversationCanWrite setAllowed(Boolean allowed) {
        this.allowed = allowed;
        return this;
    }

    public Integer getReason() {
        return reason;
    }

    public ConversationCanWrite setReason(Integer reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, allowed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConversationCanWrite conversationCanWrite = (ConversationCanWrite) o;
        return Objects.equals(reason, conversationCanWrite.reason) &&
                Objects.equals(allowed, conversationCanWrite.allowed);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ConversationCanWrite{");
        sb.append("reason=").append(reason);
        sb.append(", allowed=").append(allowed);
        sb.append('}');
        return sb.toString();
    }
}
