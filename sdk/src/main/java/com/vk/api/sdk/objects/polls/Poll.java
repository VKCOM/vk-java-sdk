package com.vk.api.sdk.objects.polls;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.List;
import java.util.Objects;

/**
 * Poll object
 */
public class Poll {
    /**
     * Poll ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Poll owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Date when poll has been created in Unixtime
     */
    @SerializedName("created")
    private Integer created;

    /**
     * Poll question
     */
    @SerializedName("question")
    private String question;

    /**
     * Votes number
     */
    @SerializedName("votes")
    private String votes;

    /**
     * Current user's answer ID
     */
    @SerializedName("answer_id")
    private Integer answerId;

    @SerializedName("answers")
    private List<Answer> answers;

    @SerializedName("anonymous")
    private BoolInt anonymous;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getCreated() {
        return created;
    }

    public String getQuestion() {
        return question;
    }

    public String getVotes() {
        return votes;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public BoolInt getAnonymous() {
        return anonymous;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, question, created, answers, votes, id, ownerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poll poll = (Poll) o;
        return Objects.equals(id, poll.id) &&
                Objects.equals(ownerId, poll.ownerId) &&
                Objects.equals(created, poll.created) &&
                Objects.equals(question, poll.question) &&
                Objects.equals(votes, poll.votes) &&
                Objects.equals(answerId, poll.answerId) &&
                Objects.equals(answers, poll.answers) &&
                Objects.equals(anonymous, poll.anonymous);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Poll{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", created=").append(created);
        sb.append(", question='").append(question).append("'");
        sb.append(", votes='").append(votes).append("'");
        sb.append(", answerId=").append(answerId);
        sb.append(", answers=").append(answers);
        sb.append(", anonymous=").append(anonymous);
        sb.append('}');
        return sb.toString();
    }
}
