// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.polls.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.polls.VotersFieldsUsers;
import java.util.Objects;

/**
 * GetVotersFieldsResponse object
 */
public class GetVotersFieldsResponse implements Validable {
    /**
     * Answer ID
     */
    @SerializedName("answer_id")
    private Long answerId;

    /**
     * Answer offset
     */
    @SerializedName("answer_offset")
    private String answerOffset;

    @SerializedName("users")
    private VotersFieldsUsers users;

    public Long getAnswerId() {
        return answerId;
    }

    public GetVotersFieldsResponse setAnswerId(Long answerId) {
        this.answerId = answerId;
        return this;
    }

    public String getAnswerOffset() {
        return answerOffset;
    }

    public GetVotersFieldsResponse setAnswerOffset(String answerOffset) {
        this.answerOffset = answerOffset;
        return this;
    }

    public VotersFieldsUsers getUsers() {
        return users;
    }

    public GetVotersFieldsResponse setUsers(VotersFieldsUsers users) {
        this.users = users;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, answerOffset, users);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetVotersFieldsResponse getVotersFieldsResponse = (GetVotersFieldsResponse) o;
        return Objects.equals(answerOffset, getVotersFieldsResponse.answerOffset) &&
                Objects.equals(answerId, getVotersFieldsResponse.answerId) &&
                Objects.equals(users, getVotersFieldsResponse.users);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetVotersFieldsResponse{");
        sb.append("answerOffset='").append(answerOffset).append("'");
        sb.append(", answerId=").append(answerId);
        sb.append(", users=").append(users);
        sb.append('}');
        return sb.toString();
    }
}