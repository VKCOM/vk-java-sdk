package com.vk.api.sdk.objects.polls;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Voters object
 */
public class Voters {
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

    public VotersUsers getUsers() {
        return users;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, users);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voters voters = (Voters) o;
        return Objects.equals(answerId, voters.answerId) &&
                Objects.equals(users, voters.users);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Voters{");
        sb.append("answerId=").append(answerId);
        sb.append(", users=").append(users);
        sb.append('}');
        return sb.toString();
    }
}
