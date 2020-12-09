package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * ItemWallpostFeedback object
 */
public class ItemWallpostFeedback implements Validable {
    @SerializedName("type")
    @Required
    private ItemWallpostFeedbackType type;

    @SerializedName("question")
    @Required
    private String question;

    @SerializedName("answers")
    private List<ItemWallpostFeedbackAnswer> answers;

    @SerializedName("stars_count")
    private Integer starsCount;

    @SerializedName("gratitude")
    private String gratitude;

    public ItemWallpostFeedbackType getType() {
        return type;
    }

    public ItemWallpostFeedback setType(ItemWallpostFeedbackType type) {
        this.type = type;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public ItemWallpostFeedback setQuestion(String question) {
        this.question = question;
        return this;
    }

    public List<ItemWallpostFeedbackAnswer> getAnswers() {
        return answers;
    }

    public ItemWallpostFeedback setAnswers(List<ItemWallpostFeedbackAnswer> answers) {
        this.answers = answers;
        return this;
    }

    public Integer getStarsCount() {
        return starsCount;
    }

    public ItemWallpostFeedback setStarsCount(Integer starsCount) {
        this.starsCount = starsCount;
        return this;
    }

    public String getGratitude() {
        return gratitude;
    }

    public ItemWallpostFeedback setGratitude(String gratitude) {
        this.gratitude = gratitude;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, starsCount, gratitude, answers, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemWallpostFeedback itemWallpostFeedback = (ItemWallpostFeedback) o;
        return Objects.equals(question, itemWallpostFeedback.question) &&
                Objects.equals(starsCount, itemWallpostFeedback.starsCount) &&
                Objects.equals(gratitude, itemWallpostFeedback.gratitude) &&
                Objects.equals(answers, itemWallpostFeedback.answers) &&
                Objects.equals(type, itemWallpostFeedback.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemWallpostFeedback{");
        sb.append("question='").append(question).append("'");
        sb.append(", starsCount=").append(starsCount);
        sb.append(", gratitude='").append(gratitude).append("'");
        sb.append(", answers=").append(answers);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
