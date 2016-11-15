package com.vk.api.sdk.objects.polls;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Answer object
 */
public class Answer {

    /**
     * Answer ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Answer text
     */
    @SerializedName("text")
    private String text;

    /**
     * Votes number
     */
    @SerializedName("votes")
    private Integer votes;

    /**
     * Answer rate in percents
     */
    @SerializedName("rate")
    private Float rate;

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getVotes() {
        return votes;
    }

    public Float getRate() {
        return rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return Objects.equals(id, answer.id) &&
                Objects.equals(text, answer.text) &&
                Objects.equals(votes, answer.votes) &&
                Objects.equals(rate, answer.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, votes, rate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Answer{");
        sb.append("id=").append(id);
        sb.append(", text='").append(text).append('\'');
        sb.append(", votes=").append(votes);
        sb.append(", rate=").append(rate);
        sb.append('}');
        return sb.toString();
    }
}
