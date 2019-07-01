package com.vk.api.sdk.objects.board;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.polls.Answer;
import java.util.List;
import java.util.Objects;

/**
 * TopicPoll object
 */
public class TopicPoll implements Validable {
    /**
     * Current user's answer ID
     */
    @SerializedName("answer_id")
    private Integer answerId;

    @SerializedName("answers")
    @Required
    private List<Answer> answers;

    /**
     * Date when poll has been created in Unixtime
     */
    @SerializedName("created")
    @Required
    private Integer created;

    /**
     * Information whether the poll is closed
     */
    @SerializedName("is_closed")
    private BoolInt isClosed;

    /**
     * Poll owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Poll ID
     */
    @SerializedName("poll_id")
    private Integer pollId;

    /**
     * Poll question
     */
    @SerializedName("question")
    @Required
    private String question;

    /**
     * Votes number
     */
    @SerializedName("votes")
    @Required
    private String votes;

    public Integer getAnswerId() {
        return answerId;
    }

    public TopicPoll setAnswerId(Integer answerId) {
        this.answerId = answerId;
        return this;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public TopicPoll setAnswers(List<Answer> answers) {
        this.answers = answers;
        return this;
    }

    public Integer getCreated() {
        return created;
    }

    public TopicPoll setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public boolean isClosed() {
        return isClosed == BoolInt.YES;
    }

    public BoolInt getIsClosed() {
        return isClosed;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public TopicPoll setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getPollId() {
        return pollId;
    }

    public TopicPoll setPollId(Integer pollId) {
        this.pollId = pollId;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public TopicPoll setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getVotes() {
        return votes;
    }

    public TopicPoll setVotes(String votes) {
        this.votes = votes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, question, isClosed, created, pollId, answers, votes, ownerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopicPoll topicPoll = (TopicPoll) o;
        return Objects.equals(pollId, topicPoll.pollId) &&
                Objects.equals(question, topicPoll.question) &&
                Objects.equals(created, topicPoll.created) &&
                Objects.equals(ownerId, topicPoll.ownerId) &&
                Objects.equals(answers, topicPoll.answers) &&
                Objects.equals(votes, topicPoll.votes) &&
                Objects.equals(answerId, topicPoll.answerId) &&
                Objects.equals(isClosed, topicPoll.isClosed);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("TopicPoll{");
        sb.append("pollId=").append(pollId);
        sb.append(", question='").append(question).append("'");
        sb.append(", created=").append(created);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", answers=").append(answers);
        sb.append(", votes='").append(votes).append("'");
        sb.append(", answerId=").append(answerId);
        sb.append(", isClosed=").append(isClosed);
        sb.append('}');
        return sb.toString();
    }
}
