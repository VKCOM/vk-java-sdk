package com.vk.api.sdk.objects.board;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.polls.Answer;

import java.util.List;
import java.util.Objects;

/**
 * TopicPoll object
 */
public class TopicPoll {

    /**
     * Poll ID
     */
    @SerializedName("poll_id")
    private Integer pollId;

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
     * Information whether the poll is closed
     */
    @SerializedName("is_closed")
    private BoolInt isClosed;

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

    public Integer getPollId() {
        return pollId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getCreated() {
        return created;
    }

    public boolean isClosed() {
        return isClosed == BoolInt.YES;
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

    @Override
    public int hashCode() {
        return Objects.hash(answerId, isClosed, question, created, pollId, answers, votes, ownerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopicPoll topicPoll = (TopicPoll) o;
        return Objects.equals(pollId, topicPoll.pollId) &&
                Objects.equals(ownerId, topicPoll.ownerId) &&
                Objects.equals(created, topicPoll.created) &&
                Objects.equals(isClosed, topicPoll.isClosed) &&
                Objects.equals(question, topicPoll.question) &&
                Objects.equals(votes, topicPoll.votes) &&
                Objects.equals(answerId, topicPoll.answerId) &&
                Objects.equals(answers, topicPoll.answers);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TopicPoll{");
        sb.append("pollId=").append(pollId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", created=").append(created);
        sb.append(", isClosed=").append(isClosed);
        sb.append(", question='").append(question).append("'");
        sb.append(", votes='").append(votes).append("'");
        sb.append(", answerId=").append(answerId);
        sb.append(", answers=").append(answers);
        sb.append('}');
        return sb.toString();
    }
}
