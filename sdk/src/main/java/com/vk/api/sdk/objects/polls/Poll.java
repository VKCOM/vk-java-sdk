package com.vk.api.sdk.objects.polls;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * Poll object
 */
public class Poll implements Validable {
    /**
     * Information whether the field is anonymous
     */
    @SerializedName("anonymous")
    @Required
    private Boolean anonymous;

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
     * Poll ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Poll owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

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

    public Boolean getAnonymous() {
        return anonymous;
    }

    public Poll setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
        return this;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public Poll setAnswerId(Integer answerId) {
        this.answerId = answerId;
        return this;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public Poll setAnswers(List<Answer> answers) {
        this.answers = answers;
        return this;
    }

    public Integer getCreated() {
        return created;
    }

    public Poll setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Poll setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Poll setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public Poll setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getVotes() {
        return votes;
    }

    public Poll setVotes(String votes) {
        this.votes = votes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, question, created, answers, anonymous, votes, id, ownerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poll poll = (Poll) o;
        return Objects.equals(question, poll.question) &&
                Objects.equals(created, poll.created) &&
                Objects.equals(ownerId, poll.ownerId) &&
                Objects.equals(answers, poll.answers) &&
                Objects.equals(anonymous, poll.anonymous) &&
                Objects.equals(votes, poll.votes) &&
                Objects.equals(id, poll.id) &&
                Objects.equals(answerId, poll.answerId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Poll{");
        sb.append("question='").append(question).append("'");
        sb.append(", created=").append(created);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", answers=").append(answers);
        sb.append(", anonymous=").append(anonymous);
        sb.append(", votes='").append(votes).append("'");
        sb.append(", id=").append(id);
        sb.append(", answerId=").append(answerId);
        sb.append('}');
        return sb.toString();
    }
}
