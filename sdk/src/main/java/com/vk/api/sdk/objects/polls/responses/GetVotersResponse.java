package com.vk.api.sdk.objects.polls.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.polls.VotersUsers;
import java.util.Objects;

/**
 * GetVotersResponse object
 */
public class GetVotersResponse implements Validable {
    /**
     * Answer ID
     */
    @SerializedName("answer_id")
    private Integer answerId;

    @SerializedName("users")
    private VotersUsers users;

    public Integer getAnswerId() {
        return answerId;
    }

    public GetVotersResponse setAnswerId(Integer answerId) {
        this.answerId = answerId;
        return this;
    }

    public VotersUsers getUsers() {
        return users;
    }

    public GetVotersResponse setUsers(VotersUsers users) {
        this.users = users;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, users);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetVotersResponse getVotersResponse = (GetVotersResponse) o;
        return Objects.equals(answerId, getVotersResponse.answerId) &&
                Objects.equals(users, getVotersResponse.users);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetVotersResponse{");
        sb.append("answerId=").append(answerId);
        sb.append(", users=").append(users);
        sb.append('}');
        return sb.toString();
    }
}
